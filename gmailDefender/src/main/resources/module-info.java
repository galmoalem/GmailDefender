module gmailDefender {
	exports dao;
	exports data;
	exports config.firebase;
	exports infra;
	exports conditionals;

	requires com.google.api.client;
	requires firebase.admin;
	requires java.persistence;
	requires java.validation;
	requires org.hibernate.validator;
	requires spring.beans;
	requires spring.context;
	requires spring.core;
	requires spring.data.commons;
	requires spring.security.core;
	requires spring.web;
	requires tomcat.embed.core;
}