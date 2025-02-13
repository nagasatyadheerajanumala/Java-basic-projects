package Banking;

enum FixedAmounts {
  MinimumBalance(2000.0);
  double val;
  FixedAmounts(double val){
    this.val = val;
  }
}
