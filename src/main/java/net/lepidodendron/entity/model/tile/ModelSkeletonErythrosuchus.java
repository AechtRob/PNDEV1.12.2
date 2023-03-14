package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonErythrosuchus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Basin_r2;
    private final AdvancedModelRenderer Basin_r3;
    private final AdvancedModelRenderer Basin_r4;
    private final AdvancedModelRenderer Basin_r5;
    private final AdvancedModelRenderer Basin_r6;
    private final AdvancedModelRenderer Basin_r7;
    private final AdvancedModelRenderer Basin_r8;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Neck_r1;
    private final AdvancedModelRenderer Neck_r2;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Bodymiddle_r1;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer Bodyfront_r3;
    private final AdvancedModelRenderer Bodyfront_r4;
    private final AdvancedModelRenderer Bodyfront_r5;
    private final AdvancedModelRenderer Bodyfront_r6;
    private final AdvancedModelRenderer Bodyfront_r7;
    private final AdvancedModelRenderer Bodyfront_r8;
    private final AdvancedModelRenderer Bodyfront_r9;
    private final AdvancedModelRenderer Bodyfront_r10;
    private final AdvancedModelRenderer Bodyfront_r11;
    private final AdvancedModelRenderer Bodyfront_r12;
    private final AdvancedModelRenderer Bodyfront_r13;
    private final AdvancedModelRenderer Bodyfront_r14;
    private final AdvancedModelRenderer Bodyfront_r15;
    private final AdvancedModelRenderer Bodyfront_r16;
    private final AdvancedModelRenderer Bodyfront_r17;
    private final AdvancedModelRenderer Bodyfront_r18;
    private final AdvancedModelRenderer Bodyfront_r19;
    private final AdvancedModelRenderer Neck_r3;
    private final AdvancedModelRenderer Neck_r4;
    private final AdvancedModelRenderer Neck_r5;
    private final AdvancedModelRenderer Bodyfront_r20;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Bodyfront_r21;
    private final AdvancedModelRenderer Bodyfront_r22;
    private final AdvancedModelRenderer Bodyfront_r23;
    private final AdvancedModelRenderer Bodyfront_r24;
    private final AdvancedModelRenderer Bodyfront_r25;
    private final AdvancedModelRenderer Bodyfront_r26;
    private final AdvancedModelRenderer Bodyfront_r27;
    private final AdvancedModelRenderer Bodyfront_r28;
    private final AdvancedModelRenderer Bodyfront_r29;
    private final AdvancedModelRenderer Bodyfront_r30;
    private final AdvancedModelRenderer Bodyfront_r31;
    private final AdvancedModelRenderer Bodyfront_r32;
    private final AdvancedModelRenderer Bodyfront_r33;
    private final AdvancedModelRenderer Bodyfront_r34;
    private final AdvancedModelRenderer Bodyfront_r35;
    private final AdvancedModelRenderer Bodyfront_r36;
    private final AdvancedModelRenderer Bodyfront_r37;
    private final AdvancedModelRenderer Bodyfront_r38;
    private final AdvancedModelRenderer Bodyfront_r39;
    private final AdvancedModelRenderer Bodyfront_r40;
    private final AdvancedModelRenderer Bodyfront_r41;
    private final AdvancedModelRenderer Bodyfront_r42;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Bodyfront_r43;
    private final AdvancedModelRenderer Neck_r6;
    private final AdvancedModelRenderer Neck_r7;
    private final AdvancedModelRenderer Neck_r8;
    private final AdvancedModelRenderer Neck_r9;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r10;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperlipback;
    private final AdvancedModelRenderer UpperteethbackR;
    private final AdvancedModelRenderer Upperjawmiddle;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer Snoutslope;
    private final AdvancedModelRenderer Upperlipfront;
    private final AdvancedModelRenderer UpperteethmidfrontR;
    private final AdvancedModelRenderer UpperteethmiddleR;
    private final AdvancedModelRenderer UpperteethmiddleR2;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer Lowerjawback_r1;
    private final AdvancedModelRenderer Lowerjawback_r2;
    private final AdvancedModelRenderer Lowerjawmiddleback;
    private final AdvancedModelRenderer Lowerjawmiddlefront;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerteethfront;
    private final AdvancedModelRenderer Lowerteethback;
    private final AdvancedModelRenderer Lowerjawslope;
    private final AdvancedModelRenderer Jawparting;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Tailbase_r2;
    private final AdvancedModelRenderer Neck_r11;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailbase_r3;
    private final AdvancedModelRenderer Neck_r12;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Tailbase_r4;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Rightankle;
    private final AdvancedModelRenderer Righttoes;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Leftankle;
    private final AdvancedModelRenderer Lefttoes;

    public ModelSkeletonErythrosuchus() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(1.0F, 3.9F, 0.8F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.2972F, 0.0F, 0.0F);


        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-3.3F, -2.7763F, 12.2945F);
        this.Hips.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1442F, 0.1899F, -0.2773F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 19, 32, -0.1979F, 5.2037F, -2.722F, 1, 2, 1, 0.0F, true));
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 74, 0, -0.1979F, 1.2037F, -2.722F, 1, 4, 3, 0.0F, true));

        this.Basin_r2 = new AdvancedModelRenderer(this);
        this.Basin_r2.setRotationPoint(-3.3F, -2.7763F, 12.2945F);
        this.Hips.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, 0.0025F, 0.0254F, 0.0562F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 19, 57, -0.3547F, 0.1298F, -3.0638F, 1, 2, 6, 0.0F, true));

        this.Basin_r3 = new AdvancedModelRenderer(this);
        this.Basin_r3.setRotationPoint(-3.3F, -1.3763F, 14.4945F);
        this.Hips.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, 1.0028F, 0.3962F, 0.0379F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 46, 9, -0.5353F, 4.0075F, 0.5323F, 1, 3, 1, 0.0F, true));
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 0, 76, -0.5353F, 0.0075F, -1.4677F, 1, 4, 3, 0.0F, true));

        this.Basin_r4 = new AdvancedModelRenderer(this);
        this.Basin_r4.setRotationPoint(-3.7F, -2.5763F, 11.9945F);
        this.Hips.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, -0.0046F, -0.0251F, 0.2231F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 0, 42, -0.3471F, -1.8716F, -3.0639F, 1, 2, 8, 0.0F, true));

        this.Basin_r5 = new AdvancedModelRenderer(this);
        this.Basin_r5.setRotationPoint(1.3F, -2.7763F, 12.2945F);
        this.Hips.addChild(Basin_r5);
        this.setRotateAngle(Basin_r5, 0.0025F, -0.0254F, -0.0562F);
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 19, 57, -0.6453F, 0.1298F, -3.0638F, 1, 2, 6, 0.0F, false));

        this.Basin_r6 = new AdvancedModelRenderer(this);
        this.Basin_r6.setRotationPoint(1.7F, -2.5763F, 11.9945F);
        this.Hips.addChild(Basin_r6);
        this.setRotateAngle(Basin_r6, -0.0046F, 0.0251F, -0.2231F);
        this.Basin_r6.cubeList.add(new ModelBox(Basin_r6, 0, 42, -0.6529F, -1.8716F, -3.0639F, 1, 2, 8, 0.0F, false));

        this.Basin_r7 = new AdvancedModelRenderer(this);
        this.Basin_r7.setRotationPoint(1.3F, -1.3763F, 14.4945F);
        this.Hips.addChild(Basin_r7);
        this.setRotateAngle(Basin_r7, 1.0028F, -0.3962F, -0.0379F);
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 46, 9, -0.4647F, 4.0075F, 0.5323F, 1, 3, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 0, 76, -0.4647F, 0.0075F, -1.4677F, 1, 4, 3, 0.0F, false));

        this.Basin_r8 = new AdvancedModelRenderer(this);
        this.Basin_r8.setRotationPoint(1.3F, -2.7763F, 12.2945F);
        this.Hips.addChild(Basin_r8);
        this.setRotateAngle(Basin_r8, -0.1442F, -0.1899F, 0.2773F);
        this.Basin_r8.cubeList.add(new ModelBox(Basin_r8, 74, 0, -0.8021F, 1.2037F, -2.722F, 1, 4, 3, 0.0F, false));
        this.Basin_r8.cubeList.add(new ModelBox(Basin_r8, 19, 32, -0.8021F, 5.2037F, -2.722F, 1, 2, 1, 0.0F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-3.7F, -2.5763F, 11.9945F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0349F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 55, 61, 0.7F, -1.1842F, -1.8549F, 1, 1, 6, 0.001F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 55, 61, 3.7F, -1.1842F, -1.8549F, 1, 1, 6, 0.001F, false));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-1.0F, -4.6763F, 7.4945F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0349F, 0.0F, 0.0F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 19, 0, -1.0F, 0.0715F, -0.8309F, 2, 2, 10, 0.001F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, -4.6005F, 16.0689F);
        this.Hips.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, -0.096F, 0.0F, 0.0F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 57, 48, 0.0F, -1.4984F, -0.5666F, 0, 3, 1, 0.0F, false));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, -4.6005F, 7.6689F);
        this.Hips.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, 0.0349F, 0.0F, 0.0F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 56, 57, 0.0F, -1.2052F, 5.8283F, 0, 3, 1, 0.0F, false));
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 59, 41, 0.0F, -1.2052F, 3.8283F, 0, 3, 1, 0.0F, false));
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 60, 48, 0.0F, -1.2052F, 1.8283F, 0, 3, 1, 0.0F, false));
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 62, 9, 0.0F, -1.2052F, -0.1717F, 0, 3, 1, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(-1.0F, -3.7763F, 7.1945F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.2378F, -0.1668F, -0.0516F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 11, 64, 0.0F, -2.5277F, -5.6678F, 0, 3, 1, 0.0F, false));

        this.Bodymiddle_r1 = new AdvancedModelRenderer(this);
        this.Bodymiddle_r1.setRotationPoint(0.0F, 0.6333F, -13.4687F);
        this.Bodymiddle.addChild(Bodymiddle_r1);
        this.setRotateAngle(Bodymiddle_r1, 0.0524F, 0.0F, 0.0F);
        this.Bodymiddle_r1.cubeList.add(new ModelBox(Bodymiddle_r1, 0, 0, -1.0F, -0.8F, -0.3F, 2, 2, 14, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-1.0F, 0.6091F, -1.2943F);
        this.Bodymiddle.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.1096F, -0.005F, 0.7406F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 53, 68, 0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-1.0F, 0.7091F, -3.2943F);
        this.Bodymiddle.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, 0.0928F, 0.0587F, 0.1327F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 9, 53, -1.6478F, 2.3939F, -0.7073F, 0, 2, 1, 0.0F, true));

        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-1.0F, 0.7091F, -3.2943F);
        this.Bodymiddle.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, 0.1096F, -0.005F, 0.7406F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 71, 0, 0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(-1.0F, 0.7091F, -5.2943F);
        this.Bodymiddle.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, 0.0928F, 0.0587F, 0.22F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 22, 57, -1.6478F, 2.3939F, -0.7073F, 0, 4, 1, 0.0F, true));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-1.0F, 0.7091F, -5.2943F);
        this.Bodymiddle.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, 0.1096F, -0.005F, 0.8278F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 76, 46, 0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r6 = new AdvancedModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-1.0F, 0.8091F, -7.2943F);
        this.Bodymiddle.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, 0.0928F, 0.0587F, 0.2898F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 67, 15, -1.6478F, 2.3939F, -0.7073F, 0, 5, 1, 0.0F, true));

        this.Bodyfront_r7 = new AdvancedModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(-1.0F, 0.8091F, -7.2943F);
        this.Bodymiddle.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, 0.1096F, -0.005F, 0.8976F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 79, 34, 0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r8 = new AdvancedModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(-1.0F, 0.9906F, -13.378F);
        this.Bodymiddle.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, 0.0992F, -0.0142F, 0.9584F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 79, 46, -0.0817F, 0.2372F, 3.3672F, 0, 3, 1, 0.0F, true));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 66, 79, -0.0917F, 0.0184F, 1.3792F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r9 = new AdvancedModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(-1.0F, 0.9906F, -13.378F);
        this.Bodymiddle.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, 0.0894F, 0.0452F, 0.3503F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 11, 42, -1.9113F, 2.5922F, 3.3672F, 0, 6, 1, 0.0F, true));
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 29, 79, -1.794F, 2.4073F, 1.3792F, 0, 7, 1, 0.0F, true));

        this.Bodyfront_r10 = new AdvancedModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(1.0F, 0.6091F, -1.2943F);
        this.Bodymiddle.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, 0.1096F, 0.005F, -0.7406F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 53, 68, -0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r11 = new AdvancedModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(1.0F, 0.7091F, -3.2943F);
        this.Bodymiddle.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, 0.1096F, 0.005F, -0.7406F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 71, 0, -0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r12 = new AdvancedModelRenderer(this);
        this.Bodyfront_r12.setRotationPoint(1.0F, 0.7091F, -3.2943F);
        this.Bodymiddle.addChild(Bodyfront_r12);
        this.setRotateAngle(Bodyfront_r12, 0.0928F, -0.0587F, -0.1327F);
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 9, 53, 1.6478F, 2.3939F, -0.7073F, 0, 2, 1, 0.0F, false));

        this.Bodyfront_r13 = new AdvancedModelRenderer(this);
        this.Bodyfront_r13.setRotationPoint(1.0F, 0.7091F, -5.2943F);
        this.Bodymiddle.addChild(Bodyfront_r13);
        this.setRotateAngle(Bodyfront_r13, 0.0928F, -0.0587F, -0.22F);
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 22, 57, 1.6478F, 2.3939F, -0.7073F, 0, 4, 1, 0.0F, false));

        this.Bodyfront_r14 = new AdvancedModelRenderer(this);
        this.Bodyfront_r14.setRotationPoint(1.0F, 0.7091F, -5.2943F);
        this.Bodymiddle.addChild(Bodyfront_r14);
        this.setRotateAngle(Bodyfront_r14, 0.1096F, 0.005F, -0.8278F);
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 76, 46, -0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r15 = new AdvancedModelRenderer(this);
        this.Bodyfront_r15.setRotationPoint(1.0F, 0.8091F, -7.2943F);
        this.Bodymiddle.addChild(Bodyfront_r15);
        this.setRotateAngle(Bodyfront_r15, 0.1096F, 0.005F, -0.8976F);
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 79, 34, -0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r16 = new AdvancedModelRenderer(this);
        this.Bodyfront_r16.setRotationPoint(1.0F, 0.8091F, -7.2943F);
        this.Bodymiddle.addChild(Bodyfront_r16);
        this.setRotateAngle(Bodyfront_r16, 0.0928F, -0.0587F, -0.2898F);
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 67, 15, 1.6478F, 2.3939F, -0.7073F, 0, 5, 1, 0.0F, false));

        this.Bodyfront_r17 = new AdvancedModelRenderer(this);
        this.Bodyfront_r17.setRotationPoint(1.0F, 0.9906F, -13.378F);
        this.Bodymiddle.addChild(Bodyfront_r17);
        this.setRotateAngle(Bodyfront_r17, 0.0894F, -0.0452F, -0.3503F);
        this.Bodyfront_r17.cubeList.add(new ModelBox(Bodyfront_r17, 11, 42, 1.9113F, 2.5922F, 3.3672F, 0, 6, 1, 0.0F, false));

        this.Bodyfront_r18 = new AdvancedModelRenderer(this);
        this.Bodyfront_r18.setRotationPoint(1.0F, 0.9906F, -13.378F);
        this.Bodymiddle.addChild(Bodyfront_r18);
        this.setRotateAngle(Bodyfront_r18, 0.0992F, 0.0142F, -0.9584F);
        this.Bodyfront_r18.cubeList.add(new ModelBox(Bodyfront_r18, 79, 46, 0.0817F, 0.2372F, 3.3672F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r19 = new AdvancedModelRenderer(this);
        this.Bodyfront_r19.setRotationPoint(1.0F, 0.9906F, -11.678F);
        this.Bodymiddle.addChild(Bodyfront_r19);
        this.setRotateAngle(Bodyfront_r19, 0.1706F, -0.0357F, -0.9647F);
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 66, 79, 0.1158F, -0.1499F, -0.3123F, 0, 3, 1, 0.0F, false));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(0.0F, -0.6909F, -1.4943F);
        this.Bodymiddle.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, -0.0524F, 0.0F, 0.0F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 39, 63, 0.0F, -1.5096F, -0.1849F, 0, 3, 1, 0.0F, false));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(0.0F, -0.5909F, -3.4943F);
        this.Bodymiddle.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, -0.0349F, 0.0F, 0.0F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 42, 63, 0.0F, -1.8698F, -0.1828F, 0, 3, 1, 0.0F, false));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(0.0F, 0.1091F, -11.4943F);
        this.Bodymiddle.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0698F, 0.0F, 0.0F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 64, 61, 0.0F, -2.2101F, 3.8465F, 0, 3, 1, 0.0F, false));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 67, 61, 0.0F, -2.2101F, 1.8465F, 0, 3, 1, 0.0F, false));
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 68, 0, 0.0F, -2.2101F, -0.1535F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r20 = new AdvancedModelRenderer(this);
        this.Bodyfront_r20.setRotationPoint(1.0F, 0.9906F, -11.678F);
        this.Bodymiddle.addChild(Bodyfront_r20);
        this.setRotateAngle(Bodyfront_r20, 0.1198F, -0.1269F, -0.3584F);
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 29, 79, 1.7171F, 2.2556F, -0.3123F, 0, 7, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, 0.7333F, -13.0687F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.2132F, -0.1742F, -0.0112F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 29, 63, -1.0F, -1.0116F, -4.9141F, 2, 2, 5, 0.001F, false));

        this.Bodyfront_r21 = new AdvancedModelRenderer(this);
        this.Bodyfront_r21.setRotationPoint(-1.0F, 0.3407F, -0.1265F);
        this.Bodyfront.addChild(Bodyfront_r21);
        this.setRotateAngle(Bodyfront_r21, 0.0757F, 0.184F, 0.9507F);
        this.Bodyfront_r21.cubeList.add(new ModelBox(Bodyfront_r21, 69, 79, -0.1099F, -0.2126F, -0.6404F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r22 = new AdvancedModelRenderer(this);
        this.Bodyfront_r22.setRotationPoint(-1.0F, 0.3407F, -0.1265F);
        this.Bodyfront.addChild(Bodyfront_r22);
        this.setRotateAngle(Bodyfront_r22, -0.0449F, 0.1937F, 0.3285F);
        this.Bodyfront_r22.cubeList.add(new ModelBox(Bodyfront_r22, 11, 0, -1.6763F, 2.2077F, -0.6404F, 0, 8, 1, 0.0F, true));

        this.Bodyfront_r23 = new AdvancedModelRenderer(this);
        this.Bodyfront_r23.setRotationPoint(-1.0F, 0.1407F, -1.9265F);
        this.Bodyfront.addChild(Bodyfront_r23);
        this.setRotateAngle(Bodyfront_r23, -0.0299F, 0.1068F, 0.2968F);
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 26, 79, -1.6512F, 2.42F, -0.8235F, 0, 8, 1, 0.0F, true));

        this.Bodyfront_r24 = new AdvancedModelRenderer(this);
        this.Bodyfront_r24.setRotationPoint(-1.0F, 0.1407F, -1.9265F);
        this.Bodyfront.addChild(Bodyfront_r24);
        this.setRotateAngle(Bodyfront_r24, 0.037F, 0.1046F, 0.9112F);
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 72, 79, 0.0325F, -0.0531F, -0.8235F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r25 = new AdvancedModelRenderer(this);
        this.Bodyfront_r25.setRotationPoint(-1.0F, 0.2407F, -4.1265F);
        this.Bodyfront.addChild(Bodyfront_r25);
        this.setRotateAngle(Bodyfront_r25, 0.0399F, 0.0994F, 0.2139F);
        this.Bodyfront_r25.cubeList.add(new ModelBox(Bodyfront_r25, 32, 79, -1.7677F, 2.3421F, -0.6302F, 0, 7, 1, 0.0F, true));

        this.Bodyfront_r26 = new AdvancedModelRenderer(this);
        this.Bodyfront_r26.setRotationPoint(-1.0F, 0.2407F, -4.1265F);
        this.Bodyfront.addChild(Bodyfront_r26);
        this.setRotateAngle(Bodyfront_r26, 0.0897F, 0.0586F, 0.8254F);
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 75, 79, -0.1076F, -0.0501F, -0.6302F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r27 = new AdvancedModelRenderer(this);
        this.Bodyfront_r27.setRotationPoint(-1.0F, 0.2592F, -6.0427F);
        this.Bodyfront.addChild(Bodyfront_r27);
        this.setRotateAngle(Bodyfront_r27, 0.1418F, -0.0344F, 0.7923F);
        this.Bodyfront_r27.cubeList.add(new ModelBox(Bodyfront_r27, 80, 51, 0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r28 = new AdvancedModelRenderer(this);
        this.Bodyfront_r28.setRotationPoint(-1.0F, 0.2592F, -6.0427F);
        this.Bodyfront.addChild(Bodyfront_r28);
        this.setRotateAngle(Bodyfront_r28, 0.1361F, 0.0528F, 0.1875F);
        this.Bodyfront_r28.cubeList.add(new ModelBox(Bodyfront_r28, 0, 53, -1.6478F, 2.3939F, -0.7073F, 0, 6, 1, 0.0F, true));

        this.Bodyfront_r29 = new AdvancedModelRenderer(this);
        this.Bodyfront_r29.setRotationPoint(-1.0F, 0.3592F, -8.0427F);
        this.Bodyfront.addChild(Bodyfront_r29);
        this.setRotateAngle(Bodyfront_r29, 0.2226F, 0.0409F, 0.1392F);
        this.Bodyfront_r29.cubeList.add(new ModelBox(Bodyfront_r29, 20, 72, -1.6478F, 2.3939F, -0.7073F, 0, 5, 1, 0.0F, true));

        this.Bodyfront_r30 = new AdvancedModelRenderer(this);
        this.Bodyfront_r30.setRotationPoint(-1.0F, 0.3592F, -8.0427F);
        this.Bodyfront.addChild(Bodyfront_r30);
        this.setRotateAngle(Bodyfront_r30, 0.2065F, -0.0932F, 0.7358F);
        this.Bodyfront_r30.cubeList.add(new ModelBox(Bodyfront_r30, 78, 80, 0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r31 = new AdvancedModelRenderer(this);
        this.Bodyfront_r31.setRotationPoint(-1.0F, 0.6592F, -10.6427F);
        this.Bodyfront.addChild(Bodyfront_r31);
        this.setRotateAngle(Bodyfront_r31, 0.2193F, -0.0562F, 0.5647F);
        this.Bodyfront_r31.cubeList.add(new ModelBox(Bodyfront_r31, 9, 81, 0.0F, -0.0491F, -0.1096F, 0, 3, 1, 0.0F, true));

        this.Bodyfront_r32 = new AdvancedModelRenderer(this);
        this.Bodyfront_r32.setRotationPoint(1.0F, 0.3407F, -0.1265F);
        this.Bodyfront.addChild(Bodyfront_r32);
        this.setRotateAngle(Bodyfront_r32, -0.1373F, -0.0346F, -0.9663F);
        this.Bodyfront_r32.cubeList.add(new ModelBox(Bodyfront_r32, 69, 79, 0.1099F, -0.2126F, -0.6404F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r33 = new AdvancedModelRenderer(this);
        this.Bodyfront_r33.setRotationPoint(1.0F, 0.3407F, -0.1265F);
        this.Bodyfront.addChild(Bodyfront_r33);
        this.setRotateAngle(Bodyfront_r33, -0.1324F, 0.0501F, -0.3611F);
        this.Bodyfront_r33.cubeList.add(new ModelBox(Bodyfront_r33, 11, 0, 1.6763F, 2.2077F, -0.6404F, 0, 8, 1, 0.0F, false));

        this.Bodyfront_r34 = new AdvancedModelRenderer(this);
        this.Bodyfront_r34.setRotationPoint(1.0F, 0.1407F, -1.9265F);
        this.Bodyfront.addChild(Bodyfront_r34);
        this.setRotateAngle(Bodyfront_r34, -0.066F, -0.0258F, -0.9239F);
        this.Bodyfront_r34.cubeList.add(new ModelBox(Bodyfront_r34, 72, 79, -0.0325F, -0.0531F, -0.8235F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r35 = new AdvancedModelRenderer(this);
        this.Bodyfront_r35.setRotationPoint(1.0F, 0.1407F, -1.9265F);
        this.Bodyfront.addChild(Bodyfront_r35);
        this.setRotateAngle(Bodyfront_r35, -0.0689F, 0.0167F, -0.3144F);
        this.Bodyfront_r35.cubeList.add(new ModelBox(Bodyfront_r35, 26, 79, 1.6512F, 2.42F, -0.8235F, 0, 8, 1, 0.0F, false));

        this.Bodyfront_r36 = new AdvancedModelRenderer(this);
        this.Bodyfront_r36.setRotationPoint(1.0F, 0.2407F, -4.1265F);
        this.Bodyfront.addChild(Bodyfront_r36);
        this.setRotateAngle(Bodyfront_r36, 0.0399F, -0.0994F, -0.2139F);
        this.Bodyfront_r36.cubeList.add(new ModelBox(Bodyfront_r36, 32, 79, 1.7677F, 2.3421F, -0.6302F, 0, 7, 1, 0.0F, false));

        this.Bodyfront_r37 = new AdvancedModelRenderer(this);
        this.Bodyfront_r37.setRotationPoint(1.0F, 0.2407F, -4.1265F);
        this.Bodyfront.addChild(Bodyfront_r37);
        this.setRotateAngle(Bodyfront_r37, 0.0897F, -0.0586F, -0.8254F);
        this.Bodyfront_r37.cubeList.add(new ModelBox(Bodyfront_r37, 75, 79, 0.1076F, -0.0501F, -0.6302F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r38 = new AdvancedModelRenderer(this);
        this.Bodyfront_r38.setRotationPoint(1.0F, 0.2592F, -6.0427F);
        this.Bodyfront.addChild(Bodyfront_r38);
        this.setRotateAngle(Bodyfront_r38, 0.1418F, 0.0344F, -0.7923F);
        this.Bodyfront_r38.cubeList.add(new ModelBox(Bodyfront_r38, 80, 51, -0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r39 = new AdvancedModelRenderer(this);
        this.Bodyfront_r39.setRotationPoint(1.0F, 0.2592F, -6.0427F);
        this.Bodyfront.addChild(Bodyfront_r39);
        this.setRotateAngle(Bodyfront_r39, 0.1361F, -0.0528F, -0.1875F);
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 0, 53, 1.6478F, 2.3939F, -0.7073F, 0, 6, 1, 0.0F, false));

        this.Bodyfront_r40 = new AdvancedModelRenderer(this);
        this.Bodyfront_r40.setRotationPoint(1.0F, 0.3592F, -8.0427F);
        this.Bodyfront.addChild(Bodyfront_r40);
        this.setRotateAngle(Bodyfront_r40, 0.2226F, -0.0409F, -0.1392F);
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 20, 72, 1.6478F, 2.3939F, -0.7073F, 0, 5, 1, 0.0F, false));

        this.Bodyfront_r41 = new AdvancedModelRenderer(this);
        this.Bodyfront_r41.setRotationPoint(1.0F, 0.3592F, -8.0427F);
        this.Bodyfront.addChild(Bodyfront_r41);
        this.setRotateAngle(Bodyfront_r41, 0.2065F, 0.0932F, -0.7358F);
        this.Bodyfront_r41.cubeList.add(new ModelBox(Bodyfront_r41, 78, 80, -0.0203F, -0.0764F, -0.7073F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r42 = new AdvancedModelRenderer(this);
        this.Bodyfront_r42.setRotationPoint(1.0F, 0.6592F, -10.6427F);
        this.Bodyfront.addChild(Bodyfront_r42);
        this.setRotateAngle(Bodyfront_r42, 0.2193F, 0.0562F, -0.5647F);
        this.Bodyfront_r42.cubeList.add(new ModelBox(Bodyfront_r42, 9, 81, 0.0F, -0.0491F, -0.1096F, 0, 3, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-1.6F, 9.1464F, -9.6438F);
        this.Bodyfront.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2199F, 0.1643F, 0.3842F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 77, 26, -0.9301F, -0.1812F, -0.2937F, 3, 6, 1, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.2F, 7.0464F, -6.4438F);
        this.Bodyfront.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.2133F, -0.6508F, -0.1933F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 76, -0.7651F, -2.7415F, -2.802F, 1, 4, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(3.8F, 6.6464F, -7.3438F);
        this.Bodyfront.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.9512F, 0.3376F, -0.3708F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 71, -0.3761F, -1.2881F, 0.1035F, 1, 3, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.8F, 3.1464F, -4.8438F);
        this.Bodyfront.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.8957F, 0.1791F, -0.5866F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 69, 48, -0.7449F, -2.1562F, -0.166F, 1, 4, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-3.8F, 6.6464F, -7.3438F);
        this.Bodyfront.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.9512F, -0.3376F, 0.3708F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 71, -0.6239F, -1.2881F, 0.1035F, 1, 3, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-3.8F, 3.1464F, -4.8438F);
        this.Bodyfront.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.8957F, -0.1791F, 0.5866F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 69, 48, -0.2551F, -2.1562F, -0.166F, 1, 4, 4, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(4.2F, 7.0464F, -6.4438F);
        this.Bodyfront.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 1.2133F, 0.6508F, 0.1933F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 76, -0.2349F, -2.7415F, -2.802F, 1, 4, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.6F, 9.1464F, -9.6438F);
        this.Bodyfront.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.2199F, -0.1643F, -0.3842F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 77, 26, -2.0699F, -0.1812F, -0.2937F, 3, 6, 1, 0.0F, false));

        this.Bodyfront_r43 = new AdvancedModelRenderer(this);
        this.Bodyfront_r43.setRotationPoint(0.0F, 1.1592F, -11.6427F);
        this.Bodyfront.addChild(Bodyfront_r43);
        this.setRotateAngle(Bodyfront_r43, 0.1047F, 0.0F, 0.0F);
        this.Bodyfront_r43.cubeList.add(new ModelBox(Bodyfront_r43, 45, 47, -1.0F, -1.4419F, -0.0628F, 2, 2, 7, -0.001F, false));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(0.0F, -0.5408F, -4.2427F);
        this.Bodyfront.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, -0.0524F, 0.0F, 0.0F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 81, 14, 0.0F, -2.4241F, 3.8383F, 0, 3, 1, 0.0F, false));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 81, 56, 0.0F, -2.4241F, 1.8383F, 0, 3, 1, 0.0F, false));
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 81, 61, 0.0F, -2.3241F, -0.1617F, 0, 3, 1, 0.0F, false));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(0.0F, -0.5408F, -6.2427F);
        this.Bodyfront.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, -0.0087F, 0.0F, 0.0F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 81, 66, 0.0F, -2.2415F, -0.1618F, 0, 3, 1, 0.0F, false));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(0.0F, -0.5408F, -8.2427F);
        this.Bodyfront.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0349F, 0.0F, 0.0F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 81, 80, 0.0F, -1.9717F, -0.163F, 0, 3, 1, 0.0F, false));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(0.0F, -0.3408F, -10.3427F);
        this.Bodyfront.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0349F, 0.0F, 0.0F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 82, 7, 0.0F, -1.8814F, -0.0763F, 0, 3, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.5834F, -10.6172F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.0006F, -0.0863F, 0.0129F);


        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(0.0F, 0.5758F, -3.9256F);
        this.Neck.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, -0.0524F, 0.0F, 0.0F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 53, 69, -1.0F, -1.5991F, 0.0394F, 2, 2, 4, 0.0F, false));
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 34, 0, 0.0F, -3.5991F, 1.0394F, 0, 3, 2, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.1F, -3.1F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.6714F, -0.2221F, 0.051F);
        this.Head.cubeList.add(new ModelBox(Head, 0, 17, -4.5F, -3.596F, -7.0932F, 9, 7, 7, 0.0F, false));

        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -3.496F, -7.0932F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 28, 13, -3.0F, 0.0F, -5.0F, 6, 5, 5, 0.0F, false));

        this.Upperlipback = new AdvancedModelRenderer(this);
        this.Upperlipback.setRotationPoint(-0.01F, 5.65F, -5.9F);
        this.Upperjawback.addChild(Upperlipback);
        this.setRotateAngle(Upperlipback, -0.2388F, 0.0F, 0.0F);
        this.Upperlipback.cubeList.add(new ModelBox(Upperlipback, 0, 32, -3.5F, -5.0F, 0.0F, 7, 5, 4, 0.0F, false));

        this.UpperteethbackR = new AdvancedModelRenderer(this);
        this.UpperteethbackR.setRotationPoint(3.05F, -0.5F, 0.4F);
        this.Upperlipback.addChild(UpperteethbackR);
        this.setRotateAngle(UpperteethbackR, 0.1485F, 0.1061F, 0.0F);
        this.UpperteethbackR.cubeList.add(new ModelBox(UpperteethbackR, 0, 42, 0.0F, 0.0F, 0.0F, 0, 1, 3, 0.0F, false));
        this.UpperteethbackR.cubeList.add(new ModelBox(UpperteethbackR, 0, 42, -6.08F, 0.0F, 0.0F, 0, 1, 3, 0.0F, true));

        this.Upperjawmiddle = new AdvancedModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.01F, 5.73F, -5.6F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.2546F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 46, 24, -3.0F, -5.0F, -4.0F, 6, 5, 4, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.4245F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 46, 9, -2.5F, 0.0F, -5.0F, 5, 3, 5, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 2.0F, -4.8F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.1698F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 35, 37, -1.5F, 0.0F, 0.0F, 3, 2, 0, 0.0F, false));

        this.Snoutslope = new AdvancedModelRenderer(this);
        this.Snoutslope.setRotationPoint(0.0F, -5.0F, -4.0F);
        this.Upperjawmiddle.addChild(Snoutslope);
        this.setRotateAngle(Snoutslope, 0.2175F, 0.0F, 0.0F);
        this.Snoutslope.cubeList.add(new ModelBox(Snoutslope, 51, 18, -2.5F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

        this.Upperlipfront = new AdvancedModelRenderer(this);
        this.Upperlipfront.setRotationPoint(-0.01F, 0.0F, -4.0F);
        this.Upperjawmiddle.addChild(Upperlipfront);
        this.setRotateAngle(Upperlipfront, -0.1911F, 0.0F, 0.0F);
        this.Upperlipfront.cubeList.add(new ModelBox(Upperlipfront, 11, 66, -2.5F, -2.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.UpperteethmidfrontR = new AdvancedModelRenderer(this);
        this.UpperteethmidfrontR.setRotationPoint(2.05F, -0.5F, -3.2F);
        this.Upperlipfront.addChild(UpperteethmidfrontR);
        this.setRotateAngle(UpperteethmidfrontR, 0.2972F, 0.1274F, 0.0F);
        this.UpperteethmidfrontR.cubeList.add(new ModelBox(UpperteethmidfrontR, 38, 24, 0.0F, 0.0F, 0.0F, 0, 2, 3, 0.0F, false));
        this.UpperteethmidfrontR.cubeList.add(new ModelBox(UpperteethmidfrontR, 38, 24, -4.1F, 0.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.UpperteethmiddleR = new AdvancedModelRenderer(this);
        this.UpperteethmiddleR.setRotationPoint(2.6F, -0.9F, -4.0F);
        this.Upperjawmiddle.addChild(UpperteethmiddleR);
        this.setRotateAngle(UpperteethmiddleR, 0.0848F, 0.0848F, 0.0F);
        this.UpperteethmiddleR.cubeList.add(new ModelBox(UpperteethmiddleR, 39, 78, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, false));

        this.UpperteethmiddleR2 = new AdvancedModelRenderer(this);
        this.UpperteethmiddleR2.setRotationPoint(-2.62F, -0.9F, -4.0F);
        this.Upperjawmiddle.addChild(UpperteethmiddleR2);
        this.setRotateAngle(UpperteethmiddleR2, 0.0848F, -0.0848F, 0.0F);
        this.UpperteethmiddleR2.cubeList.add(new ModelBox(UpperteethmiddleR2, 39, 78, 0.0F, 0.0F, 0.0F, 0, 2, 4, 0.0F, true));

        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 3.404F, -0.0932F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.6981F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 25, 24, 2.0F, 0.0F, -7.0F, 2, 4, 8, 0.0F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 25, 24, -4.0F, 0.0F, -7.0F, 2, 4, 8, 0.0F, true));

        this.Lowerjawback_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(-1.2F, 4.5F, 0.8F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, -0.0896F, -0.1725F, 0.0265F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 25, 24, -0.1086F, -0.9004F, -7.806F, 0, 1, 8, 0.0F, true));

        this.Lowerjawback_r2 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r2.setRotationPoint(1.2F, 4.5F, 0.8F);
        this.Lowerjawback.addChild(Lowerjawback_r2);
        this.setRotateAngle(Lowerjawback_r2, -0.0896F, 0.1725F, -0.0265F);
        this.Lowerjawback_r2.cubeList.add(new ModelBox(Lowerjawback_r2, 25, 24, 0.1086F, -0.9004F, -7.806F, 0, 1, 8, 0.0F, false));

        this.Lowerjawmiddleback = new AdvancedModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.1698F, 0.0F, 0.0F);
        this.Lowerjawmiddleback.cubeList.add(new ModelBox(Lowerjawmiddleback, 17, 79, 2.0F, 0.0F, -3.0F, 1, 3, 3, 0.001F, false));
        this.Lowerjawmiddleback.cubeList.add(new ModelBox(Lowerjawmiddleback, 17, 79, -3.0F, 0.0F, -3.0F, 1, 3, 3, 0.001F, true));

        this.Lowerjawmiddlefront = new AdvancedModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 3.0F, -3.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, -0.1061F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 73, 15, 1.5F, -3.0F, -4.0F, 1, 3, 4, 0.0F, false));
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 73, 15, -2.5F, -3.0F, -4.0F, 1, 3, 4, 0.0F, true));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -3.0F, -4.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1485F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 0, 17, 1.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 0, 17, -2.0F, 0.0F, -2.0F, 1, 3, 2, 0.0F, true));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 51, 0, -2.0F, 0.0F, -3.0F, 4, 3, 1, 0.0F, false));

        this.Lowerteethfront = new AdvancedModelRenderer(this);
        this.Lowerteethfront.setRotationPoint(-0.01F, 0.0F, -2.8F);
        this.Lowerjawfront.addChild(Lowerteethfront);
        this.setRotateAngle(Lowerteethfront, -0.0424F, 0.0F, 0.0F);
        this.Lowerteethfront.cubeList.add(new ModelBox(Lowerteethfront, 67, 9, -2.0F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

        this.Lowerteethback = new AdvancedModelRenderer(this);
        this.Lowerteethback.setRotationPoint(0.0F, -3.0F, -3.6F);
        this.Lowerjawmiddlefront.addChild(Lowerteethback);
        this.setRotateAngle(Lowerteethback, -0.0637F, 0.0F, 0.0F);
        this.Lowerteethback.cubeList.add(new ModelBox(Lowerteethback, 57, 41, -2.0F, -1.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(0.01F, 4.0F, -7.0F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, -0.1114F, 0.0F, 0.0F);
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 28, 37, 2.0F, -1.0F, -2.7F, 1, 1, 4, 0.0F, false));
        this.Lowerjawslope.cubeList.add(new ModelBox(Lowerjawslope, 28, 37, -3.02F, -1.0F, -2.7F, 1, 1, 4, 0.0F, true));

        this.Jawparting = new AdvancedModelRenderer(this);
        this.Jawparting.setRotationPoint(0.01F, 0.1F, -5.5F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.2759F, 0.0F, 0.0F);


        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(4.8F, 8.4534F, -7.5172F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.3755F, -0.0751F, -0.5434F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 59, 52, -1.0F, -1.0F, -2.0F, 2, 3, 5, 0.0F, false));
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 71, 38, -1.0F, 2.0F, -0.6F, 2, 4, 3, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(0.0F, 5.8F, 2.5F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.2805F, -0.0856F, 0.5113F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 11, 72, -1.0F, 0.5F, -1.0F, 2, 7, 2, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 77, 71, -1.0F, 0.5F, -2.7F, 2, 7, 1, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 7.2F, -2.0F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.4995F, -0.0007F, 0.0216F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 36, 37, -2.5F, -0.5F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(-4.8F, 8.4534F, -7.5172F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.7565F, -0.4767F, 0.2815F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 46, 57, -1.0F, -1.0F, -2.0F, 2, 3, 5, 0.0F, false));
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 25, 71, -1.0F, 2.0F, -0.6F, 2, 4, 3, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.0F, 5.8F, 2.5F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.3239F, 0.0866F, -0.5094F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 19, 0, -1.0F, 0.5F, -1.0F, 2, 7, 2, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 59, 76, -1.0F, 0.5F, -2.7F, 2, 7, 1, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 7.2F, -2.0F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 0.0637F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 34, 0, -2.5F, -0.5F, -4.5F, 5, 2, 6, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(-1.0F, -3.8763F, 16.2945F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.104F, -0.2085F, -0.0648F);


        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 1.2023F, 3.9071F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.5585F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 40, 54, 0.0F, 1.0113F, 1.9322F, 0, 4, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 19, 57, 0.0F, 0.0113F, -0.0678F, 0, 4, 1, 0.0F, false));

        this.Tailbase_r2 = new AdvancedModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, -0.1977F, -0.0929F);
        this.Tailbase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, -0.0524F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 15, 37, -1.0F, -0.8F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(0.0F, -0.7219F, 1.1815F);
        this.Tailbase.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, -0.1047F, 0.0F, 0.0F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 51, 18, 0.0F, -1.3472F, 6.0343F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 3, 53, 0.0F, -1.3472F, 4.0343F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 6, 53, 0.0F, -1.3472F, 2.0343F, 0, 2, 1, 0.0F, false));
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 46, 57, 0.0F, -1.3472F, 0.0343F, 0, 3, 1, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1023F, 7.4071F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.076F, -0.2F, -0.0877F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 29, 54, -1.0F, -0.7153F, -0.5964F, 2, 2, 6, -0.001F, false));

        this.Tailbase_r3 = new AdvancedModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, 1.1847F, -3.4964F);
        this.Tailmiddlebase.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.5585F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 28, 37, 0.0F, 3.7113F, 5.9322F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 47, 46, 0.0F, 2.0113F, 3.9322F, 0, 3, 1, 0.0F, false));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(0.0F, -0.7395F, -6.222F);
        this.Tailmiddlebase.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, -0.1047F, 0.0F, 0.0F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 45, 24, 0.0F, -1.3472F, 8.0343F, 0, 2, 1, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, 0.3847F, 4.8036F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.167F, -0.1919F, -0.1045F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 57, 0, -1.0F, -1.1F, 0.0F, 2, 2, 6, 0.0F, false));

        this.Tailbase_r4 = new AdvancedModelRenderer(this);
        this.Tailbase_r4.setRotationPoint(0.0F, 0.8F, -8.3F);
        this.Tailmiddle.addChild(Tailbase_r4);
        this.setRotateAngle(Tailbase_r4, 0.5585F, 0.0F, 0.0F);
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 11, 10, 0.0F, 5.7113F, 10.2322F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r4.cubeList.add(new ModelBox(Tailbase_r4, 0, 32, 0.0F, 4.7113F, 8.2322F, 0, 2, 1, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.5F, 5.6F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.1559F, 0.1235F, 0.0434F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 64, 18, -0.5F, -0.2914F, -0.4063F, 1, 1, 6, 0.001F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.2086F, 4.9937F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1572F, 0.3002F, 0.0572F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 64, 63, -0.5F, -0.4945F, 0.074F, 1, 1, 6, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.5F, -0.0163F, 12.6945F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, 0.2893F, 0.1472F, -0.2173F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 64, -1.0F, -1.1F, -1.5F, 2, 8, 3, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 7.08F, -1.1228F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.4833F, -0.0759F, 0.2508F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 68, 26, -1.0F, 0.0F, -0.5F, 2, 9, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 74, 57, -1.0F, 0.0317F, 1.9997F, 2, 9, 1, 0.0F, false));

        this.Rightankle = new AdvancedModelRenderer(this);
        this.Rightankle.setRotationPoint(0.0F, 8.5F, 2.3F);
        this.Rightshin.addChild(Rightankle);
        this.setRotateAngle(Rightankle, -0.0213F, 0.0F, 0.0F);
        this.Rightankle.cubeList.add(new ModelBox(Rightankle, 14, 49, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Righttoes = new AdvancedModelRenderer(this);
        this.Righttoes.setRotationPoint(0.01F, 0.49F, -2.8F);
        this.Rightankle.addChild(Righttoes);
        this.setRotateAngle(Righttoes, -0.3491F, 0.0F, 0.0F);
        this.Righttoes.cubeList.add(new ModelBox(Righttoes, 0, 57, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-4.5F, -0.0163F, 12.6945F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.263F, -0.0092F, 0.2616F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 0, -1.0F, -1.1F, -1.5F, 2, 8, 3, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 7.08F, -1.1228F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.4397F, 0.0759F, -0.2508F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 44, 66, -1.0F, 0.0F, -0.5F, 2, 9, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 36, 71, -1.0F, 0.0317F, 1.9997F, 2, 9, 1, 0.0F, false));

        this.Leftankle = new AdvancedModelRenderer(this);
        this.Leftankle.setRotationPoint(0.0F, 8.5F, 2.3F);
        this.Leftshin.addChild(Leftankle);
        this.setRotateAngle(Leftankle, 0.415F, 0.0F, 0.0F);
        this.Leftankle.cubeList.add(new ModelBox(Leftankle, 31, 46, -2.5F, -0.5F, -3.5F, 5, 2, 5, 0.0F, false));

        this.Lefttoes = new AdvancedModelRenderer(this);
        this.Lefttoes.setRotationPoint(-0.01F, 0.49F, -2.8F);
        this.Leftankle.addChild(Lefttoes);
        this.setRotateAngle(Lefttoes, -0.2618F, 0.0F, 0.0F);
        this.Lefttoes.cubeList.add(new ModelBox(Lefttoes, 53, 34, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

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
