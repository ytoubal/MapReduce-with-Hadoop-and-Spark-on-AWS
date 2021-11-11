package com.company;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class FriendRelation implements Writable {
    public Text friend = new Text();
    public IntWritable relationship = new IntWritable(); // -1 already friend, 1 potential recommendation

    public FriendRelation() {}

    public FriendRelation(Text friend, IntWritable relation) {
        this.friend = friend;
        this.relationship = relation;
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        this.friend.readFields(dataInput);
        this.relationship.readFields(dataInput);
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        this.friend.write(dataOutput);
        this.relationship.write(dataOutput);
    }
}
