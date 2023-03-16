package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDimetrodon extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Bodymiddle;
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
    private final AdvancedModelRenderer Bodyfront_r20;
    private final AdvancedModelRenderer Bodyfront_r21;
    private final AdvancedModelRenderer Bodyfront_r22;
    private final AdvancedModelRenderer Bodyfront_r23;
    private final AdvancedModelRenderer Bodyfront_r24;
    private final AdvancedModelRenderer Bodyfront_r25;
    private final AdvancedModelRenderer Bodyfront_r26;
    private final AdvancedModelRenderer Bodyfront_r27;
    private final AdvancedModelRenderer Bodyfront_r28;
    private final AdvancedModelRenderer Bodyfront;
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
    private final AdvancedModelRenderer Bodyfront_r43;
    private final AdvancedModelRenderer Bodyfront_r44;
    private final AdvancedModelRenderer Bodyfront_r45;
    private final AdvancedModelRenderer Bodyfront_r46;
    private final AdvancedModelRenderer Neckbase;
    private final AdvancedModelRenderer Neckend;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer Lowerjawback_r1;
    private final AdvancedModelRenderer Lowerjawback_r2;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerfrontteeth;
    private final AdvancedModelRenderer Lowerjawslope;
    private final AdvancedModelRenderer Leftlowerteeth;
    private final AdvancedModelRenderer Rightlowerteeth;
    private final AdvancedModelRenderer Rightlowerteeth_r1;
    private final AdvancedModelRenderer Jawparting;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperjawmiddle;
    private final AdvancedModelRenderer Nosebridge;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperfrontteeth;
    private final AdvancedModelRenderer Leftupperfrontteeth;
    private final AdvancedModelRenderer Rightupperfrontteeth;
    private final AdvancedModelRenderer Leftupperbackteeth;
    private final AdvancedModelRenderer Rightupperteethback;
    private final AdvancedModelRenderer Forehead;
    private final AdvancedModelRenderer Sailfrontend;
    private final AdvancedModelRenderer Sailfrontbase;
    private final AdvancedModelRenderer Leftupperarm;
    private final AdvancedModelRenderer Leftlowerarm;
    private final AdvancedModelRenderer Leftfrontfoot;
    private final AdvancedModelRenderer Rightupperarm;
    private final AdvancedModelRenderer Rightlowerarm;
    private final AdvancedModelRenderer Rightfrontfoot;
    private final AdvancedModelRenderer Sailmiddlefront;
    private final AdvancedModelRenderer Sailmiddlefront_r1;
    private final AdvancedModelRenderer Sailmiddlefront_r2;
    private final AdvancedModelRenderer Sailmiddlefront_r3;
    private final AdvancedModelRenderer Sailmiddle;
    private final AdvancedModelRenderer Sailmiddle_r1;
    private final AdvancedModelRenderer Sailmiddle_r2;
    private final AdvancedModelRenderer Sailmiddle_r3;
    private final AdvancedModelRenderer Sailmiddle_r4;
    private final AdvancedModelRenderer Tailbase;
    private final AdvancedModelRenderer Tailbase_r1;
    private final AdvancedModelRenderer Tailmiddlebase;
    private final AdvancedModelRenderer Tailbase_r2;
    private final AdvancedModelRenderer Tailmiddleend;
    private final AdvancedModelRenderer Tailend;
    private final AdvancedModelRenderer Leftthigh;
    private final AdvancedModelRenderer Leftshin;
    private final AdvancedModelRenderer Lefthindfoot;
    private final AdvancedModelRenderer Rightthigh;
    private final AdvancedModelRenderer Rightshin;
    private final AdvancedModelRenderer Righthindfoot;
    private final AdvancedModelRenderer Sailend;
    private final AdvancedModelRenderer Sailend_r1;

    public ModelSkeletonDimetrodon() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 13.8F, 1.0F);
        this.root.addChild(Hips);
        this.setRotateAngle(Hips, -0.4245F, 0.0F, 0.0F);
        this.Hips.cubeList.add(new ModelBox(Hips, 15, 16, -0.7F, -6.942F, 4.9351F, 2, 2, 8, 0.0F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -5.742F, 9.9351F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, 0.0F, 0.0F, 0.3054F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 22, 38, -1.7F, -1.2F, -3.0F, 1, 2, 7, 0.0F, true));
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 0, 0, -1.7F, 0.8F, -3.0F, 1, 2, 5, 0.0F, true));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-3.0F, -2.942F, 9.9351F);
        this.Hips.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, 0.0F, 0.0F, -0.7418F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 0, 30, 0.5655F, 0.2282F, -4.0F, 1, 3, 8, 0.0F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(3.0F, -2.942F, 9.9351F);
        this.Hips.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.0F, 0.0F, 0.7418F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 0, 30, -0.5655F, -0.5718F, -4.0F, 1, 3, 8, 0.0F, false));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(1.0F, -5.742F, 9.9351F);
        this.Hips.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.0F, 0.0F, -0.3054F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 0, 0.7F, 0.8F, -3.0F, 1, 2, 5, 0.0F, false));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 22, 38, 0.7F, -1.2F, -3.0F, 1, 2, 7, 0.0F, false));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, -6.142F, 5.4351F);
        this.Hips.addChild(Bodymiddle);
        this.setRotateAngle(Bodymiddle, 0.3834F, -0.081F, -0.0326F);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 0, -0.7F, -1.0F, -13.0F, 2, 2, 13, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-0.2F, 0.0F, -0.2F);
        this.Bodymiddle.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.1995F, -0.4874F, -1.1632F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 48, 19, -2.26F, -1.2316F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-0.2F, 0.0F, -0.2F);
        this.Bodymiddle.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.4837F, -0.2089F, -0.3759F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 11, 35, -1.8432F, 0.0471F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-0.2F, -0.4F, -2.2F);
        this.Bodymiddle.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.1268F, -0.3261F, -1.1921F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 51, 56, -2.36F, -1.2316F, -0.5F, 1, 0, 1, 0.0F, true));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(-0.2F, -0.4F, -2.2F);
        this.Bodymiddle.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.3198F, -0.1423F, -0.4046F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 32, 38, -1.8432F, 0.0471F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(-0.2F, -0.4F, -4.2F);
        this.Bodymiddle.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, -0.1591F, -0.0721F, -0.4219F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 56, 34, -2.8432F, 0.0471F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r6 = new AdvancedModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(-0.2F, -0.4F, -4.2F);
        this.Bodymiddle.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, -0.0617F, -0.1634F, -1.208F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 46, 17, -4.06F, -1.9316F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r7 = new AdvancedModelRenderer(this);
        this.Bodyfront_r7.setRotationPoint(-0.2F, -0.4F, -6.2F);
        this.Bodymiddle.addChild(Bodyfront_r7);
        this.setRotateAngle(Bodyfront_r7, 0.0F, 0.0F, -1.213F);
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 63, 0, -5.06F, -1.9316F, -0.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r7.cubeList.add(new ModelBox(Bodyfront_r7, 0, 11, -7.06F, -1.9316F, -2.5F, 5, 0, 1, 0.0F, true));

        this.Bodyfront_r8 = new AdvancedModelRenderer(this);
        this.Bodyfront_r8.setRotationPoint(-0.2F, -0.4F, -6.2F);
        this.Bodymiddle.addChild(Bodyfront_r8);
        this.setRotateAngle(Bodyfront_r8, 0.0F, 0.0F, -0.4276F);
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 61, 27, -2.8432F, 0.0471F, -0.5F, 3, 0, 1, 0.0F, true));
        this.Bodyfront_r8.cubeList.add(new ModelBox(Bodyfront_r8, 63, 11, -2.8432F, 0.0471F, -2.5F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r9 = new AdvancedModelRenderer(this);
        this.Bodyfront_r9.setRotationPoint(1.2F, 0.0F, -0.2F);
        this.Bodymiddle.addChild(Bodyfront_r9);
        this.setRotateAngle(Bodyfront_r9, -0.1995F, 0.4874F, 1.1632F);
        this.Bodyfront_r9.cubeList.add(new ModelBox(Bodyfront_r9, 48, 19, 1.26F, -1.2316F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r10 = new AdvancedModelRenderer(this);
        this.Bodyfront_r10.setRotationPoint(1.2F, 0.0F, -0.2F);
        this.Bodymiddle.addChild(Bodyfront_r10);
        this.setRotateAngle(Bodyfront_r10, -0.4837F, 0.2089F, 0.3759F);
        this.Bodyfront_r10.cubeList.add(new ModelBox(Bodyfront_r10, 11, 35, -0.1568F, 0.0471F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r11 = new AdvancedModelRenderer(this);
        this.Bodyfront_r11.setRotationPoint(1.2F, -0.4F, -2.2F);
        this.Bodymiddle.addChild(Bodyfront_r11);
        this.setRotateAngle(Bodyfront_r11, -0.1268F, 0.3261F, 1.1921F);
        this.Bodyfront_r11.cubeList.add(new ModelBox(Bodyfront_r11, 51, 56, 1.36F, -1.2316F, -0.5F, 1, 0, 1, 0.0F, false));

        this.Bodyfront_r12 = new AdvancedModelRenderer(this);
        this.Bodyfront_r12.setRotationPoint(1.2F, -0.4F, -2.2F);
        this.Bodymiddle.addChild(Bodyfront_r12);
        this.setRotateAngle(Bodyfront_r12, -0.3198F, 0.1423F, 0.4046F);
        this.Bodyfront_r12.cubeList.add(new ModelBox(Bodyfront_r12, 32, 38, -0.1568F, 0.0471F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r13 = new AdvancedModelRenderer(this);
        this.Bodyfront_r13.setRotationPoint(1.2F, -0.4F, -4.2F);
        this.Bodymiddle.addChild(Bodyfront_r13);
        this.setRotateAngle(Bodyfront_r13, -0.0617F, 0.1634F, 1.208F);
        this.Bodyfront_r13.cubeList.add(new ModelBox(Bodyfront_r13, 46, 17, 2.06F, -1.9316F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r14 = new AdvancedModelRenderer(this);
        this.Bodyfront_r14.setRotationPoint(1.2F, -0.4F, -4.2F);
        this.Bodymiddle.addChild(Bodyfront_r14);
        this.setRotateAngle(Bodyfront_r14, -0.1591F, 0.0721F, 0.4219F);
        this.Bodyfront_r14.cubeList.add(new ModelBox(Bodyfront_r14, 56, 34, -0.1568F, 0.0471F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r15 = new AdvancedModelRenderer(this);
        this.Bodyfront_r15.setRotationPoint(1.2F, -0.4F, -6.2F);
        this.Bodymiddle.addChild(Bodyfront_r15);
        this.setRotateAngle(Bodyfront_r15, 0.0F, 0.0F, 1.213F);
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 63, 0, 2.06F, -1.9316F, -0.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r15.cubeList.add(new ModelBox(Bodyfront_r15, 0, 11, 2.06F, -1.9316F, -2.5F, 5, 0, 1, 0.0F, false));

        this.Bodyfront_r16 = new AdvancedModelRenderer(this);
        this.Bodyfront_r16.setRotationPoint(1.2F, -0.4F, -6.2F);
        this.Bodymiddle.addChild(Bodyfront_r16);
        this.setRotateAngle(Bodyfront_r16, 0.0F, 0.0F, 0.4276F);
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 61, 27, -0.1568F, 0.0471F, -0.5F, 3, 0, 1, 0.0F, false));
        this.Bodyfront_r16.cubeList.add(new ModelBox(Bodyfront_r16, 63, 11, -0.1568F, 0.0471F, -2.5F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r17 = new AdvancedModelRenderer(this);
        this.Bodyfront_r17.setRotationPoint(-0.3F, -0.2F, -10.2F);
        this.Bodymiddle.addChild(Bodyfront_r17);
        this.setRotateAngle(Bodyfront_r17, -0.0027F, 0.0027F, -2.3909F);
        this.Bodyfront_r17.cubeList.add(new ModelBox(Bodyfront_r17, 18, 9, -5.5056F, -7.9227F, -0.5F, 4, 0, 1, 0.0F, true));

        this.Bodyfront_r18 = new AdvancedModelRenderer(this);
        this.Bodyfront_r18.setRotationPoint(-0.3F, -0.2F, -10.2F);
        this.Bodymiddle.addChild(Bodyfront_r18);
        this.setRotateAngle(Bodyfront_r18, 0.0034F, 0.0017F, -0.4711F);
        this.Bodyfront_r18.cubeList.add(new ModelBox(Bodyfront_r18, 63, 13, -2.6693F, -0.0934F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r19 = new AdvancedModelRenderer(this);
        this.Bodyfront_r19.setRotationPoint(-0.3F, -0.2F, -10.2F);
        this.Bodymiddle.addChild(Bodyfront_r19);
        this.setRotateAngle(Bodyfront_r19, 0.0013F, 0.0036F, -1.2565F);
        this.Bodyfront_r19.cubeList.add(new ModelBox(Bodyfront_r19, 54, 9, -7.8376F, -1.908F, -0.5F, 6, 0, 1, 0.0F, true));

        this.Bodyfront_r20 = new AdvancedModelRenderer(this);
        this.Bodyfront_r20.setRotationPoint(-0.4F, -0.2F, -12.2F);
        this.Bodymiddle.addChild(Bodyfront_r20);
        this.setRotateAngle(Bodyfront_r20, 0.0042F, 0.0066F, -2.6127F);
        this.Bodyfront_r20.cubeList.add(new ModelBox(Bodyfront_r20, 55, 43, -3.587F, -8.9254F, -0.4842F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r21 = new AdvancedModelRenderer(this);
        this.Bodyfront_r21.setRotationPoint(-0.4F, -0.2F, -12.2F);
        this.Bodymiddle.addChild(Bodyfront_r21);
        this.setRotateAngle(Bodyfront_r21, 0.0074F, -0.0023F, -1.3037F);
        this.Bodyfront_r21.cubeList.add(new ModelBox(Bodyfront_r21, 51, 30, -8.8145F, -1.7921F, -0.4842F, 7, 0, 1, 0.0F, true));

        this.Bodyfront_r22 = new AdvancedModelRenderer(this);
        this.Bodyfront_r22.setRotationPoint(-0.4F, -0.2F, -12.2F);
        this.Bodymiddle.addChild(Bodyfront_r22);
        this.setRotateAngle(Bodyfront_r22, 0.0036F, -0.0069F, -0.5184F);
        this.Bodyfront_r22.cubeList.add(new ModelBox(Bodyfront_r22, 64, 55, -2.5709F, -0.0278F, -0.4842F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r23 = new AdvancedModelRenderer(this);
        this.Bodyfront_r23.setRotationPoint(1.3F, -0.2F, -10.2F);
        this.Bodymiddle.addChild(Bodyfront_r23);
        this.setRotateAngle(Bodyfront_r23, -0.0623F, 0.0611F, 2.3892F);
        this.Bodyfront_r23.cubeList.add(new ModelBox(Bodyfront_r23, 18, 9, 1.5056F, -7.9227F, -0.5F, 4, 0, 1, 0.0F, false));

        this.Bodyfront_r24 = new AdvancedModelRenderer(this);
        this.Bodyfront_r24.setRotationPoint(1.3F, -0.2F, -10.2F);
        this.Bodymiddle.addChild(Bodyfront_r24);
        this.setRotateAngle(Bodyfront_r24, -0.0818F, -0.0305F, 1.2579F);
        this.Bodyfront_r24.cubeList.add(new ModelBox(Bodyfront_r24, 54, 9, 1.8376F, -1.908F, -0.5F, 6, 0, 1, 0.0F, false));

        this.Bodyfront_r25 = new AdvancedModelRenderer(this);
        this.Bodyfront_r25.setRotationPoint(1.3F, -0.2F, -10.2F);
        this.Bodymiddle.addChild(Bodyfront_r25);
        this.setRotateAngle(Bodyfront_r25, -0.0363F, -0.0794F, 0.4727F);
        this.Bodyfront_r25.cubeList.add(new ModelBox(Bodyfront_r25, 63, 13, -0.3307F, -0.0934F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r26 = new AdvancedModelRenderer(this);
        this.Bodyfront_r26.setRotationPoint(1.4F, -0.2F, -12.2F);
        this.Bodymiddle.addChild(Bodyfront_r26);
        this.setRotateAngle(Bodyfront_r26, -0.0845F, 0.144F, 2.6066F);
        this.Bodyfront_r26.cubeList.add(new ModelBox(Bodyfront_r26, 55, 43, 0.587F, -8.9254F, -0.4842F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r27 = new AdvancedModelRenderer(this);
        this.Bodyfront_r27.setRotationPoint(1.4F, -0.2F, -12.2F);
        this.Bodymiddle.addChild(Bodyfront_r27);
        this.setRotateAngle(Bodyfront_r27, -0.161F, -0.0436F, 1.3072F);
        this.Bodyfront_r27.cubeList.add(new ModelBox(Bodyfront_r27, 51, 30, 1.8145F, -1.7921F, -0.4842F, 7, 0, 1, 0.0F, false));

        this.Bodyfront_r28 = new AdvancedModelRenderer(this);
        this.Bodyfront_r28.setRotationPoint(1.4F, -0.2F, -12.2F);
        this.Bodymiddle.addChild(Bodyfront_r28);
        this.setRotateAngle(Bodyfront_r28, -0.0834F, -0.1446F, 0.5244F);
        this.Bodyfront_r28.cubeList.add(new ModelBox(Bodyfront_r28, 64, 55, -0.4291F, -0.0278F, -0.4842F, 3, 0, 1, 0.0F, false));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.2F, 0.0F, -12.0F);
        this.Bodymiddle.addChild(Bodyfront);
        this.setRotateAngle(Bodyfront, 0.1077F, -0.1735F, -0.0187F);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 32, 24, -0.9F, -1.0F, -7.0F, 2, 2, 7, 0.0F, false));

        this.Bodyfront_r29 = new AdvancedModelRenderer(this);
        this.Bodyfront_r29.setRotationPoint(-4.1F, 7.2F, -2.9F);
        this.Bodyfront.addChild(Bodyfront_r29);
        this.setRotateAngle(Bodyfront_r29, 0.0F, 0.0F, -2.6093F);
        this.Bodyfront_r29.cubeList.add(new ModelBox(Bodyfront_r29, 0, 25, -2.8133F, -0.0073F, -0.1F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r30 = new AdvancedModelRenderer(this);
        this.Bodyfront_r30.setRotationPoint(-3.4F, 6.3F, -7.5F);
        this.Bodyfront.addChild(Bodyfront_r30);
        this.setRotateAngle(Bodyfront_r30, -0.0673F, -0.3068F, -1.199F);
        this.Bodyfront_r30.cubeList.add(new ModelBox(Bodyfront_r30, 32, 0, 0.1291F, 0.041F, 2.3878F, 0, 3, 1, -0.001F, true));
        this.Bodyfront_r30.cubeList.add(new ModelBox(Bodyfront_r30, 45, 54, 0.1291F, 0.041F, 0.7878F, 0, 3, 1, -0.001F, true));
        this.Bodyfront_r30.cubeList.add(new ModelBox(Bodyfront_r30, 57, 45, 0.1291F, 0.041F, -2.2122F, 1, 3, 3, -0.001F, true));

        this.Bodyfront_r31 = new AdvancedModelRenderer(this);
        this.Bodyfront_r31.setRotationPoint(-2.1F, 0.5F, -2.9F);
        this.Bodyfront.addChild(Bodyfront_r31);
        this.setRotateAngle(Bodyfront_r31, 0.0F, 0.0F, -1.2566F);
        this.Bodyfront_r31.cubeList.add(new ModelBox(Bodyfront_r31, 51, 32, -7.0034F, 0.061F, -0.1F, 7, 0, 1, 0.0F, true));

        this.Bodyfront_r32 = new AdvancedModelRenderer(this);
        this.Bodyfront_r32.setRotationPoint(-0.3F, -0.5F, -2.5F);
        this.Bodyfront.addChild(Bodyfront_r32);
        this.setRotateAngle(Bodyfront_r32, 0.0F, 0.0F, -0.6021F);
        this.Bodyfront_r32.cubeList.add(new ModelBox(Bodyfront_r32, 54, 11, -2.0905F, -0.1228F, -0.5F, 2, 0, 1, 0.0F, true));
        this.Bodyfront_r32.cubeList.add(new ModelBox(Bodyfront_r32, 51, 54, -2.0905F, -0.1228F, -2.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r33 = new AdvancedModelRenderer(this);
        this.Bodyfront_r33.setRotationPoint(-0.3F, -0.5F, -4.5F);
        this.Bodyfront.addChild(Bodyfront_r33);
        this.setRotateAngle(Bodyfront_r33, 0.0F, 0.0F, -1.3875F);
        this.Bodyfront_r33.cubeList.add(new ModelBox(Bodyfront_r33, 53, 7, -8.3147F, -1.5266F, -0.5F, 7, 0, 1, 0.0F, true));

        this.Bodyfront_r34 = new AdvancedModelRenderer(this);
        this.Bodyfront_r34.setRotationPoint(-0.3F, -0.5F, -6.5F);
        this.Bodyfront.addChild(Bodyfront_r34);
        this.setRotateAngle(Bodyfront_r34, 0.0321F, 0.1716F, -1.3848F);
        this.Bodyfront_r34.cubeList.add(new ModelBox(Bodyfront_r34, 66, 2, -4.3147F, -1.5266F, -0.5F, 3, 0, 1, 0.0F, true));

        this.Bodyfront_r35 = new AdvancedModelRenderer(this);
        this.Bodyfront_r35.setRotationPoint(-0.3F, -0.5F, -6.5F);
        this.Bodyfront.addChild(Bodyfront_r35);
        this.setRotateAngle(Bodyfront_r35, 0.1443F, 0.0985F, -0.595F);
        this.Bodyfront_r35.cubeList.add(new ModelBox(Bodyfront_r35, 48, 0, -2.0905F, -0.1228F, -0.5F, 2, 0, 1, 0.0F, true));

        this.Bodyfront_r36 = new AdvancedModelRenderer(this);
        this.Bodyfront_r36.setRotationPoint(4.0F, 6.3F, -7.5F);
        this.Bodyfront.addChild(Bodyfront_r36);
        this.setRotateAngle(Bodyfront_r36, -0.0673F, 0.3068F, 1.199F);
        this.Bodyfront_r36.cubeList.add(new ModelBox(Bodyfront_r36, 32, 0, -0.1291F, 0.041F, 2.3878F, 0, 3, 1, -0.001F, false));
        this.Bodyfront_r36.cubeList.add(new ModelBox(Bodyfront_r36, 45, 54, -0.1291F, 0.041F, 0.7878F, 0, 3, 1, -0.001F, false));
        this.Bodyfront_r36.cubeList.add(new ModelBox(Bodyfront_r36, 57, 45, -1.1291F, 0.041F, -2.2122F, 1, 3, 3, -0.001F, false));

        this.Bodyfront_r37 = new AdvancedModelRenderer(this);
        this.Bodyfront_r37.setRotationPoint(-1.4F, -0.7F, -4.5F);
        this.Bodyfront.addChild(Bodyfront_r37);
        this.setRotateAngle(Bodyfront_r37, -0.4531F, 0.272F, 0.5042F);
        this.Bodyfront_r37.cubeList.add(new ModelBox(Bodyfront_r37, 22, 54, 0.1F, -0.3F, -2.7F, 1, 6, 3, 0.0F, true));

        this.Bodyfront_r38 = new AdvancedModelRenderer(this);
        this.Bodyfront_r38.setRotationPoint(-3.4F, 4.3F, -7.5F);
        this.Bodyfront.addChild(Bodyfront_r38);
        this.setRotateAngle(Bodyfront_r38, -0.2951F, -0.1084F, -0.1897F);
        this.Bodyfront_r38.cubeList.add(new ModelBox(Bodyfront_r38, 33, 34, -0.2457F, -1.0917F, -2.6019F, 1, 3, 7, 0.0F, true));

        this.Bodyfront_r39 = new AdvancedModelRenderer(this);
        this.Bodyfront_r39.setRotationPoint(4.0F, 4.3F, -7.5F);
        this.Bodyfront.addChild(Bodyfront_r39);
        this.setRotateAngle(Bodyfront_r39, -0.2951F, 0.1084F, 0.1897F);
        this.Bodyfront_r39.cubeList.add(new ModelBox(Bodyfront_r39, 33, 34, -0.7543F, -1.0917F, -2.6019F, 1, 3, 7, 0.0F, false));

        this.Bodyfront_r40 = new AdvancedModelRenderer(this);
        this.Bodyfront_r40.setRotationPoint(2.0F, -0.7F, -4.5F);
        this.Bodyfront.addChild(Bodyfront_r40);
        this.setRotateAngle(Bodyfront_r40, -0.4531F, -0.272F, -0.5042F);
        this.Bodyfront_r40.cubeList.add(new ModelBox(Bodyfront_r40, 22, 54, -1.1F, -0.3F, -2.7F, 1, 6, 3, 0.0F, false));

        this.Bodyfront_r41 = new AdvancedModelRenderer(this);
        this.Bodyfront_r41.setRotationPoint(0.9F, -0.5F, -2.5F);
        this.Bodyfront.addChild(Bodyfront_r41);
        this.setRotateAngle(Bodyfront_r41, 0.0F, 0.0F, 0.6021F);
        this.Bodyfront_r41.cubeList.add(new ModelBox(Bodyfront_r41, 54, 11, 0.0905F, -0.1228F, -0.5F, 2, 0, 1, 0.0F, false));
        this.Bodyfront_r41.cubeList.add(new ModelBox(Bodyfront_r41, 51, 54, 0.0905F, -0.1228F, -2.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r42 = new AdvancedModelRenderer(this);
        this.Bodyfront_r42.setRotationPoint(4.7F, 7.2F, -2.9F);
        this.Bodyfront.addChild(Bodyfront_r42);
        this.setRotateAngle(Bodyfront_r42, 0.0F, 0.0F, 2.6093F);
        this.Bodyfront_r42.cubeList.add(new ModelBox(Bodyfront_r42, 0, 25, -0.1867F, -0.0073F, -0.1F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r43 = new AdvancedModelRenderer(this);
        this.Bodyfront_r43.setRotationPoint(2.7F, 0.5F, -2.9F);
        this.Bodyfront.addChild(Bodyfront_r43);
        this.setRotateAngle(Bodyfront_r43, 0.0F, 0.0F, 1.2566F);
        this.Bodyfront_r43.cubeList.add(new ModelBox(Bodyfront_r43, 51, 32, 0.0034F, 0.061F, -0.1F, 7, 0, 1, 0.0F, false));

        this.Bodyfront_r44 = new AdvancedModelRenderer(this);
        this.Bodyfront_r44.setRotationPoint(0.9F, -0.5F, -6.5F);
        this.Bodyfront.addChild(Bodyfront_r44);
        this.setRotateAngle(Bodyfront_r44, 0.1443F, -0.0985F, 0.595F);
        this.Bodyfront_r44.cubeList.add(new ModelBox(Bodyfront_r44, 48, 0, 0.0905F, -0.1228F, -0.5F, 2, 0, 1, 0.0F, false));

        this.Bodyfront_r45 = new AdvancedModelRenderer(this);
        this.Bodyfront_r45.setRotationPoint(0.9F, -0.5F, -6.5F);
        this.Bodyfront.addChild(Bodyfront_r45);
        this.setRotateAngle(Bodyfront_r45, 0.0321F, -0.1716F, 1.3848F);
        this.Bodyfront_r45.cubeList.add(new ModelBox(Bodyfront_r45, 66, 2, 1.3147F, -1.5266F, -0.5F, 3, 0, 1, 0.0F, false));

        this.Bodyfront_r46 = new AdvancedModelRenderer(this);
        this.Bodyfront_r46.setRotationPoint(0.9F, -0.5F, -4.5F);
        this.Bodyfront.addChild(Bodyfront_r46);
        this.setRotateAngle(Bodyfront_r46, 0.0F, 0.0F, 1.3875F);
        this.Bodyfront_r46.cubeList.add(new ModelBox(Bodyfront_r46, 53, 7, 1.3147F, -1.5266F, -0.5F, 7, 0, 1, 0.0F, false));

        this.Neckbase = new AdvancedModelRenderer(this);
        this.Neckbase.setRotationPoint(0.0F, -1.0F, -6.5F);
        this.Bodyfront.addChild(Neckbase);
        this.setRotateAngle(Neckbase, -0.2665F, -0.1399F, -0.038F);
        this.Neckbase.cubeList.add(new ModelBox(Neckbase, 45, 40, -1.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));

        this.Neckend = new AdvancedModelRenderer(this);
        this.Neckend.setRotationPoint(0.0F, 1.0F, -4.5F);
        this.Neckbase.addChild(Neckend);
        this.setRotateAngle(Neckend, 0.0241F, -0.3483F, -0.0232F);
        this.Neckend.cubeList.add(new ModelBox(Neckend, 49, 17, -1.0F, -1.0F, -4.0F, 2, 2, 4, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(-0.01F, 0.1F, -2.2F);
        this.Neckend.addChild(Head);
        this.setRotateAngle(Head, 0.4211F, 0.1449F, 0.0976F);
        this.Head.cubeList.add(new ModelBox(Head, 32, 0, -2.5F, -1.5F, -4.5F, 5, 4, 5, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.01F, 0.1F, -2.1F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0087F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 8, -2.5F, -0.507F, -1.6551F, 5, 1, 1, 0.04F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 30, -2.5F, -1.007F, -2.1551F, 5, 2, 2, 0.03F, false));

        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.5672F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 53, 61, 1.5F, 0.0F, -3.0F, 1, 3, 3, 0.0F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 53, 61, -2.5208F, -0.0292F, -3.011F, 1, 3, 3, 0.0F, true));

        this.Lowerjawback_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(1.01F, 2.3F, 0.1F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, 0.0F, 0.4363F, 0.0F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 53, 61, 0.1308F, 0.0708F, -3.111F, 0, 1, 3, 0.0F, false));

        this.Lowerjawback_r2 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r2.setRotationPoint(-1.39F, 2.3F, 0.1F);
        this.Lowerjawback.addChild(Lowerjawback_r2);
        this.setRotateAngle(Lowerjawback_r2, 0.0F, -0.4363F, 0.0F);
        this.Lowerjawback_r2.cubeList.add(new ModelBox(Lowerjawback_r2, 53, 61, -0.1308F, 0.0708F, -3.111F, 0, 1, 3, 0.0F, true));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 0.65F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, 0.1911F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 56, 36, 0.5F, 0.0F, -4.0F, 1, 2, 4, 0.0F, false));
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 56, 36, -1.5208F, -0.0308F, -4.0053F, 1, 2, 4, 0.0F, true));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, -0.2335F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 63, 43, -1.0F, -2.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Lowerfrontteeth = new AdvancedModelRenderer(this);
        this.Lowerfrontteeth.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Lowerjawfront.addChild(Lowerfrontteeth);
        this.setRotateAngle(Lowerfrontteeth, 0.7006F, 0.0F, 0.0F);
        this.Lowerfrontteeth.cubeList.add(new ModelBox(Lowerfrontteeth, 37, 65, -0.5F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        this.Lowerjawslope = new AdvancedModelRenderer(this);
        this.Lowerjawslope.setRotationPoint(-0.01F, -0.1F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawslope);
        this.setRotateAngle(Lowerjawslope, 0.3768F, 0.0F, 0.0F);


        this.Leftlowerteeth = new AdvancedModelRenderer(this);
        this.Leftlowerteeth.setRotationPoint(-1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Leftlowerteeth);
        this.setRotateAngle(Leftlowerteeth, -0.0637F, -0.1698F, 0.0F);


        this.Rightlowerteeth = new AdvancedModelRenderer(this);
        this.Rightlowerteeth.setRotationPoint(1.5F, 0.6F, 0.0F);
        this.Lowerjawslope.addChild(Rightlowerteeth);
        this.setRotateAngle(Rightlowerteeth, -0.0637F, 0.1698F, 0.0F);
        this.Rightlowerteeth.cubeList.add(new ModelBox(Rightlowerteeth, 45, 54, 0.0F, -1.9F, -5.0F, 0, 2, 5, 0.0F, false));

        this.Rightlowerteeth_r1 = new AdvancedModelRenderer(this);
        this.Rightlowerteeth_r1.setRotationPoint(-2.2281F, -0.112F, -0.9747F);
        this.Rightlowerteeth.addChild(Rightlowerteeth_r1);
        this.setRotateAngle(Rightlowerteeth_r1, 0.0F, -0.3054F, 0.0F);
        this.Rightlowerteeth_r1.cubeList.add(new ModelBox(Rightlowerteeth_r1, 45, 54, -0.349F, -1.7061F, -4.3707F, 0, 2, 5, 0.0F, true));

        this.Jawparting = new AdvancedModelRenderer(this);
        this.Jawparting.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.Lowerjawback.addChild(Jawparting);
        this.setRotateAngle(Jawparting, -0.3183F, 0.0F, 0.0F);


        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, 0.65F, -4.0F);
        this.Head.addChild(Upperjawback);
        this.setRotateAngle(Upperjawback, 0.4245F, 0.0F, 0.0F);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 41, 10, -2.0F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

        this.Upperjawmiddle = new AdvancedModelRenderer(this);
        this.Upperjawmiddle.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Upperjawback.addChild(Upperjawmiddle);
        this.setRotateAngle(Upperjawmiddle, -0.5943F, 0.0F, 0.0F);
        this.Upperjawmiddle.cubeList.add(new ModelBox(Upperjawmiddle, 60, 22, -1.5F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));

        this.Nosebridge = new AdvancedModelRenderer(this);
        this.Nosebridge.setRotationPoint(0.0F, -4.4F, -1.25F);
        this.Upperjawmiddle.addChild(Nosebridge);
        this.setRotateAngle(Nosebridge, 0.9976F, 0.0F, 0.0F);
        this.Nosebridge.cubeList.add(new ModelBox(Nosebridge, 56, 54, -1.0F, 0.0F, -3.0F, 2, 3, 3, 0.0F, false));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(-0.01F, -2.0F, -2.8F);
        this.Upperjawmiddle.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, 0.9128F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 63, 34, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, false));

        this.Upperfrontteeth = new AdvancedModelRenderer(this);
        this.Upperfrontteeth.setRotationPoint(0.0F, 1.0F, -1.5F);
        this.Upperjawfront.addChild(Upperfrontteeth);
        this.setRotateAngle(Upperfrontteeth, -0.2972F, 0.0F, 0.0F);
        this.Upperfrontteeth.cubeList.add(new ModelBox(Upperfrontteeth, 48, 2, -1.0F, 0.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.Leftupperfrontteeth = new AdvancedModelRenderer(this);
        this.Leftupperfrontteeth.setRotationPoint(-1.3F, -0.5F, -2.0F);
        this.Upperjawmiddle.addChild(Leftupperfrontteeth);
        this.setRotateAngle(Leftupperfrontteeth, 0.2759F, -0.0637F, 0.0F);


        this.Rightupperfrontteeth = new AdvancedModelRenderer(this);
        this.Rightupperfrontteeth.setRotationPoint(1.3F, -0.5F, -2.0F);
        this.Upperjawmiddle.addChild(Rightupperfrontteeth);
        this.setRotateAngle(Rightupperfrontteeth, 0.2759F, 0.0637F, 0.0F);
        this.Rightupperfrontteeth.cubeList.add(new ModelBox(Rightupperfrontteeth, 0, 0, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));
        this.Rightupperfrontteeth.cubeList.add(new ModelBox(Rightupperfrontteeth, 0, 0, -2.7287F, -0.07F, 0.1482F, 0, 2, 2, 0.0F, true));

        this.Leftupperbackteeth = new AdvancedModelRenderer(this);
        this.Leftupperbackteeth.setRotationPoint(-1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Leftupperbackteeth);
        this.setRotateAngle(Leftupperbackteeth, -0.1061F, -0.0213F, 0.0F);


        this.Rightupperteethback = new AdvancedModelRenderer(this);
        this.Rightupperteethback.setRotationPoint(1.8F, 1.7F, 1.17F);
        this.Upperjawback.addChild(Rightupperteethback);
        this.setRotateAngle(Rightupperteethback, -0.1061F, 0.0213F, 0.0F);
        this.Rightupperteethback.cubeList.add(new ModelBox(Rightupperteethback, 58, 11, 0.0F, 0.0F, -5.0F, 0, 2, 4, 0.0F, false));
        this.Rightupperteethback.cubeList.add(new ModelBox(Rightupperteethback, 58, 11, -3.7246F, -0.0454F, -4.8493F, 0, 2, 4, 0.0F, true));

        this.Forehead = new AdvancedModelRenderer(this);
        this.Forehead.setRotationPoint(0.01F, -1.35F, -4.5F);
        this.Head.addChild(Forehead);
        this.setRotateAngle(Forehead, 0.3183F, 0.0F, 0.0F);
        this.Forehead.cubeList.add(new ModelBox(Forehead, 53, 0, -1.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, false));

        this.Sailfrontend = new AdvancedModelRenderer(this);
        this.Sailfrontend.setRotationPoint(0.0F, -2.3F, -1.3F);
        this.Neckend.addChild(Sailfrontend);
        this.setRotateAngle(Sailfrontend, 0.3609F, 0.0F, 0.0F);
        this.Sailfrontend.cubeList.add(new ModelBox(Sailfrontend, 21, 64, -0.5F, 0.0F, -0.4F, 1, 3, 2, 0.0F, false));

        this.Sailfrontbase = new AdvancedModelRenderer(this);
        this.Sailfrontbase.setRotationPoint(0.0F, 0.5F, -2.0F);
        this.Neckbase.addChild(Sailfrontbase);
        this.setRotateAngle(Sailfrontbase, 0.0848F, 0.0F, 0.0F);
        this.Sailfrontbase.cubeList.add(new ModelBox(Sailfrontbase, 34, 65, 0.0F, -6.0F, -2.5F, 0, 6, 1, 0.0F, false));
        this.Sailfrontbase.cubeList.add(new ModelBox(Sailfrontbase, 36, 53, 0.0F, -11.0F, -0.5F, 0, 11, 1, 0.0F, false));

        this.Leftupperarm = new AdvancedModelRenderer(this);
        this.Leftupperarm.setRotationPoint(-3.0F, 5.7F, -8.0F);
        this.Bodyfront.addChild(Leftupperarm);
        this.setRotateAngle(Leftupperarm, 0.5943F, -0.1061F, 0.2122F);
        this.Leftupperarm.cubeList.add(new ModelBox(Leftupperarm, 18, 0, -1.5F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.Leftlowerarm = new AdvancedModelRenderer(this);
        this.Leftlowerarm.setRotationPoint(-0.5F, 3.9F, 0.9F);
        this.Leftupperarm.addChild(Leftlowerarm);
        this.setRotateAngle(Leftlowerarm, -0.7217F, -0.0637F, -0.2122F);
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 5, 64, -1.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F, false));
        this.Leftlowerarm.cubeList.add(new ModelBox(Leftlowerarm, 22, 38, -1.0F, 0.0F, -2.0F, 2, 5, 1, 0.0F, false));

        this.Leftfrontfoot = new AdvancedModelRenderer(this);
        this.Leftfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Leftlowerarm.addChild(Leftfrontfoot);
        this.setRotateAngle(Leftfrontfoot, 0.0637F, 0.0F, 0.0F);
        this.Leftfrontfoot.cubeList.add(new ModelBox(Leftfrontfoot, 44, 24, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Rightupperarm = new AdvancedModelRenderer(this);
        this.Rightupperarm.setRotationPoint(3.7F, 5.7F, -7.3F);
        this.Bodyfront.addChild(Rightupperarm);
        this.setRotateAngle(Rightupperarm, 1.2748F, 0.3573F, -0.2882F);
        this.Rightupperarm.cubeList.add(new ModelBox(Rightupperarm, 0, 16, -0.3F, -0.5F, -1.5F, 2, 5, 3, 0.0F, false));

        this.Rightlowerarm = new AdvancedModelRenderer(this);
        this.Rightlowerarm.setRotationPoint(0.5F, 3.9F, 0.9F);
        this.Rightupperarm.addChild(Rightlowerarm);
        this.setRotateAngle(Rightlowerarm, -1.5507F, 0.0637F, 0.2122F);
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 14, 63, -1.0F, 0.0F, -0.5F, 2, 5, 1, 0.0F, false));
        this.Rightlowerarm.cubeList.add(new ModelBox(Rightlowerarm, 62, 61, -1.0F, 0.0F, -2.0F, 2, 5, 1, 0.0F, false));

        this.Rightfrontfoot = new AdvancedModelRenderer(this);
        this.Rightfrontfoot.setRotationPoint(0.0F, 4.4F, -0.5F);
        this.Rightlowerarm.addChild(Rightfrontfoot);
        this.setRotateAngle(Rightfrontfoot, 1.0236F, 0.0F, 0.0F);
        this.Rightfrontfoot.cubeList.add(new ModelBox(Rightfrontfoot, 43, 34, -2.0F, 0.0F, -3.5F, 4, 1, 4, 0.0F, false));

        this.Sailmiddlefront = new AdvancedModelRenderer(this);
        this.Sailmiddlefront.setRotationPoint(-0.01F, -1.0F, -7.6F);
        this.Bodyfront.addChild(Sailmiddlefront);
        this.setRotateAngle(Sailmiddlefront, -0.0637F, 0.0F, 0.0F);


        this.Sailmiddlefront_r1 = new AdvancedModelRenderer(this);
        this.Sailmiddlefront_r1.setRotationPoint(0.01F, -0.2F, 5.1F);
        this.Sailmiddlefront.addChild(Sailmiddlefront_r1);
        this.setRotateAngle(Sailmiddlefront_r1, -0.1745F, 0.0F, 0.0F);
        this.Sailmiddlefront_r1.cubeList.add(new ModelBox(Sailmiddlefront_r1, 19, 38, -0.01F, -22.5389F, -0.0829F, 0, 23, 1, 0.0F, false));

        this.Sailmiddlefront_r2 = new AdvancedModelRenderer(this);
        this.Sailmiddlefront_r2.setRotationPoint(0.01F, -0.2F, 3.1F);
        this.Sailmiddlefront.addChild(Sailmiddlefront_r2);
        this.setRotateAngle(Sailmiddlefront_r2, -0.1309F, 0.0F, 0.0F);
        this.Sailmiddlefront_r2.cubeList.add(new ModelBox(Sailmiddlefront_r2, 0, 42, -0.01F, -21.8F, -0.1F, 0, 22, 1, 0.0F, false));

        this.Sailmiddlefront_r3 = new AdvancedModelRenderer(this);
        this.Sailmiddlefront_r3.setRotationPoint(0.01F, -0.2F, 1.1F);
        this.Sailmiddlefront.addChild(Sailmiddlefront_r3);
        this.setRotateAngle(Sailmiddlefront_r3, -0.0873F, 0.0F, 0.0F);
        this.Sailmiddlefront_r3.cubeList.add(new ModelBox(Sailmiddlefront_r3, 12, 42, -0.01F, -19.8F, -0.1F, 0, 20, 1, 0.0F, false));

        this.Sailmiddle = new AdvancedModelRenderer(this);
        this.Sailmiddle.setRotationPoint(0.0F, -1.0F, -12.0F);
        this.Bodymiddle.addChild(Sailmiddle);


        this.Sailmiddle_r1 = new AdvancedModelRenderer(this);
        this.Sailmiddle_r1.setRotationPoint(0.0F, 0.4F, 10.0F);
        this.Sailmiddle.addChild(Sailmiddle_r1);
        this.setRotateAngle(Sailmiddle_r1, -0.2618F, 0.0F, 0.0F);
        this.Sailmiddle_r1.cubeList.add(new ModelBox(Sailmiddle_r1, 42, 45, 0.0F, -15.0947F, 0.0856F, 0, 16, 1, 0.0F, false));

        this.Sailmiddle_r2 = new AdvancedModelRenderer(this);
        this.Sailmiddle_r2.setRotationPoint(0.0F, 0.4F, 8.0F);
        this.Sailmiddle.addChild(Sailmiddle_r2);
        this.setRotateAngle(Sailmiddle_r2, -0.2182F, 0.0F, 0.0F);
        this.Sailmiddle_r2.cubeList.add(new ModelBox(Sailmiddle_r2, 39, 45, 0.0F, -17.3558F, 0.0684F, 0, 18, 1, 0.0F, false));

        this.Sailmiddle_r3 = new AdvancedModelRenderer(this);
        this.Sailmiddle_r3.setRotationPoint(0.0F, 0.4F, 6.0F);
        this.Sailmiddle.addChild(Sailmiddle_r3);
        this.setRotateAngle(Sailmiddle_r3, -0.1745F, 0.0F, 0.0F);
        this.Sailmiddle_r3.cubeList.add(new ModelBox(Sailmiddle_r3, 15, 42, 0.0F, -18.6168F, 0.0513F, 0, 19, 1, 0.0F, false));

        this.Sailmiddle_r4 = new AdvancedModelRenderer(this);
        this.Sailmiddle_r4.setRotationPoint(0.0F, 0.4F, 0.0F);
        this.Sailmiddle.addChild(Sailmiddle_r4);
        this.setRotateAngle(Sailmiddle_r4, -0.1309F, 0.0F, 0.0F);
        this.Sailmiddle_r4.cubeList.add(new ModelBox(Sailmiddle_r4, 6, 42, 0.0F, -20.4F, 4.0F, 0, 20, 1, 0.0F, false));
        this.Sailmiddle_r4.cubeList.add(new ModelBox(Sailmiddle_r4, 9, 42, 0.0F, -20.4F, 2.0F, 0, 20, 1, 0.0F, false));
        this.Sailmiddle_r4.cubeList.add(new ModelBox(Sailmiddle_r4, 3, 42, 0.0F, -21.4F, 0.0F, 0, 21, 1, 0.0F, false));

        this.Tailbase = new AdvancedModelRenderer(this);
        this.Tailbase.setRotationPoint(0.0F, -5.842F, 12.4351F);
        this.Hips.addChild(Tailbase);
        this.setRotateAngle(Tailbase, 0.0216F, -0.1745F, -0.0038F);
        this.Tailbase.cubeList.add(new ModelBox(Tailbase, 19, 27, -0.6F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Tailbase_r1 = new AdvancedModelRenderer(this);
        this.Tailbase_r1.setRotationPoint(0.5F, 1.1F, 2.2F);
        this.Tailbase.addChild(Tailbase_r1);
        this.setRotateAngle(Tailbase_r1, 0.4363F, 0.0F, 0.0F);
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 22, 48, -0.1F, 0.5F, 1.8F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 33, 48, -0.1F, 1.0F, 3.8F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r1.cubeList.add(new ModelBox(Tailbase_r1, 8, 0, -0.1F, -0.6F, -0.2F, 0, 3, 1, 0.0F, false));

        this.Tailmiddlebase = new AdvancedModelRenderer(this);
        this.Tailmiddlebase.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tailbase.addChild(Tailmiddlebase);
        this.setRotateAngle(Tailmiddlebase, -0.0659F, -0.2613F, 0.0171F);
        this.Tailmiddlebase.cubeList.add(new ModelBox(Tailmiddlebase, 28, 13, -0.5F, -1.0F, 0.0F, 2, 2, 8, 0.0F, false));

        this.Tailbase_r2 = new AdvancedModelRenderer(this);
        this.Tailbase_r2.setRotationPoint(0.5F, 1.1F, -4.8F);
        this.Tailmiddlebase.addChild(Tailbase_r2);
        this.setRotateAngle(Tailbase_r2, 0.4363F, 0.0F, 0.0F);
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 43, 34, -0.1F, 2.4F, 7.8F, 0, 2, 1, 0.0F, false));
        this.Tailbase_r2.cubeList.add(new ModelBox(Tailbase_r2, 44, 24, -0.1F, 1.6F, 5.8F, 0, 2, 1, 0.0F, false));

        this.Tailmiddleend = new AdvancedModelRenderer(this);
        this.Tailmiddleend.setRotationPoint(0.0F, -0.4F, 7.5F);
        this.Tailmiddlebase.addChild(Tailmiddleend);
        this.setRotateAngle(Tailmiddleend, 0.214F, -0.1279F, -0.0277F);
        this.Tailmiddleend.cubeList.add(new ModelBox(Tailmiddleend, 18, 0, 0.0F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));

        this.Tailend = new AdvancedModelRenderer(this);
        this.Tailend.setRotationPoint(0.0F, 0.3F, 10.5F);
        this.Tailmiddleend.addChild(Tailend);
        this.setRotateAngle(Tailend, 0.2031F, -0.3424F, -0.069F);
        this.Tailend.cubeList.add(new ModelBox(Tailend, 0, 16, 0.0F, -0.5F, 0.0F, 1, 1, 12, 0.0F, false));

        this.Leftthigh = new AdvancedModelRenderer(this);
        this.Leftthigh.setRotationPoint(-1.5F, -3.442F, 10.4351F);
        this.Hips.addChild(Leftthigh);
        this.setRotateAngle(Leftthigh, -0.5117F, 0.1485F, 0.2546F);
        this.Leftthigh.cubeList.add(new ModelBox(Leftthigh, 0, 30, -2.0F, -0.5F, -1.5F, 1, 5, 2, 0.0F, false));

        this.Leftshin = new AdvancedModelRenderer(this);
        this.Leftshin.setRotationPoint(-0.7F, 4.9F, -0.7F);
        this.Leftthigh.addChild(Leftshin);
        this.setRotateAngle(Leftshin, 0.868F, 0.1274F, -0.0848F);
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 28, 67, -1.0F, 1.0F, -0.5F, 1, 4, 1, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 64, 50, -1.0F, 5.0F, -0.5F, 1, 2, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 32, 27, -1.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F, false));
        this.Leftshin.cubeList.add(new ModelBox(Leftshin, 44, 62, -1.0F, 0.0F, 1.2F, 1, 7, 1, 0.0F, false));

        this.Lefthindfoot = new AdvancedModelRenderer(this);
        this.Lefthindfoot.setRotationPoint(0.0F, 5.7F, 1.5F);
        this.Leftshin.addChild(Lefthindfoot);
        this.setRotateAngle(Lefthindfoot, 0.1108F, 0.0F, 0.0213F);
        this.Lefthindfoot.cubeList.add(new ModelBox(Lefthindfoot, 45, 48, -2.0F, 0.3F, -4.0F, 3, 1, 4, 0.0F, false));

        this.Rightthigh = new AdvancedModelRenderer(this);
        this.Rightthigh.setRotationPoint(2.7F, -4.042F, 11.4351F);
        this.Hips.addChild(Rightthigh);
        this.setRotateAngle(Rightthigh, -0.0754F, -0.1485F, -0.2546F);
        this.Rightthigh.cubeList.add(new ModelBox(Rightthigh, 15, 16, 0.4F, -0.5F, -1.9F, 1, 5, 2, 0.0F, false));

        this.Rightshin = new AdvancedModelRenderer(this);
        this.Rightshin.setRotationPoint(0.7F, 4.9F, -0.7F);
        this.Rightthigh.addChild(Rightshin);
        this.setRotateAngle(Rightshin, 1.3043F, -0.1274F, 0.0848F);
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 0, 66, -0.5F, 0.0F, -0.1F, 1, 4, 1, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 41, 17, -0.5F, -1.0F, -0.1F, 1, 1, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 65, 16, -0.5F, 4.0F, -0.5F, 1, 2, 2, 0.0F, false));
        this.Rightshin.cubeList.add(new ModelBox(Rightshin, 31, 13, -0.5F, 0.0F, 1.5F, 1, 6, 1, 0.0F, false));

        this.Righthindfoot = new AdvancedModelRenderer(this);
        this.Righthindfoot.setRotationPoint(0.0F, 5.7F, 1.5F);
        this.Rightshin.addChild(Righthindfoot);
        this.setRotateAngle(Righthindfoot, -0.4128F, 0.0F, -0.0213F);
        this.Righthindfoot.cubeList.add(new ModelBox(Righthindfoot, 22, 48, -1.5F, 0.0F, -4.1F, 3, 1, 4, 0.0F, false));

        this.Sailend = new AdvancedModelRenderer(this);
        this.Sailend.setRotationPoint(0.01F, -6.942F, 4.4351F);
        this.Hips.addChild(Sailend);
        this.setRotateAngle(Sailend, 0.3821F, 0.0F, 0.0F);


        this.Sailend_r1 = new AdvancedModelRenderer(this);
        this.Sailend_r1.setRotationPoint(-0.01F, 0.2F, 0.5F);
        this.Sailend.addChild(Sailend_r1);
        this.setRotateAngle(Sailend_r1, -0.3491F, 0.0F, 0.0F);
        this.Sailend_r1.cubeList.add(new ModelBox(Sailend_r1, 28, 16, 0.01F, -1.2F, 6.5F, 0, 3, 1, 0.0F, false));
        this.Sailend_r1.cubeList.add(new ModelBox(Sailend_r1, 52, 68, 0.01F, -2.2F, 4.5F, 0, 4, 1, 0.0F, false));
        this.Sailend_r1.cubeList.add(new ModelBox(Sailend_r1, 49, 62, 0.01F, -4.2F, 2.5F, 0, 6, 1, 0.0F, false));
        this.Sailend_r1.cubeList.add(new ModelBox(Sailend_r1, 31, 54, 0.01F, -9.2F, 0.5F, 0, 11, 1, 0.0F, false));

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
