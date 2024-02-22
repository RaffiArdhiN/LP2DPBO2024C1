<?php

class Product {
    private $idProduct = '';
    private $name = '';
    private $brand = '';
    private $price = '';

    public function __construct() {
    }

    public function setIdProduct($idProduct) {
        $this->idProduct = $idProduct;
    }

    public function getIdProduct() {
        return $this->idProduct;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function getName() {
        return $this->name;
    }

    public function setBrand($brand) {
        $this->$brand = $brand;
    }

    public function getBrand() {
        return $this->brand;
    }

    public function setPrice($price) {
        $this->price = $price;
    }

    public function getPrice() {
        return $this->price;
    }

}

?>