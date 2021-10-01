package com.umanizales.list_se.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ListSE {
    private Node head;
    private int count;

    public void add(Boy boy)
    {
        if(head==null)
        {
            head=new Node(boy);
        }
        else
        {
            Node temp = head;
            while (temp.getNext()!=null)
            {
                temp = temp.getNext();
            }
            temp.setNext(new Node(boy));
        }
        count++;
    }

    public void addToStart(Boy boy)
    {
        if(this.head==null)
        {
            this.head=new Node(boy);
        }
        else
        {
            Node temp = new Node(boy);
            temp.setNext(this.head);
            this.head=temp;
        }
        count++;
    }

    public void invert()
    {
        if(this.head !=null)
        {
            ListSE listTemp = new ListSE();
            Node temp = this.head;
            while(temp !=null)
            {
                listTemp.addToStart(temp.getData());
                temp = temp.getNext();
            }
            this.head = listTemp.getHead();
        }

    }

    public int count()
    {
        int count=0;
        if(this.head !=null)
        {
            Node temp = this.head;
            while(temp !=null)
            {
                count++;
                temp = temp.getNext();
            }
        }
        return count;
    }

    public List<Boy> list()
    {
        if(this.head!=null)
        {
            Node temp=this.head;
            List<Boy> list = new ArrayList<>();
            while (temp!=null)
            {
                list.add(temp.getData());
                temp = temp.getNext();
            }
            return list;
        }
        return null;
    }

    public void changeStartToEnd ()
    {
        if(this.head!=null && this.head.getNext()!=null)
        {
            Boy start= this.head.getData();
            Node temp= head;
            while(temp.getNext()!=null)
            {
                temp = temp.getNext();
            }
            this.head.setData(temp.getData());
            temp.setData(start);
        }
    }

    public void delete ()
    {
        if(this.head!=null && this.head.getNext()!=null)
        {
            Node temp = head;
            head = head.getNext();
            temp.getNext();
            count--;

        }
    }


}
