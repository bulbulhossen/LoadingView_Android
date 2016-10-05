package com.example.bulbulhossen.loadingview_android;

import android.net.IpPrefix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.ldoublem.appleviewlib.LVComputer;
import com.ldoublem.appleviewlib.LVComputerDesktop;
import com.ldoublem.appleviewlib.LVComputerIpad;
import com.ldoublem.loadingviewlib.LVBattery;
import com.ldoublem.loadingviewlib.LVBlock;
import com.ldoublem.loadingviewlib.LVChromeLogo;
import com.ldoublem.loadingviewlib.LVCircular;
import com.ldoublem.loadingviewlib.LVCircularCD;
import com.ldoublem.loadingviewlib.LVCircularJump;
import com.ldoublem.loadingviewlib.LVCircularRing;
import com.ldoublem.loadingviewlib.LVCircularSmile;
import com.ldoublem.loadingviewlib.LVCircularZoom;
import com.ldoublem.loadingviewlib.LVEatBeans;
import com.ldoublem.loadingviewlib.LVFinePoiStar;
import com.ldoublem.loadingviewlib.LVFunnyBar;
import com.ldoublem.loadingviewlib.LVGears;
import com.ldoublem.loadingviewlib.LVGearsTwo;
import com.ldoublem.loadingviewlib.LVGhost;
import com.ldoublem.loadingviewlib.LVLineWithText;
import com.ldoublem.loadingviewlib.LVNews;
import com.ldoublem.loadingviewlib.LVPlayBall;
import com.ldoublem.loadingviewlib.LVWifi;


public class MainActivity extends AppCompatActivity {

    LVBlock LVBlock;
    LVChromeLogo lvChromeLogo;
    LVPlayBall mLVPlayBall;
    LVCircularRing mLVCircularRing;
    LVCircular mLVCircular;
    LVCircularJump mLVCircularJump;
    LVCircularZoom mLVCircularZoom;
    LVLineWithText mLVLineWithText;
    LVEatBeans mLVEatBeans;
    LVCircularCD mLVCircularCD;
    LVCircularSmile mLVCircularSmile;
    LVGears mLVGears;
    LVGearsTwo mLVGearsTwo;
    LVFinePoiStar mLVFinePoiStar;
    LVBattery mLVBattery;
    LVWifi mLVWifi;
    LVNews mLVNews;
    LVGhost mLVGhost;
    LVFunnyBar mLVFunnyBar;

    //For mac
    LVComputerDesktop mLVComputerDesktop;
    LVComputer mLVComputer;
    LVComputerIpad ipadd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LVBlock = (LVBlock) findViewById(R.id.lv_block);
        LVBlock.startAnim();
        LVBlock.isShadow(true);

        lvChromeLogo = (LVChromeLogo) findViewById(R.id.chrome);
        lvChromeLogo.startAnim();

        mLVCircularRing = (LVCircularRing) findViewById(R.id.LVCircularRing);
        mLVCircularRing.startAnim();


        mLVCircular = (LVCircular) findViewById(R.id.LVCircular);
        mLVCircular.startAnim();

        mLVCircularCD = (LVCircularCD) findViewById(R.id.LVCircularCD);
        mLVCircularCD.startAnim();

        mLVCircularZoom = (LVCircularZoom) findViewById(R.id.LVCircularZoom);
        mLVCircularZoom.startAnim();


/*        mLVComputerDesktop = (LVComputerDesktop) findViewById(R.id.macDesktop);
        mLVComputerDesktop.startAnim(4000);

        mLVComputer = (LVComputer) findViewById(R.id.computer);
        mLVComputer.startAnim(4000);

        mLVCircularZoom = (LVCircularZoom) findViewById(R.id.LVCircularZoom);
        mLVCircularZoom.startAnim();


        ipadd = (LVComputerIpad) findViewById(R.id.ipad);
        ipadd.startAnim(4000);
        */
        mLVComputerDesktop = (LVComputerDesktop) (findViewById(R.id.macDesktop));
        mLVComputerDesktop.startAnim(4000);


    }
}
