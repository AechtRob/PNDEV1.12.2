package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonOphiacodon extends AdvancedModelBase {
    private final AdvancedModelRenderer ophiacodon;
    private final AdvancedModelRenderer back_body;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Hips_r2;
    private final AdvancedModelRenderer Hips_r3;
    private final AdvancedModelRenderer Hips_r4;
    private final AdvancedModelRenderer Hips_r5;
    private final AdvancedModelRenderer Hips_r6;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer left_thigh;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer left_shin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer left_foot;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer right_thigh;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer right_shin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer right_foot;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer middle_body;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer front_body;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer Bodyfront_r1;
    private final AdvancedModelRenderer Bodyfront_r2;
    private final AdvancedModelRenderer Bodyfront_r3;
    private final AdvancedModelRenderer Bodyfront_r4;
    private final AdvancedModelRenderer Bodyfront_r5;
    private final AdvancedModelRenderer Bodyfront_r6;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer lower_jaw;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer left_upper_arm;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer left_lower_arm;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer left_paw;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer right_upper_arm;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer right_lower_arm;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer right_paw;
    private final AdvancedModelRenderer cube_r85;

    public ModelSkeletonOphiacodon() {
        this.textureWidth = 95;
        this.textureHeight = 95;

        this.ophiacodon = new AdvancedModelRenderer(this);
        this.ophiacodon.setRotationPoint(0.0F, 13.0F, -1.0F);
        this.setRotateAngle(ophiacodon, -0.0873F, 0.0F, 0.0F);


        this.back_body = new AdvancedModelRenderer(this);
        this.back_body.setRotationPoint(0.0F, -5.3372F, 11.7233F);
        this.ophiacodon.addChild(back_body);


        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(-2.5F, 0.7372F, 0.4767F);
        this.back_body.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.2418F, -0.1013F, -0.6073F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 37, 58, -1.4364F, 1.6092F, -4.3035F, 1, 3, 9, 0.0F, true));

        this.Hips_r2 = new AdvancedModelRenderer(this);
        this.Hips_r2.setRotationPoint(-2.5F, 0.7372F, 0.4767F);
        this.back_body.addChild(Hips_r2);
        this.setRotateAngle(Hips_r2, -0.2502F, 0.0779F, 0.0775F);
        this.Hips_r2.cubeList.add(new ModelBox(Hips_r2, 7, 8, -0.3856F, -0.0195F, -2.3035F, 1, 2, 3, 0.0F, true));

        this.Hips_r3 = new AdvancedModelRenderer(this);
        this.Hips_r3.setRotationPoint(-1.0F, 0.1372F, 0.4767F);
        this.back_body.addChild(Hips_r3);
        this.setRotateAngle(Hips_r3, 0.0552F, 0.0779F, 0.2956F);
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 0, 0, -1.6419F, 0.3842F, -1.9482F, 1, 1, 6, 0.0F, true));
        this.Hips_r3.cubeList.add(new ModelBox(Hips_r3, 55, 58, -0.6419F, 0.3842F, 0.0518F, 1, 1, 3, 0.0F, true));

        this.Hips_r4 = new AdvancedModelRenderer(this);
        this.Hips_r4.setRotationPoint(1.0F, 0.1372F, 0.4767F);
        this.back_body.addChild(Hips_r4);
        this.setRotateAngle(Hips_r4, 0.0552F, -0.0779F, -0.2956F);
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 0, 0, 0.6419F, 0.3842F, -1.9482F, 1, 1, 6, 0.0F, false));
        this.Hips_r4.cubeList.add(new ModelBox(Hips_r4, 55, 58, -0.3581F, 0.3842F, 0.0518F, 1, 1, 3, 0.0F, false));

        this.Hips_r5 = new AdvancedModelRenderer(this);
        this.Hips_r5.setRotationPoint(2.5F, 0.7372F, 0.4767F);
        this.back_body.addChild(Hips_r5);
        this.setRotateAngle(Hips_r5, -0.2502F, -0.0779F, -0.0775F);
        this.Hips_r5.cubeList.add(new ModelBox(Hips_r5, 7, 8, -0.6144F, -0.0195F, -2.3035F, 1, 2, 3, 0.0F, false));

        this.Hips_r6 = new AdvancedModelRenderer(this);
        this.Hips_r6.setRotationPoint(2.5F, 0.7372F, 0.4767F);
        this.back_body.addChild(Hips_r6);
        this.setRotateAngle(Hips_r6, -0.2418F, 0.1013F, 0.6073F);
        this.Hips_r6.cubeList.add(new ModelBox(Hips_r6, 37, 58, 0.4364F, 1.6092F, -4.3035F, 1, 3, 9, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.2266F, -3.0755F);
        this.back_body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 58, -1.0F, -1.0404F, -0.109F, 2, 2, 9, 0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.1487F, 4.9355F);
        this.back_body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3229F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 68, 7, 0.0F, -2.7838F, -0.1422F, 0, 3, 1, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -1.7487F, -0.9645F);
        this.back_body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.2531F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 70, 0.0F, -2.7121F, 3.9705F, 0, 3, 1, 0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 70, 0.0F, -2.7121F, 1.9705F, 0, 3, 1, 0.001F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 70, 0.0F, -2.5121F, -0.0295F, 0, 3, 1, 0.001F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.3487F, -2.9645F);
        this.back_body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 40, 71, 0.0F, -2.2504F, 0.0421F, 0, 3, 1, 0.001F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.7471F, 5.0501F);
        this.back_body.addChild(tail);
        this.setRotateAngle(tail, 0.0492F, 0.4795F, 0.0227F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.8844F, 1.3155F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 45, 0.0F, 4.0996F, 5.0836F, 0, 3, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 8, 0.0F, 2.8471F, 3.2312F, 0, 4, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 8, 0.0F, 1.5946F, 1.3789F, 0, 4, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 0, 0.0F, 0.7387F, -0.5257F, 0, 4, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.1844F, 0.3155F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 46, 35, -1.0F, -0.9432F, -0.4009F, 2, 2, 10, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -0.0884F, 1.5722F);
        this.tail.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.4102F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 31, 36, 0.0F, -1.8714F, 5.897F, 0, 2, 1, 0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 41, 45, 0.0F, -2.1714F, 3.897F, 0, 3, 1, 0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 48, 35, 0.0F, -2.5714F, 1.897F, 0, 3, 1, 0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 35, 0.0F, -2.9714F, -0.103F, 0, 3, 1, 0.001F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 3.8842F, 8.4262F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0457F, 0.3051F, 0.0138F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.9348F, 4.2887F);
        this.tail2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3491F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 36, -1.0F, -0.3F, -4.5F, 2, 2, 11, 0.001F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -3.9859F, -6.8412F);
        this.tail2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.4102F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 7, 8, 0.0F, -0.9714F, 15.897F, 0, 1, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 13, 8, 0.0F, -1.0714F, 13.897F, 0, 1, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 10, 0.0F, -1.2714F, 11.897F, 0, 2, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 36, 0.0F, -1.4714F, 9.897F, 0, 2, 1, 0.001F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 36, 0.0F, -1.6714F, 7.897F, 0, 2, 1, 0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -2.0131F, -7.0979F);
        this.tail2.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, 0.0F, 8.394F, 14.483F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 7, 18, 0.0F, 7.8497F, 12.5481F, 0, 2, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 23, 18, 0.0F, 6.207F, 10.6306F, 0, 3, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 28, 0.0F, 5.5642F, 8.713F, 0, 3, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 39, 0, 0.0F, 5.02F, 6.7782F, 0, 3, 1, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 3.3F, 9.5F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.0517F, 0.5666F, 0.0278F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.8501F, 2.1612F);
        this.tail3.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.2618F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 50, -1.5F, -0.95F, -2.75F, 2, 2, 9, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 2.2697F, 8.029F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0517F, 0.5666F, -0.0278F);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.7959F, 5.9068F);
        this.tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0873F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -0.5F, 1.75F, -6.25F, 1, 1, 14, 0.001F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.1F, 13.1F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.0962F, 0.4346F, -0.0406F);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 0, -0.5F, -0.5325F, 0.0188F, 1, 1, 16, 0.0F, false));

        this.left_thigh = new AdvancedModelRenderer(this);
        this.left_thigh.setRotationPoint(3.0F, 4.2539F, 0.1857F);
        this.back_body.addChild(left_thigh);
        this.setRotateAngle(left_thigh, 0.0F, 0.0F, -0.1309F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(3.8969F, 2.8274F, -0.2983F);
        this.left_thigh.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.1653F, 0.0681F, 0.3875F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 64, 48, -5.0F, -2.5F, -2.0F, 8, 2, 4, 0.0F, false));

        this.left_shin = new AdvancedModelRenderer(this);
        this.left_shin.setRotationPoint(6.9801F, 3.2169F, -0.9962F);
        this.left_thigh.addChild(left_shin);
        this.setRotateAngle(left_shin, -0.0873F, 0.0F, 0.0F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.4313F, 4.761F, 1.292F);
        this.left_shin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2003F, -0.2155F, 0.0844F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 48, 79, -1.7072F, -5.0F, -1.5F, 3, 8, 1, 0.0F, false));
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 36, -1.7072F, -5.0F, 0.5F, 3, 8, 2, 0.0F, false));

        this.left_foot = new AdvancedModelRenderer(this);
        this.left_foot.setRotationPoint(-0.1386F, 7.1063F, 3.1843F);
        this.left_shin.addChild(left_foot);
        this.setRotateAngle(left_foot, 0.1745F, 0.0F, 0.1309F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.4176F, 1.026F, -2.7388F);
        this.left_foot.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0469F, -0.5664F, 0.0436F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 44, 11, -3.6F, -1.0F, -4.5F, 6, 2, 8, 0.0F, false));

        this.right_thigh = new AdvancedModelRenderer(this);
        this.right_thigh.setRotationPoint(-3.0F, 4.2539F, 0.1857F);
        this.back_body.addChild(right_thigh);
        this.setRotateAngle(right_thigh, 0.0F, 0.0F, 0.1309F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.8969F, 2.8274F, -0.2983F);
        this.right_thigh.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1653F, -0.0681F, -0.3875F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 57, 0, -3.0F, -2.5F, -2.0F, 8, 2, 4, 0.0F, false));

        this.right_shin = new AdvancedModelRenderer(this);
        this.right_shin.setRotationPoint(-6.9801F, 3.2169F, -0.9962F);
        this.right_thigh.addChild(right_shin);
        this.setRotateAngle(right_shin, -0.0873F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.4313F, 4.761F, 1.292F);
        this.right_shin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2003F, 0.2155F, -0.0844F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 77, 78, -1.2928F, -5.0F, -1.5F, 3, 8, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 0, -1.2928F, -5.0F, 0.5F, 3, 8, 2, 0.0F, false));

        this.right_foot = new AdvancedModelRenderer(this);
        this.right_foot.setRotationPoint(0.1386F, 7.1063F, 3.1843F);
        this.right_shin.addChild(right_foot);
        this.setRotateAngle(right_foot, 0.1745F, 0.0F, -0.1309F);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.4176F, 1.026F, -2.7388F);
        this.right_foot.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.0469F, 0.5664F, -0.0436F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 0, -2.4F, -1.0F, -4.5F, 6, 2, 8, 0.0F, false));

        this.middle_body = new AdvancedModelRenderer(this);
        this.middle_body.setRotationPoint(0.0F, -1.2414F, -3.1808F);
        this.back_body.addChild(middle_body);
        this.setRotateAngle(middle_body, 0.0F, -0.4363F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -1.1073F, -1.6837F);
        this.middle_body.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 43, 71, 0.0F, -2.1994F, -0.0638F, 0, 3, 1, 0.001F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -1.4073F, -7.8837F);
        this.middle_body.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0785F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 46, 71, 0.0F, -2.2868F, 4.1406F, 0, 3, 1, 0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 49, 71, 0.0F, -2.0868F, 2.1406F, 0, 3, 1, 0.001F, false));
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 57, 0, 0.0F, -1.8868F, 0.1406F, 0, 2, 1, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.4073F, -13.6837F);
        this.middle_body.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.0262F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 64, 48, 0.0F, -2.0386F, 3.9387F, 0, 2, 1, 0.001F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 5, 66, 0.0F, -1.9386F, 1.9387F, 0, 2, 1, 0.001F, false));
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 22, 0.0F, -1.9386F, -0.0613F, 0, 2, 1, 0.001F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-1.0449F, -0.4267F, -12.9745F);
        this.middle_body.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.0072F, 0.0071F, 0.3489F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 30, 0, -1.6251F, 2.5253F, -0.6883F, 0, 8, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-1.0449F, -0.4267F, -12.9745F);
        this.middle_body.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.0023F, 0.0098F, 0.9162F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 3, 62, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-1.0449F, -0.3267F, -10.9745F);
        this.middle_body.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0072F, 0.0071F, 0.3489F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 11, 18, -1.6251F, 2.5253F, -0.6883F, 0, 8, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-1.0449F, -0.3267F, -10.9745F);
        this.middle_body.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0023F, 0.0098F, 0.9162F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 62, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-1.0449F, -0.2267F, -8.9745F);
        this.middle_body.addChild(cube_r26);
        this.setRotateAngle(cube_r26, -0.0072F, 0.0071F, 0.3053F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 14, 50, -1.6251F, 2.5253F, -0.6883F, 0, 7, 1, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(-1.0449F, -0.2267F, -8.9745F);
        this.middle_body.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0023F, 0.0098F, 0.8726F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 61, 35, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(-1.0449F, -0.1267F, -6.9745F);
        this.middle_body.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0322F, 0.0149F, 0.305F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 0, -1.6251F, 2.5253F, -0.6883F, 0, 6, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-1.0449F, -0.1267F, -6.9745F);
        this.middle_body.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0191F, 0.0299F, 0.8722F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 49, 58, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.0449F, -0.0267F, -4.9745F);
        this.middle_body.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0738F, 0.028F, 0.3041F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 0, -1.6251F, 2.5253F, -0.6883F, 0, 4, 1, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-1.0449F, -0.0267F, -4.9745F);
        this.middle_body.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0473F, 0.0633F, 0.8709F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 31, 58, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-1.0449F, 0.1733F, -2.9745F);
        this.middle_body.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0738F, 0.028F, 0.2169F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 49, 15, -1.6251F, 2.5253F, -0.6883F, 0, 2, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-1.0449F, 0.3733F, -0.9745F);
        this.middle_body.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0473F, 0.0633F, 0.6964F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 41, 4, -0.0209F, 0.0058F, -0.6883F, 0, 2, 1, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-1.0449F, 0.1733F, -2.9745F);
        this.middle_body.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0473F, 0.0633F, 0.7836F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 58, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.0449F, 0.3733F, -0.9745F);
        this.middle_body.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0473F, -0.0633F, -0.6964F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 41, 4, 0.0209F, 0.0058F, -0.6883F, 0, 2, 1, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(1.0449F, 0.1733F, -2.9745F);
        this.middle_body.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.0738F, -0.028F, -0.2169F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 49, 15, 1.6251F, 2.5253F, -0.6883F, 0, 2, 1, 0.0F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(1.0449F, 0.1733F, -2.9745F);
        this.middle_body.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0473F, -0.0633F, -0.7836F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 28, 58, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(1.0449F, -0.0267F, -4.9745F);
        this.middle_body.addChild(cube_r38);
        this.setRotateAngle(cube_r38, -0.0473F, -0.0633F, -0.8709F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 31, 58, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(1.0449F, -0.0267F, -4.9745F);
        this.middle_body.addChild(cube_r39);
        this.setRotateAngle(cube_r39, -0.0738F, -0.028F, -0.3041F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 12, 0, 1.6251F, 2.5253F, -0.6883F, 0, 4, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(1.0449F, -0.1267F, -6.9745F);
        this.middle_body.addChild(cube_r40);
        this.setRotateAngle(cube_r40, -0.0191F, -0.0299F, -0.8722F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 49, 58, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(1.0449F, -0.1267F, -6.9745F);
        this.middle_body.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0322F, -0.0149F, -0.305F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 36, 0, 1.6251F, 2.5253F, -0.6883F, 0, 6, 1, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(1.0449F, -0.2267F, -8.9745F);
        this.middle_body.addChild(cube_r42);
        this.setRotateAngle(cube_r42, -0.0023F, -0.0098F, -0.8726F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 61, 35, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(1.0449F, -0.2267F, -8.9745F);
        this.middle_body.addChild(cube_r43);
        this.setRotateAngle(cube_r43, -0.0072F, -0.0071F, -0.3053F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 14, 50, 1.6251F, 2.5253F, -0.6883F, 0, 7, 1, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(1.0449F, -0.3267F, -10.9745F);
        this.middle_body.addChild(cube_r44);
        this.setRotateAngle(cube_r44, -0.0023F, -0.0098F, -0.9162F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 62, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(1.0449F, -0.3267F, -10.9745F);
        this.middle_body.addChild(cube_r45);
        this.setRotateAngle(cube_r45, -0.0072F, -0.0071F, -0.3489F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 11, 18, 1.6251F, 2.5253F, -0.6883F, 0, 8, 1, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(1.0449F, -0.4267F, -12.9745F);
        this.middle_body.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0378F, -0.13F, -0.352F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 30, 0, 1.6251F, 2.5253F, -0.6883F, 0, 8, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(1.0449F, -0.4267F, -12.9745F);
        this.middle_body.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.1018F, -0.0893F, -0.9214F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 3, 62, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 9.6538F, -20.0599F);
        this.middle_body.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0436F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 0.5434F, 16.1773F, 6, 0, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 0.6307F, 14.1792F, 6, 0, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 0.7179F, 12.1811F, 6, 0, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 0.8052F, 10.183F, 6, 0, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 0.8924F, 8.1849F, 6, 0, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 0.9796F, 6.1869F, 6, 0, 1, 0.0F, false));
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, -1, 94, -3.0F, 1.0669F, 4.1888F, 6, 0, 1, 0.0F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, -0.3254F, -14.7819F);
        this.middle_body.addChild(cube_r49);
        this.setRotateAngle(cube_r49, -0.0436F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 0, 18, -1.0F, -1.3F, -0.0026F, 2, 2, 15, 0.0F, false));

        this.front_body = new AdvancedModelRenderer(this);
        this.front_body.setRotationPoint(0.0F, -0.9043F, -14.9347F);
        this.middle_body.addChild(front_body);
        this.setRotateAngle(front_body, 0.0057F, -0.306F, 0.0083F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, -0.5031F, -0.849F);
        this.front_body.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0087F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 69, 22, 0.0F, -1.8203F, 0.0386F, 0, 2, 1, 0.001F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, -0.3031F, -2.749F);
        this.front_body.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0436F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 70, 11, 0.0F, -1.6373F, -0.051F, 0, 2, 1, 0.001F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, -0.1031F, -6.849F);
        this.front_body.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.096F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 52, 71, 0.0F, -1.4434F, 2.0493F, 0, 2, 1, 0.001F, false));
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 55, 71, 0.0F, -1.4434F, 0.0493F, 0, 2, 1, 0.001F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-1.0449F, 0.7776F, -6.0398F);
        this.front_body.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0774F, -0.0136F, 0.174F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 64, 35, -1.6251F, 2.5253F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.0449F, 0.7776F, -6.0398F);
        this.front_body.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.058F, -0.053F, 0.7402F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 65, 7, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(-1.0449F, 0.5776F, -4.0398F);
        this.front_body.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0774F, -0.0136F, 0.2176F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 20, 18, -1.6251F, 2.5253F, -0.6883F, 0, 5, 1, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(-1.0449F, 0.5776F, -4.0398F);
        this.front_body.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.058F, -0.053F, 0.7839F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 19, 62, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0449F, 0.4776F, -2.0398F);
        this.front_body.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0257F, -0.0236F, 0.8287F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 16, 62, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.0449F, 0.4776F, -2.0398F);
        this.front_body.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0344F, -0.0061F, 0.2617F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 31, 70, -1.6251F, 2.5253F, -0.6883F, 0, 7, 1, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-1.0449F, 0.4776F, -0.0398F);
        this.front_body.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0873F, 0.1603F, 0.3094F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 51, 22, -1.6251F, 2.5253F, -0.6883F, 0, 8, 1, 0.0F, true));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-1.0449F, 0.4776F, -0.0398F);
        this.front_body.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1597F, 0.0885F, 0.8767F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 13, 62, -0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(1.0449F, 0.4776F, -0.0398F);
        this.front_body.addChild(cube_r61);
        this.setRotateAngle(cube_r61, -0.0323F, 0.214F, -0.3127F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 51, 22, 1.6251F, 2.5253F, -0.6883F, 0, 8, 1, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(1.0449F, 0.4776F, -0.0398F);
        this.front_body.addChild(cube_r62);
        this.setRotateAngle(cube_r62, -0.143F, 0.1629F, -0.8881F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 13, 62, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(1.0449F, 0.4776F, -2.0398F);
        this.front_body.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0344F, 0.0061F, -0.2617F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 31, 70, 1.6251F, 2.5253F, -0.6883F, 0, 7, 1, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(1.0449F, 0.4776F, -2.0398F);
        this.front_body.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0257F, 0.0236F, -0.8287F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 16, 62, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(1.0449F, 0.5776F, -4.0398F);
        this.front_body.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.058F, 0.053F, -0.7839F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 19, 62, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(1.0449F, 0.5776F, -4.0398F);
        this.front_body.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0774F, 0.0136F, -0.2176F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 20, 18, 1.6251F, 2.5253F, -0.6883F, 0, 5, 1, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(1.0449F, 0.7776F, -6.0398F);
        this.front_body.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0774F, 0.0136F, -0.174F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 64, 35, 1.6251F, 2.5253F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(1.0449F, 0.7776F, -6.0398F);
        this.front_body.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.058F, 0.053F, -0.7402F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 65, 7, 0.0209F, 0.0058F, -0.6883F, 0, 3, 1, 0.0F, false));

        this.Bodyfront_r1 = new AdvancedModelRenderer(this);
        this.Bodyfront_r1.setRotationPoint(-5.2F, 9.3829F, -5.6078F);
        this.front_body.addChild(Bodyfront_r1);
        this.setRotateAngle(Bodyfront_r1, -0.0673F, -0.3068F, -1.199F);
        this.Bodyfront_r1.cubeList.add(new ModelBox(Bodyfront_r1, 0, 50, 0.1291F, 0.041F, -2.2122F, 1, 5, 3, -0.001F, true));

        this.Bodyfront_r2 = new AdvancedModelRenderer(this);
        this.Bodyfront_r2.setRotationPoint(-5.2F, 7.3829F, -5.6078F);
        this.front_body.addChild(Bodyfront_r2);
        this.setRotateAngle(Bodyfront_r2, -0.2951F, -0.1084F, -0.1897F);
        this.Bodyfront_r2.cubeList.add(new ModelBox(Bodyfront_r2, 14, 70, -0.2457F, -1.0917F, -2.6019F, 1, 3, 7, 0.0F, true));

        this.Bodyfront_r3 = new AdvancedModelRenderer(this);
        this.Bodyfront_r3.setRotationPoint(-4.876F, 5.9189F, -6.6029F);
        this.front_body.addChild(Bodyfront_r3);
        this.setRotateAngle(Bodyfront_r3, -0.2966F, 0.0577F, 0.4645F);
        this.Bodyfront_r3.cubeList.add(new ModelBox(Bodyfront_r3, 0, 18, -0.629F, -6.5131F, -0.9896F, 1, 7, 4, 0.0F, true));

        this.Bodyfront_r4 = new AdvancedModelRenderer(this);
        this.Bodyfront_r4.setRotationPoint(4.876F, 5.9189F, -6.6029F);
        this.front_body.addChild(Bodyfront_r4);
        this.setRotateAngle(Bodyfront_r4, -0.2966F, -0.0577F, -0.4645F);
        this.Bodyfront_r4.cubeList.add(new ModelBox(Bodyfront_r4, 0, 18, -0.371F, -6.5131F, -0.9896F, 1, 7, 4, 0.0F, false));

        this.Bodyfront_r5 = new AdvancedModelRenderer(this);
        this.Bodyfront_r5.setRotationPoint(5.2F, 7.3829F, -5.6078F);
        this.front_body.addChild(Bodyfront_r5);
        this.setRotateAngle(Bodyfront_r5, -0.2951F, 0.1084F, 0.1897F);
        this.Bodyfront_r5.cubeList.add(new ModelBox(Bodyfront_r5, 14, 70, -0.7543F, -1.0917F, -2.6019F, 1, 3, 7, 0.0F, false));

        this.Bodyfront_r6 = new AdvancedModelRenderer(this);
        this.Bodyfront_r6.setRotationPoint(5.2F, 9.3829F, -5.6078F);
        this.front_body.addChild(Bodyfront_r6);
        this.setRotateAngle(Bodyfront_r6, -0.0673F, 0.3068F, 1.199F);
        this.Bodyfront_r6.cubeList.add(new ModelBox(Bodyfront_r6, 0, 50, -1.1291F, 0.041F, -2.2122F, 1, 5, 3, -0.001F, false));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(0.0F, 0.2969F, -7.749F);
        this.front_body.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0785F, 0.0F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 62, -1.0F, -0.3716F, -0.0221F, 2, 2, 8, 0.001F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.5466F, -7.467F);
        this.front_body.addChild(neck);
        this.setRotateAngle(neck, -0.0953F, -0.4781F, 0.0137F);


        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(0.5F, 2.2268F, -0.9392F);
        this.neck.addChild(cube_r70);
        this.setRotateAngle(cube_r70, -0.0873F, 0.0F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 0, -0.5F, -4.1F, -1.6F, 0, 2, 2, 0.0F, false));
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 35, 58, -1.5F, -2.9F, -2.0F, 2, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.2F, -2.4F);
        this.neck.addChild(head);
        this.setRotateAngle(head, -0.4943F, -0.2316F, 0.1231F);
        this.head.cubeList.add(new ModelBox(head, 20, 18, -4.0F, -2.2F, -7.0F, 8, 6, 7, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.5F, 0.6391F, -10.7669F);
        this.head.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0873F, 0.0F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 19, 45, -3.0F, -2.5F, -4.0F, 5, 4, 8, -0.01F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.1F, 0.7226F, -17.4791F);
        this.head.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.2618F, 0.0F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 19, 11, -2.1F, 1.5F, -4.0209F, 4, 1, 0, 0.0F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 36, 11, -2.0F, 1.5F, -4.0209F, 0, 1, 1, 0.0F, true));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 36, 11, 1.8F, 1.5F, -4.0209F, 0, 1, 1, 0.0F, false));
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 58, 58, -2.1F, -1.5F, -4.0F, 4, 3, 7, 0.0F, false));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(0.0F, 2.2062F, -12.3582F);
        this.head.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.1745F, 0.0F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 38, 45, -2.4F, 2.5F, -2.0F, 0, 1, 6, 0.0F, true));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 38, 45, 2.4F, 2.5F, -2.0F, 0, 1, 6, 0.0F, false));
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 27, 32, -3.0F, -1.5F, -2.0F, 6, 4, 8, 0.0F, false));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(0.0F, 2.4089F, -16.6695F);
        this.head.addChild(cube_r74);
        this.setRotateAngle(cube_r74, -0.3491F, 0.0F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 8, -1.9F, 1.5F, -2.5F, 0, 1, 6, 0.0F, true));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 8, 1.9F, 1.5F, -2.5F, 0, 1, 6, 0.0F, false));
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 61, 35, -2.5F, -1.5F, -2.5F, 5, 3, 6, 0.0F, false));

        this.lower_jaw = new AdvancedModelRenderer(this);
        this.lower_jaw.setRotationPoint(0.0F, 4.3F, 0.0F);
        this.head.addChild(lower_jaw);
        this.setRotateAngle(lower_jaw, 1.0908F, 0.0F, 0.0F);
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 51, 69, 2.0F, -0.51F, -6.99F, 2, 2, 7, -0.01F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 70, 69, 2.0F, 1.29F, -6.99F, 2, 1, 7, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 66, 18, 1.5F, -0.5F, -15.0F, 1, 2, 8, -0.01F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 31, 71, 2.25F, -1.5F, -15.0F, 0, 1, 8, 0.0F, false));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 66, 18, -2.5F, -0.5F, -15.0F, 1, 2, 8, -0.01F, true));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 70, 69, -4.0F, 1.29F, -6.99F, 2, 1, 7, 0.0F, true));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 51, 69, -4.0F, -0.51F, -6.99F, 2, 2, 7, -0.01F, true));
        this.lower_jaw.cubeList.add(new ModelBox(lower_jaw, 31, 71, -2.25F, -1.5F, -15.0F, 0, 1, 8, 0.0F, true));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.0F, 1.5639F, -6.5316F);
        this.lower_jaw.addChild(cube_r75);
        this.setRotateAngle(cube_r75, -0.404F, -0.2457F, 0.0914F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 28, 58, 0.0F, -2.0261F, -0.1809F, 0, 2, 6, 0.0F, true));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.0F, 1.0058F, -17.7727F);
        this.lower_jaw.addChild(cube_r76);
        this.setRotateAngle(cube_r76, -0.1745F, 0.0F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 49, 58, -1.9F, -3.0F, -2.7273F, 0, 1, 5, 0.0F, true));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 73, -2.0F, -2.0F, -2.0F, 1, 2, 5, -0.02F, true));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 30, -2.0F, -3.0F, -2.7273F, 4, 1, 0, -0.02F, false));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 49, 58, 1.9F, -3.0F, -2.7273F, 0, 1, 5, 0.0F, false));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 63, 69, -2.0F, -2.0F, -3.0F, 4, 2, 1, -0.02F, false));
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 0, 73, 1.0F, -2.0F, -2.0F, 1, 2, 5, -0.02F, false));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(0.0F, 1.5F, -15.0F);
        this.lower_jaw.addChild(cube_r77);
        this.setRotateAngle(cube_r77, -0.0873F, 0.0F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 65, 7, -2.5F, -2.0F, 0.1F, 1, 2, 8, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(0.0F, 1.5639F, -6.5316F);
        this.lower_jaw.addChild(cube_r78);
        this.setRotateAngle(cube_r78, -0.404F, 0.2457F, -0.0914F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 28, 58, 0.0F, -2.0261F, -0.1809F, 0, 2, 6, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.0F, 1.5F, -15.0F);
        this.lower_jaw.addChild(cube_r79);
        this.setRotateAngle(cube_r79, -0.0873F, 0.0F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 65, 7, 1.5F, -2.0F, 0.1F, 1, 2, 8, 0.0F, false));

        this.left_upper_arm = new AdvancedModelRenderer(this);
        this.left_upper_arm.setRotationPoint(6.0F, 7.4867F, -3.695F);
        this.front_body.addChild(left_upper_arm);
        this.setRotateAngle(left_upper_arm, 0.0F, 0.0F, 0.0436F);


        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(1.9316F, 1.5218F, 1.5115F);
        this.left_upper_arm.addChild(cube_r80);
        this.setRotateAngle(cube_r80, -0.197F, -0.5765F, 0.5072F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 74, 55, -3.5F, -0.4393F, -1.4244F, 6, 2, 3, 0.0F, false));

        this.left_lower_arm = new AdvancedModelRenderer(this);
        this.left_lower_arm.setRotationPoint(3.0029F, 3.1309F, 3.0F);
        this.left_upper_arm.addChild(left_lower_arm);


        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(0.2286F, 2.63F, -0.7405F);
        this.left_lower_arm.addChild(cube_r81);
        this.setRotateAngle(cube_r81, -0.144F, -0.4775F, -0.0056F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 0, 81, -1.0F, -3.1784F, -1.9724F, 2, 8, 1, 0.0F, false));
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 68, 78, -1.0F, -3.1784F, -0.1724F, 2, 8, 2, 0.0F, false));

        this.left_paw = new AdvancedModelRenderer(this);
        this.left_paw.setRotationPoint(0.0755F, 7.6634F, -0.6413F);
        this.left_lower_arm.addChild(left_paw);
        this.setRotateAngle(left_paw, 0.0873F, 0.0F, 0.0F);


        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(1.8373F, -0.3879F, -3.8301F);
        this.left_paw.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, -0.4363F, -0.0436F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 46, 48, -2.5F, -0.6749F, -1.4807F, 5, 2, 7, 0.0F, false));

        this.right_upper_arm = new AdvancedModelRenderer(this);
        this.right_upper_arm.setRotationPoint(-6.0F, 7.4867F, -3.695F);
        this.front_body.addChild(right_upper_arm);
        this.setRotateAngle(right_upper_arm, 0.0F, 0.0F, -0.0436F);


        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(-1.9316F, 1.5218F, 1.5115F);
        this.right_upper_arm.addChild(cube_r83);
        this.setRotateAngle(cube_r83, -0.197F, 0.5765F, -0.5072F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 73, 29, -2.5F, -0.4393F, -1.4244F, 6, 2, 3, 0.0F, false));

        this.right_lower_arm = new AdvancedModelRenderer(this);
        this.right_lower_arm.setRotationPoint(-3.0029F, 3.1309F, 3.0F);
        this.right_upper_arm.addChild(right_lower_arm);


        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(-0.2286F, 2.63F, -0.7405F);
        this.right_lower_arm.addChild(cube_r84);
        this.setRotateAngle(cube_r84, -0.144F, 0.4775F, 0.0056F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 57, 79, -1.0F, -3.1784F, -1.9724F, 2, 8, 1, 0.0F, false));
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 16, 36, -1.0F, -3.1784F, -0.1724F, 2, 8, 2, 0.0F, false));

        this.right_paw = new AdvancedModelRenderer(this);
        this.right_paw.setRotationPoint(-0.0755F, 7.6634F, -0.6413F);
        this.right_lower_arm.addChild(right_paw);
        this.setRotateAngle(right_paw, 0.0873F, 0.0F, 0.0F);


        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(-1.8373F, -0.3879F, -3.8301F);
        this.right_paw.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.4363F, 0.0436F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 48, 25, -2.5F, -0.6749F, -1.4807F, 5, 2, 7, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.ophiacodon.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
