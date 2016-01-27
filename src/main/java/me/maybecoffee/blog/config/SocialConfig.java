package me.maybecoffee.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.social.config.annotation.SocialConfigurerAdapter;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.mem.InMemoryUsersConnectionRepository;
import org.springframework.social.facebook.api.Facebook;

@Configuration
public class SocialConfig extends SocialConfigurerAdapter {

	/*@Override
	public UserIdSource getUserIdSource() {
		return new AuthenticationNameUserIdSource();
	}*/
	@Override
	public UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator arg0) {
		return new InMemoryUsersConnectionRepository(arg0);
	}
/*	@Bean 
	@Scope(value="request", proxyMode=ScopedProxyMode.INTERFACES) 
	public Facebook facebook(ConnectionRepository repository) { 
		System.out.println("aldfjalsdjf");
		Connection<Facebook> connection = repository.findPrimaryConnection(Facebook.class);
		System.out.println(connection);
		return connection != null ? connection.getApi() : null; 
	}*/
	
    /*@Override
    public void addConnectionFactories(ConnectionFactoryConfigurer cfConfig, Environment env) {
        cfConfig.addConnectionFactory(new FacebookConnectionFactory(
            env.getProperty("spring.social.facebook.app-id"),
            env.getProperty("spring.social.facebook.app-secret")));
    }*/
}