package com.redhat.jbuenosv.demos.monitoring.knative.echo;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 * Created by jlbuenosvinos.
 */
@QuarkusMain
public class EchoApplication {

	/**
	 * main method
	 * @param args application arguments
	 */
	public static void main(String[] args) {
		Quarkus.run(args);
	}

}
