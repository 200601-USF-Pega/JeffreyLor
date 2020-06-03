package com.revature.tourofheroes.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

import com.revature.tourofheroes.models.Hero;

public class HeroRepoFile implements IHeroRepo {
	private String filepath= "Hero.txt";
	@Override
	public Hero addHero(Hero hero) {
		// TODO Auto-generated method stub
		try {
			ObjectOutputStream objectOutputStream = 
					new ObjectOutputStream(new FileOutputStream(filepath));
			objectOutputStream.writeObject(hero);
			objectOutputStream.close();
			return hero;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	//finish this method
	@Override
	public List<Hero> getAllHeros() {
		// TODO Auto-generated method stub
		List<Hero> heroList = new ArrayList<Hero>();
		try {
			ObjectInputStream inputStream = 
					new ObjectInputStream((new FileInputStream(filepath)));
			Hero hero;
			while((hero = (Hero) inputStream.readObject()) != null)
			{
				heroList.add(hero);
			}
			inputStream.close();
		} catch (EOFException e) {
			return heroList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//Just in class Hero class is not found
			e.printStackTrace();
		}
		return heroList;
	}

}
