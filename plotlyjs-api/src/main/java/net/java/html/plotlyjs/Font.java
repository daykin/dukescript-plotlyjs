
package net.java.html.plotlyjs;

/*
 * #%L
 * This software is Copyright by the Board of Trustees of Michigan State University.
 * Contact Information:
 * Facility for Rare Isotope Beams
 * Michigan State University
 * East Lansing, MI 48824-1321
 * http://frib.msu.edu
 * %%
 * Copyright (C) 2016 Board of Trustees of Michigan State University
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */




public class Font {
      
    private final String color;
    private final String family;
    private final int size;
    
    
    public Font(FontBuilder builder){
        color = builder.color;
        family = builder.family;
        size = builder.size;
    }
    

    @Override
    public String toString() {
        return "Font{" + "color=" + color + ", family=" + family + ", size=" + size + '}';
    }
    
    
    public static class FontBuilder{
        String color = "#444";
        String family = "\"Open Sans\", verdana, arial, sans-serif" ;
        int size = 12;
        
        
        public FontBuilder(){}
        
        
        public FontBuilder color(String color){
            this.color = color;
            return this;
        }
    
        
        public FontBuilder family(String family){
            this.family = family;
            return this;
        }
    
        
        public FontBuilder size(int size){
            this.size = size;
            return this;
        }
        
        
        public Font build(){
        return new Font(this);
        }
    }   
}
