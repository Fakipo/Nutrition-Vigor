package nutrition.vigor.foodandhealth.service;

import java.util.ArrayList;
import java.util.List;

public class AutoCompleteSearchImpl implements AutoCompleteSearch {

	@Override
	public List<String> getSearchSuggestions(String s) {
		List<String> demoList = new ArrayList<>();
		demoList.add("first itm");
		demoList.add("second itm");
		return demoList;
	}
	
}
