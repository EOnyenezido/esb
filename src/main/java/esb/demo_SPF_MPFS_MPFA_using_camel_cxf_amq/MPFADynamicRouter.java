package esb.demo_SPF_MPFS_MPFA_using_camel_cxf_amq;

public class MPFADynamicRouter {
	
	public String route(String body, String previous) {
		if (previous == null) {
			return "mock://a";
		} else if ("mock://a".equals(previous)) {
			return "language://simple:Bye ${body}";
		} else {
			return null;
		}
	}

}
