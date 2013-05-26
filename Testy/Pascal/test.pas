program test;

const
  x = 69;
  y = 100;

var

  i : integer;
  test : real;
  n : integer;


begin
  i := 0;
  n := 10;
  w1 := 1.0;


  repeat
    begin
        test := test + 1.15;
        i:= i+1;
    end
  until i=n 

  if n = 10 then 
    begin
      n := 15;
      writeln(n);
    end
  else
     begin
       w1 := 6.9;
       i := 45;
     end

end.