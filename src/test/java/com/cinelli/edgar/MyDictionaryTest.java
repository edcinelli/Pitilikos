package com.cinelli.edgar;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

public class MyDictionaryTest {

	@Test()
	public void whenConfigVoidRetunMethodToThrowEx_thenExIsThrown() {
	    MyDictionary dictMock = mock(MyDictionary.class);
	    doThrow(IllegalStateException.class)
	      .when(dictMock)
	      .add(anyString(), anyString());

	    dictMock.add("word", "meaning");
	}
	
}
