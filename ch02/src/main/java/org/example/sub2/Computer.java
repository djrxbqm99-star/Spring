package org.example.sub2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dell")
public class Computer {

    // 필드주입
    @Autowired
    private CPU cpu;

    private RAM ram;

    @Autowired
    public Computer(RAM ram){
        this.ram = ram;
    }

    private SSD ssd;

    // 세터주입
    @Autowired
    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public void show() {
        cpu.show();
        ram.show();
        ssd.show();
    }



}
