package com.internousdev.leisurepass.dto;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class DestinationInfoDTOTest {

	// get Id test
		@Test
		public void testGetId1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testGetId4() throws Exception{
			DestinationInfoDTO dto = new DestinationInfoDTO();
			try{
			int postalMax = Integer.parseInt("2147483647");
				dto.setId(postalMax);
			}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testGetId5() throws Exception{
			DestinationInfoDTO dto = new DestinationInfoDTO();
			try{
				int postalMin = Integer.parseInt("-2147483648");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}


		//set Id test
		@Test
		public void testSetId1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 0;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = 2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			int expected = -2147483647;

			dto.setId(expected);
			int actual = dto.getId();
			assertEquals(expected,actual);
		}
		@Test
		public void testSetId4() throws Exception{
			DestinationInfoDTO dto = new DestinationInfoDTO();
			try{
			int postalMax = Integer.parseInt("2147483647");
				dto.setId(postalMax);
			}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
			}
		}
		@Test
		public void testSetId5() throws Exception{
			DestinationInfoDTO dto = new DestinationInfoDTO();
			try{
				int postalMin = Integer.parseInt("-2147483648");
				dto.setId(postalMin);
			}catch(RuntimeException e){
				assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
			}
		}

		@Test
		public void testGetUserId1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = " ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "abc123あいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserId12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected = "ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//set UserId test
		@Test
		public void testSetUserId1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected=" ";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="　";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abcあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserId12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setUserId(expected);
			String actual = dto.getUserId();
			assertEquals(expected, actual);
		}

		//get FamilyName test
		@Test
		public void testGetFamilyName1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyName12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}




		// set Family Name test
		@Test

		public void testSetFamilyName1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected=" ";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="　";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyName12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyName(expected);
			String actual = dto.getFamilyName();
			assertEquals(expected, actual);
		}

		// get FirstName test
		@Test
		public void testGetFirstName1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstName12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}

		//set First Name test
		@Test
		public void testSetFirstName1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstName12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstName(expected);
			String actual = dto.getFirstName();
			assertEquals(expected, actual);
		}


		// get FamilyNameKana test
		@Test
		public void testGetFamilyNameKana1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFamilyNameKana12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

		// set FamilyNameKana test
		@Test
		public void testSetFamilyNameKana1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected=" ";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="　";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="abc123あいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFamilyNameKana12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="ａｂｃあいう１２３漢字";

			dto.setFamilyNameKana(expected);
			String actual = dto.getFamilyNameKana();
			assertEquals(expected, actual);
		}

			// get FirstNameKana test
		@Test
		public void testGetFirstNameKana() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetFirstNameKana12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}

		@Test
		public void testSetFirstNameKana1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="0";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="-2147483647";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="null";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected="";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetFirstNameKana11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setFirstNameKana(expected);
			String actual = dto.getFirstNameKana();
			assertEquals(expected, actual);
		}


		// get UserAddress test
		@Test
		public void testGetUserAddress1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "0";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "-2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUserAddress12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}


		//set UserAddress test
		@Test
		public void testSetUserAddress1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "0";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "-2147483647";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "null";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUserAddress12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setUserAddress(expected);
			String actual = dto.getUserAddress();
			assertEquals(expected, actual);
		}


		// get Telnumber test
		@Test
		public void testGetTelNumber1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "0";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "-2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetTelNumber12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}

			//set TelNumber
		@Test
		public void testSetTelNumber1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "0";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "-2147483647";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "null";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetTelNumber12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setTelNumber(expected);
			String actual = dto.getTelNumber();
			assertEquals(expected, actual);
		}


		// get Email test
		@Test
		public void testGetEmail1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetEmail12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		//set Email test
		@Test
		public void testSetEmail1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "0";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail2() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail3() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "-2147483647";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail4() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "null";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail5() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail6() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= " ";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail7() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "　";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail8() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail9() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail10() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail11() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "abc123あいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetEmail12() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			String expected= "ａｂｃあいう１２３漢字";

			dto.setEmail(expected);
			String actual = dto.getEmail();
			assertEquals(expected, actual);
		}

		// get RegistDate test
		@Test
		public void testGetRegistDate1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetRegistDate2() throws ParseException {
			DestinationInfoDTO dto = new DestinationInfoDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());
		}

		//set RegistDate test
		@Test
		public void testSetRegistDate1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			Date expected = null;

			dto.setRegistDate(expected);
			Date actual = dto.getRegistDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetRegistDate2() throws ParseException {
			DestinationInfoDTO dto = new DestinationInfoDTO();

			SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setRegistDate(expected);
			assertEquals(expected, dto.getRegistDate());
		}


		// get UpdateDate test
		@Test
		public void testGetUpdateDate1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testGetUpdateDate2() throws ParseException{
			DestinationInfoDTO dto = new DestinationInfoDTO();

			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setUpdateDate(expected);
			assertEquals(expected,dto.getUpdateDate());
		}

		@Test
		public void testSetUpdateDate1() {
			DestinationInfoDTO dto = new DestinationInfoDTO();
			Date expected = null;

			dto.setUpdateDate(expected);
			Date actual = dto.getUpdateDate();
			assertEquals(expected, actual);
		}
		@Test
		public void testSetUpdateDate2() throws ParseException{
			DestinationInfoDTO dto = new DestinationInfoDTO();

			SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
			Date expected = sdf.parse("20180420 12:00:00");
			dto.setUpdateDate(expected);
			assertEquals(expected,dto.getUpdateDate());
		}
}