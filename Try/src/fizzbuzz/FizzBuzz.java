package fizzbuzz;

public class FizzBuzz {
	public Integer value;
	public FizzBuzz(Integer value) {
		this.value = value;
	}
	public String result () {
		final String Fizz = "Fizz";
		final String Buzz = "Buzz";
		if(this.value % 3 == 0 && this.value % 5 == 0) {
			return (Fizz + Buzz);
		}
		if(this.value % 3 == 0) {
			return Fizz;
		}else if(this.value % 5 == 0) {
			return Buzz;
		}
		return this.value.toString();
	}
}
