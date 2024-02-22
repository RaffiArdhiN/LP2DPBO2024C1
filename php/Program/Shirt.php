<?php

class Shirt extends Clothing {
    private $color = '';
    private $sleeve = '';

    public function __construct() {

    }

    public function setColor($color) {
        $this->color = $color;
    }

    public function getColor() {
        return $this->color;
    }

    public function setSleeve($sleeve) {
        $this->sleeve = $sleeve;
    }

    public function getSleeve() {
        return $this->sleeve;
    }

}

?>