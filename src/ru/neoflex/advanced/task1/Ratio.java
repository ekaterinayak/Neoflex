package ru.neoflex.advanced.task1;

//класс представляющий простую дробь
public class Ratio {
	// числитель
	private int numer;

	// знаменатель
	private int denom;

	public Ratio(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
		reduction();
	}

	public Ratio(double ratio) {
		String ratioString = String.valueOf(ratio);
		int position = ratioString.indexOf('.');

		boolean flag = false;

		if (position == -1) {
			position = ratioString.length() - 1;

			flag = true;
		}

		if (flag) {
			numer = Integer.valueOf(ratioString.substring(0, position));
			denom = 1;
		} else {
			String denomString = ratioString.substring(position + 1);
			numer = Integer.valueOf(ratioString.substring(0, position).concat(denomString));
			denom = (int)Math.pow(10.0d, (double)denomString.length());
		}

		reduction();
	}

	// сокращение дроби, для нахождения НОД использовать
	// алгоритм Евклида
	private void reduction() {
		int a = numer;
		int b = denom;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		numer /= a;
		denom /= a;
	}

	// сложение с целым
	public Ratio add(int number) {
		numer += number * denom;
		reduction();
		return this;
	}

	// сложение с дробью
	public Ratio add(Ratio ratio) {
		numer = numer * ratio.denom + ratio.numer * denom;
		denom *= ratio.denom;
		reduction();
		return this;
	}

	// вычитание целого
	public Ratio substract(int number) {
		numer -= number * denom;
		reduction();
		return this;
	}

	// вычитание дроби
	public Ratio substract(Ratio ratio) {
		numer = numer * ratio.denom - ratio.numer * denom;
		denom *= ratio.denom;
		reduction();
		return this;
	}

	// умножение на целое
	public Ratio multiply(int number) {
		numer *= number;
		reduction();
		return this;
	}

	// умножение дроби
	public Ratio multiply(Ratio ratio) {
		numer *= ratio.numer;
		denom *= ratio.denom;
		reduction();
		return this;
	}

	// деление на число
	public Ratio devide(int number) {
		denom *= number;
		reduction();
		return this;
	}

	// деление на диробь
	public Ratio devide(Ratio ratio) {
		numer *= ratio.denom;
		denom *= ratio.numer;
		reduction();
		return this;
	}

	// строковое представление
	public String toString() {
		return numer + "/" + denom;
	}

}