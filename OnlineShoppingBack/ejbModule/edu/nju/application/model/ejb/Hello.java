package edu.nju.application.model.ejb;

import javax.ejb.Stateless;

import edu.nju.application.service.HelloRemote;


/**
 * Session Bean implementation class Hello
 */
@Stateless
public class Hello implements HelloRemote {

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void Dohello() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
