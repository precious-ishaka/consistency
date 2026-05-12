defmodule Games do
  def getAll do
   [ %{name: "Assassin", in_stock: true, price: 300},
    %{name: "Merlin", in_stock: false, price: 200},
    %{name: "Ghost Rider", in_stock: true, price: 400}]
  end

  def filt(list) do
    Enum.filter(list, &(&1.price > 200 && &1.in_stock))
  end




end
