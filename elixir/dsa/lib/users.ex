defmodule Users do
  import Helpers.Format, only: [trimmer: 1]
   @enforce_keys [:name]
  defstruct [:name, :email, :age]

  def data(name, age) when age > 18 and is_number(age) do
    fomatted_name = trimmer(name)
    user = %Users{name: fomatted_name, age: age}
    IO.puts(user)
  end

  def data(name, age)do
        IO.puts("#{name}  #{age}")
  end




end
