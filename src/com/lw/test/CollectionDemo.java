package com.lw.test;

import java.util.ArrayList;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo {
		/**
		 * @param args
		 */
		public static void main(String[] args)
		{
			Collection c = new ArrayList();
			c.add("孙悟空");
			c.add(6);
			System.out.println("c:"+c);
			int [] a = {1,2,3,4,5};
			Collection b = new ArrayList();
			b.addAll(c);
			b.clear();
			System.out.println("b"+b);
			if(c.contains("孙悟空")) {
				System.out.println("俺老孙来也");
			}
			if(c.contains("猪八戒")==false) {
				System.out.println("猪");
			}
			System.out.println(c.contains("猪八戒"));
			Object[] d = (Object[]) c.toArray();
			System.out.println(d[1]);
			
			//使用Lambda遍历集合
			Collection books = new HashSet();
			books.add("one");
			books.add("two");
			books.add("three");
			books.forEach(obj -> System.out.println("迭代元素" + obj));
			
			//iterator遍历集合元素
			Iterator it = books.iterator();
			while(it.hasNext()) {
				String book = (String) it.next();
				System.out.println(book);
				if(book.equals("two")) {
					it.remove();
				}
				book = "book";
			}
			books.removeIf(ele -> ((String)ele).length()<4);
			System.out.println(books);
			//System.out.println(calAll(books,ele->((String)ele)));
			//Collection d = Collection.s
			
			
			
		}
		public synchronized String fun() {
			return "SUCCESS";
		}
		public static void main2(String [] args) {
			
		}
}
