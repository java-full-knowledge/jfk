package com.jfk.InterfacesOthers.Geometric;

import com.jfk.InterfacesOthers.Geometric.Circle;
import com.jfk.InterfacesOthers.Geometric.Resizable;

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public int resize(int percent) {
      return percent;
        }

    @Override
    public double getPerimetr() {
        return super.getPerimetr();
    }
}

