package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String method1(){
		ActionContext.getContext().put("msg", "方法1被执行");
		System.out.println("方法1被执行");
		return SUCCESS;
	}
	public String method2(){
		ActionContext.getContext().put("msg", "方法2被执行");
		System.out.println("方法2被执行");
		return SUCCESS;
	}
	public String method3(){
		ActionContext.getContext().put("msg", "方法3被执行");
		System.out.println("方法3被执行");
		return SUCCESS;
	}
	@Override
	public String execute() throws Exception {
		ActionContext.getContext().put("msg", "execute方法被执行");
		System.out.println("execute方法被执行");
		return SUCCESS;
	}
	
}
