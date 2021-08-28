package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<UserVo> list = new ArrayList<UserVo>();
		list.add(new UserVo("A","Bang","Dev"));
		list.add(new UserVo("B","Bang","Dev"));
		list.add(new UserVo("C","Hyd","Dev"));
		list.add(new UserVo("D","Hyd","Dev"));
		list.add(new UserVo("E","Pune","Dev"));

		Map<String, List<UserVo>> collect = list.stream().collect(Collectors.groupingBy(UserVo::getCity));
		Set<Entry<String, List<UserVo>>> entrySet = collect.entrySet();
		for (Entry<String, List<UserVo>> entry : entrySet) {
			if (entry.getKey()== "Bang") {
				System.out.println(entry);
			}
		}
	}
}
