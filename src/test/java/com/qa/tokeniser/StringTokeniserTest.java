package com.qa.tokeniser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTokeniserTest {

    @Test
    public void empty_string_result_empty_array()
    {
//        Triple 'A' pattern
//        arrange
        String inputVal = "";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_one_result_array_of_one()
    {
        //        arrange
        String inputVal = "java";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_two_result_array_of_two_strings()
    {
        //        arrange
        String inputVal = "java,python";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java", "python"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_many_result_array_of_many_strings()
    {
        //        arrange
        String inputVal = "java,python,C#";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java", "python", "C#"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_compound_result_array_of_many_strings()
    {
        //        arrange
        String inputVal = "java byte code,python,C#";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java byte code", "python", "C#"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_one_result_array_of_one_with_spaces_removed()
    {
        //        arrange
        String inputVal = " java ";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_one_with_preceding_comma_result_array_of_one()
    {
        //        arrange
        String inputVal = ",java";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void string_of_one_with_proceeding_comma_result_array_of_one()
    {
        //        arrange
        String inputVal = "java,";
        StringTokeniser cut = new StringTokeniser();
        String[] expectedResult = {"java"};
//        act
        String[] actualResult = cut.tokenise(inputVal);
//        assert
        assertArrayEquals(expectedResult, actualResult);
    }
}