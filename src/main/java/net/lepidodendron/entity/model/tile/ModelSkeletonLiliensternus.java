package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLiliensternus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Hips_r5;
    private final AdvancedModelRenderer Hips_r6;
    private final AdvancedModelRenderer Hips_r7;
    private final AdvancedModelRenderer Hips_r8;
    private final AdvancedModelRenderer Neckend_r1;
    private final AdvancedModelRenderer Neckend_r2;
    private final AdvancedModelRenderer Neckend_r3;
    private final AdvancedModelRenderer Neckend_r4;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodymiddle_r1;
    private final AdvancedModelRenderer Neckend_r5;
    private final AdvancedModelRenderer Neckend_r6;
    private final AdvancedModelRenderer Neckend_r7;
    private final AdvancedModelRenderer Neckend_r8;
    private final AdvancedModelRenderer Neckend_r9;
    private final AdvancedModelRenderer Neckend_r10;
    private final AdvancedModelRenderer Neckend_r11;
    private final AdvancedModelRenderer Neckend_r12;
    private final AdvancedModelRenderer Neckend_r13;
    private final AdvancedModelRenderer Neckend_r14;
    private final AdvancedModelRenderer Neckend_r15;
    private final AdvancedModelRenderer Neckend_r16;
    private final AdvancedModelRenderer Neckend_r17;
    private final AdvancedModelRenderer Neckend_r18;
    private final AdvancedModelRenderer Breast_Coracoid_r1;
    private final AdvancedModelRenderer Neckend_r19;
    private final AdvancedModelRenderer Neckend_r20;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Breast_Coracoid_r2;
    private final AdvancedModelRenderer Breast_Coracoid_r3;
    private final AdvancedModelRenderer Breast_Coracoid_r4;
    private final AdvancedModelRenderer Breast_Coracoid_r5;
    private final AdvancedModelRenderer Breast_Coracoid_r6;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Neckend_r21;
    private final AdvancedModelRenderer Neckend_r22;
    private final AdvancedModelRenderer Neckend_r23;
    private final AdvancedModelRenderer Neckend_r24;
    private final AdvancedModelRenderer Neckend_r25;
    private final AdvancedModelRenderer Neckend_r26;
    private final AdvancedModelRenderer Neckend_r27;
    private final AdvancedModelRenderer Neckend_r28;
    private final AdvancedModelRenderer Neckend_r29;
    private final AdvancedModelRenderer Neckend_r30;
    private final AdvancedModelRenderer Neckend_r31;
    private final AdvancedModelRenderer Neckend_r32;
    private final AdvancedModelRenderer Neckend_r33;
    private final AdvancedModelRenderer Neckend_r34;
    private final AdvancedModelRenderer Neckend_r35;
    private final AdvancedModelRenderer Neckend_r36;
    private final AdvancedModelRenderer Neckend_r37;
    private final AdvancedModelRenderer Neckend_r38;
    private final AdvancedModelRenderer Neckbase;
    private final AdvancedModelRenderer Neckbase_r1;
    private final AdvancedModelRenderer Neckend_r39;
    private final AdvancedModelRenderer Neckend_r40;
    private final AdvancedModelRenderer Neckend_r41;
    private final AdvancedModelRenderer Neckend_r42;
    private final AdvancedModelRenderer Neckend_r43;
    private final AdvancedModelRenderer Neckend_r44;
    private final AdvancedModelRenderer Neckmiddle;
    private final AdvancedModelRenderer Neckmiddle_r1;
    private final AdvancedModelRenderer Neckend_r45;
    private final AdvancedModelRenderer Neckend_r46;
    private final AdvancedModelRenderer Neckend;
    private final AdvancedModelRenderer Neckend_r47;
    private final AdvancedModelRenderer Neckend_r48;
    private final AdvancedModelRenderer Neckend_r49;
    private final AdvancedModelRenderer Neckend_r50;
    private final AdvancedModelRenderer Neckend_r51;
    private final AdvancedModelRenderer Neckend_r52;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Lowerjawbase;
    private final AdvancedModelRenderer Lowerjawbase_r1;
    private final AdvancedModelRenderer Lowerjawbase_r2;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Rightlowerteeth;
    private final AdvancedModelRenderer Lowerjawunderside;
    private final AdvancedModelRenderer Upperjawbase;
    private final AdvancedModelRenderer Upperjawend;
    private final AdvancedModelRenderer Snout;
    private final AdvancedModelRenderer Rightupperfrontteeth;
    private final AdvancedModelRenderer Leftupperfrontteeth;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Rightcrestbase;
    private final AdvancedModelRenderer Rightcrestfront;
    private final AdvancedModelRenderer Rightcrestfront2;
    private final AdvancedModelRenderer Leftcrestbase;
    private final AdvancedModelRenderer Leftcrestfront;
    private final AdvancedModelRenderer Leftcrestfront2;
    private final AdvancedModelRenderer Headslope2;
    private final AdvancedModelRenderer Rightupperbackteeth;
    private final AdvancedModelRenderer Leftupperbackteeth;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Righthand;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Lefthand;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Tailbase_r2;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailbase_r3;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailbase_r4;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Rightankle;
    private final AdvancedModelRenderer Rightfoot;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Leftankle;
    private final AdvancedModelRenderer Leftfoot;

    public ModelSkeletonLiliensternus() {
        this.textureWidth = 85;
        this.textureHeight = 85;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, -1.1F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.3466F, 0.0F, 0.0F);


        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.0F, 2.4612F, 1.653F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0698F, 0.0F, -0.1745F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 13, 55, 0.0F, 0.0627F, -2.6132F, 1, 1, 5, 0.0F, true));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.0F, 2.4781F, 1.4537F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.5847F, 0.0F, -0.2705F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 17, 72, 0.0029F, 1.3769F, -1.8935F, 1, 10, 1, 0.0F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(-3.0F, 2.4781F, 1.4537F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.3316F, 0.0F, -0.2705F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 22, 72, 0.0029F, 0.5267F, 1.3064F, 1, 8, 1, 0.0F, true));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(-3.0F, -0.24F, -1.989F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.0698F, 0.0F, 0.0F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 20, 1.0F, 0.0113F, -0.1686F, 1, 1, 7, 0.0F, true));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 44, 23, 0.0F, 0.0113F, -1.1686F, 1, 3, 9, 0.0F, true));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 20, 4.0F, 0.0113F, -0.1686F, 1, 1, 7, 0.0F, false));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 44, 23, 5.0F, 0.0113F, -1.1686F, 1, 3, 9, 0.0F, false));

        this.Hips_r5 = new AdvancedModelRenderer(this);
        this.Hips_r5.setRotationPoint(3.0F, 2.4781F, 1.4537F);
        this.Hips.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.5847F, 0.0F, 0.2705F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 17, 72, -1.0029F, 1.3769F, -1.8935F, 1, 10, 1, 0.0F, false));

        this.Hips_r6 = new AdvancedModelRenderer(this);
        this.Hips_r6.setRotationPoint(3.0F, 2.4781F, 1.4537F);
        this.Hips.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, 0.3316F, 0.0F, 0.2705F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 22, 72, -1.0029F, 0.5267F, 1.3064F, 1, 8, 1, 0.0F, false));

        this.Hips_r7 = new AdvancedModelRenderer(this);
        this.Hips_r7.setRotationPoint(3.0F, 2.4612F, 1.653F);
        this.Hips.addChild(Hips_r7);
        this.setRotateAngle(Hips_r7, 0.0698F, 0.0F, 0.1745F);
        this.Hips_r7.cubeList.add(new ModelBox(Hips_r7, 13, 55, -1.0F, 0.0627F, -2.6132F, 1, 1, 5, 0.0F, false));

        this.Hips_r8 = new AdvancedModelRenderer(this);
        this.Hips_r8.setRotationPoint(0.0F, 0.0989F, -5.9746F);
        this.Hips.addChild(Hips_r8);
        this.setRotateAngle(Hips_r8, -0.0175F, 0.0F, 0.0F);
        this.Hips_r8.cubeList.add(new ModelBox(Hips_r8, 0, 40, -1.0F, -1.1F, 0.0F, 2, 2, 12, 0.0F, false));

        this.Neckend_r1 = new AdvancedModelRenderer(this);
        this.Neckend_r1.setRotationPoint(-1.0F, 0.1035F, -4.5505F);
        this.Hips.addChild(Neckend_r1);
        this.setRotateAngle(Neckend_r1, -1.6228F, -0.0221F, 0.1378F);
        this.Neckend_r1.cubeList.add(new ModelBox(Neckend_r1, 10, 29, -1.082F, -0.6158F, 1.5713F, 0, 1, 1, 0.001F, true));

        this.Neckend_r2 = new AdvancedModelRenderer(this);
        this.Neckend_r2.setRotationPoint(-1.0F, 0.1035F, -4.5505F);
        this.Hips.addChild(Neckend_r2);
        this.setRotateAngle(Neckend_r2, -1.6261F, 0.0117F, 0.7478F);
        this.Neckend_r2.cubeList.add(new ModelBox(Neckend_r2, 0, 10, 0.0021F, -0.6158F, -0.093F, 0, 1, 2, 0.001F, true));

        this.Neckend_r3 = new AdvancedModelRenderer(this);
        this.Neckend_r3.setRotationPoint(1.0F, 0.1035F, -4.5505F);
        this.Hips.addChild(Neckend_r3);
        this.setRotateAngle(Neckend_r3, -1.6261F, -0.0117F, -0.7478F);
        this.Neckend_r3.cubeList.add(new ModelBox(Neckend_r3, 0, 10, -0.0021F, -0.6158F, -0.093F, 0, 1, 2, 0.001F, false));

        this.Neckend_r4 = new AdvancedModelRenderer(this);
        this.Neckend_r4.setRotationPoint(1.0F, 0.1035F, -4.5505F);
        this.Hips.addChild(Neckend_r4);
        this.setRotateAngle(Neckend_r4, -1.6228F, 0.0221F, -0.1378F);
        this.Neckend_r4.cubeList.add(new ModelBox(Neckend_r4, 10, 29, 1.082F, -0.6158F, 1.5713F, 0, 1, 1, 0.001F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-0.01F, -0.0011F, -5.4746F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, -0.0248F, 0.0F, 0.0F);


        this.Bodymiddle_r1 = new AdvancedModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.01F, -0.7593F, -8.534F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, -0.0349F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 29, 43, -1.01F, -0.5F, -0.1F, 2, 2, 9, 0.001F, false));

        this.Neckend_r5 = new AdvancedModelRenderer(this);
        this.Neckend_r5.setRotationPoint(-0.99F, 0.2453F, -1.1099F);
        this.Bodymiddle.addChild(Neckend_r5);
        this.setRotateAngle(Neckend_r5, -1.6228F, -0.0221F, 0.1378F);
        this.Neckend_r5.cubeList.add(new ModelBox(Neckend_r5, 12, 10, -1.682F, -0.6158F, 2.3713F, 0, 1, 2, 0.001F, true));

        this.Neckend_r6 = new AdvancedModelRenderer(this);
        this.Neckend_r6.setRotationPoint(-0.99F, 0.2453F, -1.1099F);
        this.Bodymiddle.addChild(Neckend_r6);
        this.setRotateAngle(Neckend_r6, -1.6261F, 0.0117F, 0.7478F);
        this.Neckend_r6.cubeList.add(new ModelBox(Neckend_r6, 10, 29, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r7 = new AdvancedModelRenderer(this);
        this.Neckend_r7.setRotationPoint(-0.99F, 0.2453F, -3.1099F);
        this.Bodymiddle.addChild(Neckend_r7);
        this.setRotateAngle(Neckend_r7, -1.6228F, -0.0221F, 0.1378F);
        this.Neckend_r7.cubeList.add(new ModelBox(Neckend_r7, 52, 12, -1.682F, -0.6158F, 2.3713F, 0, 1, 3, 0.001F, true));

        this.Neckend_r8 = new AdvancedModelRenderer(this);
        this.Neckend_r8.setRotationPoint(-0.99F, 0.2453F, -3.1099F);
        this.Bodymiddle.addChild(Neckend_r8);
        this.setRotateAngle(Neckend_r8, -1.6261F, 0.0117F, 0.7478F);
        this.Neckend_r8.cubeList.add(new ModelBox(Neckend_r8, 31, 43, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r9 = new AdvancedModelRenderer(this);
        this.Neckend_r9.setRotationPoint(-0.99F, 0.2453F, -5.1099F);
        this.Bodymiddle.addChild(Neckend_r9);
        this.setRotateAngle(Neckend_r9, -1.5709F, -0.0292F, 0.1365F);
        this.Neckend_r9.cubeList.add(new ModelBox(Neckend_r9, 0, 55, -1.682F, -0.6158F, 2.3713F, 0, 1, 3, 0.001F, true));

        this.Neckend_r10 = new AdvancedModelRenderer(this);
        this.Neckend_r10.setRotationPoint(-0.99F, 0.2453F, -5.1099F);
        this.Bodymiddle.addChild(Neckend_r10);
        this.setRotateAngle(Neckend_r10, -1.5877F, -0.0239F, 0.7476F);
        this.Neckend_r10.cubeList.add(new ModelBox(Neckend_r10, 21, 55, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r11 = new AdvancedModelRenderer(this);
        this.Neckend_r11.setRotationPoint(-0.99F, 0.2453F, -7.1099F);
        this.Bodymiddle.addChild(Neckend_r11);
        this.setRotateAngle(Neckend_r11, -1.4844F, -0.041F, 0.1335F);
        this.Neckend_r11.cubeList.add(new ModelBox(Neckend_r11, 56, 26, -1.682F, -0.6158F, 2.3713F, 0, 1, 4, 0.001F, true));

        this.Neckend_r12 = new AdvancedModelRenderer(this);
        this.Neckend_r12.setRotationPoint(-0.99F, 0.2453F, -7.1099F);
        this.Bodymiddle.addChild(Neckend_r12);
        this.setRotateAngle(Neckend_r12, -1.5235F, -0.0831F, 0.7441F);
        this.Neckend_r12.cubeList.add(new ModelBox(Neckend_r12, 27, 72, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r13 = new AdvancedModelRenderer(this);
        this.Neckend_r13.setRotationPoint(1.01F, 0.2453F, -1.1099F);
        this.Bodymiddle.addChild(Neckend_r13);
        this.setRotateAngle(Neckend_r13, -1.6228F, 0.0221F, -0.1378F);
        this.Neckend_r13.cubeList.add(new ModelBox(Neckend_r13, 12, 10, 1.682F, -0.6158F, 2.3713F, 0, 1, 2, 0.001F, false));

        this.Neckend_r14 = new AdvancedModelRenderer(this);
        this.Neckend_r14.setRotationPoint(1.01F, 0.2453F, -1.1099F);
        this.Bodymiddle.addChild(Neckend_r14);
        this.setRotateAngle(Neckend_r14, -1.6261F, -0.0117F, -0.7478F);
        this.Neckend_r14.cubeList.add(new ModelBox(Neckend_r14, 10, 29, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r15 = new AdvancedModelRenderer(this);
        this.Neckend_r15.setRotationPoint(1.01F, 0.2453F, -3.1099F);
        this.Bodymiddle.addChild(Neckend_r15);
        this.setRotateAngle(Neckend_r15, -1.6228F, 0.0221F, -0.1378F);
        this.Neckend_r15.cubeList.add(new ModelBox(Neckend_r15, 52, 12, 1.682F, -0.6158F, 2.3713F, 0, 1, 3, 0.001F, false));

        this.Neckend_r16 = new AdvancedModelRenderer(this);
        this.Neckend_r16.setRotationPoint(1.01F, 0.2453F, -3.1099F);
        this.Bodymiddle.addChild(Neckend_r16);
        this.setRotateAngle(Neckend_r16, -1.6261F, -0.0117F, -0.7478F);
        this.Neckend_r16.cubeList.add(new ModelBox(Neckend_r16, 31, 43, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r17 = new AdvancedModelRenderer(this);
        this.Neckend_r17.setRotationPoint(1.01F, 0.2453F, -5.1099F);
        this.Bodymiddle.addChild(Neckend_r17);
        this.setRotateAngle(Neckend_r17, -1.5877F, 0.0239F, -0.7476F);
        this.Neckend_r17.cubeList.add(new ModelBox(Neckend_r17, 21, 55, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r18 = new AdvancedModelRenderer(this);
        this.Neckend_r18.setRotationPoint(1.01F, 0.2453F, -5.1099F);
        this.Bodymiddle.addChild(Neckend_r18);
        this.setRotateAngle(Neckend_r18, -1.5709F, 0.0292F, -0.1365F);
        this.Neckend_r18.cubeList.add(new ModelBox(Neckend_r18, 0, 55, 1.682F, -0.6158F, 2.3713F, 0, 1, 3, 0.001F, false));

        this.Breast_Coracoid_r1 = new AdvancedModelRenderer(this);
        this.Breast_Coracoid_r1.setRotationPoint(0.01F, 8.0842F, -11.5664F);
        this.Bodymiddle.addChild(Breast_Coracoid_r1);
        this.setRotateAngle(Breast_Coracoid_r1, -0.2094F, 0.0F, 0.0F);
        this.Breast_Coracoid_r1.cubeList.add(new ModelBox(Breast_Coracoid_r1, 34, 2, -1.5F, 0.272F, 0.9928F, 3, 0, 1, 0.0F, false));
        this.Breast_Coracoid_r1.cubeList.add(new ModelBox(Breast_Coracoid_r1, 0, 49, -1.5F, 0.272F, 2.9928F, 3, 0, 1, 0.0F, false));
        this.Breast_Coracoid_r1.cubeList.add(new ModelBox(Breast_Coracoid_r1, 30, 16, -1.5F, 0.272F, 6.9928F, 3, 0, 1, 0.0F, false));
        this.Breast_Coracoid_r1.cubeList.add(new ModelBox(Breast_Coracoid_r1, 34, 0, -1.5F, 0.272F, 4.9928F, 3, 0, 1, 0.0F, false));
        this.Breast_Coracoid_r1.cubeList.add(new ModelBox(Breast_Coracoid_r1, 21, 16, -1.5F, 0.272F, 8.9928F, 3, 0, 1, 0.0F, false));

        this.Neckend_r19 = new AdvancedModelRenderer(this);
        this.Neckend_r19.setRotationPoint(1.01F, 0.2453F, -7.1099F);
        this.Bodymiddle.addChild(Neckend_r19);
        this.setRotateAngle(Neckend_r19, -1.4844F, 0.041F, -0.1335F);
        this.Neckend_r19.cubeList.add(new ModelBox(Neckend_r19, 56, 26, 1.682F, -0.6158F, 2.3713F, 0, 1, 4, 0.001F, false));

        this.Neckend_r20 = new AdvancedModelRenderer(this);
        this.Neckend_r20.setRotationPoint(1.01F, 0.2453F, -7.1099F);
        this.Bodymiddle.addChild(Neckend_r20);
        this.setRotateAngle(Neckend_r20, -1.5235F, 0.0831F, -0.7441F);
        this.Neckend_r20.cubeList.add(new ModelBox(Neckend_r20, 27, 72, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3593F, -8.234F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, -0.1321F, 0.0F, 0.0F);


        this.Breast_Coracoid_r2 = new AdvancedModelRenderer(this);
        this.Breast_Coracoid_r2.setRotationPoint(-3.99F, 4.5522F, -7.1042F);
        this.Bodyfront.addChild(Breast_Coracoid_r2);
        this.setRotateAngle(Breast_Coracoid_r2, 0.6985F, 0.002F, 0.4016F);
        this.Breast_Coracoid_r2.cubeList.add(new ModelBox(Breast_Coracoid_r2, 0, 0, -0.5378F, -1.0133F, -0.4279F, 1, 2, 7, 0.0F, true));

        this.Breast_Coracoid_r3 = new AdvancedModelRenderer(this);
        this.Breast_Coracoid_r3.setRotationPoint(-1.99F, -0.2828F, -2.7876F);
        this.Bodyfront.addChild(Breast_Coracoid_r3);
        this.setRotateAngle(Breast_Coracoid_r3, 0.7026F, -0.0981F, 0.3172F);
        this.Breast_Coracoid_r3.cubeList.add(new ModelBox(Breast_Coracoid_r3, 44, 36, -1.351F, 0.2174F, -8.0486F, 4, 2, 1, 0.0F, true));

        this.Breast_Coracoid_r4 = new AdvancedModelRenderer(this);
        this.Breast_Coracoid_r4.setRotationPoint(4.01F, 4.5522F, -7.1042F);
        this.Bodyfront.addChild(Breast_Coracoid_r4);
        this.setRotateAngle(Breast_Coracoid_r4, 0.6985F, -0.002F, -0.4016F);
        this.Breast_Coracoid_r4.cubeList.add(new ModelBox(Breast_Coracoid_r4, 0, 0, -0.4622F, -1.0133F, -0.4279F, 1, 2, 7, 0.0F, false));

        this.Breast_Coracoid_r5 = new AdvancedModelRenderer(this);
        this.Breast_Coracoid_r5.setRotationPoint(2.01F, -0.2828F, -2.7876F);
        this.Bodyfront.addChild(Breast_Coracoid_r5);
        this.setRotateAngle(Breast_Coracoid_r5, 0.7026F, 0.0981F, -0.3172F);
        this.Breast_Coracoid_r5.cubeList.add(new ModelBox(Breast_Coracoid_r5, 44, 36, -2.649F, 0.2174F, -8.0486F, 4, 2, 1, 0.0F, false));

        this.Breast_Coracoid_r6 = new AdvancedModelRenderer(this);
        this.Breast_Coracoid_r6.setRotationPoint(0.01F, 6.5172F, -6.7876F);
        this.Bodyfront.addChild(Breast_Coracoid_r6);
        this.setRotateAngle(Breast_Coracoid_r6, -0.3927F, 0.0F, 0.0F);
        this.Breast_Coracoid_r6.cubeList.add(new ModelBox(Breast_Coracoid_r6, 21, 9, -1.5F, -0.2706F, -1.0778F, 3, 1, 5, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.01F, 0.2172F, -8.5876F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0524F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 44, 0, -1.01F, -0.7F, -0.2F, 2, 2, 9, 0.0F, false));

        this.Neckend_r21 = new AdvancedModelRenderer(this);
        this.Neckend_r21.setRotationPoint(-0.99F, 0.6218F, -0.8636F);
        this.Bodyfront.addChild(Neckend_r21);
        this.setRotateAngle(Neckend_r21, -1.3978F, -0.0524F, 0.1294F);
        this.Neckend_r21.cubeList.add(new ModelBox(Neckend_r21, 35, 62, -1.682F, -0.6158F, 2.3713F, 0, 1, 5, 0.001F, true));

        this.Neckend_r22 = new AdvancedModelRenderer(this);
        this.Neckend_r22.setRotationPoint(-0.99F, 0.6218F, -2.8636F);
        this.Bodyfront.addChild(Neckend_r22);
        this.setRotateAngle(Neckend_r22, -1.3111F, -0.0635F, 0.1244F);
        this.Neckend_r22.cubeList.add(new ModelBox(Neckend_r22, 24, 43, -1.682F, -0.6158F, 2.3713F, 0, 1, 6, 0.001F, true));

        this.Neckend_r23 = new AdvancedModelRenderer(this);
        this.Neckend_r23.setRotationPoint(-0.99F, 0.6218F, -0.8636F);
        this.Bodyfront.addChild(Neckend_r23);
        this.setRotateAngle(Neckend_r23, -1.4587F, -0.142F, 0.7368F);
        this.Neckend_r23.cubeList.add(new ModelBox(Neckend_r23, 58, 72, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r24 = new AdvancedModelRenderer(this);
        this.Neckend_r24.setRotationPoint(-0.99F, 0.6218F, -2.8636F);
        this.Bodyfront.addChild(Neckend_r24);
        this.setRotateAngle(Neckend_r24, -1.3928F, -0.2003F, 0.7256F);
        this.Neckend_r24.cubeList.add(new ModelBox(Neckend_r24, 72, 71, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r25 = new AdvancedModelRenderer(this);
        this.Neckend_r25.setRotationPoint(-0.99F, 0.8218F, -4.8636F);
        this.Bodyfront.addChild(Neckend_r25);
        this.setRotateAngle(Neckend_r25, -1.2243F, -0.074F, 0.1184F);
        this.Neckend_r25.cubeList.add(new ModelBox(Neckend_r25, 63, 47, -1.682F, -0.6158F, 2.3713F, 0, 1, 5, 0.001F, true));

        this.Neckend_r26 = new AdvancedModelRenderer(this);
        this.Neckend_r26.setRotationPoint(-0.99F, 0.8218F, -4.8636F);
        this.Bodyfront.addChild(Neckend_r26);
        this.setRotateAngle(Neckend_r26, -1.3253F, -0.2577F, 0.7103F);
        this.Neckend_r26.cubeList.add(new ModelBox(Neckend_r26, 0, 73, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r27 = new AdvancedModelRenderer(this);
        this.Neckend_r27.setRotationPoint(-0.99F, 0.8218F, -6.8636F);
        this.Bodyfront.addChild(Neckend_r27);
        this.setRotateAngle(Neckend_r27, -1.1373F, -0.0841F, 0.1115F);
        this.Neckend_r27.cubeList.add(new ModelBox(Neckend_r27, 42, 74, -1.682F, -0.6158F, 2.3713F, 0, 1, 3, 0.001F, true));

        this.Neckend_r28 = new AdvancedModelRenderer(this);
        this.Neckend_r28.setRotationPoint(-0.99F, 0.8218F, -6.8636F);
        this.Bodyfront.addChild(Neckend_r28);
        this.setRotateAngle(Neckend_r28, -1.2558F, -0.314F, 0.6907F);
        this.Neckend_r28.cubeList.add(new ModelBox(Neckend_r28, 74, 26, 0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, true));

        this.Neckend_r29 = new AdvancedModelRenderer(this);
        this.Neckend_r29.setRotationPoint(1.01F, 0.6218F, -0.8636F);
        this.Bodyfront.addChild(Neckend_r29);
        this.setRotateAngle(Neckend_r29, -1.3978F, 0.0524F, -0.1294F);
        this.Neckend_r29.cubeList.add(new ModelBox(Neckend_r29, 35, 62, 1.682F, -0.6158F, 2.3713F, 0, 1, 5, 0.001F, false));

        this.Neckend_r30 = new AdvancedModelRenderer(this);
        this.Neckend_r30.setRotationPoint(1.01F, 0.6218F, -0.8636F);
        this.Bodyfront.addChild(Neckend_r30);
        this.setRotateAngle(Neckend_r30, -1.4587F, 0.142F, -0.7368F);
        this.Neckend_r30.cubeList.add(new ModelBox(Neckend_r30, 58, 72, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r31 = new AdvancedModelRenderer(this);
        this.Neckend_r31.setRotationPoint(1.01F, 0.6218F, -2.8636F);
        this.Bodyfront.addChild(Neckend_r31);
        this.setRotateAngle(Neckend_r31, -1.3928F, 0.2003F, -0.7256F);
        this.Neckend_r31.cubeList.add(new ModelBox(Neckend_r31, 72, 71, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r32 = new AdvancedModelRenderer(this);
        this.Neckend_r32.setRotationPoint(1.01F, 0.6218F, -2.8636F);
        this.Bodyfront.addChild(Neckend_r32);
        this.setRotateAngle(Neckend_r32, -1.3111F, 0.0635F, -0.1244F);
        this.Neckend_r32.cubeList.add(new ModelBox(Neckend_r32, 24, 43, 1.682F, -0.6158F, 2.3713F, 0, 1, 6, 0.001F, false));

        this.Neckend_r33 = new AdvancedModelRenderer(this);
        this.Neckend_r33.setRotationPoint(1.01F, 0.8218F, -4.8636F);
        this.Bodyfront.addChild(Neckend_r33);
        this.setRotateAngle(Neckend_r33, -1.3253F, 0.2577F, -0.7103F);
        this.Neckend_r33.cubeList.add(new ModelBox(Neckend_r33, 0, 73, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r34 = new AdvancedModelRenderer(this);
        this.Neckend_r34.setRotationPoint(1.01F, 0.8218F, -4.8636F);
        this.Bodyfront.addChild(Neckend_r34);
        this.setRotateAngle(Neckend_r34, -1.2243F, 0.074F, -0.1184F);
        this.Neckend_r34.cubeList.add(new ModelBox(Neckend_r34, 63, 47, 1.682F, -0.6158F, 2.3713F, 0, 1, 5, 0.001F, false));

        this.Neckend_r35 = new AdvancedModelRenderer(this);
        this.Neckend_r35.setRotationPoint(1.01F, 0.8218F, -6.8636F);
        this.Bodyfront.addChild(Neckend_r35);
        this.setRotateAngle(Neckend_r35, -1.2558F, 0.314F, -0.6907F);
        this.Neckend_r35.cubeList.add(new ModelBox(Neckend_r35, 74, 26, -0.0021F, -0.6158F, -0.093F, 0, 1, 3, 0.001F, false));

        this.Neckend_r36 = new AdvancedModelRenderer(this);
        this.Neckend_r36.setRotationPoint(1.01F, 0.8218F, -6.8636F);
        this.Bodyfront.addChild(Neckend_r36);
        this.setRotateAngle(Neckend_r36, -1.1373F, 0.0841F, -0.1115F);
        this.Neckend_r36.cubeList.add(new ModelBox(Neckend_r36, 42, 74, 1.682F, -0.6158F, 2.3713F, 0, 1, 3, 0.001F, false));

        this.Neckend_r37 = new AdvancedModelRenderer(this);
        this.Neckend_r37.setRotationPoint(-0.99F, 1.0937F, -8.785F);
        this.Bodyfront.addChild(Neckend_r37);
        this.setRotateAngle(Neckend_r37, -1.1536F, -0.358F, 0.4257F);
        this.Neckend_r37.cubeList.add(new ModelBox(Neckend_r37, 16, 65, -0.0025F, -0.4699F, -0.0435F, 0, 1, 5, 0.001F, true));

        this.Neckend_r38 = new AdvancedModelRenderer(this);
        this.Neckend_r38.setRotationPoint(1.01F, 1.0937F, -8.785F);
        this.Bodyfront.addChild(Neckend_r38);
        this.setRotateAngle(Neckend_r38, -1.1536F, 0.358F, -0.4257F);
        this.Neckend_r38.cubeList.add(new ModelBox(Neckend_r38, 16, 65, 0.0025F, -0.4699F, -0.0435F, 0, 1, 5, 0.001F, false));

        this.Neckbase = new AdvancedModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, 0.4172F, -8.6876F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.6014F, 0.0F, 0.0F);


        this.Neckbase_r1 = new AdvancedModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(0.01F, 0.4002F, -6.6514F);
        this.Neckbase.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, 0.0175F, 0.0F, 0.0F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 21, 55, -1.01F, -1.1F, -0.1F, 2, 2, 7, 0.001F, false));

        this.Neckend_r39 = new AdvancedModelRenderer(this);
        this.Neckend_r39.setRotationPoint(-0.99F, 0.9479F, -2.1892F);
        this.Neckbase.addChild(Neckend_r39);
        this.setRotateAngle(Neckend_r39, -0.7221F, -0.2219F, 0.14F);
        this.Neckend_r39.cubeList.add(new ModelBox(Neckend_r39, 27, 65, 0.0195F, -0.5649F, 0.0249F, 0, 1, 5, 0.001F, true));

        this.Neckend_r40 = new AdvancedModelRenderer(this);
        this.Neckend_r40.setRotationPoint(-0.99F, 1.1079F, -4.2226F);
        this.Neckbase.addChild(Neckend_r40);
        this.setRotateAngle(Neckend_r40, -0.6333F, -0.2332F, 0.1199F);
        this.Neckend_r40.cubeList.add(new ModelBox(Neckend_r40, 0, 66, 0.0104F, -0.64F, -0.0406F, 0, 1, 5, 0.001F, true));

        this.Neckend_r41 = new AdvancedModelRenderer(this);
        this.Neckend_r41.setRotationPoint(-0.99F, 0.8703F, -5.9528F);
        this.Neckbase.addChild(Neckend_r41);
        this.setRotateAngle(Neckend_r41, -0.4546F, -0.194F, 0.1003F);
        this.Neckend_r41.cubeList.add(new ModelBox(Neckend_r41, 66, 2, -0.0272F, -0.3758F, -0.3386F, 0, 1, 5, 0.001F, true));

        this.Neckend_r42 = new AdvancedModelRenderer(this);
        this.Neckend_r42.setRotationPoint(1.01F, 0.9479F, -2.1892F);
        this.Neckbase.addChild(Neckend_r42);
        this.setRotateAngle(Neckend_r42, -0.7221F, 0.2219F, -0.14F);
        this.Neckend_r42.cubeList.add(new ModelBox(Neckend_r42, 27, 65, -0.0195F, -0.5649F, 0.0249F, 0, 1, 5, 0.001F, false));

        this.Neckend_r43 = new AdvancedModelRenderer(this);
        this.Neckend_r43.setRotationPoint(1.01F, 1.1079F, -4.2226F);
        this.Neckbase.addChild(Neckend_r43);
        this.setRotateAngle(Neckend_r43, -0.6333F, 0.2332F, -0.1199F);
        this.Neckend_r43.cubeList.add(new ModelBox(Neckend_r43, 0, 66, -0.0104F, -0.64F, -0.0406F, 0, 1, 5, 0.001F, false));

        this.Neckend_r44 = new AdvancedModelRenderer(this);
        this.Neckend_r44.setRotationPoint(1.01F, 0.8703F, -5.9528F);
        this.Neckbase.addChild(Neckend_r44);
        this.setRotateAngle(Neckend_r44, -0.4546F, 0.194F, -0.1003F);
        this.Neckend_r44.cubeList.add(new ModelBox(Neckend_r44, 66, 2, 0.0272F, -0.3758F, -0.3386F, 0, 1, 5, 0.001F, false));

        this.Neckmiddle = new AdvancedModelRenderer(this);
        this.Neckmiddle.setRotationPoint(0.0F, 0.2002F, -6.3514F);
        this.Neckbase.addChild(Neckmiddle);
        this.setRotateAngle(Neckmiddle, -0.598F, -0.1963F, -0.1295F);


        this.Neckmiddle_r1 = new AdvancedModelRenderer(this);
        this.Neckmiddle_r1.setRotationPoint(0.01F, 0.5021F, -7.3621F);
        this.Neckmiddle.addChild(Neckmiddle_r1);
        this.setRotateAngle(Neckmiddle_r1, 0.0349F, 0.0F, 0.0F);
        this.Neckmiddle_r1.cubeList.add(new ModelBox(Neckmiddle_r1, 0, 55, -1.01F, -1.0F, -0.5F, 2, 2, 8, 0.0F, false));

        this.Neckend_r45 = new AdvancedModelRenderer(this);
        this.Neckend_r45.setRotationPoint(-0.99F, 1.4021F, -6.8621F);
        this.Neckmiddle.addChild(Neckend_r45);
        this.setRotateAngle(Neckend_r45, -0.1868F, -0.1155F, 0.0617F);
        this.Neckend_r45.cubeList.add(new ModelBox(Neckend_r45, 66, 21, 0.5061F, -1.9722F, 4.4127F, 0, 1, 5, 0.001F, true));
        this.Neckend_r45.cubeList.add(new ModelBox(Neckend_r45, 41, 67, 0.2186F, -1.3821F, 1.937F, 0, 1, 5, 0.001F, true));
        this.Neckend_r45.cubeList.add(new ModelBox(Neckend_r45, 64, 67, 0.0186F, -0.5821F, -0.263F, 0, 1, 5, 0.001F, true));

        this.Neckend_r46 = new AdvancedModelRenderer(this);
        this.Neckend_r46.setRotationPoint(1.01F, 1.4021F, -6.8621F);
        this.Neckmiddle.addChild(Neckend_r46);
        this.setRotateAngle(Neckend_r46, -0.1868F, 0.1155F, -0.0617F);
        this.Neckend_r46.cubeList.add(new ModelBox(Neckend_r46, 66, 21, -0.5061F, -1.9722F, 4.4127F, 0, 1, 5, 0.001F, false));
        this.Neckend_r46.cubeList.add(new ModelBox(Neckend_r46, 41, 67, -0.2186F, -1.3821F, 1.937F, 0, 1, 5, 0.001F, false));
        this.Neckend_r46.cubeList.add(new ModelBox(Neckend_r46, 64, 67, -0.0186F, -0.5821F, -0.263F, 0, 1, 5, 0.001F, false));

        this.Neckend = new AdvancedModelRenderer(this);
        this.Neckend.setRotationPoint(0.01F, 0.3021F, -7.3621F);
        this.Neckmiddle.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.4946F, 0.1013F, -0.446F);


        this.Neckend_r47 = new AdvancedModelRenderer(this);
        this.Neckend_r47.setRotationPoint(0.0F, 0.0064F, -3.8407F);
        this.Neckend.addChild(Neckend_r47);
        this.setRotateAngle(Neckend_r47, 0.1658F, 0.0F, 0.0F);
        this.Neckend_r47.cubeList.add(new ModelBox(Neckend_r47, 58, 0, -1.0F, -1.6587F, -3.6963F, 2, 2, 4, 0.0F, false));

        this.Neckend_r48 = new AdvancedModelRenderer(this);
        this.Neckend_r48.setRotationPoint(0.0F, -0.9936F, -3.7407F);
        this.Neckend.addChild(Neckend_r48);
        this.setRotateAngle(Neckend_r48, -0.1833F, 0.0F, 0.0F);
        this.Neckend_r48.cubeList.add(new ModelBox(Neckend_r48, 33, 55, -1.0F, -0.6548F, -0.1438F, 2, 2, 4, 0.001F, false));

        this.Neckend_r49 = new AdvancedModelRenderer(this);
        this.Neckend_r49.setRotationPoint(-1.0F, 0.7064F, -0.8407F);
        this.Neckend.addChild(Neckend_r49);
        this.setRotateAngle(Neckend_r49, -0.7104F, -0.1155F, 0.0617F);
        this.Neckend_r49.cubeList.add(new ModelBox(Neckend_r49, 6, 68, -0.0026F, -0.4857F, -0.2943F, 0, 1, 5, 0.001F, true));

        this.Neckend_r50 = new AdvancedModelRenderer(this);
        this.Neckend_r50.setRotationPoint(-1.0F, -0.0936F, -3.0407F);
        this.Neckend.addChild(Neckend_r50);
        this.setRotateAngle(Neckend_r50, -0.4923F, -0.1155F, 0.0617F);
        this.Neckend_r50.cubeList.add(new ModelBox(Neckend_r50, 68, 28, 0.0F, -0.4122F, 0.0039F, 0, 1, 5, 0.001F, true));

        this.Neckend_r51 = new AdvancedModelRenderer(this);
        this.Neckend_r51.setRotationPoint(1.0F, 0.7064F, -0.8407F);
        this.Neckend.addChild(Neckend_r51);
        this.setRotateAngle(Neckend_r51, -0.7104F, 0.1155F, -0.0617F);
        this.Neckend_r51.cubeList.add(new ModelBox(Neckend_r51, 6, 68, 0.0026F, -0.4857F, -0.2943F, 0, 1, 5, 0.001F, false));

        this.Neckend_r52 = new AdvancedModelRenderer(this);
        this.Neckend_r52.setRotationPoint(1.0F, -0.0936F, -3.0407F);
        this.Neckend.addChild(Neckend_r52);
        this.setRotateAngle(Neckend_r52, -0.4923F, 0.1155F, -0.0617F);
        this.Neckend_r52.cubeList.add(new ModelBox(Neckend_r52, 68, 28, 0.0F, -0.4122F, 0.0039F, 0, 1, 5, 0.001F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -0.3436F, -6.2407F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 1.1301F, 0.0194F, -0.261F);
        this.Head.cubeList.add(new ModelBox(Head, 21, 0, -2.0F, -1.7358F, -3.686F, 4, 4, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 83, -2.0F, -1.2358F, -3.386F, 4, 1, 1, 0.02F, false));
        this.Head.cubeList.add(new ModelBox(Head, 10, 83, 1.24F, -1.2358F, -3.386F, 1, 1, 1, -0.2F, false));
        this.Head.cubeList.add(new ModelBox(Head, 10, 83, -2.24F, -1.2358F, -3.386F, 1, 1, 1, -0.2F, true));

        this.Lowerjawbase = new AdvancedModelRenderer(this);
        this.Lowerjawbase.setRotationPoint(0.0F, 2.2642F, 0.314F);
        this.Head.addChild(Lowerjawbase);
        this.setRotateAngle(Lowerjawbase, 0.4363F, 0.0F, 0.0F);
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 34, 70, 1.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));
        this.Lowerjawbase.cubeList.add(new ModelBox(Lowerjawbase, 34, 70, -2.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, true));

        this.Lowerjawbase_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r1.setRotationPoint(0.0F, 2.1F, 0.0F);
        this.Lowerjawbase.addChild(Lowerjawbase_r1);
        this.setRotateAngle(Lowerjawbase_r1, -0.1787F, -0.2148F, 0.0385F);
        this.Lowerjawbase_r1.cubeList.add(new ModelBox(Lowerjawbase_r1, 35, 72, -0.6493F, -0.5F, -2.9289F, 0, 1, 3, 0.0F, true));

        this.Lowerjawbase_r2 = new AdvancedModelRenderer(this);
        this.Lowerjawbase_r2.setRotationPoint(0.0F, 2.1F, 0.0F);
        this.Lowerjawbase.addChild(Lowerjawbase_r2);
        this.setRotateAngle(Lowerjawbase_r2, -0.1787F, 0.2148F, -0.0385F);
        this.Lowerjawbase_r2.cubeList.add(new ModelBox(Lowerjawbase_r2, 35, 72, 0.6493F, -0.5F, -2.9289F, 0, 1, 3, 0.0F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.01F, 1.0F, -3.9F);
        this.Lowerjawbase.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1061F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 60, 40, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.1061F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 72, 0, -0.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

        this.Rightlowerteeth = new AdvancedModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(0.83F, -0.2F, -1.5F);
        this.Lowerjawmiddle.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.1061F, 0.1344F, 0.0F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 69, 35, 0.0F, -1.0F, -5.0F, 0, 1, 5, 0.0F, false));

        this.Lowerjawunderside = new AdvancedModelRenderer(this);
        this.Lowerjawunderside.setRotationPoint(-0.01F, 1.0F, 0.0F);
        this.Lowerjawmiddle.addChild(Lowerjawunderside);
        this.setRotateAngle(Lowerjawunderside, -0.2546F, 0.0F, 0.0F);
        this.Lowerjawunderside.cubeList.add(new ModelBox(Lowerjawunderside, 42, 61, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.0F, false));

        this.Upperjawbase = new AdvancedModelRenderer(this);
        this.Upperjawbase.setRotationPoint(0.0F, 1.2342F, -3.416F);
        this.Head.addChild(Upperjawbase);
        this.setRotateAngle(Upperjawbase, 0.1061F, 0.0F, 0.0F);
        this.Upperjawbase.cubeList.add(new ModelBox(Upperjawbase, 0, 10, -1.5F, -1.0F, -5.0F, 3, 2, 5, 0.0F, false));

        this.Upperjawend = new AdvancedModelRenderer(this);
        this.Upperjawend.setRotationPoint(0.0F, 0.55F, -4.5F);
        this.Upperjawbase.addChild(Upperjawend);
        this.setRotateAngle(Upperjawend, 0.0213F, 0.0F, 0.0F);
        this.Upperjawend.cubeList.add(new ModelBox(Upperjawend, 22, 65, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Snout = new AdvancedModelRenderer(this);
        this.Snout.setRotationPoint(0.0F, -2.4F, -0.4F);
        this.Upperjawend.addChild(Snout);
        this.setRotateAngle(Snout, 0.2122F, 0.0F, 0.0F);
        this.Snout.cubeList.add(new ModelBox(Snout, 69, 42, -0.5F, 0.0F, -3.0F, 1, 2, 4, 0.0F, false));

        this.Rightupperfrontteeth = new AdvancedModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(0.9F, -0.8F, 0.2F);
        this.Upperjawend.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, 0.1485F, 0.2335F, 0.1485F);
        this.Rightupperfrontteeth.cubeList.add(new ModelBox(Rightupperfrontteeth, 74, 49, 0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F, false));

        this.Leftupperfrontteeth = new AdvancedModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-0.9F, -0.8F, 0.2F);
        this.Upperjawend.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, 0.1485F, -0.2335F, -0.1485F);
        this.Leftupperfrontteeth.cubeList.add(new ModelBox(Leftupperfrontteeth, 74, 49, 0.0F, 0.0F, -3.0F, 0, 1, 3, 0.0F, true));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -3.05F, 0.1F);
        this.Upperjawbase.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2335F, 0.0F, 0.0F);


        this.Rightcrestbase = new AdvancedModelRenderer(this);
        this.Rightcrestbase.setRotationPoint(0.8F, -0.4F, -0.2F);
        this.Headslope.addChild(Rightcrestbase);
        this.setRotateAngle(Rightcrestbase, -0.3821F, 0.1485F, 0.2546F);
        this.Rightcrestbase.cubeList.add(new ModelBox(Rightcrestbase, 59, 30, 0.0F, 0.0F, -2.0F, 1, 3, 6, 0.0F, false));

        this.Rightcrestfront = new AdvancedModelRenderer(this);
        this.Rightcrestfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Rightcrestbase.addChild(Rightcrestfront);
        this.setRotateAngle(Rightcrestfront, 0.6117F, -0.0424F, -0.0213F);


        this.Rightcrestfront2 = new AdvancedModelRenderer(this);
        this.Rightcrestfront2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Rightcrestbase.addChild(Rightcrestfront2);
        this.setRotateAngle(Rightcrestfront2, 0.6117F, -0.0424F, -0.0213F);
        this.Rightcrestfront2.cubeList.add(new ModelBox(Rightcrestfront2, 17, 40, 0.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F, false));

        this.Leftcrestbase = new AdvancedModelRenderer(this);
        this.Leftcrestbase.setRotationPoint(-0.8F, -0.4F, -0.2F);
        this.Headslope.addChild(Leftcrestbase);
        this.setRotateAngle(Leftcrestbase, -0.3821F, -0.1485F, -0.2546F);
        this.Leftcrestbase.cubeList.add(new ModelBox(Leftcrestbase, 59, 30, -1.0F, 0.0F, -2.0F, 1, 3, 6, 0.0F, true));

        this.Leftcrestfront = new AdvancedModelRenderer(this);
        this.Leftcrestfront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Leftcrestbase.addChild(Leftcrestfront);
        this.setRotateAngle(Leftcrestfront, 0.6117F, 0.0424F, 0.0213F);


        this.Leftcrestfront2 = new AdvancedModelRenderer(this);
        this.Leftcrestfront2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Leftcrestbase.addChild(Leftcrestfront2);
        this.setRotateAngle(Leftcrestfront2, 0.6117F, 0.0424F, 0.0213F);
        this.Leftcrestfront2.cubeList.add(new ModelBox(Leftcrestfront2, 17, 40, -1.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F, true));

        this.Headslope2 = new AdvancedModelRenderer(this);
        this.Headslope2.setRotationPoint(0.0F, -3.05F, 0.1F);
        this.Upperjawbase.addChild(Headslope2);
        this.setRotateAngle(Headslope2, 0.2335F, 0.0F, 0.0F);
        this.Headslope2.cubeList.add(new ModelBox(Headslope2, 0, 29, -1.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.Rightupperbackteeth = new AdvancedModelRenderer(this);
        this.Rightupperbackteeth.setRotationPoint(1.15F, 0.75F, -4.6F);
        this.Upperjawbase.addChild(Rightupperbackteeth);
        this.setRotateAngle(Rightupperbackteeth, 0.0873F, 0.0637F, 0.0F);
        this.Rightupperbackteeth.cubeList.add(new ModelBox(Rightupperbackteeth, 70, 65, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, false));

        this.Leftupperbackteeth = new AdvancedModelRenderer(this);
        this.Leftupperbackteeth.setRotationPoint(-1.15F, 0.75F, -4.6F);
        this.Upperjawbase.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, 0.0873F, -0.0637F, 0.0F);
        this.Leftupperbackteeth.cubeList.add(new ModelBox(Leftupperbackteeth, 70, 65, 0.0F, 0.0F, 0.0F, 0, 1, 4, 0.0F, true));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(4.45F, 6.2172F, -5.5876F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.7535F, -0.1807F, -0.6201F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 71, 9, -1.5F, -1.2059F, -1.0444F, 2, 6, 2, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(-0.51F, 4.5F, 0.4F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.9976F, 0.0F, 0.0F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 10, 20, -1.0F, -0.5F, -0.5F, 2, 5, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 0, 20, -1.0F, -0.5F, -1.8F, 2, 5, 1, 0.0F, false));

        this.Righthand = new AdvancedModelRenderer(this);
        this.Righthand.setRotationPoint(0.7F, 4.2F, -0.5F);
        this.Rightlowerarm.addChild(Righthand);
        this.setRotateAngle(Righthand, 0.1485F, 0.0F, 0.4458F);
        this.Righthand.cubeList.add(new ModelBox(Righthand, 72, 18, -1.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-4.43F, 6.2172F, -5.5876F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.5954F, 0.3586F, 0.7062F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 0, 40, -0.5F, -1.2059F, -1.0444F, 2, 6, 2, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.51F, 4.5F, 0.4F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.9976F, 0.0F, 0.0F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 10, 0, -1.0F, -0.5F, -0.5F, 2, 5, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 0, -1.0F, -0.5F, -1.8F, 2, 5, 1, 0.0F, false));

        this.Lefthand = new AdvancedModelRenderer(this);
        this.Lefthand.setRotationPoint(-0.7F, 4.2F, -0.5F);
        this.Leftlowerarm.addChild(Lefthand);
        this.setRotateAngle(Lefthand, 0.1485F, 0.0F, -0.4458F);
        this.Lefthand.cubeList.add(new ModelBox(Lefthand, 49, 71, 0.0F, 0.0F, -1.5F, 1, 4, 3, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.1011F, 5.0254F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.1971F, -0.0428F, -0.0085F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 25, 26, -1.0F, -0.7F, 0.0F, 2, 2, 14, 0.001F, false));

        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 1.44F, 11.0765F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.8727F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 9, 40, 0.0F, 0.0344F, -0.2876F, 0, 5, 1, 0.001F, false));

        this.Tailbase_r2 = new AdvancedModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, 1.2F, 2.0F);
        this.Tailbase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.7418F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 56, 23, 0.0F, 4.5622F, 3.8281F, 0, 5, 1, 0.001F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 68, 9, 0.0F, 2.7811F, 1.4141F, 0, 4, 1, 0.001F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 0, 29, 0.0F, 1.0F, -1.0F, 0, 3, 1, 0.001F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.3F, 13.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, 0.3099F, -0.2081F, -0.0661F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 23, 4, -1.0F, -1.0F, 0.0F, 2, 2, 16, 0.0F, false));

        this.Tailbase_r3 = new AdvancedModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, 1.14F, -1.9235F);
        this.Tailmiddlebase.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.8727F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 21, 0, 0.0F, 11.4051F, 9.4799F, 0, 2, 1, 0.001F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 21, 9, 0.0F, 9.1486F, 7.5031F, 0, 3, 1, 0.001F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 43, 43, 0.0F, 6.892F, 5.5262F, 0, 4, 1, 0.001F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 46, 43, 0.0F, 4.6355F, 3.5493F, 0, 4, 1, 0.001F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 12, 66, 0.0F, 2.3789F, 1.5725F, 0, 4, 1, 0.001F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4F, 15.7F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1962F, -0.1284F, -0.0255F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 0, 0, -0.5F, -0.5191F, -0.2994F, 1, 1, 18, 0.0F, false));

        this.Tailbase_r4 = new AdvancedModelRenderer(this);
        this.Tailbase_r4.setRotationPoint(0.0F, 1.5209F, -17.6229F);
        this.Tailmiddleend.addChild(Tailbase_r4);
        this.setRotateAngle(Tailbase_r4, 0.8727F, 0.0F, 0.0F);
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 21, 22, 0.0F, 13.6617F, 11.4568F, 0, 1, 1, 0.001F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, -0.0191F, 17.3006F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, -0.1065F, -0.0868F, 0.0093F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 20, -0.5F, -0.49F, -0.0888F, 1, 1, 18, -0.001F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(3.5F, 2.7989F, 1.0254F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0354F, 0.0F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 60, 12, -1.0F, -0.7071F, -0.9562F, 2, 10, 3, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(-0.1F, 8.9929F, -0.5562F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.7217F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 69, 54, -1.0F, -0.1607F, -0.2507F, 2, 9, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 62, 61, -1.0F, -0.1607F, 1.3493F, 2, 9, 1, 0.0F, false));

        this.Rightankle = new AdvancedModelRenderer(this);
        this.Rightankle.setRotationPoint(-0.01F, 8.3393F, 1.7493F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.5943F, 0.0F, 0.0F);
        this.Rightankle.cubeList.add(new ModelBox(Rightankle, 44, 23, -1.0F, 0.0F, -1.5F, 2, 6, 2, 0.0F, false));

        this.Rightfoot = new AdvancedModelRenderer(this);
        this.Rightfoot.setRotationPoint(0.0F, 5.3F, -1.2F);
        this.Rightankle.addChild(Rightfoot);
        this.setRotateAngle(Rightfoot, 0.2546F, 0.0F, 0.0F);
        this.Rightfoot.cubeList.add(new ModelBox(Rightfoot, 46, 52, -2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-3.5F, 2.7989F, 1.0254F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.6463F, 0.0F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 21, 23, -1.0F, -0.7071F, -0.9562F, 2, 10, 3, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.1F, 8.9929F, -0.5562F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 1.5507F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 55, 61, -1.0F, -0.1607F, -0.2507F, 2, 9, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 32, 23, -1.0F, -0.1607F, 1.3493F, 2, 9, 1, 0.0F, false));

        this.Leftankle = new AdvancedModelRenderer(this);
        this.Leftankle.setRotationPoint(0.01F, 8.3393F, 1.7493F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, -1.4233F, 0.0F, 0.0F);
        this.Leftankle.cubeList.add(new ModelBox(Leftankle, 44, 0, -1.0F, 0.0F, -1.5F, 2, 6, 2, 0.0F, false));

        this.Leftfoot = new AdvancedModelRenderer(this);
        this.Leftfoot.setRotationPoint(0.0F, 5.3F, -1.2F);
        this.Leftankle.addChild(Leftfoot);
        this.setRotateAngle(Leftfoot, 2.3054F, 0.0F, 0.0F);
        this.Leftfoot.cubeList.add(new ModelBox(Leftfoot, 43, 43, -2.5F, 0.0F, -5.0F, 5, 2, 6, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
