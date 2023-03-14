package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonLotosaurus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Neckhump_r1;
    private final AdvancedModelRenderer Neckhump_r2;
    private final AdvancedModelRenderer Neckhump_r3;
    private final AdvancedModelRenderer Basin_r1;
    private final AdvancedModelRenderer Basin_r2;
    private final AdvancedModelRenderer Basin_r3;
    private final AdvancedModelRenderer Basin_r4;
    private final AdvancedModelRenderer Basin_r5;
    private final AdvancedModelRenderer Basin_r6;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Belly;
    private final AdvancedModelRenderer Neckhump_r4;
    private final AdvancedModelRenderer Neck_r1;
    private final AdvancedModelRenderer Neck_r2;
    private final AdvancedModelRenderer Neck_r3;
    private final AdvancedModelRenderer Neck_r4;
    private final AdvancedModelRenderer Neck_r5;
    private final AdvancedModelRenderer Neck_r6;
    private final AdvancedModelRenderer Neck_r7;
    private final AdvancedModelRenderer Neck_r8;
    private final AdvancedModelRenderer Neck_r9;
    private final AdvancedModelRenderer Neck_r10;
    private final AdvancedModelRenderer Neck_r11;
    private final AdvancedModelRenderer Neck_r12;
    private final AdvancedModelRenderer Neck_r13;
    private final AdvancedModelRenderer Neck_r14;
    private final AdvancedModelRenderer Neck_r15;
    private final AdvancedModelRenderer Neck_r16;
    private final AdvancedModelRenderer Neck_r17;
    private final AdvancedModelRenderer Neck_r18;
    private final AdvancedModelRenderer Neck_r19;
    private final AdvancedModelRenderer Neck_r20;
    private final AdvancedModelRenderer Neck_r21;
    private final AdvancedModelRenderer Neck_r22;
    private final AdvancedModelRenderer Neck_r23;
    private final AdvancedModelRenderer Neck_r24;
    private final AdvancedModelRenderer Neckhump_r5;
    private final AdvancedModelRenderer Neckhump_r6;
    private final AdvancedModelRenderer Basin_r7;
    private final AdvancedModelRenderer Neckhump_r7;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer Basin_r8;
    private final AdvancedModelRenderer Basin_r9;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Neckhump_r8;
    private final AdvancedModelRenderer Neckhump_r9;
    private final AdvancedModelRenderer Neckhump_r10;
    private final AdvancedModelRenderer Neck_r25;
    private final AdvancedModelRenderer Neck_r26;
    private final AdvancedModelRenderer Neck_r27;
    private final AdvancedModelRenderer Neck_r28;
    private final AdvancedModelRenderer Neck_r29;
    private final AdvancedModelRenderer Neck_r30;
    private final AdvancedModelRenderer Neck_r31;
    private final AdvancedModelRenderer Neck_r32;
    private final AdvancedModelRenderer Neck_r33;
    private final AdvancedModelRenderer Neck_r34;
    private final AdvancedModelRenderer Neck_r35;
    private final AdvancedModelRenderer Neck_r36;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Neck_r37;
    private final AdvancedModelRenderer Neck_r38;
    private final AdvancedModelRenderer Neck_r39;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperjawmiddle;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Faceslopefront;
    private final AdvancedModelRenderer Faceslopemiddle;
    private final AdvancedModelRenderer Lefteye;
    private final AdvancedModelRenderer Righteye;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer Lowerjawback_r1;
    private final AdvancedModelRenderer Lowerjawback_r2;
    private final AdvancedModelRenderer Lowerjawmiddleback;
    private final AdvancedModelRenderer Lowerjawmiddlefront;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawslopeback;
    private final AdvancedModelRenderer Lowerjawslopeback_r1;
    private final AdvancedModelRenderer Lowerjawslopefront;
    private final AdvancedModelRenderer Lowerjawslopefront_r1;
    private final AdvancedModelRenderer Neckhump;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Bellyhump;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Neckhump_r11;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Tailbase_r2;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailmiddlebase_r1;
    private final AdvancedModelRenderer Neckhump_r12;
    private final AdvancedModelRenderer Tailbase_r3;
    private final AdvancedModelRenderer Tailmiddle;
    private final AdvancedModelRenderer Neckhump_r13;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Neckhump_r14;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Tailbasehump;
    private final AdvancedModelRenderer Hiphumpfront;
    private final AdvancedModelRenderer Hiphumpback;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Rightheel;
    private final AdvancedModelRenderer Righttoes;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Leftheel;
    private final AdvancedModelRenderer Lefttoes;

    public ModelSkeletonLotosaurus() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 6.3F, -2.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.0848F, 0.0F, 0.0F);


        this.Neckhump_r1 = new AdvancedModelRenderer(this);
        this.Neckhump_r1.setRotationPoint(0.0F, -1.409F, 13.5489F);
        this.Hips.addChild(Neckhump_r1);
        this.setRotateAngle(Neckhump_r1, -0.2705F, 0.0F, 0.0F);
        this.Neckhump_r1.cubeList.add(new ModelBox(Neckhump_r1, 49, 57, 0.0F, -3.9472F, 0.0559F, 0, 5, 1, 0.0F, false));

        this.Neckhump_r2 = new AdvancedModelRenderer(this);
        this.Neckhump_r2.setRotationPoint(0.0F, -1.409F, 9.5489F);
        this.Hips.addChild(Neckhump_r2);
        this.setRotateAngle(Neckhump_r2, -0.1833F, 0.0F, 0.0F);
        this.Neckhump_r2.cubeList.add(new ModelBox(Neckhump_r2, 22, 55, 0.0F, -4.9761F, 1.8889F, 0, 6, 1, 0.0F, false));
        this.Neckhump_r2.cubeList.add(new ModelBox(Neckhump_r2, 25, 55, 0.0F, -4.9761F, -0.1111F, 0, 6, 1, 0.0F, false));

        this.Neckhump_r3 = new AdvancedModelRenderer(this);
        this.Neckhump_r3.setRotationPoint(0.0F, -1.809F, 5.5489F);
        this.Hips.addChild(Neckhump_r3);
        this.setRotateAngle(Neckhump_r3, -0.096F, 0.0F, 0.0F);
        this.Neckhump_r3.cubeList.add(new ModelBox(Neckhump_r3, 28, 55, 0.0F, -4.9613F, 1.9088F, 0, 6, 1, 0.0F, false));

        this.Basin_r1 = new AdvancedModelRenderer(this);
        this.Basin_r1.setRotationPoint(-0.6F, 2.3717F, 9.3188F);
        this.Hips.addChild(Basin_r1);
        this.setRotateAngle(Basin_r1, -0.1382F, 0.165F, -0.1928F);
        this.Basin_r1.cubeList.add(new ModelBox(Basin_r1, 0, 28, -1.2086F, -0.258F, -0.779F, 1, 4, 1, 0.0F, true));

        this.Basin_r2 = new AdvancedModelRenderer(this);
        this.Basin_r2.setRotationPoint(-0.7F, -0.0283F, 9.8188F);
        this.Hips.addChild(Basin_r2);
        this.setRotateAngle(Basin_r2, 0.0F, 0.0F, 0.1396F);
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 39, 0, -0.9191F, -0.4118F, -2.101F, 1, 1, 6, 0.0F, true));
        this.Basin_r2.cubeList.add(new ModelBox(Basin_r2, 42, 17, -0.9191F, 0.5882F, -1.301F, 1, 2, 5, 0.0F, true));

        this.Basin_r3 = new AdvancedModelRenderer(this);
        this.Basin_r3.setRotationPoint(-0.6F, 2.5717F, 11.4188F);
        this.Hips.addChild(Basin_r3);
        this.setRotateAngle(Basin_r3, 0.9345F, 0.0648F, -0.2448F);
        this.Basin_r3.cubeList.add(new ModelBox(Basin_r3, 52, 51, -1.1481F, -0.8796F, -0.2927F, 1, 8, 1, 0.0F, true));

        this.Basin_r4 = new AdvancedModelRenderer(this);
        this.Basin_r4.setRotationPoint(0.7F, -0.0283F, 9.8188F);
        this.Hips.addChild(Basin_r4);
        this.setRotateAngle(Basin_r4, 0.0F, 0.0F, -0.1396F);
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 39, 0, -0.0809F, -0.4118F, -2.101F, 1, 1, 6, 0.0F, false));
        this.Basin_r4.cubeList.add(new ModelBox(Basin_r4, 42, 17, -0.0809F, 0.5882F, -1.301F, 1, 2, 5, 0.0F, false));

        this.Basin_r5 = new AdvancedModelRenderer(this);
        this.Basin_r5.setRotationPoint(0.6F, 2.3717F, 9.3188F);
        this.Hips.addChild(Basin_r5);
        this.setRotateAngle(Basin_r5, -0.1382F, -0.165F, 0.1928F);
        this.Basin_r5.cubeList.add(new ModelBox(Basin_r5, 0, 28, 0.2086F, -0.258F, -0.779F, 1, 4, 1, 0.0F, false));

        this.Basin_r6 = new AdvancedModelRenderer(this);
        this.Basin_r6.setRotationPoint(0.6F, 2.5717F, 11.4188F);
        this.Hips.addChild(Basin_r6);
        this.setRotateAngle(Basin_r6, 0.9345F, -0.0648F, 0.2448F);
        this.Basin_r6.cubeList.add(new ModelBox(Basin_r6, 52, 51, 0.1481F, -0.8796F, -0.2927F, 1, 8, 1, 0.0F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -0.8345F, 6.0198F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0349F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 15, -1.1F, -0.9F, 0.0F, 2, 2, 10, 0.0F, false));

        this.Belly = new AdvancedModelRenderer(this);
        this.Belly.setRotationPoint(0.0F, -0.9345F, 7.5198F);
        this.Hips.addChild(Belly);
        this.setRotateAngle(Belly, 0.0848F, 0.0F, 0.0F);
        this.Belly.cubeList.add(new ModelBox(Belly, 0, 0, -1.0F, -0.9011F, -12.0254F, 2, 2, 12, 0.0F, false));

        this.Neckhump_r4 = new AdvancedModelRenderer(this);
        this.Neckhump_r4.setRotationPoint(0.0F, -0.8756F, -1.9963F);
        this.Belly.addChild(Neckhump_r4);
        this.setRotateAngle(Neckhump_r4, -0.096F, 0.0F, 0.0F);
        this.Neckhump_r4.cubeList.add(new ModelBox(Neckhump_r4, 17, 56, 0.0F, -5.0613F, -0.0912F, 0, 6, 1, 0.0F, false));

        this.Neck_r1 = new AdvancedModelRenderer(this);
        this.Neck_r1.setRotationPoint(-1.0F, 0.3692F, -0.7951F);
        this.Belly.addChild(Neck_r1);
        this.setRotateAngle(Neck_r1, 0.0145F, -0.0609F, 0.2573F);
        this.Neck_r1.cubeList.add(new ModelBox(Neck_r1, 63, 25, -0.9939F, 1.7032F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r2 = new AdvancedModelRenderer(this);
        this.Neck_r2.setRotationPoint(-1.0F, 0.3692F, -0.7951F);
        this.Belly.addChild(Neck_r2);
        this.setRotateAngle(Neck_r2, -0.0179F, -0.06F, 0.7818F);
        this.Neck_r2.cubeList.add(new ModelBox(Neck_r2, 26, 63, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r3 = new AdvancedModelRenderer(this);
        this.Neck_r3.setRotationPoint(-1.0F, 0.3692F, -2.7951F);
        this.Belly.addChild(Neck_r3);
        this.setRotateAngle(Neck_r3, 0.0568F, -0.072F, 0.2544F);
        this.Neck_r3.cubeList.add(new ModelBox(Neck_r3, 62, 15, -0.9939F, 1.7032F, -0.5113F, 0, 3, 1, 0.0F, true));

        this.Neck_r4 = new AdvancedModelRenderer(this);
        this.Neck_r4.setRotationPoint(-1.0F, 0.3692F, -2.7951F);
        this.Belly.addChild(Neck_r4);
        this.setRotateAngle(Neck_r4, 0.0132F, -0.0907F, 0.7795F);
        this.Neck_r4.cubeList.add(new ModelBox(Neck_r4, 63, 29, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r5 = new AdvancedModelRenderer(this);
        this.Neck_r5.setRotationPoint(-1.0F, 0.3692F, -4.7951F);
        this.Belly.addChild(Neck_r5);
        this.setRotateAngle(Neck_r5, 0.0568F, -0.072F, 0.2544F);
        this.Neck_r5.cubeList.add(new ModelBox(Neck_r5, 60, 25, -0.9939F, 1.7032F, -0.5113F, 0, 4, 1, 0.0F, true));

        this.Neck_r6 = new AdvancedModelRenderer(this);
        this.Neck_r6.setRotationPoint(-1.0F, 0.3692F, -4.7951F);
        this.Belly.addChild(Neck_r6);
        this.setRotateAngle(Neck_r6, 0.0132F, -0.0907F, 0.7795F);
        this.Neck_r6.cubeList.add(new ModelBox(Neck_r6, 55, 63, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r7 = new AdvancedModelRenderer(this);
        this.Neck_r7.setRotationPoint(-1.0F, 0.3692F, -6.7951F);
        this.Belly.addChild(Neck_r7);
        this.setRotateAngle(Neck_r7, 0.0568F, -0.072F, 0.2981F);
        this.Neck_r7.cubeList.add(new ModelBox(Neck_r7, 57, 57, -0.9939F, 1.7032F, -0.5113F, 0, 5, 1, 0.0F, true));

        this.Neck_r8 = new AdvancedModelRenderer(this);
        this.Neck_r8.setRotationPoint(-1.0F, 0.3692F, -6.7951F);
        this.Belly.addChild(Neck_r8);
        this.setRotateAngle(Neck_r8, 0.0132F, -0.0907F, 0.8231F);
        this.Neck_r8.cubeList.add(new ModelBox(Neck_r8, 63, 56, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r9 = new AdvancedModelRenderer(this);
        this.Neck_r9.setRotationPoint(-1.0F, 0.3692F, -8.7951F);
        this.Belly.addChild(Neck_r9);
        this.setRotateAngle(Neck_r9, 0.0568F, -0.072F, 0.3417F);
        this.Neck_r9.cubeList.add(new ModelBox(Neck_r9, 14, 56, -0.9939F, 1.7032F, -0.5113F, 0, 6, 1, 0.0F, true));

        this.Neck_r10 = new AdvancedModelRenderer(this);
        this.Neck_r10.setRotationPoint(-1.0F, 0.3692F, -8.7951F);
        this.Belly.addChild(Neck_r10);
        this.setRotateAngle(Neck_r10, 0.0132F, -0.0907F, 0.8668F);
        this.Neck_r10.cubeList.add(new ModelBox(Neck_r10, 63, 60, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r11 = new AdvancedModelRenderer(this);
        this.Neck_r11.setRotationPoint(-1.0F, 0.3692F, -10.7951F);
        this.Belly.addChild(Neck_r11);
        this.setRotateAngle(Neck_r11, 0.0992F, -0.0829F, 0.3384F);
        this.Neck_r11.cubeList.add(new ModelBox(Neck_r11, 9, 0, -0.9939F, 1.7032F, -0.5113F, 0, 7, 1, 0.0F, true));

        this.Neck_r12 = new AdvancedModelRenderer(this);
        this.Neck_r12.setRotationPoint(-1.0F, 0.3692F, -10.7951F);
        this.Belly.addChild(Neck_r12);
        this.setRotateAngle(Neck_r12, 0.0444F, -0.1213F, 0.8635F);
        this.Neck_r12.cubeList.add(new ModelBox(Neck_r12, 64, 4, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r13 = new AdvancedModelRenderer(this);
        this.Neck_r13.setRotationPoint(1.0F, 0.3692F, -0.7951F);
        this.Belly.addChild(Neck_r13);
        this.setRotateAngle(Neck_r13, -0.0179F, 0.06F, -0.7818F);
        this.Neck_r13.cubeList.add(new ModelBox(Neck_r13, 26, 63, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r14 = new AdvancedModelRenderer(this);
        this.Neck_r14.setRotationPoint(1.0F, 0.3692F, -0.7951F);
        this.Belly.addChild(Neck_r14);
        this.setRotateAngle(Neck_r14, 0.0145F, 0.0609F, -0.2573F);
        this.Neck_r14.cubeList.add(new ModelBox(Neck_r14, 63, 25, 0.9939F, 1.7032F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r15 = new AdvancedModelRenderer(this);
        this.Neck_r15.setRotationPoint(1.0F, 0.3692F, -2.7951F);
        this.Belly.addChild(Neck_r15);
        this.setRotateAngle(Neck_r15, 0.0132F, 0.0907F, -0.7795F);
        this.Neck_r15.cubeList.add(new ModelBox(Neck_r15, 63, 29, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r16 = new AdvancedModelRenderer(this);
        this.Neck_r16.setRotationPoint(1.0F, 0.3692F, -2.7951F);
        this.Belly.addChild(Neck_r16);
        this.setRotateAngle(Neck_r16, 0.0568F, 0.072F, -0.2544F);
        this.Neck_r16.cubeList.add(new ModelBox(Neck_r16, 62, 15, 0.9939F, 1.7032F, -0.5113F, 0, 3, 1, 0.0F, false));

        this.Neck_r17 = new AdvancedModelRenderer(this);
        this.Neck_r17.setRotationPoint(1.0F, 0.3692F, -4.7951F);
        this.Belly.addChild(Neck_r17);
        this.setRotateAngle(Neck_r17, 0.0132F, 0.0907F, -0.7795F);
        this.Neck_r17.cubeList.add(new ModelBox(Neck_r17, 55, 63, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r18 = new AdvancedModelRenderer(this);
        this.Neck_r18.setRotationPoint(1.0F, 0.3692F, -4.7951F);
        this.Belly.addChild(Neck_r18);
        this.setRotateAngle(Neck_r18, 0.0568F, 0.072F, -0.2544F);
        this.Neck_r18.cubeList.add(new ModelBox(Neck_r18, 60, 25, 0.9939F, 1.7032F, -0.5113F, 0, 4, 1, 0.0F, false));

        this.Neck_r19 = new AdvancedModelRenderer(this);
        this.Neck_r19.setRotationPoint(1.0F, 0.3692F, -6.7951F);
        this.Belly.addChild(Neck_r19);
        this.setRotateAngle(Neck_r19, 0.0132F, 0.0907F, -0.8231F);
        this.Neck_r19.cubeList.add(new ModelBox(Neck_r19, 63, 56, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r20 = new AdvancedModelRenderer(this);
        this.Neck_r20.setRotationPoint(1.0F, 0.3692F, -6.7951F);
        this.Belly.addChild(Neck_r20);
        this.setRotateAngle(Neck_r20, 0.0568F, 0.072F, -0.2981F);
        this.Neck_r20.cubeList.add(new ModelBox(Neck_r20, 57, 57, 0.9939F, 1.7032F, -0.5113F, 0, 5, 1, 0.0F, false));

        this.Neck_r21 = new AdvancedModelRenderer(this);
        this.Neck_r21.setRotationPoint(1.0F, 0.3692F, -8.7951F);
        this.Belly.addChild(Neck_r21);
        this.setRotateAngle(Neck_r21, 0.0132F, 0.0907F, -0.8668F);
        this.Neck_r21.cubeList.add(new ModelBox(Neck_r21, 63, 60, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r22 = new AdvancedModelRenderer(this);
        this.Neck_r22.setRotationPoint(1.0F, 0.3692F, -8.7951F);
        this.Belly.addChild(Neck_r22);
        this.setRotateAngle(Neck_r22, 0.0568F, 0.072F, -0.3417F);
        this.Neck_r22.cubeList.add(new ModelBox(Neck_r22, 14, 56, 0.9939F, 1.7032F, -0.5113F, 0, 6, 1, 0.0F, false));

        this.Neck_r23 = new AdvancedModelRenderer(this);
        this.Neck_r23.setRotationPoint(1.0F, 0.3692F, -10.7951F);
        this.Belly.addChild(Neck_r23);
        this.setRotateAngle(Neck_r23, 0.0992F, 0.0829F, -0.3384F);
        this.Neck_r23.cubeList.add(new ModelBox(Neck_r23, 9, 0, 0.9939F, 1.7032F, -0.5113F, 0, 7, 1, 0.0F, false));

        this.Neck_r24 = new AdvancedModelRenderer(this);
        this.Neck_r24.setRotationPoint(1.0F, 0.3692F, -10.7951F);
        this.Belly.addChild(Neck_r24);
        this.setRotateAngle(Neck_r24, 0.0444F, 0.1213F, -0.8635F);
        this.Neck_r24.cubeList.add(new ModelBox(Neck_r24, 64, 4, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neckhump_r5 = new AdvancedModelRenderer(this);
        this.Neckhump_r5.setRotationPoint(0.0F, -0.8756F, -4.1963F);
        this.Belly.addChild(Neckhump_r5);
        this.setRotateAngle(Neckhump_r5, -0.0524F, 0.0F, 0.0F);
        this.Neckhump_r5.cubeList.add(new ModelBox(Neckhump_r5, 31, 57, 0.0F, -5.5765F, 0.1058F, 0, 6, 1, 0.0F, false));

        this.Neckhump_r6 = new AdvancedModelRenderer(this);
        this.Neckhump_r6.setRotationPoint(0.0F, -0.8756F, -8.1963F);
        this.Belly.addChild(Neckhump_r6);
        this.setRotateAngle(Neckhump_r6, 0.0175F, 0.0F, 0.0F);
        this.Neckhump_r6.cubeList.add(new ModelBox(Neckhump_r6, 34, 57, 0.0F, -5.5067F, 2.1052F, 0, 6, 1, 0.0F, false));
        this.Neckhump_r6.cubeList.add(new ModelBox(Neckhump_r6, 37, 57, 0.0F, -5.5067F, 0.1052F, 0, 6, 1, 0.0F, false));

        this.Basin_r7 = new AdvancedModelRenderer(this);
        this.Basin_r7.setRotationPoint(2.0F, 9.7537F, -10.3476F);
        this.Belly.addChild(Basin_r7);
        this.setRotateAngle(Basin_r7, 0.0087F, 0.0F, 0.0F);
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 54, 6, -3.5F, -0.1853F, 0.1187F, 3, 0, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 53, 39, -3.5F, -0.1853F, 2.1187F, 3, 0, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 29, 0, -3.5F, -0.1853F, 4.1187F, 3, 0, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 17, 10, -3.5F, -0.1853F, 6.1187F, 3, 0, 1, 0.0F, false));
        this.Basin_r7.cubeList.add(new ModelBox(Basin_r7, 0, 10, -3.5F, -0.1853F, 8.1187F, 3, 0, 1, 0.0F, false));

        this.Neckhump_r7 = new AdvancedModelRenderer(this);
        this.Neckhump_r7.setRotationPoint(0.0F, -1.0756F, -10.1963F);
        this.Belly.addChild(Neckhump_r7);
        this.setRotateAngle(Neckhump_r7, 0.1484F, 0.0F, 0.0F);
        this.Neckhump_r7.cubeList.add(new ModelBox(Neckhump_r7, 40, 57, 0.0F, -5.0132F, 0.0537F, 0, 6, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.3011F, -11.3254F);
        this.Belly.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.0425F, 0.0436F, 0.0019F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-2.0F, 6.4667F, -5.2606F);
        this.Bodyfront.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.2774F, -0.4623F, 0.1339F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 3, -0.9812F, -0.7418F, -1.4535F, 1, 2, 7, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-2.0F, 7.7667F, -6.2606F);
        this.Bodyfront.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.9026F, -0.3879F, 0.2902F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 31, -0.7582F, -0.3134F, -0.3241F, 3, 2, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(2.0F, 6.4667F, -5.2606F);
        this.Bodyfront.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.2774F, 0.4623F, -0.1339F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 29, 3, -0.0188F, -0.7418F, -1.4535F, 1, 2, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(2.0F, 7.7667F, -6.2606F);
        this.Bodyfront.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.9026F, 0.3879F, -0.2902F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 31, -2.2418F, -0.3134F, -0.3241F, 3, 2, 1, 0.0F, false));

        this.Basin_r8 = new AdvancedModelRenderer(this);
        this.Basin_r8.setRotationPoint(2.0F, 9.7667F, -2.0606F);
        this.Bodyfront.addChild(Basin_r8);
        this.setRotateAngle(Basin_r8, -0.0785F, 0.0F, 0.0F);
        this.Basin_r8.cubeList.add(new ModelBox(Basin_r8, 14, 54, -3.5F, -0.0216F, 1.133F, 3, 0, 1, 0.0F, false));

        this.Basin_r9 = new AdvancedModelRenderer(this);
        this.Basin_r9.setRotationPoint(2.0F, 9.0667F, -4.7606F);
        this.Bodyfront.addChild(Basin_r9);
        this.setRotateAngle(Basin_r9, -0.1658F, 0.0F, 0.0F);
        this.Basin_r9.cubeList.add(new ModelBox(Basin_r9, 30, 22, -3.5F, -0.7768F, -0.0885F, 3, 1, 3, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(0.0F, 1.0119F, -6.5384F);
        this.Bodyfront.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, 0.0873F, 0.0F, 0.0F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 28, -1.0F, -1.1F, -0.2F, 2, 2, 7, 0.001F, false));

        this.Neckhump_r8 = new AdvancedModelRenderer(this);
        this.Neckhump_r8.setRotationPoint(0.0F, -0.5627F, -0.9093F);
        this.Bodyfront.addChild(Neckhump_r8);
        this.setRotateAngle(Neckhump_r8, 0.2182F, 0.0F, 0.0F);
        this.Neckhump_r8.cubeList.add(new ModelBox(Neckhump_r8, 3, 59, 0.0F, -4.7756F, 0.0496F, 0, 5, 1, 0.0F, false));

        this.Neckhump_r9 = new AdvancedModelRenderer(this);
        this.Neckhump_r9.setRotationPoint(0.0F, -0.0395F, -2.7331F);
        this.Bodyfront.addChild(Neckhump_r9);
        this.setRotateAngle(Neckhump_r9, 0.2269F, 0.0F, 0.0F);
        this.Neckhump_r9.cubeList.add(new ModelBox(Neckhump_r9, 6, 59, 0.0F, -4.7102F, -0.0758F, 0, 5, 1, 0.0F, false));

        this.Neckhump_r10 = new AdvancedModelRenderer(this);
        this.Neckhump_r10.setRotationPoint(0.0F, 0.0119F, -6.2384F);
        this.Bodyfront.addChild(Neckhump_r10);
        this.setRotateAngle(Neckhump_r10, 0.2618F, 0.0F, 0.0F);
        this.Neckhump_r10.cubeList.add(new ModelBox(Neckhump_r10, 60, 31, 0.0F, -3.1F, 1.2F, 0, 4, 1, 0.0F, false));
        this.Neckhump_r10.cubeList.add(new ModelBox(Neckhump_r10, 62, 36, 0.0F, -2.8F, -0.8F, 0, 3, 1, 0.0F, false));

        this.Neck_r25 = new AdvancedModelRenderer(this);
        this.Neck_r25.setRotationPoint(-1.0F, 0.6822F, -1.5081F);
        this.Bodyfront.addChild(Neck_r25);
        this.setRotateAngle(Neck_r25, 0.0992F, -0.0829F, 0.2948F);
        this.Neck_r25.cubeList.add(new ModelBox(Neck_r25, 43, 57, -0.9939F, 1.7032F, -0.5113F, 0, 6, 1, 0.0F, true));

        this.Neck_r26 = new AdvancedModelRenderer(this);
        this.Neck_r26.setRotationPoint(-1.0F, 0.6822F, -1.5081F);
        this.Bodyfront.addChild(Neck_r26);
        this.setRotateAngle(Neck_r26, 0.0444F, -0.1213F, 0.8198F);
        this.Neck_r26.cubeList.add(new ModelBox(Neck_r26, 64, 11, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r27 = new AdvancedModelRenderer(this);
        this.Neck_r27.setRotationPoint(-1.0F, 0.8822F, -3.5081F);
        this.Bodyfront.addChild(Neck_r27);
        this.setRotateAngle(Neck_r27, 0.1077F, -0.1822F, 0.7666F);
        this.Neck_r27.cubeList.add(new ModelBox(Neck_r27, 15, 64, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r28 = new AdvancedModelRenderer(this);
        this.Neck_r28.setRotationPoint(-1.0F, 1.1822F, -5.5081F);
        this.Bodyfront.addChild(Neck_r28);
        this.setRotateAngle(Neck_r28, 0.2525F, -0.1208F, 0.2356F);
        this.Neck_r28.cubeList.add(new ModelBox(Neck_r28, 20, 62, -0.9939F, 1.7032F, -0.5113F, 0, 3, 1, 0.0F, true));

        this.Neck_r29 = new AdvancedModelRenderer(this);
        this.Neck_r29.setRotationPoint(-1.0F, 0.8822F, -3.5081F);
        this.Bodyfront.addChild(Neck_r29);
        this.setRotateAngle(Neck_r29, 0.1842F, -0.1042F, 0.2432F);
        this.Neck_r29.cubeList.add(new ModelBox(Neck_r29, 0, 59, -0.9939F, 1.7032F, -0.5113F, 0, 5, 1, 0.0F, true));

        this.Neck_r30 = new AdvancedModelRenderer(this);
        this.Neck_r30.setRotationPoint(-1.0F, 1.1822F, -5.5081F);
        this.Bodyfront.addChild(Neck_r30);
        this.setRotateAngle(Neck_r30, 0.1594F, -0.2304F, 0.756F);
        this.Neck_r30.cubeList.add(new ModelBox(Neck_r30, 29, 64, -0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, true));

        this.Neck_r31 = new AdvancedModelRenderer(this);
        this.Neck_r31.setRotationPoint(1.0F, 0.6822F, -1.5081F);
        this.Bodyfront.addChild(Neck_r31);
        this.setRotateAngle(Neck_r31, 0.0992F, 0.0829F, -0.2948F);
        this.Neck_r31.cubeList.add(new ModelBox(Neck_r31, 43, 57, 0.9939F, 1.7032F, -0.5113F, 0, 6, 1, 0.0F, false));

        this.Neck_r32 = new AdvancedModelRenderer(this);
        this.Neck_r32.setRotationPoint(1.0F, 0.6822F, -1.5081F);
        this.Bodyfront.addChild(Neck_r32);
        this.setRotateAngle(Neck_r32, 0.0444F, 0.1213F, -0.8198F);
        this.Neck_r32.cubeList.add(new ModelBox(Neck_r32, 64, 11, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r33 = new AdvancedModelRenderer(this);
        this.Neck_r33.setRotationPoint(1.0F, 0.8822F, -3.5081F);
        this.Bodyfront.addChild(Neck_r33);
        this.setRotateAngle(Neck_r33, 0.1077F, 0.1822F, -0.7666F);
        this.Neck_r33.cubeList.add(new ModelBox(Neck_r33, 15, 64, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck_r34 = new AdvancedModelRenderer(this);
        this.Neck_r34.setRotationPoint(1.0F, 0.8822F, -3.5081F);
        this.Bodyfront.addChild(Neck_r34);
        this.setRotateAngle(Neck_r34, 0.1842F, 0.1042F, -0.2432F);
        this.Neck_r34.cubeList.add(new ModelBox(Neck_r34, 0, 59, 0.9939F, 1.7032F, -0.5113F, 0, 5, 1, 0.0F, false));

        this.Neck_r35 = new AdvancedModelRenderer(this);
        this.Neck_r35.setRotationPoint(1.0F, 1.1822F, -5.5081F);
        this.Bodyfront.addChild(Neck_r35);
        this.setRotateAngle(Neck_r35, 0.2525F, 0.1208F, -0.2356F);
        this.Neck_r35.cubeList.add(new ModelBox(Neck_r35, 20, 62, 0.9939F, 1.7032F, -0.5113F, 0, 3, 1, 0.0F, false));

        this.Neck_r36 = new AdvancedModelRenderer(this);
        this.Neck_r36.setRotationPoint(1.0F, 1.1822F, -5.5081F);
        this.Bodyfront.addChild(Neck_r36);
        this.setRotateAngle(Neck_r36, 0.1594F, 0.2304F, -0.756F);
        this.Neck_r36.cubeList.add(new ModelBox(Neck_r36, 29, 64, 0.0051F, -0.0306F, -0.5113F, 0, 2, 1, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 0.7119F, -6.0384F);
        this.Bodyfront.addChild(Neck);
        this.setRotateAngle(Neck, -0.4468F, 0.5092F, -0.1049F);


        this.Neck_r37 = new AdvancedModelRenderer(this);
        this.Neck_r37.setRotationPoint(-1.0F, 1.2437F, -3.4393F);
        this.Neck.addChild(Neck_r37);
        this.setRotateAngle(Neck_r37, 0.3591F, -0.1624F, 0.4068F);
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 62, 20, 0.2F, 0.36F, 1.5579F, 0, 3, 1, 0.0F, true));
        this.Neck_r37.cubeList.add(new ModelBox(Neck_r37, 64, 33, 0.0F, -0.14F, -0.4421F, 0, 2, 1, 0.0F, true));

        this.Neck_r38 = new AdvancedModelRenderer(this);
        this.Neck_r38.setRotationPoint(1.0F, 1.2437F, -3.4393F);
        this.Neck.addChild(Neck_r38);
        this.setRotateAngle(Neck_r38, 0.3591F, 0.1624F, -0.4068F);
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 62, 20, -0.2F, 0.36F, 1.5579F, 0, 3, 1, 0.0F, false));
        this.Neck_r38.cubeList.add(new ModelBox(Neck_r38, 64, 33, 0.0F, -0.14F, -0.4421F, 0, 2, 1, 0.0F, false));

        this.Neck_r39 = new AdvancedModelRenderer(this);
        this.Neck_r39.setRotationPoint(0.0F, 1.2437F, -5.1393F);
        this.Neck.addChild(Neck_r39);
        this.setRotateAngle(Neck_r39, 0.2618F, 0.0F, 0.0F);
        this.Neck_r39.cubeList.add(new ModelBox(Neck_r39, 30, 13, -1.0F, -0.7F, -0.8F, 2, 2, 6, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 1.7437F, -5.2393F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, 0.1547F, 0.591F, 0.1581F);
        this.Head.cubeList.add(new ModelBox(Head, 17, 38, -2.5F, -2.1761F, -2.8269F, 5, 3, 3, 0.0F, false));

        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -2.1761F, -2.6269F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.0424F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 49, 25, -1.5F, 0.0F, -2.0F, 3, 3, 2, 0.0F, false));

        this.Upperjawmiddle = new AdvancedModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 0.93F, -1.6F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, 0.1061F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 50, 16, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 0.82F, -1.0F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.1698F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 57, 49, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.Faceslopefront = new AdvancedModelRenderer(this);
        this.Faceslopefront.setRotationPoint(0.01F, 0.0F, -2.0F);
        this.Upperjawfront.addChild(Faceslopefront);
        this.setRotateAngle(Faceslopefront, 0.7391F, 0.0F, 0.0F);
        this.Faceslopefront.cubeList.add(new ModelBox(Faceslopefront, 57, 53, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Faceslopemiddle = new AdvancedModelRenderer(this);
        this.Faceslopemiddle.setRotationPoint(-0.01F, -0.41F, -1.75F);
        this.Upperjawmiddle.addChild(Faceslopemiddle);
        this.setRotateAngle(Faceslopemiddle, 0.2546F, 0.0F, 0.0F);
        this.Faceslopemiddle.cubeList.add(new ModelBox(Faceslopemiddle, 57, 11, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.Lefteye = new AdvancedModelRenderer(this);
        this.Lefteye.setRotationPoint(-1.45F, 1.1F, -1.9F);
        this.Upperjawback.addChild(Lefteye);
        this.setRotateAngle(Lefteye, -0.0424F, -0.1911F, 0.0F);


        this.Righteye = new AdvancedModelRenderer(this);
        this.Righteye.setRotationPoint(1.45F, 1.1F, -1.9F);
        this.Upperjawback.addChild(Righteye);
        this.setRotateAngle(Righteye, -0.0424F, 0.1911F, 0.0F);


        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 0.8239F, 0.1731F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.6109F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 50, 8, 1.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 26, 13, 1.5F, 0.4F, -3.0F, 1, 1, 3, -0.001F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 50, 8, -2.5F, 0.0F, -3.0F, 1, 1, 3, 0.0F, true));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 26, 13, -2.5F, 0.4F, -3.0F, 1, 1, 3, -0.001F, true));

        this.Lowerjawback_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(-1.2F, 1.9F, 0.0F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, -0.1329F, -0.4273F, 0.005F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 17, 0, 0.0F, -1.0F, -3.0F, 0, 1, 3, -0.001F, true));

        this.Lowerjawback_r2 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r2.setRotationPoint(1.2F, 1.9F, 0.0F);
        this.Lowerjawback.addChild(Lowerjawback_r2);
        this.setRotateAngle(Lowerjawback_r2, -0.1329F, 0.4273F, -0.005F);
        this.Lowerjawback_r2.cubeList.add(new ModelBox(Lowerjawback_r2, 17, 0, 0.0F, -1.0F, -3.0F, 0, 1, 3, -0.001F, false));

        this.Lowerjawmiddleback = new AdvancedModelRenderer(this);
        this.Lowerjawmiddleback.setRotationPoint(0.0F, -0.01F, -2.67F);
        this.Lowerjawback.addChild(Lowerjawmiddleback);
        this.setRotateAngle(Lowerjawmiddleback, 0.0424F, 0.0F, 0.0F);
        this.Lowerjawmiddleback.cubeList.add(new ModelBox(Lowerjawmiddleback, 29, 2, 0.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
        this.Lowerjawmiddleback.cubeList.add(new ModelBox(Lowerjawmiddleback, 29, 2, -1.5F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.Lowerjawmiddlefront = new AdvancedModelRenderer(this);
        this.Lowerjawmiddlefront.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawmiddleback.addChild(Lowerjawmiddlefront);
        this.setRotateAngle(Lowerjawmiddlefront, 0.0848F, 0.0F, 0.0F);
        this.Lowerjawmiddlefront.cubeList.add(new ModelBox(Lowerjawmiddlefront, 38, 0, -1.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Lowerjawmiddlefront.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.1323F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 13, 38, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.Lowerjawslopeback = new AdvancedModelRenderer(this);
        this.Lowerjawslopeback.setRotationPoint(-0.01F, 1.9F, -0.12F);
        this.Lowerjawmiddleback.addChild(Lowerjawslopeback);
        this.setRotateAngle(Lowerjawslopeback, -0.1698F, 0.0F, 0.0F);


        this.Lowerjawslopeback_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawslopeback_r1.setRotationPoint(0.01F, -0.0382F, -3.5248F);
        this.Lowerjawslopeback.addChild(Lowerjawslopeback_r1);
        this.setRotateAngle(Lowerjawslopeback_r1, 0.1396F, 0.0F, 0.0F);
        this.Lowerjawslopeback_r1.cubeList.add(new ModelBox(Lowerjawslopeback_r1, 55, 0, -1.49F, -0.9618F, 1.5248F, 1, 1, 2, 0.0F, true));
        this.Lowerjawslopeback_r1.cubeList.add(new ModelBox(Lowerjawslopeback_r1, 55, 0, 0.49F, -0.9618F, 1.5248F, 1, 1, 2, 0.0F, false));

        this.Lowerjawslopefront = new AdvancedModelRenderer(this);
        this.Lowerjawslopefront.setRotationPoint(0.0F, -0.01F, -1.7F);
        this.Lowerjawslopeback.addChild(Lowerjawslopefront);
        this.setRotateAngle(Lowerjawslopefront, -0.0087F, 0.0F, 0.0F);


        this.Lowerjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawslopefront_r1.setRotationPoint(0.01F, -0.0282F, -1.8248F);
        this.Lowerjawslopefront.addChild(Lowerjawslopefront_r1);
        this.setRotateAngle(Lowerjawslopefront_r1, 0.1396F, 0.0F, 0.0F);
        this.Lowerjawslopefront_r1.cubeList.add(new ModelBox(Lowerjawslopefront_r1, 55, 21, -0.51F, -0.9718F, -0.1752F, 1, 1, 2, 0.0F, false));

        this.Neckhump = new AdvancedModelRenderer(this);
        this.Neckhump.setRotationPoint(0.0F, -3.9563F, 0.5607F);
        this.Neck.addChild(Neckhump);
        this.setRotateAngle(Neckhump, 0.4458F, 0.0F, 0.0F);
        this.Neckhump.cubeList.add(new ModelBox(Neckhump, 62, 46, 0.0F, 0.0F, -7.0F, 0, 3, 1, 0.0F, false));
        this.Neckhump.cubeList.add(new ModelBox(Neckhump, 62, 41, 0.0F, 0.0F, -5.0F, 0, 3, 1, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.0F, 7.2119F, -3.8384F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 0.7936F, 0.0F, -0.0424F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 15, 45, 0.0339F, -0.8935F, -0.9784F, 2, 6, 2, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(1.0339F, 5.1065F, 0.8216F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -0.5295F, 0.0F, 0.0424F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 53, 31, -1.1F, 0.5F, -0.5F, 2, 6, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 52, 43, -1.1F, 0.5F, -2.1F, 2, 6, 1, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 5.7F, -1.2F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, -0.0449F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 0, 38, -2.0F, -0.5F, -3.0F, 4, 2, 4, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 7.2119F, -3.8384F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, -0.0791F, 0.0F, 0.0424F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 15, 15, -2.0339F, -0.8935F, -0.9784F, 2, 6, 2, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-1.0339F, 5.1065F, 0.8216F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.4423F, 0.0F, -0.0424F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 7, 51, -0.9F, 0.5F, -0.5F, 2, 6, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 0, 51, -0.9F, 0.5F, -2.1F, 2, 6, 1, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 5.7F, -1.2F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.4787F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 32, 34, -2.0F, -0.5F, -3.0F, 4, 2, 4, 0.0F, false));

        this.Bellyhump = new AdvancedModelRenderer(this);
        this.Bellyhump.setRotationPoint(0.0F, -1.2011F, -6.0254F);
        this.Belly.addChild(Bellyhump);


        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -0.7345F, 15.0198F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, -0.1724F, -0.172F, 0.0298F);


        this.Neckhump_r11 = new AdvancedModelRenderer(this);
        this.Neckhump_r11.setRotationPoint(0.0F, -0.6746F, 0.5292F);
        this.Tailbase.addChild(Neckhump_r11);
        this.setRotateAngle(Neckhump_r11, -0.1571F, 0.0F, 0.0F);
        this.Neckhump_r11.cubeList.add(new ModelBox(Neckhump_r11, 62, 7, 0.0F, -3.1973F, 8.0071F, 0, 3, 1, 0.0F, false));
        this.Neckhump_r11.cubeList.add(new ModelBox(Neckhump_r11, 9, 59, 0.0F, -3.1973F, 6.0071F, 0, 4, 1, 0.0F, false));
        this.Neckhump_r11.cubeList.add(new ModelBox(Neckhump_r11, 59, 15, 0.0F, -3.1973F, 4.0071F, 0, 4, 1, 0.0F, false));
        this.Neckhump_r11.cubeList.add(new ModelBox(Neckhump_r11, 59, 41, 0.0F, -3.1973F, 2.0071F, 0, 4, 1, 0.0F, false));
        this.Neckhump_r11.cubeList.add(new ModelBox(Neckhump_r11, 46, 57, 0.0F, -3.1973F, 0.0071F, 0, 5, 1, 0.0F, false));

        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.0F, 1.4F, 2.1F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.4363F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 48, 0, 0.0F, 1.988F, 3.867F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 49, 43, 0.0F, 0.988F, 1.867F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 60, 62, 0.0F, 2.588F, 5.867F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 12, 63, 0.0F, -0.012F, -0.133F, 0, 2, 1, 0.0F, false));

        this.Tailbase_r2 = new AdvancedModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.0F, 0.6F, 0.1F);
        this.Tailbase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, -0.0436F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 15, 18, -1.0F, -1.3F, -0.1F, 2, 2, 10, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.1F, 9.3F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0861F, -0.1739F, 0.0149F);


        this.Tailmiddlebase_r1 = new AdvancedModelRenderer(this);
        this.Tailmiddlebase_r1.setRotationPoint(0.0F, 0.4F, 0.1F);
        this.Tailmiddlebase.addChild(Tailmiddlebase_r1);
        this.setRotateAngle(Tailmiddlebase_r1, 0.0698F, 0.0F, 0.0F);
        this.Tailmiddlebase_r1.cubeList.add(new ModelBox(Tailmiddlebase_r1, 17, 0, -1.0F, -0.8F, -0.1F, 2, 2, 7, 0.001F, false));

        this.Neckhump_r12 = new AdvancedModelRenderer(this);
        this.Neckhump_r12.setRotationPoint(0.0F, -0.3746F, 1.3292F);
        this.Tailmiddlebase.addChild(Neckhump_r12);
        this.setRotateAngle(Neckhump_r12, -0.0524F, 0.0F, 0.0F);
        this.Neckhump_r12.cubeList.add(new ModelBox(Neckhump_r12, 52, 61, 0.0F, -2.0124F, -0.0311F, 0, 3, 1, 0.0F, false));
        this.Neckhump_r12.cubeList.add(new ModelBox(Neckhump_r12, 60, 57, 0.0F, -2.0124F, 3.9689F, 0, 3, 1, 0.0F, false));
        this.Neckhump_r12.cubeList.add(new ModelBox(Neckhump_r12, 62, 0, 0.0F, -2.0124F, 1.9689F, 0, 3, 1, 0.0F, false));

        this.Tailbase_r3 = new AdvancedModelRenderer(this);
        this.Tailbase_r3.setRotationPoint(0.0F, 1.2745F, 1.8008F);
        this.Tailmiddlebase.addChild(Tailbase_r3);
        this.setRotateAngle(Tailbase_r3, 0.4712F, 0.0F, 0.0F);
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 45, 34, 0.0F, -0.8156F, -0.2898F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 0, 38, 0.0F, -0.4156F, 1.7102F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r3.cubeList.add(new ModelBox(Tailbase_r3, 32, 31, 0.0F, 0.2844F, 3.7102F, 0, 2, 1, 0.0F, false));

        this.Tailmiddle = new AdvancedModelRenderer(this);
        this.Tailmiddle.setRotationPoint(0.0F, -0.2F, 6.4F);
        this.Tailmiddlebase.addChild(Tailmiddle);
        this.setRotateAngle(Tailmiddle, 0.0659F, -0.2613F, -0.0171F);
        this.Tailmiddle.cubeList.add(new ModelBox(Tailmiddle, 41, 8, -0.5F, -0.5255F, -0.3992F, 1, 1, 6, 0.0F, false));

        this.Neckhump_r13 = new AdvancedModelRenderer(this);
        this.Neckhump_r13.setRotationPoint(0.0F, -0.2F, -5.07F);
        this.Tailmiddle.addChild(Neckhump_r13);
        this.setRotateAngle(Neckhump_r13, -0.0524F, 0.0F, 0.0F);
        this.Neckhump_r13.cubeList.add(new ModelBox(Neckhump_r13, 17, 0, 0.0F, -1.5624F, 7.9689F, 0, 1, 1, 0.0F, false));
        this.Neckhump_r13.cubeList.add(new ModelBox(Neckhump_r13, 23, 63, 0.0F, -1.8124F, 5.9689F, 0, 2, 1, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.0255F, 4.8008F);
        this.Tailmiddle.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.0439F, 0.2616F, 0.0114F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 46, 37, -0.5F, -0.5F, 0.0F, 1, 1, 4, -0.001F, false));

        this.Neckhump_r14 = new AdvancedModelRenderer(this);
        this.Neckhump_r14.setRotationPoint(0.0F, -0.1746F, -9.8708F);
        this.Tailmiddleend.addChild(Neckhump_r14);
        this.setRotateAngle(Neckhump_r14, -0.0524F, 0.0F, 0.0F);
        this.Neckhump_r14.cubeList.add(new ModelBox(Neckhump_r14, 9, 9, 0.0F, -1.2624F, 9.9689F, 0, 1, 1, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.0F, 3.2F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.1148F, 0.3904F, 0.0438F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 48, 0, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tailbasehump = new AdvancedModelRenderer(this);
        this.Tailbasehump.setRotationPoint(0.0F, -0.9F, -0.2F);
        this.Tailbase.addChild(Tailbasehump);
        this.setRotateAngle(Tailbasehump, -0.1061F, 0.0F, 0.0F);


        this.Hiphumpfront = new AdvancedModelRenderer(this);
        this.Hiphumpfront.setRotationPoint(0.0F, -1.7345F, 5.4198F);
        this.Hips.addChild(Hiphumpfront);
        this.setRotateAngle(Hiphumpfront, -0.0637F, 0.0F, 0.0F);


        this.Hiphumpback = new AdvancedModelRenderer(this);
        this.Hiphumpback.setRotationPoint(-0.01F, -5.0F, 6.0F);
        this.Hiphumpfront.addChild(Hiphumpback);
        this.setRotateAngle(Hiphumpback, -0.2122F, 0.0F, 0.0F);


        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.8F, 1.2655F, 10.5198F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.454F, -0.0424F, 0.0F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 0, 15, -1.0F, 0.0F, -0.8F, 2, 7, 2, 0.001F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.0F, 6.9F, -0.4F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 0.3833F, 0.0F, 0.0F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 45, 47, -1.0F, 0.1669F, -0.4429F, 2, 8, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 38, 47, -1.0F, 0.1669F, 1.0571F, 2, 8, 1, 0.0F, false));

        this.Rightheel = new AdvancedModelRenderer(this);
        this.Rightheel.setRotationPoint(0.0F, 7.6669F, 0.0571F);
        this.Rightshin.addChild(Rightheel);
        this.setRotateAngle(Rightheel, 0.4611F, 0.0F, 0.0F);
        this.Rightheel.cubeList.add(new ModelBox(Rightheel, 36, 27, -2.0F, -0.5F, -2.5F, 4, 2, 4, 0.0F, false));

        this.Righttoes = new AdvancedModelRenderer(this);
        this.Righttoes.setRotationPoint(0.01F, 0.49F, -2.25F);
        this.Rightheel.addChild(Righttoes);
        this.setRotateAngle(Righttoes, -0.3054F, 0.0F, 0.0F);
        this.Righttoes.cubeList.add(new ModelBox(Righttoes, 0, 45, -2.0F, -1.0F, -2.8F, 4, 2, 3, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-2.8F, 1.2655F, 10.5198F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, 0.0696F, 0.0424F, 0.0F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 0, -1.0F, 0.0F, -0.8F, 2, 7, 2, 0.001F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(0.0F, 6.9F, -0.4F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.8196F, 0.0F, 0.0F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 31, 47, -1.0F, 0.1669F, -0.4429F, 2, 8, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 24, 45, -1.0F, 0.1669F, 1.0571F, 2, 8, 1, 0.0F, false));

        this.Leftheel = new AdvancedModelRenderer(this);
        this.Leftheel.setRotationPoint(0.0F, 7.6669F, 0.0571F);
        this.Leftshin.addChild(Leftheel);
        this.setRotateAngle(Leftheel, 0.1121F, 0.0F, 0.0F);
        this.Leftheel.cubeList.add(new ModelBox(Leftheel, 19, 31, -2.0F, -0.5F, -2.5F, 4, 2, 4, 0.0F, false));

        this.Lefttoes = new AdvancedModelRenderer(this);
        this.Lefttoes.setRotationPoint(-0.01F, 0.49F, -2.25F);
        this.Leftheel.addChild(Lefttoes);
        this.setRotateAngle(Lefttoes, -0.829F, 0.0F, 0.0F);
        this.Lefttoes.cubeList.add(new ModelBox(Lefttoes, 34, 41, -2.0F, -1.0F, -2.8F, 4, 2, 3, 0.0F, false));

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
