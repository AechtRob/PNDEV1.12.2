package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCeratosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCeratosaurus extends AdvancedModelBaseExtended {

    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Osteoderm_r1;
    private final AdvancedModelRenderer Osteoderm_r2;
    private final AdvancedModelRenderer Osteoderm_r3;
    private final AdvancedModelRenderer Osteoderm_r4;
    private final AdvancedModelRenderer Osteoderm_r5;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Osteoderm_r6;
    private final AdvancedModelRenderer Osteoderm_r7;
    private final AdvancedModelRenderer Osteoderm_r8;
    private final AdvancedModelRenderer Osteoderm_r9;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Osteoderm_r10;
    private final AdvancedModelRenderer Osteoderm_r11;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Osteoderm_r12;
    private final AdvancedModelRenderer Neckbase_r1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Osteoderm_r13;
    private final AdvancedModelRenderer Osteoderm_r14;
    private final AdvancedModelRenderer Neckfrontthroat_r1;
    private final AdvancedModelRenderer Neckmiddle_r1;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Osteoderm_r15;
    private final AdvancedModelRenderer Osteoderm_r16;
    private final AdvancedModelRenderer Neckfrontslope_r1;
    private final AdvancedModelRenderer Neckfront_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Osteoderm_r17;
    private final AdvancedModelRenderer Hornslope_r1;
    private final AdvancedModelRenderer Horn_r1;
    private final AdvancedModelRenderer Rightcrestextensionslope_r1;
    private final AdvancedModelRenderer Rightcrestextension_r1;
    private final AdvancedModelRenderer Rightcrestorbit_r1;
    private final AdvancedModelRenderer Rightcrestfront_r1;
    private final AdvancedModelRenderer Rightcrestbase_r1;
    private final AdvancedModelRenderer Leftcrestextensionslope_r1;
    private final AdvancedModelRenderer Leftcrestextension_r1;
    private final AdvancedModelRenderer Leftcrestorbit_r1;
    private final AdvancedModelRenderer Leftcrestfront_r1;
    private final AdvancedModelRenderer Leftcrestbase_r1;
    private final AdvancedModelRenderer Upperfrontteeth_r1;
    private final AdvancedModelRenderer Upperbackteeth_r1;
    private final AdvancedModelRenderer Upperjawslopefront_r1;
    private final AdvancedModelRenderer Upperjawslopebase_r1;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer Upperjawbase_r1;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer Lowerfrontteeth_r1;
    private final AdvancedModelRenderer Lowerbackteeth_r1;
    private final AdvancedModelRenderer Lowerjawfrontslope_r1;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Lowerjawbase_r1;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Throat_r1;
    private final AdvancedModelRenderer Masseter;
    private final AdvancedModelRenderer Masseter_r1;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftleg4;
    private final AdvancedModelRenderer Leftleg5;
    private final AdvancedModelRenderer Rightleg1;
    private final AdvancedModelRenderer Rightleg2;
    private final AdvancedModelRenderer Rightleg3;
    private final AdvancedModelRenderer Rightleg4;
    private final AdvancedModelRenderer Rightleg5;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Osteoderm_r18;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Osteoderm_r19;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Osteoderm_r20;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Osteoderm_r21;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Osteoderm_r22;
    private final AdvancedModelRenderer Tail6;
    private final AdvancedModelRenderer Osteoderm_r23;

    private ModelAnimator animator;

    public ModelCeratosaurus() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -5.0F, 0.0F);
        this.setRotateAngle(Hips, 0.0436F, 0.0F, 0.0F);


        this.Osteoderm_r1 = new AdvancedModelRenderer(this);
        this.Osteoderm_r1.setRotationPoint(0.0F, -2.6891F, 9.2383F);
        this.Hips.addChild(Osteoderm_r1);
        this.setRotateAngle(Osteoderm_r1, 0.5061F, 0.0F, 0.0F);
        this.Osteoderm_r1.cubeList.add(new ModelBox(Osteoderm_r1, 34, 119, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r2 = new AdvancedModelRenderer(this);
        this.Osteoderm_r2.setRotationPoint(0.0F, -3.2891F, 6.4383F);
        this.Hips.addChild(Osteoderm_r2);
        this.setRotateAngle(Osteoderm_r2, 0.637F, 0.0F, 0.0F);
        this.Osteoderm_r2.cubeList.add(new ModelBox(Osteoderm_r2, 0, 120, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r3 = new AdvancedModelRenderer(this);
        this.Osteoderm_r3.setRotationPoint(0.0F, -3.6891F, 3.3383F);
        this.Hips.addChild(Osteoderm_r3);
        this.setRotateAngle(Osteoderm_r3, 0.637F, 0.0F, 0.0F);
        this.Osteoderm_r3.cubeList.add(new ModelBox(Osteoderm_r3, 7, 120, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r4 = new AdvancedModelRenderer(this);
        this.Osteoderm_r4.setRotationPoint(0.0F, -4.1891F, 0.1383F);
        this.Hips.addChild(Osteoderm_r4);
        this.setRotateAngle(Osteoderm_r4, 0.637F, 0.0F, 0.0F);
        this.Osteoderm_r4.cubeList.add(new ModelBox(Osteoderm_r4, 14, 120, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r5 = new AdvancedModelRenderer(this);
        this.Osteoderm_r5.setRotationPoint(0.0F, -4.5891F, -3.1617F);
        this.Hips.addChild(Osteoderm_r5);
        this.setRotateAngle(Osteoderm_r5, 0.637F, 0.0F, 0.0F);
        this.Osteoderm_r5.cubeList.add(new ModelBox(Osteoderm_r5, 21, 120, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -4.0F, -6.0F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.1134F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 34, -6.0F, 0.0F, 0.0F, 12, 18, 15, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 1.8F, -5.9F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -6.5F, -5.8F, -15.0F, 13, 18, 15, 0.0F, false));

        this.Osteoderm_r6 = new AdvancedModelRenderer(this);
        this.Osteoderm_r6.setRotationPoint(0.0F, -6.7891F, -0.8617F);
        this.Bodymiddle.addChild(Osteoderm_r6);
        this.setRotateAngle(Osteoderm_r6, 0.7679F, 0.0F, 0.0F);
        this.Osteoderm_r6.cubeList.add(new ModelBox(Osteoderm_r6, 120, 109, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r7 = new AdvancedModelRenderer(this);
        this.Osteoderm_r7.setRotationPoint(0.0F, -6.9891F, -4.5617F);
        this.Bodymiddle.addChild(Osteoderm_r7);
        this.setRotateAngle(Osteoderm_r7, 0.7679F, 0.0F, 0.0F);
        this.Osteoderm_r7.cubeList.add(new ModelBox(Osteoderm_r7, 55, 48, -0.5F, -0.4775F, -3.0839F, 1, 3, 3, 0.001F, false));

        this.Osteoderm_r8 = new AdvancedModelRenderer(this);
        this.Osteoderm_r8.setRotationPoint(0.0F, -6.9891F, -8.8617F);
        this.Bodymiddle.addChild(Osteoderm_r8);
        this.setRotateAngle(Osteoderm_r8, 0.7679F, 0.0F, 0.0F);
        this.Osteoderm_r8.cubeList.add(new ModelBox(Osteoderm_r8, 100, 69, -0.5F, -0.4775F, -3.0839F, 1, 3, 3, 0.001F, false));

        this.Osteoderm_r9 = new AdvancedModelRenderer(this);
        this.Osteoderm_r9.setRotationPoint(0.0F, -6.8891F, -12.3617F);
        this.Bodymiddle.addChild(Osteoderm_r9);
        this.setRotateAngle(Osteoderm_r9, 0.7679F, 0.0F, 0.0F);
        this.Osteoderm_r9.cubeList.add(new ModelBox(Osteoderm_r9, 120, 114, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.0F, -14.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.0436F, 0.0F, 0.0F);


        this.Osteoderm_r10 = new AdvancedModelRenderer(this);
        this.Osteoderm_r10.setRotationPoint(0.0F, -6.0891F, -6.0617F);
        this.Bodyfront.addChild(Osteoderm_r10);
        this.setRotateAngle(Osteoderm_r10, 0.8901F, 0.0F, 0.0F);
        this.Osteoderm_r10.cubeList.add(new ModelBox(Osteoderm_r10, 121, 26, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r11 = new AdvancedModelRenderer(this);
        this.Osteoderm_r11.setRotationPoint(0.0F, -6.6891F, -2.2617F);
        this.Bodyfront.addChild(Osteoderm_r11);
        this.setRotateAngle(Osteoderm_r11, 0.8901F, 0.0F, 0.0F);
        this.Osteoderm_r11.cubeList.add(new ModelBox(Osteoderm_r11, 118, 120, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-1.0F, -4.0F, -7.0F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1396F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 55, 48, -4.5F, -0.8F, -2.0F, 11, 16, 9, 0.0F, false));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(0.0F, -1.8F, -7.4F);
        this.Bodyfront.addChild(Neck1);


        this.Osteoderm_r12 = new AdvancedModelRenderer(this);
        this.Osteoderm_r12.setRotationPoint(0.0F, -3.8891F, -1.5617F);
        this.Neck1.addChild(Osteoderm_r12);
        this.setRotateAngle(Osteoderm_r12, 0.5847F, 0.0F, 0.0F);
        this.Osteoderm_r12.cubeList.add(new ModelBox(Osteoderm_r12, 121, 31, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Neckbase_r1 = new AdvancedModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.0F, -2.9F, -5.0F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, -0.1745F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 74, 74, -4.0F, -0.7F, 0.3F, 8, 11, 9, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck1.addChild(Neck2);


        this.Osteoderm_r13 = new AdvancedModelRenderer(this);
        this.Osteoderm_r13.setRotationPoint(0.0F, -4.3891F, -0.9617F);
        this.Neck2.addChild(Osteoderm_r13);
        this.setRotateAngle(Osteoderm_r13, 0.3665F, 0.0F, 0.0F);
        this.Osteoderm_r13.cubeList.add(new ModelBox(Osteoderm_r13, 48, 121, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r14 = new AdvancedModelRenderer(this);
        this.Osteoderm_r14.setRotationPoint(0.0F, -5.3891F, -3.2617F);
        this.Neck2.addChild(Osteoderm_r14);
        this.setRotateAngle(Osteoderm_r14, 0.3665F, 0.0F, 0.0F);
        this.Osteoderm_r14.cubeList.add(new ModelBox(Osteoderm_r14, 55, 121, -0.5F, -0.4775F, -2.0839F, 1, 2, 2, 0.001F, false));

        this.Neckfrontthroat_r1 = new AdvancedModelRenderer(this);
        this.Neckfrontthroat_r1.setRotationPoint(0.0F, 3.6499F, -9.062F);
        this.Neck2.addChild(Neckfrontthroat_r1);
        this.setRotateAngle(Neckfrontthroat_r1, -0.6545F, 0.0F, 0.0F);
        this.Neckfrontthroat_r1.cubeList.add(new ModelBox(Neckfrontthroat_r1, 65, 113, -2.5F, -4.224F, -3.0814F, 5, 4, 3, 0.2F, false));

        this.Neckmiddle_r1 = new AdvancedModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.0F, -5.0F, -5.0F);
        this.Neck2.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, -0.4014F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 55, 95, -3.0F, -0.4F, -0.4F, 6, 10, 7, -0.04F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, -3.0F, -5.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0436F, 0.0F, 0.0F);


        this.Osteoderm_r15 = new AdvancedModelRenderer(this);
        this.Osteoderm_r15.setRotationPoint(0.0F, -2.6891F, -0.9617F);
        this.Neck3.addChild(Osteoderm_r15);
        this.setRotateAngle(Osteoderm_r15, 0.7156F, 0.0F, 0.0F);
        this.Osteoderm_r15.cubeList.add(new ModelBox(Osteoderm_r15, 83, 121, -0.5F, -0.4654F, -1.4744F, 1, 2, 2, 0.001F, false));

        this.Osteoderm_r16 = new AdvancedModelRenderer(this);
        this.Osteoderm_r16.setRotationPoint(0.0F, -2.4891F, -3.3617F);
        this.Neck3.addChild(Osteoderm_r16);
        this.setRotateAngle(Osteoderm_r16, 0.8378F, 0.0F, 0.0F);
        this.Osteoderm_r16.cubeList.add(new ModelBox(Osteoderm_r16, 90, 121, -0.5F, -0.2772F, -1.2596F, 1, 2, 2, 0.001F, false));

        this.Neckfrontslope_r1 = new AdvancedModelRenderer(this);
        this.Neckfrontslope_r1.setRotationPoint(0.0F, -2.8F, -4.1F);
        this.Neck3.addChild(Neckfrontslope_r1);
        this.setRotateAngle(Neckfrontslope_r1, 0.637F, 0.0F, 0.0F);
        this.Neckfrontslope_r1.cubeList.add(new ModelBox(Neckfrontslope_r1, 0, 9, -2.5F, 0.5051F, -1.9105F, 5, 3, 2, -0.004F, false));

        this.Neckfront_r1 = new AdvancedModelRenderer(this);
        this.Neckfront_r1.setRotationPoint(0.0F, -2.4F, -3.9F);
        this.Neck3.addChild(Neckfront_r1);
        this.setRotateAngle(Neckfront_r1, 0.0262F, 0.0F, 0.0F);
        this.Neckfront_r1.cubeList.add(new ModelBox(Neckfront_r1, 0, 96, -3.0F, 0.0F, -0.1F, 6, 8, 4, -0.05F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.6F, -2.7F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.2618F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 96, 55, -3.0F, -2.8031F, -6.9948F, 6, 6, 7, 0.02F, false));

        this.Osteoderm_r17 = new AdvancedModelRenderer(this);
        this.Osteoderm_r17.setRotationPoint(0.0F, -2.7891F, -0.9617F);
        this.Head.addChild(Osteoderm_r17);
        this.setRotateAngle(Osteoderm_r17, 0.925F, 0.0F, 0.0F);
        this.Osteoderm_r17.cubeList.add(new ModelBox(Osteoderm_r17, 69, 121, -0.5F, -0.76F, -1.3598F, 1, 2, 2, 0.001F, false));

        this.Hornslope_r1 = new AdvancedModelRenderer(this);
        this.Hornslope_r1.setRotationPoint(0.0F, -3.4891F, -10.3617F);
        this.Head.addChild(Hornslope_r1);
        this.setRotateAngle(Hornslope_r1, -1.2483F, 0.0F, 0.0F);
        this.Hornslope_r1.cubeList.add(new ModelBox(Hornslope_r1, 61, 0, -0.5F, -0.0159F, 0.0351F, 1, 3, 2, -0.002F, false));

        this.Horn_r1 = new AdvancedModelRenderer(this);
        this.Horn_r1.setRotationPoint(0.0F, -1.4891F, -12.3617F);
        this.Head.addChild(Horn_r1);
        this.setRotateAngle(Horn_r1, -0.5065F, 0.0F, 0.0F);
        this.Horn_r1.cubeList.add(new ModelBox(Horn_r1, 75, 95, -0.5F, -2.735F, -1.1862F, 1, 4, 2, 0.0F, false));

        this.Rightcrestextensionslope_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestextensionslope_r1.setRotationPoint(-1.0F, -1.2891F, -8.7617F);
        this.Head.addChild(Rightcrestextensionslope_r1);
        this.setRotateAngle(Rightcrestextensionslope_r1, -1.0405F, -0.2422F, -0.3746F);
        this.Rightcrestextensionslope_r1.cubeList.add(new ModelBox(Rightcrestextensionslope_r1, 62, 121, -0.4891F, -3.3729F, -1.1109F, 1, 2, 2, -0.002F, true));

        this.Rightcrestextension_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestextension_r1.setRotationPoint(-1.0F, -1.2891F, -8.7617F);
        this.Head.addChild(Rightcrestextension_r1);
        this.setRotateAngle(Rightcrestextension_r1, -0.3424F, -0.2422F, -0.3746F);
        this.Rightcrestextension_r1.cubeList.add(new ModelBox(Rightcrestextension_r1, 91, 36, -0.4891F, -3.2729F, -0.7109F, 1, 4, 2, 0.0F, true));

        this.Rightcrestorbit_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestorbit_r1.setRotationPoint(-1.162F, 0.9878F, -7.8136F);
        this.Head.addChild(Rightcrestorbit_r1);
        this.setRotateAngle(Rightcrestorbit_r1, 0.3986F, -0.5861F, -0.2861F);
        this.Rightcrestorbit_r1.cubeList.add(new ModelBox(Rightcrestorbit_r1, 76, 121, -0.4167F, -1.6566F, 0.2671F, 1, 2, 2, 0.0F, true));

        this.Rightcrestfront_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestfront_r1.setRotationPoint(-1.162F, -1.9122F, -11.8136F);
        this.Head.addChild(Rightcrestfront_r1);
        this.setRotateAngle(Rightcrestfront_r1, 0.1514F, -0.2737F, -0.1149F);
        this.Rightcrestfront_r1.cubeList.add(new ModelBox(Rightcrestfront_r1, 36, 111, -0.1171F, -0.0646F, -0.0923F, 2, 2, 5, -0.1F, true));

        this.Rightcrestbase_r1 = new AdvancedModelRenderer(this);
        this.Rightcrestbase_r1.setRotationPoint(-1.162F, -2.0122F, -8.9136F);
        this.Head.addChild(Rightcrestbase_r1);
        this.setRotateAngle(Rightcrestbase_r1, 0.1883F, -0.5611F, -0.0181F);
        this.Rightcrestbase_r1.cubeList.add(new ModelBox(Rightcrestbase_r1, 41, 68, -0.4496F, -0.3289F, -0.4964F, 2, 2, 3, 0.0F, true));

        this.Leftcrestextensionslope_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestextensionslope_r1.setRotationPoint(1.0F, -1.2891F, -8.7617F);
        this.Head.addChild(Leftcrestextensionslope_r1);
        this.setRotateAngle(Leftcrestextensionslope_r1, -1.0405F, 0.2422F, 0.3746F);
        this.Leftcrestextensionslope_r1.cubeList.add(new ModelBox(Leftcrestextensionslope_r1, 62, 121, -0.5109F, -3.3729F, -1.1109F, 1, 2, 2, -0.002F, false));

        this.Leftcrestextension_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestextension_r1.setRotationPoint(1.0F, -1.2891F, -8.7617F);
        this.Head.addChild(Leftcrestextension_r1);
        this.setRotateAngle(Leftcrestextension_r1, -0.3424F, 0.2422F, 0.3746F);
        this.Leftcrestextension_r1.cubeList.add(new ModelBox(Leftcrestextension_r1, 91, 36, -0.5109F, -3.2729F, -0.7109F, 1, 4, 2, 0.0F, false));

        this.Leftcrestorbit_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestorbit_r1.setRotationPoint(1.162F, 0.9878F, -7.8136F);
        this.Head.addChild(Leftcrestorbit_r1);
        this.setRotateAngle(Leftcrestorbit_r1, 0.3986F, 0.5861F, 0.2861F);
        this.Leftcrestorbit_r1.cubeList.add(new ModelBox(Leftcrestorbit_r1, 76, 121, -0.5833F, -1.6566F, 0.2671F, 1, 2, 2, 0.0F, false));

        this.Leftcrestfront_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestfront_r1.setRotationPoint(1.162F, -1.9122F, -11.8136F);
        this.Head.addChild(Leftcrestfront_r1);
        this.setRotateAngle(Leftcrestfront_r1, 0.1514F, 0.2737F, 0.1149F);
        this.Leftcrestfront_r1.cubeList.add(new ModelBox(Leftcrestfront_r1, 36, 111, -1.8829F, -0.0646F, -0.0923F, 2, 2, 5, -0.1F, false));

        this.Leftcrestbase_r1 = new AdvancedModelRenderer(this);
        this.Leftcrestbase_r1.setRotationPoint(1.162F, -2.0122F, -8.9136F);
        this.Head.addChild(Leftcrestbase_r1);
        this.setRotateAngle(Leftcrestbase_r1, 0.1883F, 0.5611F, 0.0181F);
        this.Leftcrestbase_r1.cubeList.add(new ModelBox(Leftcrestbase_r1, 41, 68, -1.5504F, -0.3289F, -0.4964F, 2, 2, 3, 0.0F, false));

        this.Upperfrontteeth_r1 = new AdvancedModelRenderer(this);
        this.Upperfrontteeth_r1.setRotationPoint(-0.2F, 1.3109F, -15.3617F);
        this.Head.addChild(Upperfrontteeth_r1);
        this.setRotateAngle(Upperfrontteeth_r1, -0.3288F, 0.0F, 0.0F);
        this.Upperfrontteeth_r1.cubeList.add(new ModelBox(Upperfrontteeth_r1, 0, 42, -0.7F, -0.7877F, 0.264F, 2, 2, 4, 0.0F, false));

        this.Upperbackteeth_r1 = new AdvancedModelRenderer(this);
        this.Upperbackteeth_r1.setRotationPoint(-0.2F, 3.8109F, -11.6617F);
        this.Head.addChild(Upperbackteeth_r1);
        this.setRotateAngle(Upperbackteeth_r1, 0.0873F, 0.0F, 0.0F);
        this.Upperbackteeth_r1.cubeList.add(new ModelBox(Upperbackteeth_r1, 87, 0, -1.3F, -2.0646F, -0.0908F, 3, 2, 5, -0.002F, false));

        this.Upperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -1.1757F, -14.5298F);
        this.Head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.2998F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 37, 78, -1.0F, -0.0868F, -0.0058F, 2, 3, 3, 0.0F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -2.0891F, -11.7617F);
        this.Head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1218F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 0, 0, -1.0F, 0.165F, 0.2138F, 2, 3, 5, 0.2F, false));

        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(0.0F, -1.1891F, -14.5617F);
        this.Head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, -0.3201F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 51, 113, -1.5F, -0.063F, -0.0088F, 3, 3, 4, 0.0F, false));

        this.Upperjawbase_r1 = new AdvancedModelRenderer(this);
        this.Upperjawbase_r1.setRotationPoint(0.0F, 3.1109F, -6.9617F);
        this.Head.addChild(Upperjawbase_r1);
        this.setRotateAngle(Upperjawbase_r1, -0.0698F, 0.0F, 0.0F);
        this.Upperjawbase_r1.cubeList.add(new ModelBox(Upperjawbase_r1, 0, 110, -2.0F, -3.9384F, -4.7305F, 4, 4, 5, 0.0F, false));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, -2.7405F, -2.4923F);
        this.Head.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, 0.192F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 42, 94, -2.5F, -0.0329F, -1.5478F, 5, 2, 4, 0.001F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.9109F, 0.0383F);
        this.Head.addChild(Lowerjaw);
        this.setRotateAngle(Lowerjaw, -0.2025F, 0.0F, 0.0F);


        this.Lowerfrontteeth_r1 = new AdvancedModelRenderer(this);
        this.Lowerfrontteeth_r1.setRotationPoint(0.0F, 1.739F, -10.9003F);
        this.Lowerjaw.addChild(Lowerfrontteeth_r1);
        this.setRotateAngle(Lowerfrontteeth_r1, -0.1019F, 0.0F, 0.0F);
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 114, 13, -1.0F, -0.7374F, -4.3523F, 2, 3, 4, 0.0F, false));
        this.Lowerfrontteeth_r1.cubeList.add(new ModelBox(Lowerfrontteeth_r1, 19, 111, -1.5F, -0.2374F, -4.6523F, 3, 3, 5, -0.2F, false));

        this.Lowerbackteeth_r1 = new AdvancedModelRenderer(this);
        this.Lowerbackteeth_r1.setRotationPoint(0.0F, 0.839F, -11.5003F);
        this.Lowerjaw.addChild(Lowerbackteeth_r1);
        this.setRotateAngle(Lowerbackteeth_r1, 0.2F, 0.0F, 0.0F);
        this.Lowerbackteeth_r1.cubeList.add(new ModelBox(Lowerbackteeth_r1, 110, 40, -1.5F, -0.0255F, 0.074F, 3, 1, 5, 0.0F, false));

        this.Lowerjawfrontslope_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfrontslope_r1.setRotationPoint(0.0F, 0.139F, -6.9003F);
        this.Lowerjaw.addChild(Lowerjawfrontslope_r1);
        this.setRotateAngle(Lowerjawfrontslope_r1, 0.104F, 0.0F, 0.0F);
        this.Lowerjawfrontslope_r1.cubeList.add(new ModelBox(Lowerjawfrontslope_r1, 26, 68, -2.0F, 0.8557F, -4.6821F, 4, 3, 6, -0.102F, false));
        this.Lowerjawfrontslope_r1.cubeList.add(new ModelBox(Lowerjawfrontslope_r1, 26, 68, -2.0F, 0.8557F, -4.2821F, 4, 3, 6, -0.1F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.0F, 0.139F, -6.9003F);
        this.Lowerjaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.3047F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 63, 74, -2.0F, -0.0379F, -4.7241F, 4, 2, 5, -0.05F, false));

        this.Lowerjawbase_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(0.0F, 0.039F, -6.7003F);
        this.Lowerjaw.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, 0.2443F, 0.0F, 0.0F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 102, 88, -3.0F, 0.025F, -0.2132F, 6, 4, 7, 0.01F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 3.939F, -5.7003F);
        this.Lowerjaw.addChild(Throat);


        this.Throat_r1 = new AdvancedModelRenderer(this);
        this.Throat_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Throat.addChild(Throat_r1);
        this.setRotateAngle(Throat_r1, -0.0611F, 0.0F, 0.0F);
        this.Throat_r1.cubeList.add(new ModelBox(Throat_r1, 100, 69, -2.0F, -4.0011F, -0.24F, 4, 4, 9, 0.0F, false));

        this.Masseter = new AdvancedModelRenderer(this);
        this.Masseter.setRotationPoint(0.0F, 0.0F, -6.0F);
        this.Lowerjaw.addChild(Masseter);


        this.Masseter_r1 = new AdvancedModelRenderer(this);
        this.Masseter_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Masseter.addChild(Masseter_r1);
        this.setRotateAngle(Masseter_r1, -0.2007F, 0.0F, 0.0F);
        this.Masseter_r1.cubeList.add(new ModelBox(Masseter_r1, 42, 0, -3.0F, -4.0F, 0.0F, 6, 4, 6, -0.06F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(5.5F, 8.4F, -3.7F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, -0.7418F, 0.0F, 0.0F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 110, 30, -0.7F, -1.5703F, -0.7949F, 2, 3, 6, 0.001F, false));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.3F, -1.6F, 5.2F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -0.829F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 21, 96, -1.0F, 0.0871F, 0.0457F, 2, 2, 5, 0.0F, false));
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 0, 34, -1.0F, 0.7871F, 0.0457F, 2, 2, 5, -0.001F, false));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(1.0F, 1.6226F, 4.963F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0F, -0.3491F, 0.0F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 0, 68, -1.0F, -1.7F, 0.0F, 1, 3, 4, 0.0F, false));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-5.5F, 8.4F, -3.7F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, -0.7418F, 0.0F, 0.0F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 110, 30, -1.3F, -1.5703F, -0.7949F, 2, 3, 6, 0.001F, true));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(-0.3F, -1.6F, 5.2F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -0.829F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 21, 96, -1.0F, 0.0871F, 0.0457F, 2, 2, 5, 0.0F, true));
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 0, 34, -1.0F, 0.7871F, 0.0457F, 2, 2, 5, -0.001F, true));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(-1.0F, 1.6226F, 4.963F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0F, 0.3491F, 0.0F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 0, 68, 0.0F, -1.7F, 0.0F, 1, 3, 4, 0.0F, true));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(5.1F, 1.7F, 0.1F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.48F, 0.0F, 0.0F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 0, 68, -3.5F, -2.0F, -5.1F, 7, 16, 11, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(0.6F, 14.0F, -5.1F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 1.0908F, 0.0F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 82, 95, -2.7F, 0.0F, 0.0F, 5, 15, 5, 0.0F, false));
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 105, 0, -2.7F, 0.0F, 4.6F, 5, 15, 1, -0.001F, false));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(0.0F, 14.8174F, 5.662F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.829F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 103, 109, -2.1F, 0.0F, -4.0F, 4, 8, 4, 0.0F, false));

        this.Leftleg4 = new AdvancedModelRenderer(this);
        this.Leftleg4.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Leftleg3.addChild(Leftleg4);
        this.setRotateAngle(Leftleg4, 0.1745F, 0.0F, 0.0F);
        this.Leftleg4.cubeList.add(new ModelBox(Leftleg4, 91, 28, -3.1F, -0.6527F, -2.0304F, 6, 3, 4, 0.0F, false));

        this.Leftleg5 = new AdvancedModelRenderer(this);
        this.Leftleg5.setRotationPoint(0.0F, 0.7473F, -2.0304F);
        this.Leftleg4.addChild(Leftleg5);
        this.Leftleg5.cubeList.add(new ModelBox(Leftleg5, 103, 100, -3.1F, -1.4F, -4.4F, 6, 3, 5, -0.001F, false));

        this.Rightleg1 = new AdvancedModelRenderer(this);
        this.Rightleg1.setRotationPoint(-5.1F, 1.7F, 0.1F);
        this.Hips.addChild(Rightleg1);
        this.setRotateAngle(Rightleg1, -0.48F, 0.0F, 0.0F);
        this.Rightleg1.cubeList.add(new ModelBox(Rightleg1, 0, 68, -3.5F, -2.0F, -5.1F, 7, 16, 11, 0.0F, true));

        this.Rightleg2 = new AdvancedModelRenderer(this);
        this.Rightleg2.setRotationPoint(-0.6F, 14.0F, -5.1F);
        this.Rightleg1.addChild(Rightleg2);
        this.setRotateAngle(Rightleg2, 1.0908F, 0.0F, 0.0F);
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 82, 95, -2.3F, 0.0F, 0.0F, 5, 15, 5, 0.0F, true));
        this.Rightleg2.cubeList.add(new ModelBox(Rightleg2, 105, 0, -2.3F, 0.0F, 4.6F, 5, 15, 1, -0.001F, true));

        this.Rightleg3 = new AdvancedModelRenderer(this);
        this.Rightleg3.setRotationPoint(0.0F, 14.8174F, 5.662F);
        this.Rightleg2.addChild(Rightleg3);
        this.setRotateAngle(Rightleg3, -0.829F, 0.0F, 0.0F);
        this.Rightleg3.cubeList.add(new ModelBox(Rightleg3, 103, 109, -1.9F, 0.0F, -4.0F, 4, 8, 4, 0.0F, true));

        this.Rightleg4 = new AdvancedModelRenderer(this);
        this.Rightleg4.setRotationPoint(0.0F, 7.0F, -2.0F);
        this.Rightleg3.addChild(Rightleg4);
        this.setRotateAngle(Rightleg4, 0.1745F, 0.0F, 0.0F);
        this.Rightleg4.cubeList.add(new ModelBox(Rightleg4, 91, 28, -2.9F, -0.6527F, -2.0304F, 6, 3, 4, 0.0F, true));

        this.Rightleg5 = new AdvancedModelRenderer(this);
        this.Rightleg5.setRotationPoint(0.0F, 0.7473F, -2.0304F);
        this.Rightleg4.addChild(Rightleg5);
        this.Rightleg5.cubeList.add(new ModelBox(Rightleg5, 103, 100, -2.9F, -1.4F, -4.4F, 6, 3, 5, -0.001F, true));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, 1.0F, 8.6F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.1745F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 46, 23, -5.0F, -3.0304F, -2.6527F, 11, 13, 11, 0.0F, false));

        this.Osteoderm_r18 = new AdvancedModelRenderer(this);
        this.Osteoderm_r18.setRotationPoint(0.5F, -4.3195F, 2.1856F);
        this.Tail1.addChild(Osteoderm_r18);
        this.setRotateAngle(Osteoderm_r18, 0.7243F, 0.0F, 0.0F);
        this.Osteoderm_r18.cubeList.add(new ModelBox(Osteoderm_r18, 119, 21, -0.5F, 2.6164F, 0.4769F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r18.cubeList.add(new ModelBox(Osteoderm_r18, 41, 119, -0.5F, 0.5373F, -1.7675F, 1, 2, 2, 0.001F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 1.9696F, 8.3473F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, 0.0873F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 57, 0, -4.0F, -5.0F, -2.0F, 9, 10, 11, 0.0F, false));

        this.Osteoderm_r19 = new AdvancedModelRenderer(this);
        this.Osteoderm_r19.setRotationPoint(0.5F, -6.2891F, -6.1617F);
        this.Tail2.addChild(Osteoderm_r19);
        this.setRotateAngle(Osteoderm_r19, 0.7243F, 0.0F, 0.0F);
        this.Osteoderm_r19.cubeList.add(new ModelBox(Osteoderm_r19, 118, 0, -0.5F, 9.2497F, 8.0113F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r19.cubeList.add(new ModelBox(Osteoderm_r19, 118, 5, -0.5F, 7.3045F, 5.7187F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r19.cubeList.add(new ModelBox(Osteoderm_r19, 118, 69, -0.5F, 5.1984F, 3.5451F, 1, 2, 2, 0.001F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 9.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, 0.0873F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 37, 74, -3.0F, -5.0F, -2.0F, 7, 8, 11, 0.0F, false));

        this.Osteoderm_r20 = new AdvancedModelRenderer(this);
        this.Osteoderm_r20.setRotationPoint(0.5F, -6.2891F, -15.1617F);
        this.Tail3.addChild(Osteoderm_r20);
        this.setRotateAngle(Osteoderm_r20, 0.7243F, 0.0F, 0.0F);
        this.Osteoderm_r20.cubeList.add(new ModelBox(Osteoderm_r20, 116, 83, -0.5F, 15.491F, 15.1586F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r20.cubeList.add(new ModelBox(Osteoderm_r20, 88, 116, -0.5F, 13.6357F, 13.0615F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r20.cubeList.add(new ModelBox(Osteoderm_r20, 95, 116, -0.5F, 11.5153F, 10.6648F, 1, 2, 2, 0.001F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, -2.0F, 9.0F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 87, 36, -2.0F, -3.0F, -1.0F, 5, 6, 12, -0.002F, false));

        this.Osteoderm_r21 = new AdvancedModelRenderer(this);
        this.Osteoderm_r21.setRotationPoint(0.5F, -4.2891F, -24.1617F);
        this.Tail4.addChild(Osteoderm_r21);
        this.setRotateAngle(Osteoderm_r21, 0.7243F, 0.0F, 0.0F);
        this.Osteoderm_r21.cubeList.add(new ModelBox(Osteoderm_r21, 46, 111, -0.5F, 22.0596F, 22.4321F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r21.cubeList.add(new ModelBox(Osteoderm_r21, 116, 55, -0.5F, 19.9392F, 20.0354F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r21.cubeList.add(new ModelBox(Osteoderm_r21, 81, 116, -0.5F, 17.8188F, 17.6388F, 1, 2, 2, 0.001F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, -2.0F, 11.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, -0.1309F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 84, 8, -1.0F, -0.8017F, -0.9739F, 3, 5, 14, 0.0F, false));

        this.Osteoderm_r22 = new AdvancedModelRenderer(this);
        this.Osteoderm_r22.setRotationPoint(0.5F, -2.2891F, -35.1617F);
        this.Tail5.addChild(Osteoderm_r22);
        this.setRotateAngle(Osteoderm_r22, 0.7243F, 0.0F, 0.0F);
        this.Osteoderm_r22.cubeList.add(new ModelBox(Osteoderm_r22, 31, 111, -0.5F, 24.5963F, 24.9015F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r22.cubeList.add(new ModelBox(Osteoderm_r22, 14, 110, -0.5F, 26.8561F, 27.3578F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r22.cubeList.add(new ModelBox(Osteoderm_r22, 109, 83, -0.5F, 29.0331F, 29.8699F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r22.cubeList.add(new ModelBox(Osteoderm_r22, 42, 101, -0.5F, 31.3199F, 32.1873F, 1, 2, 2, 0.001F, false));

        this.Tail6 = new AdvancedModelRenderer(this);
        this.Tail6.setRotationPoint(0.0F, 0.2F, 13.4F);
        this.Tail5.addChild(Tail6);
        this.setRotateAngle(Tail6, -0.1745F, 0.0F, 0.0F);
        this.Tail6.cubeList.add(new ModelBox(Tail6, 24, 94, -0.5F, -0.8093F, -0.9399F, 2, 3, 13, 0.0F, false));

        this.Osteoderm_r23 = new AdvancedModelRenderer(this);
        this.Osteoderm_r23.setRotationPoint(0.5F, -2.4891F, -48.5617F);
        this.Tail6.addChild(Osteoderm_r23);
        this.setRotateAngle(Osteoderm_r23, 0.7243F, 0.0F, 0.0F);
        this.Osteoderm_r23.cubeList.add(new ModelBox(Osteoderm_r23, 80, 28, -0.5F, 37.9723F, 38.9359F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r23.cubeList.add(new ModelBox(Osteoderm_r23, 91, 43, -0.5F, 36.428F, 37.4342F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r23.cubeList.add(new ModelBox(Osteoderm_r23, 96, 55, -0.5F, 34.8837F, 35.9325F, 1, 2, 2, 0.001F, false));
        this.Osteoderm_r23.cubeList.add(new ModelBox(Osteoderm_r23, 105, 17, -0.5F, 33.5221F, 34.3495F, 1, 2, 2, 0.001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Hips.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Lowerjaw.rotateAngleX = (float) Math.toRadians(23.9);
        this.Neck1.offsetY = -0.01F;
        this.Neck1.render(0.01F);
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyfront_r1, 0.1396F, 0.0F, 0.0F);
        this.setRotateAngle(Bodyfront, 0.0436F, 0.0436F, 0.0F);
        this.setRotateAngle(Bodymiddle, -0.2182F, 0.0F, 0.0F);
        this.setRotateAngle(Head, 0.3054F, 0.0436F, 0.0F);
        this.setRotateAngle(Headslope_r1, 0.192F, 0.0F, 0.0F);
        this.setRotateAngle(Hips_r1, -0.1134F, 0.0F, 0.0F);
        this.setRotateAngle(Hips, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Horn_r1, -0.5065F, 0.0F, 0.0F);
        this.setRotateAngle(Hornslope_r1, -1.2483F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm1, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm2, -0.829F, 0.0F, 0.0F);
        this.setRotateAngle(Leftarm3, 0.0F, -0.3491F, 0.0F);
        this.setRotateAngle(Leftcrestbase_r1, 0.1883F, 0.5611F, 0.0181F);
        this.setRotateAngle(Leftcrestextension_r1, -0.3424F, 0.2422F, 0.3746F);
        this.setRotateAngle(Leftcrestextensionslope_r1, -1.0405F, 0.2422F, 0.3746F);
        this.setRotateAngle(Leftcrestfront_r1, 0.1514F, 0.2737F, 0.1149F);
        this.setRotateAngle(Leftcrestorbit_r1, 0.3986F, 0.5861F, 0.2861F);
        this.setRotateAngle(Leftleg1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg2, 0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg3, -1.0036F, 0.0F, 0.0F);
        this.setRotateAngle(Leftleg4, 0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerbackteeth_r1, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerfrontteeth_r1, -0.1019F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.0157F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawbase_r1, 0.2443F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawfrontslope_r1, 0.104F, 0.0F, 0.0F);
        this.setRotateAngle(Lowerjawmiddle_r1, 0.3047F, 0.0F, 0.0F);
        this.setRotateAngle(Masseter_r1, -0.2007F, 0.0F, 0.0F);
        this.setRotateAngle(Neck1, 0.2618F, 0.0873F, 0.0F);
        this.setRotateAngle(Neck2, 0.1745F, 0.0873F, 0.0F);
        this.setRotateAngle(Neck3, 0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Neckbase_r1, -0.1745F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfront_r1, 0.0262F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfrontslope_r1, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(Neckfrontthroat_r1, -0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(Neckmiddle_r1, -0.4014F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r1, 0.5061F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r10, 0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r11, 0.8901F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r12, 0.5847F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r13, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r14, 0.3665F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r15, 0.7156F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r16, 0.8378F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r17, 0.925F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r18, 0.7243F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r19, 0.7243F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r2, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r20, 0.7243F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r21, 0.7243F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r22, 0.7243F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r23, 0.7243F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r3, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r4, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r5, 0.637F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r6, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r7, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r8, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(Osteoderm_r9, 0.7679F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm1, -0.7418F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm2, -0.829F, 0.0F, 0.0F);
        this.setRotateAngle(Rightarm3, 0.0F, 0.3491F, 0.0F);
        this.setRotateAngle(Rightcrestbase_r1, 0.1883F, -0.5611F, -0.0181F);
        this.setRotateAngle(Rightcrestextension_r1, -0.3424F, -0.2422F, -0.3746F);
        this.setRotateAngle(Rightcrestextensionslope_r1, -1.0405F, -0.2422F, -0.3746F);
        this.setRotateAngle(Rightcrestfront_r1, 0.1514F, -0.2737F, -0.1149F);
        this.setRotateAngle(Rightcrestorbit_r1, 0.3986F, -0.5861F, -0.2861F);
        this.setRotateAngle(Rightleg1, -0.9599F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg2, 1.3963F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg3, -0.6981F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg4, 0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(Rightleg5, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(Tail1, -0.1745F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail3, 0.0873F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail5, -0.1309F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail6, -0.1745F, -0.0873F, 0.0F);
        this.setRotateAngle(Throat_r1, -0.0611F, 0.0F, 0.0F);
        this.setRotateAngle(Upperbackteeth_r1, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(Upperfrontteeth_r1, -0.3288F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawbase_r1, -0.0698F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawfront_r1, -0.3201F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1218F, 0.0F, 0.0F);
        this.setRotateAngle(Upperjawslopefront_r1, 0.2998F, 0.0F, 0.0F);
        this.Hips.offsetY =  -0.148F;
        this.Hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraCeratosaurus EntityCerato = (EntityPrehistoricFloraCeratosaurus) e;

        this.faceTarget(f3, f4, 8, Neck1);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5, this.Tail6};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        AdvancedModelRenderer[] ArmL = {this.Leftarm1, this.Leftarm2, this.Leftarm3};
        AdvancedModelRenderer[] ArmR = {this.Rightarm1, this.Rightarm2, this.Rightarm3};

        EntityCerato.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityCerato.getAnimation() == EntityCerato.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityCerato.isReallyInWater()) {

                if (f3 == 0.0F || !EntityCerato.getIsMoving()) {
                    if (EntityCerato.getAnimation() != EntityCerato.EAT_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.walk(this.Leftarm1, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.Rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.Leftarm1, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.Rightarm1, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityCerato.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5)) + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5)) + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*2.5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*2.5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-2.5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-2.5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-2.5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*2.5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*2.5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-2.5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-2.5))));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)) + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)) + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-10D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*-5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+30))*5))));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)) + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)) + (((tickAnim - 0D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-2.5)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-10D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5)) + (((tickAnim - 10D) / 5D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*5)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*20D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*10)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*10))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10))));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*20D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*2.5))));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));










        if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-2.5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-2.5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*2.5)) + (((tickAnim - 15D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*2.5))));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-5) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+30))*-5D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*40D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*40) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*1D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*40D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*30D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*30D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-20) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-20D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*10D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*-30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*10D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+50))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+50))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+50))*10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*10) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*-1D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*10D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*-1) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*-1D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Masseter, Masseter.rotateAngleX + (float) Math.toRadians(xx), Masseter.rotateAngleY + (float) Math.toRadians(yy), Masseter.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*20) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*20D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-60))*-30D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-20) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75))*-20D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*-10D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-60))*-10D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*5) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2))*5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75-30))*-20D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2+60))*10D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.5))*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 5D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*30) + (((tickAnim - 10D) / 5D) * (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/0.75+60))*30D)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 15D) / 15D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-10) + (((tickAnim - 15D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/30D)*180/2-30))*-10D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*15) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*15D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-3)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-5)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*3)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*3))));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*5)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-3)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*3)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*3))));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*10) + (((tickAnim - 15D) / 10D) * (20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-60))*10D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-5)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*-5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*3)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1))*-10) + (((tickAnim - 25D) / 15D) * (0D-(20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1))*-10D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*5)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-3)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2))*-3))));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*60D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3)) + (((tickAnim - 0D) / 15D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*60) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*20D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*60D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25+60))*-5)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2+60))*-5))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25+60))*-5)));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25+60))*3)) + (((tickAnim - 15D) / 10D) * (-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2+60))*3))-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1.25+60))*3)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*20) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*20D)));
            yy = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2+60))*-5)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2+60))*-5))));
            zz = -((Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2+60))*3)) + (((tickAnim - 25D) / 15D) * (0D-(-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/2+60))*3))));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+90))*-10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+90))*-10) + (((tickAnim - 15D) / 10D) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+90))*-10D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -20+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*5) + (((tickAnim - 25D) / 15D) * (0D-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1+30))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*10D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*10) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*10D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*30D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*30) + (((tickAnim - 15D) / 10D) * (15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*30D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 15+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-5) + (((tickAnim - 25D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*-5D-(15+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1-30))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*-5) + (((tickAnim - 35D) / 5D) * (0D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*360/1-30))*-5D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-15) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-15D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-30D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-30) + (((tickAnim - 15D) / 10D) * (5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+30))*-30D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5+(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1))*-5) + (((tickAnim - 25D) / 15D) * (0D-(5+Math.sin((Math.PI/180)*(((double)tickAnim/40D)*720/1))*-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(xx), Throat.rotateAngleY + (float) Math.toRadians(yy), Throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*-3D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*-5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25+60))*3D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*-3D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25-30))*-5D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+60))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5) + (((tickAnim - 0D) / 15D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-15D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/0.75))*5D)));
            yy = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-15) + (((tickAnim - 15D) / 10D) * (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/1.25))*-15D)));
            yy = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 15D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = (Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5) + (((tickAnim - 25D) / 15D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/40D)*180/2+30))*5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;

        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-20))*2), Hips.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*3)), Hips.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5) + (((tickAnim - 0D) / 7D) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = 0.75+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25) + (((tickAnim - 7D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5D-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 7D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5) + (((tickAnim - 13D) / 12D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 13D) / 12D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5) + (((tickAnim - 25D) / 7D) * (0.75+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = 0.75+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25) + (((tickAnim - 32D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.5D-(0.75+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5+10))*-0.25D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75) + (((tickAnim - 32D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*720/2.5))*0.75D)));
        } else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*-3)), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-30))*-1), Bodyfront.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+40))*-1)), Bodyfront.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+40))*-1)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-60))*5), Neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-40))*-3)), Neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-40))*-1)));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+60))*10), Neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*3)), Neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*1)));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*-10), Neck3.rotateAngleY + (float) Math.toRadians(0), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+50))*2.5), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-60))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*-5), Leftarm1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*-5), Leftarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-110))*5)));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-120))*5), Leftarm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+90))*5)));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*5), Leftarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 12.5D + (((tickAnim - 0D) / 10D) * (7.5D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 7.5D + (((tickAnim - 10D) / 8D) * (-27.5D-(7.5D)));
            yy = -5D + (((tickAnim - 10D) / 8D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 10D) / 8D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5D + (((tickAnim - 18D) / 7D) * (-30D-(-27.5D)));
            yy = -5D + (((tickAnim - 18D) / 7D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 7D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -30D + (((tickAnim - 25D) / 13D) * (-12.5D-(-30D)));
            yy = -5D + (((tickAnim - 25D) / 13D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 25D) / 13D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -12.5D + (((tickAnim - 38D) / 12D) * (12.5D-(-12.5D)));
            yy = -2.5D + (((tickAnim - 38D) / 12D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 38D) / 12D) * (0D-(-2.5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 0D) / 10D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
            yy = 0.5+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5) + (((tickAnim - 44D) / 6D) * (1D-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 0D) / 10D) * (20D-(-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 20D + (((tickAnim - 10D) / 8D) * (25D-(20D)));
            yy = -2.5D + (((tickAnim - 10D) / 8D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 8D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 25D + (((tickAnim - 18D) / 7D) * (-10D-(25D)));
            yy = -2.5D + (((tickAnim - 18D) / 7D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 18D) / 7D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = -10D + (((tickAnim - 25D) / 13D) * (5D-(-10D)));
            yy = -2.5D + (((tickAnim - 25D) / 13D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 25D) / 13D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 5D + (((tickAnim - 38D) / 12D) * (-2.5D-(5D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 44D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 30D + (((tickAnim - 0D) / 10D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 10D) / 8D) * (-27.5D-(-10D)));
            yy = 2.5D + (((tickAnim - 10D) / 8D) * (5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 8D) * (5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -27.5D + (((tickAnim - 18D) / 7D) * (27.5D-(-27.5D)));
            yy = 5D + (((tickAnim - 18D) / 7D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 18D) / 7D) * (0D-(5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 27.5D + (((tickAnim - 25D) / 13D) * (17.5D-(27.5D)));
            yy = 2.5D + (((tickAnim - 25D) / 13D) * (2.5D-(2.5D)));
            zz = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 17.5D + (((tickAnim - 38D) / 12D) * (30D-(17.5D)));
            yy = 2.5D + (((tickAnim - 38D) / 12D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 25D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 44) {
            xx = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 44D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 44D) / 6D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 7.5D + (((tickAnim - 0D) / 10D) * (80D-(7.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 80D + (((tickAnim - 10D) / 8D) * (70D-(80D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 70D + (((tickAnim - 18D) / 7D) * (12.5D-(70D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 12.5D + (((tickAnim - 25D) / 13D) * (-10D-(12.5D)));
            yy = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -10D + (((tickAnim - 38D) / 12D) * (7.5D-(-10D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -47.5D + (((tickAnim - 0D) / 10D) * (30D-(-47.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 30D + (((tickAnim - 10D) / 8D) * (50D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 50D + (((tickAnim - 18D) / 7D) * (0D-(50D)));
            yy = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 38D) / 12D) * (-47.5D-(0D)));
            yy = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+50))*-2), Tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*-4)), Tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+50))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-10))*-2), Tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-30))*-5)), Tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-30))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-30))*-2), Tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*-7.5)), Tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*-3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-60))*-2), Tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-70))*-5)), Tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-70))*3)));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05) + (((tickAnim - 32D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-80))*-2), Tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-90))*-5)), Tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-90))*3)));


        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-100))*-2), Tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-120))*-5)), Tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-120))*3)));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+70))*-5), Rightarm1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-60))*5), Rightarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-80))*-5)));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5-50))*-5), Rightarm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+70))*5), Rightarm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*360/2.5+30))*-5)));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5-50))*5), Rightarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -30D + (((tickAnim - 0D) / 13D) * (-12.5D-(-30D)));
            yy = 5D + (((tickAnim - 0D) / 13D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 13D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -12.5D + (((tickAnim - 13D) / 12D) * (12.5D-(-12.5D)));
            yy = 2.5D + (((tickAnim - 13D) / 12D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 12D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 12.5D + (((tickAnim - 25D) / 10D) * (7.5D-(12.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 7.5D + (((tickAnim - 35D) / 8D) * (-27.5D-(7.5D)));
            yy = 5D + (((tickAnim - 35D) / 8D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 35D) / 8D) * (5D-(5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5D + (((tickAnim - 43D) / 7D) * (-30D-(-27.5D)));
            yy = 5D + (((tickAnim - 43D) / 7D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 43D) / 7D) * (5D-(5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*0.5D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 6D) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
            yy = 0.5+(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5) + (((tickAnim - 19D) / 6D) * (1D-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*0.5D)));
            zz = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 25D) / 10D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 0D) / 13D) * (5D-(-10D)));
            yy = 2.5D + (((tickAnim - 0D) / 13D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 13D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 5D + (((tickAnim - 13D) / 12D) * (-2.5D-(5D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -2.5D + (((tickAnim - 25D) / 10D) * (20D-(-2.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 20D + (((tickAnim - 35D) / 8D) * (25D-(20D)));
            yy = 2.5D + (((tickAnim - 35D) / 8D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 35D) / 8D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 25D + (((tickAnim - 43D) / 7D) * (-10D-(25D)));
            yy = 2.5D + (((tickAnim - 43D) / 7D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 43D) / 7D) * (-2.5D-(2.5D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 19D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 27.5D + (((tickAnim - 0D) / 13D) * (17.5D-(27.5D)));
            yy = -2.5D + (((tickAnim - 0D) / 13D) * (-2.5D-(-2.5D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 17.5D + (((tickAnim - 13D) / 12D) * (30D-(17.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 12D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 30D + (((tickAnim - 25D) / 10D) * (-10D-(30D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -10D + (((tickAnim - 35D) / 8D) * (-27.5D-(-10D)));
            yy = -2.5D + (((tickAnim - 35D) / 8D) * (-5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 35D) / 8D) * (-5D-(2.5D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -27.5D + (((tickAnim - 43D) / 7D) * (27.5D-(-27.5D)));
            yy = -5D + (((tickAnim - 43D) / 7D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 43D) / 7D) * (0D-(-5D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35) + (((tickAnim - 7D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.3))*-0.35D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25) + (((tickAnim - 19D) / 6D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/50D)*360/0.4))*-0.25D)));
            zz = 0D + (((tickAnim - 19D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 25D) * (0D-(0D)));
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 0D) / 13D) * (-10D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -10D + (((tickAnim - 13D) / 12D) * (7.5D-(-10D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 7.5D + (((tickAnim - 25D) / 10D) * (80D-(7.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 80D + (((tickAnim - 35D) / 8D) * (70D-(80D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 70D + (((tickAnim - 43D) / 7D) * (12.5D-(70D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 13D) / 12D) * (-47.5D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -47.5D + (((tickAnim - 25D) / 10D) * (30D-(-47.5D)));
            yy = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 30D + (((tickAnim - 35D) / 8D) * (50D-(30D)));
            yy = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 8D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 50D + (((tickAnim - 43D) / 7D) * (0D-(50D)));
            yy = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 43D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/50D)*2.5D)*720/2.5+30))*2.5), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+60))*-3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+60))*-2));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5) + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2) + (((tickAnim - 3D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 3D) / 1D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5) + (((tickAnim - 4D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 4D) / 6D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5) + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2) + (((tickAnim - 12D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+50))*0.5D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.2D)));
            zz = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25) + (((tickAnim - 12D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720+10))*1.25D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-60))*-2), Bodymiddle.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-3)), Bodymiddle.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-1)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+10))*-1), Bodyfront.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+80))*-1)), Bodyfront.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+80))*-1)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+50))*-5), Neck1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*-1)), Neck1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*-1)));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+70))*5), Neck2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*2)), Neck2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*1)));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720))*5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-0.5), Neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-2), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*1), Lowerjaw.rotateAngleY + (float) Math.toRadians(0), Lowerjaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+70))*-5), Leftarm1.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-60))*5), Leftarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-80))*5)));


        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-50))*-5), Leftarm2.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+70))*5), Leftarm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-5)));


        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(0), Leftarm3.rotateAngleY + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720/2.5-50))*5), Leftarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5D + (((tickAnim - 0D) / 3D) * (-5D-(12.5D)));
            yy = 2.5D + (((tickAnim - 0D) / 3D) * (-5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 0D) / 3D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -5D + (((tickAnim - 3D) / 5D) * (-37.5D-(-5D)));
            yy = -5D + (((tickAnim - 3D) / 5D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 3D) / 5D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -37.5D + (((tickAnim - 8D) / 2D) * (-27.5D-(-37.5D)));
            yy = -5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -27.5D + (((tickAnim - 10D) / 4D) * (-12.5D-(-27.5D)));
            yy = -2.5D + (((tickAnim - 10D) / 4D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -12.5D + (((tickAnim - 14D) / 4D) * (10D-(-12.5D)));
            yy = -2.5D + (((tickAnim - 14D) / 4D) * (2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 14D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 18D) / 2D) * (12.5D-(10D)));
            yy = 2.5D + (((tickAnim - 18D) / 2D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-2.5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4) + (((tickAnim - 12D) / 2D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4) + (((tickAnim - 16D) / 2D) * (1D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 18D) / 2D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 12.5D + (((tickAnim - 0D) / 3D) * (22.5D-(12.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (2.5D-(0D)));
            zz = 2.5D + (((tickAnim - 0D) / 3D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 22.5D + (((tickAnim - 3D) / 5D) * (22.5D-(22.5D)));
            yy = 2.5D + (((tickAnim - 3D) / 5D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 3D) / 5D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 8D) / 2D) * (-25D-(22.5D)));
            yy = 2.5D + (((tickAnim - 8D) / 2D) * (2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -25D + (((tickAnim - 10D) / 4D) * (5D-(-25D)));
            yy = 2.5D + (((tickAnim - 10D) / 4D) * (-2.5D-(2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 4D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 5D + (((tickAnim - 14D) / 4D) * (-2.5D-(5D)));
            yy = -2.5D + (((tickAnim - 14D) / 4D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 14D) / 4D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 18D) / 2D) * (12.5D-(-2.5D)));
            yy = -2.5D + (((tickAnim - 18D) / 2D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (2.5D-(2.5D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3) + (((tickAnim - 12D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25D + (((tickAnim - 0D) / 3D) * (-20D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -20D + (((tickAnim - 3D) / 5D) * (-22.5D-(-20D)));
            yy = 2.5D + (((tickAnim - 3D) / 5D) * (5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 3D) / 5D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -22.5D + (((tickAnim - 8D) / 2D) * (20D-(-22.5D)));
            yy = 5D + (((tickAnim - 8D) / 2D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 8D) / 2D) * (5D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 20D + (((tickAnim - 10D) / 4D) * (15D-(20D)));
            yy = 2.5D + (((tickAnim - 10D) / 4D) * (2.5D-(2.5D)));
            zz = 5D + (((tickAnim - 10D) / 4D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15D + (((tickAnim - 14D) / 4D) * (35D-(15D)));
            yy = 2.5D + (((tickAnim - 14D) / 4D) * (0D-(2.5D)));
            zz = 2.5D + (((tickAnim - 14D) / 4D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 35D + (((tickAnim - 18D) / 2D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3) + (((tickAnim - 12D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2) + (((tickAnim - 16D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 67.5D + (((tickAnim - 0D) / 3D) * (87.5D-(67.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 87.5D + (((tickAnim - 3D) / 5D) * (77.5D-(87.5D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 77.5D + (((tickAnim - 8D) / 2D) * (35D-(77.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 35D + (((tickAnim - 10D) / 4D) * (-10D-(35D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 14D) / 4D) * (22.5D-(-10D)));
            yy = 2.5D + (((tickAnim - 14D) / 4D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 18D) / 2D) * (67.5D-(22.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25D + (((tickAnim - 0D) / 3D) * (35D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 35D + (((tickAnim - 3D) / 5D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 25D + (((tickAnim - 8D) / 2D) * (-2.5D-(25D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -2.5D + (((tickAnim - 10D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 14D) / 4D) * (-67.5D-(0D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -67.5D + (((tickAnim - 18D) / 2D) * (25D-(-67.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-3), Tail1.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*3)), Tail1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-30))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*-3), Tail2.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*5)), Tail2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-90))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-90))*-3), Tail3.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*5)), Tail3.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*-2)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-120))*-3), Tail4.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-150))*7.5)), Tail4.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-150))*-3)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-150))*-3), Tail5.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-160))*7.5)), Tail5.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-160))*-3)));

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 3D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05) + (((tickAnim - 13D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.05D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail5.offsetX = (float) Math.toRadians(xx);
        this.Tail5.offsetY = (float) Math.toRadians(yy);
        this.Tail5.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-180))*-3), Tail6.rotateAngleY + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-180))*7.5)), Tail6.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-180))*-3)));


        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*-5), Rightarm1.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*-5), Rightarm1.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-110))*5)));


        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+30))*5), Rightarm2.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360-120))*5), Rightarm2.rotateAngleZ + (float) Math.toRadians(-(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*360+90))*5)));


        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(0), Rightarm3.rotateAngleY + (float) Math.toRadians(10+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720+30))*5), Rightarm3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -27.5D + (((tickAnim - 0D) / 4D) * (-12.5D-(-27.5D)));
            yy = 2.5D + (((tickAnim - 0D) / 4D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -12.5D + (((tickAnim - 4D) / 4D) * (10D-(-12.5D)));
            yy = 2.5D + (((tickAnim - 4D) / 4D) * (-2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 4D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10D + (((tickAnim - 8D) / 2D) * (12.5D-(10D)));
            yy = -2.5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 8D) / 2D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 10D) / 3D) * (-5D-(12.5D)));
            yy = -2.5D + (((tickAnim - 10D) / 3D) * (5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 3D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -5D + (((tickAnim - 13D) / 5D) * (-37.5D-(-5D)));
            yy = 5D + (((tickAnim - 13D) / 5D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 13D) / 5D) * (5D-(5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -37.5D + (((tickAnim - 18D) / 2D) * (-27.5D-(-37.5D)));
            yy = 5D + (((tickAnim - 18D) / 2D) * (2.5D-(5D)));
            zz = 5D + (((tickAnim - 18D) / 2D) * (2.5D-(5D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4) + (((tickAnim - 3D) / 1D) * (0D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = 1+(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4) + (((tickAnim - 6D) / 2D) * (1D-(1+Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*0.4D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 8D) / 2D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -25D + (((tickAnim - 0D) / 4D) * (5D-(-25D)));
            yy = -2.5D + (((tickAnim - 0D) / 4D) * (2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 0D) / 4D) * (2.5D-(2.5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 4D) / 4D) * (-2.5D-(5D)));
            yy = 2.5D + (((tickAnim - 4D) / 4D) * (2.5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 4D) / 4D) * (-2.5D-(2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 8D) / 2D) * (12.5D-(-2.5D)));
            yy = 2.5D + (((tickAnim - 8D) / 2D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 8D) / 2D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 12.5D + (((tickAnim - 10D) / 3D) * (22.5D-(12.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-2.5D-(0D)));
            zz = -2.5D + (((tickAnim - 10D) / 3D) * (-2.5D-(-2.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 22.5D + (((tickAnim - 13D) / 5D) * (22.5D-(22.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 5D) * (-2.5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 13D) / 5D) * (2.5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 18D) / 2D) * (-25D-(22.5D)));
            yy = -2.5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 18D) / 2D) * (2.5D-(2.5D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3) + (((tickAnim - 3D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2) + (((tickAnim - 6D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        this.Rightleg2.offsetX = (float) Math.toRadians(xx);
        this.Rightleg2.offsetY = (float) Math.toRadians(yy);
        this.Rightleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 20D + (((tickAnim - 0D) / 4D) * (15D-(20D)));
            yy = -2.5D + (((tickAnim - 0D) / 4D) * (-2.5D-(-2.5D)));
            zz = -5D + (((tickAnim - 0D) / 4D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 15D + (((tickAnim - 4D) / 4D) * (35D-(15D)));
            yy = -2.5D + (((tickAnim - 4D) / 4D) * (0D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 4D) / 4D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 35D + (((tickAnim - 8D) / 2D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25D + (((tickAnim - 10D) / 3D) * (-20D-(25D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -20D + (((tickAnim - 13D) / 5D) * (-22.5D-(-20D)));
            yy = -2.5D + (((tickAnim - 13D) / 5D) * (-5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 13D) / 5D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -22.5D + (((tickAnim - 18D) / 2D) * (20D-(-22.5D)));
            yy = -5D + (((tickAnim - 18D) / 2D) * (-2.5D-(-5D)));
            zz = -5D + (((tickAnim - 18D) / 2D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3) + (((tickAnim - 3D) / 1D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.3D)));
            zz = 0D + (((tickAnim - 3D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 2D) * (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2) + (((tickAnim - 6D) / 2D) * (0D-(Math.sin((Math.PI/180)*(((double)tickAnim/20D)*720/0.3))*-0.2D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 12D) * (0D-(0D)));
        }
        this.Rightleg3.offsetX = (float) Math.toRadians(xx);
        this.Rightleg3.offsetY = (float) Math.toRadians(yy);
        this.Rightleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 35D + (((tickAnim - 0D) / 4D) * (-10D-(35D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -10D + (((tickAnim - 4D) / 4D) * (22.5D-(-10D)));
            yy = -2.5D + (((tickAnim - 4D) / 4D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 8D) / 2D) * (67.5D-(22.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 67.5D + (((tickAnim - 10D) / 3D) * (87.5D-(67.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 87.5D + (((tickAnim - 13D) / 5D) * (77.5D-(87.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 77.5D + (((tickAnim - 18D) / 2D) * (35D-(77.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -2.5D + (((tickAnim - 0D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 4D) / 4D) * (-67.5D-(0D)));
            yy = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -67.5D + (((tickAnim - 8D) / 2D) * (25D-(-67.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25D + (((tickAnim - 10D) / 3D) * (35D-(25D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 35D + (((tickAnim - 13D) / 5D) * (25D-(35D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 25D + (((tickAnim - 18D) / 2D) * (-2.5D-(25D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Throat, Throat.rotateAngleX + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)*720-30))*-2), Throat.rotateAngleY + (float) Math.toRadians(0), Throat.rotateAngleZ + (float) Math.toRadians(0));
    }

    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10) + (((tickAnim - 10D) / 10D) * (-5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*2D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -5+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*2) + (((tickAnim - 20D) / 30D) * (0D-(-5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*2D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.5D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-1) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*0.5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-1D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*0.5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*0.5D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*1) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D)));
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*-10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*5D)));
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*3) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*3D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-60)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-60)*3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*10D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*3) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*3D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*15D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+60)*3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*15) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5+30)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*15D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*60))*3) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*30))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*60))*3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5+((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5+((Math.PI/180)*30))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*30))*-3) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1+((Math.PI/180)*30))*-3D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*15D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-3D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*15) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*15D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*-3) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*-3D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5)*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*-3) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*-3D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1+((Math.PI/180)*60))*10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*60))*-5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*60))*5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/2.5-((Math.PI/180)*30))*5D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1-((Math.PI/180)*30))*-5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-10) + (((tickAnim - 10D) / 10D) * (5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-2D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 5+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-2) + (((tickAnim - 20D) / 30D) * (0D-(5+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-2D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*5) + (((tickAnim - 10D) / 10D) * (-10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*30D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = -10+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*30) + (((tickAnim - 20D) / 30D) * (0D-(-10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*30D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.25) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-0.25D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*0.25D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-0.25) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*0.25D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*-0.25D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-0.25) + (((tickAnim - 10D) / 10D) * (1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*0.5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-0.25D)));
            zz = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*0.25) + (((tickAnim - 10D) / 10D) * (-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*0.25D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            yy = 1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*0.5) + (((tickAnim - 20D) / 30D) * (0D-(1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*0.5D)));
            zz = -1+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*1) + (((tickAnim - 20D) / 30D) * (0D-(-1+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*360/1)*1D)));
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5) + (((tickAnim - 10D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-60)*20D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-60)*20) + (((tickAnim - 20D) / 30D) * (0D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-60)*20D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5) + (((tickAnim - 10D) / 10D) * (10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*10D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 10+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*10) + (((tickAnim - 20D) / 30D) * (0D-(10+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*10D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5) + (((tickAnim - 10D) / 10D) * (40+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5+60)*30D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 40+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5+60)*30) + (((tickAnim - 20D) / 30D) * (0D-(40+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5+60)*30D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1)*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5)*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*30))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*30))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*60))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*60))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*60))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*60))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*90))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*90))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*90))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*90))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*90))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*90))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*120))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*120))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*120))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*120))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*120))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*120))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5) + (((tickAnim - 0D) / 10D) * (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*150))*-3D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/0.5)*5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = (Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*150))*-3) + (((tickAnim - 10D) / 10D) * (3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*150))*-1D-(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*180/1-((Math.PI/180)*150))*-3D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 50) {
            xx = 3+(Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*150))*-1) + (((tickAnim - 20D) / 30D) * (0D-(3+Math.sin((Math.PI/180)*2.5D*((double)tickAnim/50D)*720/1.5-((Math.PI/180)*150))*-1D)));
            yy = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 30D) * (0D-(0D)));
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;

        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -30D + (((tickAnim - 10D) / 15D) * (-15D-(-30D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -15D + (((tickAnim - 25D) / 15D) * (0D-(-15D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(xx), Hips.rotateAngleY + (float) Math.toRadians(yy), Hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-0.75D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-4D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            yy = -0.75D + (((tickAnim - 10D) / 15D) * (-0.37D-(-0.75D)));
            zz = -4D + (((tickAnim - 10D) / 15D) * (-2D-(-4D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            yy = -0.37D + (((tickAnim - 25D) / 15D) * (0D-(-0.37D)));
            zz = -2D + (((tickAnim - 25D) / 15D) * (0D-(-2D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);



        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 0D) / 5D) * (11D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 11D + (((tickAnim - 5D) / 3D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 9.5D + (((tickAnim - 8D) / 4D) * (11D-(9.5D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11D + (((tickAnim - 12D) / 2D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 9.5D + (((tickAnim - 14D) / 4D) * (11D-(9.5D)));
            yy = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 11D + (((tickAnim - 18D) / 3D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = 9.5D + (((tickAnim - 21D) / 4D) * (11D-(9.5D)));
            yy = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = 11D + (((tickAnim - 25D) / 3D) * (9.5D-(11D)));
            yy = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 40) {
            xx = 9.5D + (((tickAnim - 28D) / 12D) * (0D-(9.5D)));
            yy = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 12D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(xx), Bodymiddle.rotateAngleY + (float) Math.toRadians(yy), Bodymiddle.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 25D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(xx), Bodyfront.rotateAngleY + (float) Math.toRadians(yy), Bodyfront.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 30D + (((tickAnim - 10D) / 15D) * (15D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 25D) / 15D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (1D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 1D + (((tickAnim - 10D) / 30D) * (0D-(1D)));
            yy = 3D + (((tickAnim - 10D) / 30D) * (0D-(3D)));
            zz = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 25D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -10D + (((tickAnim - 10D) / 15D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 25D) / 15D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (30D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 30D + (((tickAnim - 10D) / 15D) * (15D-(30D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 15D + (((tickAnim - 25D) / 15D) * (0D-(15D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg1, Rightleg1.rotateAngleX + (float) Math.toRadians(xx), Rightleg1.rotateAngleY + (float) Math.toRadians(yy), Rightleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-1D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (3D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -1D + (((tickAnim - 10D) / 30D) * (0D-(-1D)));
            yy = 3D + (((tickAnim - 10D) / 30D) * (0D-(3D)));
            zz = 0D + (((tickAnim - 10D) / 30D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightleg1.offsetX = (float) Math.toRadians(xx);
        this.Rightleg1.offsetY = (float) Math.toRadians(yy);
        this.Rightleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 5D + (((tickAnim - 25D) / 15D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg2, Rightleg2.rotateAngleX + (float) Math.toRadians(xx), Rightleg2.rotateAngleY + (float) Math.toRadians(yy), Rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -10D + (((tickAnim - 10D) / 15D) * (-5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 25D) / 15D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg3, Rightleg3.rotateAngleX + (float) Math.toRadians(xx), Rightleg3.rotateAngleY + (float) Math.toRadians(yy), Rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 5D) / 4D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 9D) / 4D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 13D) / 3D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -10D + (((tickAnim - 16D) / 2D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = 10D + (((tickAnim - 21D) / 2D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = -10D + (((tickAnim - 27D) / 4D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 5D) / 4D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 9D) / 4D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0D + (((tickAnim - 13D) / 3D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 10D + (((tickAnim - 16D) / 2D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 16D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = 0D + (((tickAnim - 18D) / 3D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 21 && tickAnim < 23) {
            xx = -10D + (((tickAnim - 21D) / 2D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 21D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 10D + (((tickAnim - 27D) / 4D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 31 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 31D) / 9D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5D + (((tickAnim - 10D) / 15D) * (3.75D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75D + (((tickAnim - 25D) / 15D) * (0D-(3.75D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg4, Leftleg4.rotateAngleX + (float) Math.toRadians(xx), Leftleg4.rotateAngleY + (float) Math.toRadians(yy), Leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-7D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -7D + (((tickAnim - 10D) / 15D) * (-3.5D-(-7D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.5D + (((tickAnim - 25D) / 15D) * (0D-(-3.5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Leftleg5, Leftleg5.rotateAngleX + (float) Math.toRadians(xx), Leftleg5.rotateAngleY + (float) Math.toRadians(yy), Leftleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5D + (((tickAnim - 10D) / 15D) * (3.75D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75D + (((tickAnim - 25D) / 15D) * (0D-(3.75D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg4, Rightleg4.rotateAngleX + (float) Math.toRadians(xx), Rightleg4.rotateAngleY + (float) Math.toRadians(yy), Rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (-7D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -7D + (((tickAnim - 10D) / 15D) * (-3.5D-(-7D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -3.5D + (((tickAnim - 25D) / 15D) * (0D-(-3.5D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Rightleg5, Rightleg5.rotateAngleX + (float) Math.toRadians(xx), Rightleg5.rotateAngleY + (float) Math.toRadians(yy), Rightleg5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 10D) / 10D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 20D) / 3D) * (4D-(5D)));
            yy = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4D + (((tickAnim - 23D) / 5D) * (-4D-(4D)));
            yy = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = -4D + (((tickAnim - 28D) / 2D) * (-1D-(-4D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -1D + (((tickAnim - 30D) / 3D) * (2D-(-1D)));
            yy = 5D + (((tickAnim - 30D) / 3D) * (0D-(5D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 2D + (((tickAnim - 33D) / 2D) * (1.33D-(2D)));
            yy = 0D + (((tickAnim - 33D) / 2D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 1.33D + (((tickAnim - 35D) / 3D) * (0.67D-(1.33D)));
            yy = -2.5D + (((tickAnim - 35D) / 3D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.67D + (((tickAnim - 38D) / 2D) * (0D-(0.67D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (1.5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
            yy = 1.5D + (((tickAnim - 40D) / 2D) * (0D-(1.5D)));
            zz = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 1D) * (-1.5D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 43D) / 2D) * (0D-(-1.5D)));
            zz = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 45D) / 2D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 47D) / 1D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(xx), Tail1.rotateAngleY + (float) Math.toRadians(yy), Tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 5D + (((tickAnim - 10D) / 15D) * (2.5D-(5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 2.5D + (((tickAnim - 25D) / 5D) * (1.67D-(2.5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 1.67D + (((tickAnim - 30D) / 3D) * (1.25D-(1.67D)));
            yy = 2.5D + (((tickAnim - 30D) / 3D) * (0D-(2.5D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 35) {
            xx = 1.25D + (((tickAnim - 33D) / 2D) * (0.83D-(1.25D)));
            yy = 0D + (((tickAnim - 33D) / 2D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 38) {
            xx = 0.83D + (((tickAnim - 35D) / 3D) * (0.42D-(0.83D)));
            yy = -2.5D + (((tickAnim - 35D) / 3D) * (0D-(-2.5D)));
            zz = 0D + (((tickAnim - 35D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 38 && tickAnim < 40) {
            xx = 0.42D + (((tickAnim - 38D) / 2D) * (0D-(0.42D)));
            yy = 0D + (((tickAnim - 38D) / 2D) * (1.5D-(0D)));
            zz = 0D + (((tickAnim - 38D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
            yy = 1.5D + (((tickAnim - 40D) / 2D) * (0D-(1.5D)));
            zz = 0D + (((tickAnim - 40D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 1D) * (-1.5D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 43D) / 2D) * (0D-(-1.5D)));
            zz = 0D + (((tickAnim - 43D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 45D) / 2D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 45D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 47 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 47D) / 1D) * (0D-(1D)));
            zz = 0D + (((tickAnim - 47D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 7.5D + (((tickAnim - 10D) / 15D) * (3.75D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 3.75D + (((tickAnim - 25D) / 15D) * (0D-(3.75D)));
            yy = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 15D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 10D) / 15D) * (6.25D-(12.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 6.25D + (((tickAnim - 25D) / 5D) * (8D-(6.25D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 8D + (((tickAnim - 30D) / 10D) * (0D-(8D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (12.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 12.5D + (((tickAnim - 10D) / 15D) * (6.25D-(12.5D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 34) {
            xx = 6.25D + (((tickAnim - 25D) / 9D) * (2.78D-(6.25D)));
            yy = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.78D + (((tickAnim - 34D) / 6D) * (0D-(2.78D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(xx), Tail5.rotateAngleY + (float) Math.toRadians(yy), Tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 10D + (((tickAnim - 10D) / 15D) * (5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 15D) * (0D-(0D)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 5D + (((tickAnim - 25D) / 5D) * (12.5D-(5D)));
            yy = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 25D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.5D + (((tickAnim - 30D) / 10D) * (0D-(12.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail6, Tail6.rotateAngleX + (float) Math.toRadians(xx), Tail6.rotateAngleY + (float) Math.toRadians(yy), Tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 23D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 5D + (((tickAnim - 27D) / 3D) * (-10D-(5D)));
            yy = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = -10D + (((tickAnim - 30D) / 6D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 23D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0D + (((tickAnim - 23D) / 5D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 34) {
            xx = 10D + (((tickAnim - 28D) / 6D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 28D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 27) {
            xx = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 27D) * (0D-(0D)));
        }
        else if (tickAnim >= 27 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 27D) / 5D) * (7.5D-(0D)));
            yy = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 27D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 32 && tickAnim < 38) {
            xx = 7.5D + (((tickAnim - 32D) / 6D) * (0D-(7.5D)));
            yy = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 32D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (-10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 9D) / 4D) * (10D-(-10D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 10D + (((tickAnim - 13D) / 17D) * (0D-(10D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (-5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -5D + (((tickAnim - 33D) / 7D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = -2.5D + (((tickAnim - 9D) / 4D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 2.5D + (((tickAnim - 34D) / 6D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = (((tickAnim - 0D) / 9D) * (7.5D-(2.5D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 7.5D + (((tickAnim - 9D) / 4D) * (-10D-(7.5D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -10D + (((tickAnim - 13D) / 17D) * (0D-(-10D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (-2.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -2.5D + (((tickAnim - 34D) / 6D) * (0D-(-2.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));



        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0D + (((tickAnim - 0D) / 9D) * (8D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 9D) * (0D-(0D)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
            xx = 8D + (((tickAnim - 9D) / 4D) * (-2D-(8D)));
            yy = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 9D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -2D + (((tickAnim - 13D) / 3D) * (-2D-(-2D)));
            yy = 0D + (((tickAnim - 13D) / 3D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = -2D + (((tickAnim - 16D) / 3D) * (-2D-(-2D)));
            yy = 5D + (((tickAnim - 16D) / 3D) * (-5D-(5D)));
            zz = 0D + (((tickAnim - 16D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -2D + (((tickAnim - 19D) / 4D) * (-2D-(-2D)));
            yy = -5D + (((tickAnim - 19D) / 4D) * (5D-(-5D)));
            zz = 0D + (((tickAnim - 19D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = -2D + (((tickAnim - 23D) / 3D) * (-2D-(-2D)));
            yy = 5D + (((tickAnim - 23D) / 3D) * (-5D-(5D)));
            zz = 0D + (((tickAnim - 23D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -2D + (((tickAnim - 26D) / 4D) * (0D-(-2D)));
            yy = -5D + (((tickAnim - 26D) / 4D) * (0D-(-5D)));
            zz = 0D + (((tickAnim - 26D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (2.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 2.5D + (((tickAnim - 33D) / 7D) * (0D-(2.5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 11 && tickAnim < 14) {
            xx = 0D + (((tickAnim - 11D) / 3D) * (25D-(0D)));
            yy = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 11D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 14 && tickAnim < 28) {
            xx = 25D + (((tickAnim - 14D) / 14D) * (25D-(25D)));
            yy = 0D + (((tickAnim - 14D) / 14D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 14D) / 14D) * (0D-(0D)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 25D + (((tickAnim - 28D) / 2D) * (0D-(25D)));
            yy = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 28D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCeratosaurus entity = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-0.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.5D + (((tickAnim - 6D) / 7D) * (2D-(-0.5D)));
            yy = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 2D + (((tickAnim - 13D) / 17D) * (0D-(2D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = 0D + (((tickAnim - 30D) / 3D) * (-0.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -0.5D + (((tickAnim - 33D) / 7D) * (0D-(-0.5D)));
            yy = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 33D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(xx), Neck1.rotateAngleY + (float) Math.toRadians(yy), Neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (-0.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -0.5D + (((tickAnim - 6D) / 7D) * (0D-(-0.5D)));
            yy = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0.5D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0.5D + (((tickAnim - 34D) / 6D) * (0D-(0.5D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (1.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 1.5D + (((tickAnim - 6D) / 7D) * (-1D-(1.5D)));
            yy = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -1D + (((tickAnim - 13D) / 17D) * (0D-(-1D)));
            yy = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 17D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 34D) / 6D) * (0D-(0D)));
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0D + (((tickAnim - 0D) / 4D) * (5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 4 && tickAnim < 10) {
            xx = 5D + (((tickAnim - 4D) / 6D) * (7.5D-(5D)));
            yy = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 4D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 7.5D + (((tickAnim - 10D) / 13D) * (5D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 35) {
            xx = 5D + (((tickAnim - 23D) / 12D) * (0D-(5D)));
            yy = 0D + (((tickAnim - 23D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 35D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (3D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 3D + (((tickAnim - 6D) / 2D) * (-1D-(3D)));
            yy = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 6D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -1D + (((tickAnim - 8D) / 4D) * (-0.5D-(-1D)));
            yy = 0D + (((tickAnim - 8D) / 4D) * (1D-(0D)));
            zz = 0D + (((tickAnim - 8D) / 4D) * (2D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -0.5D + (((tickAnim - 12D) / 3D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 12D) / 3D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 12D) / 3D) * (-2D-(2D)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -0.5D + (((tickAnim - 15D) / 3D) * (-0.5D-(-0.5D)));
            yy = -1D + (((tickAnim - 15D) / 3D) * (1D-(-1D)));
            zz = -2D + (((tickAnim - 15D) / 3D) * (2D-(-2D)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -0.5D + (((tickAnim - 18D) / 4D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 18D) / 4D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 18D) / 4D) * (-2D-(2D)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = -0.5D + (((tickAnim - 22D) / 3D) * (-0.5D-(-0.5D)));
            yy = -1D + (((tickAnim - 22D) / 3D) * (1D-(-1D)));
            zz = -2D + (((tickAnim - 22D) / 3D) * (2D-(-2D)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -0.5D + (((tickAnim - 25D) / 3D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 25D) / 3D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 25D) / 3D) * (-2D-(2D)));
        }
        else if (tickAnim >= 28 && tickAnim < 32) {
            xx = -0.5D + (((tickAnim - 28D) / 4D) * (-0.5D-(-0.5D)));
            yy = -1D + (((tickAnim - 28D) / 4D) * (1D-(-1D)));
            zz = -2D + (((tickAnim - 28D) / 4D) * (2D-(-2D)));
        }
        else if (tickAnim >= 32 && tickAnim < 35) {
            xx = -0.5D + (((tickAnim - 32D) / 3D) * (-0.5D-(-0.5D)));
            yy = 1D + (((tickAnim - 32D) / 3D) * (-1D-(1D)));
            zz = 2D + (((tickAnim - 32D) / 3D) * (-2D-(2D)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -0.5D + (((tickAnim - 35D) / 5D) * (0D-(-0.5D)));
            yy = -1D + (((tickAnim - 35D) / 5D) * (0D-(-1D)));
            zz = -2D + (((tickAnim - 35D) / 5D) * (0D-(-2D)));
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));


    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraCeratosaurus ee = (EntityPrehistoricFloraCeratosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) { //The idle noise/anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The actual roar/anim
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraCeratosaurus e = (EntityPrehistoricFloraCeratosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION);
        animator.startKeyframe(10);
        animator.rotate(this.Neck1, (float) Math.toRadians(-10),0,0);
        animator.rotate(this.Neck2, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Neck3, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Head, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.Lowerjaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
