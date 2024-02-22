<?php

class Clothing extends Product {
    private $size = '';
    private $material = '';
    private $gender = '';

    public function __construct() {
    }

    public function setSize($size) {
        $this->size = $size;
    }

    public function getSize() {
        return $this->size;
    }

    public function setMaterial($material) {
        $this->material = $material;
    }

    public function getMaterial() {
        return $this->material;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }

    public function getGender() {
        return $this->gender;
    }

}

?>