package com.internousdev.leisurepass.dto;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class MPlaceDTOTest {

	// get Id test
	@Test
	public void testGetId1() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId2() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId3() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetId4() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");		}
	}


	//set Id test
	@Test
	public void testSetId1() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId2() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId3() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = -2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetId4() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetId5() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");		}
	}

	@Test
	public void testGetPlaceName1() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "0";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName2() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "2147483647";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName3() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "-2147483647";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName4() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "null";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName5() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName6() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = " ";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName7() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "　";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName8() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "abc123";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName9() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "あいう１２３";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName10() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "abc123あいう１２３";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName11() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceName12() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected = "ａｂｃあいう１２３漢字";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}

	//set PlaceName test
	@Test
	public void testSetPlaceName1() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="0";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName2() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="2147483647";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName3() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="-2147483647";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName4() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="null";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName5() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName6() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected=" ";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName7() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="　";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName8() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="abc123";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName9() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="あいう１２３";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName10() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="abc123あいう１２３";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName11() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="abcあいう１２３漢字";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceName12() {
		MPlaceDTO dto = new MPlaceDTO();
		String expected="ａｂｃあいう１２３漢字";

		dto.setPlaceName(expected);
		String actual = dto.getPlaceName();
		assertEquals(expected, actual);
	}



	// get InsertDate test
	@Test
	public void testGetInsertDate1() {
		MPlaceDTO dto = new MPlaceDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetInsertDate2() throws ParseException {
		MPlaceDTO dto = new MPlaceDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}

	//set InsertDate test
	@Test
	public void testSetInsertDate1() {
		MPlaceDTO dto = new MPlaceDTO();
		Date expected = null;

		dto.setInsertDate(expected);
		Date actual = dto.getInsertDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetInsertDate2() throws ParseException {
		MPlaceDTO dto = new MPlaceDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setInsertDate(expected);
		assertEquals(expected, dto.getInsertDate());
	}


	// get UpdateDate test
	@Test
	public void testGetUpdateDate1() {
		MPlaceDTO dto = new MPlaceDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException{
		MPlaceDTO dto = new MPlaceDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate1() {
		MPlaceDTO dto = new MPlaceDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() throws ParseException{
		MPlaceDTO dto = new MPlaceDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}


	@Test
	public void testGetPlaceId1() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 0;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPlaceId2() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 2147483647;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPlaceId3() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = -2147483647;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetPlaceId4() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setPlaceId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPlaceId5() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setPlaceId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");		}
	}


	//set PlaceId test
	@Test
	public void testSetPlaceId1() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 0;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPlaceId2() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = 2147483647;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPlaceId3() {
		MPlaceDTO dto = new MPlaceDTO();
		int expected = -2147483647;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetPlaceId4() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMax = Integer.parseInt("2147483647");
			dto.setPlaceId(postalMax);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetPlaceId5() throws Exception{
		MPlaceDTO dto = new MPlaceDTO();
		try{
			int postalMin = Integer.parseInt("-2147483648");
			dto.setPlaceId(postalMin);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

}
