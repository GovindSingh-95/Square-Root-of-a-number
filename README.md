# Square-Root-of-a-number
<h2>Question</h2>
<p>
  Find the Greatest Integer Function of the square root of the number, with T.C of O(logn).
</p>
<h2>Algorithm</h2>
<p>
<br>1) For a number X,to be square root of Y, Y=(X/Y).<br>
<br>2) We can use this condition in Binaray Search to find GiF of X.<br>
<br>3)Here, Search space is from 1 to X.<br>
<br>4) If X<=0 ,we can return X directly.<br>
<br>5) For Binary search, low=1, high=X.<br>
<br>6) Inside while(low<=high). We'll use int mid, which is equal to low+(high-low)/2.<br>
<br>7) Here Conditions are-><br>
<br> if(mid=X/mid) return mid;<br>
<br> else if(mid>X/mid) high=mid-1; . Cuz the value of mid is greater than X/mid(It is Basically target).<br>
<br> else low=mid+1; . Cuz the value of mid is less than X/mid(It is Basically target).<br>
<br>8) This loop will only break if,it founds a perfect Square. But about non-perfect squares, the high int will be it's GIF and low will be it's CeilFunction.<br>
<br>9) As, the high and low both will try to come closer to value of X/mid. But as both are integers.So, one of them will be integer just lower than X/mid i.e GIF and other to be just bigger int value than X/mid.<br>
<br>10) But when while loop breaks, it is always true that Low=High+1,since these both are ints so high will be storing GIF value and Low will be storing CeilValue.<br>
<br>11) Thus at the end We have to return high.<br>
</p>
