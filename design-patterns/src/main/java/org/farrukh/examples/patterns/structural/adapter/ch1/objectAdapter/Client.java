package org.farrukh.examples.patterns.structural.adapter.ch1.objectAdapter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");

		IPrintableList printableList = new PrintableListAdapter();
		printableList.printList(list);
	}
}
