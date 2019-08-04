package testing;

import org.junit.Assert;
import org.junit.Test;

public class MergeArraysTest {
	
	@Test
	public void Mergearraystest1() {
	int [] array1 =new int[] {1,9};
	int [] array2 =new int[] {3,4,5,8};
	int [] x= new int [] {1,3,4,5,8,9};
	Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
	}
	
	@Test
	public void Mergearraystest2() {
	int [] array1 =new int[] {3,4,5,8};
	int [] array2 =new int[] {1,9};
	int [] x= new int [] {1,3,4,5,8,9};
	Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
	}
	

	@Test
	public void Arr1zerotest() {
	int [] array1 =new int[] {} ;
	int [] array2 =new int[] {1,3} ;
	int [] x= new int [] {1,3};
	Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
	}
	
	@Test
	public void Arr2zerotest() {
	int [] array1 =new int[] {2,6,7} ;
	int [] array2 =new int[] {} ;
	int [] x= new int [] {2,6,7};
	Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
	}
	
	
	@Test
	public void Arr1nulltest() {
	int [] array1 =null ;
	int [] array2 =new int[] {1,3} ;
	int [] x= new int [] {1,3};
	Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
	}
	
	@Test
	public void Arr2nulltest() {
	int [] array1 = new int [] {1,3};
	int [] array2 =null ;
	int [] x= new int [] {1,3};
	Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
	}
	
	@Test
	public void Nulltest() {
		int [] array1 = null;
		int [] array2 =null ;
		int [] x= null;
		Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
		}
	
	
	
	
	@Test
	public void Zeronulltest() {
		int [] array1 =  new int [] {};
		int [] array2 =null ;
		int [] x= null;
		Assert.assertArrayEquals(MergeUniqueArrays.mergeArrays(array1, array2), x);
		}
	
	@Test
	public void MergeUniqueArraystest() {
		MergeUniqueArrays arr=new MergeUniqueArrays();
		Assert.assertNotNull(arr);
		}
	
	
	
}
