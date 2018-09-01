package love.fundraising.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class ApiAbstractController {

	// 每一页的条数
	private final int pageSize = 5;
	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected String readRequest(HttpServletRequest request) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
		StringBuffer content = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
			content.append(line + "\r\n");
		}
		String result = content.toString();
		return result;
	}

	/**
	 * 分页的条数
	 * 
	 * @param pageNo
	 * @return
	 */
	public int getLimit() {
		return pageSize;
	}

	/**
	 * 分页的起始值
	 * 
	 * @param pageNo
	 * @return
	 */
	public int getStart(int pageNo) {
		int size = (pageNo - 1) * pageSize;
		return size;
	}

}
