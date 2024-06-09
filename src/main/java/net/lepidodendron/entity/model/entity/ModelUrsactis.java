package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelUrsactis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headLegLeft;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer headLegRight;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer appendageleft;
    private final AdvancedModelRenderer appendageright;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer bottomLegleft;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bottomLegright;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer topLegleft;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer topLegright;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer bottomLegleft2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer bottomLegright2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer topLegleft2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer topLegright2;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer topLegleft3;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer topLegright3;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer bottomLegleft3;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer bottomLegright3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer bottomLegleft4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer bottomLegright4;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer topLegleft4;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer topLegright4;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer bottomLegleft5;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer bottomLegright5;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer topLegleft5;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer topLegright5;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer bottomLegleft6;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer bottomLegright6;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer topLegleft6;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer topLegright6;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer body7;
    private final AdvancedModelRenderer topLegleft7;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer topLegright7;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer bottomLegleft7;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer bottomLegright7;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer body8;
    private final AdvancedModelRenderer bottomLegleft8;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer bottomLegright8;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer topLegleft8;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer topLegright8;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer body9;
    private final AdvancedModelRenderer bottomLegleft9;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer cube_r68;
    private final AdvancedModelRenderer bottomLegright9;
    private final AdvancedModelRenderer cube_r69;
    private final AdvancedModelRenderer cube_r70;
    private final AdvancedModelRenderer topLegleft9;
    private final AdvancedModelRenderer cube_r71;
    private final AdvancedModelRenderer cube_r72;
    private final AdvancedModelRenderer topLegright9;
    private final AdvancedModelRenderer cube_r73;
    private final AdvancedModelRenderer cube_r74;
    private final AdvancedModelRenderer body10;
    private final AdvancedModelRenderer bottomLegleft10;
    private final AdvancedModelRenderer cube_r75;
    private final AdvancedModelRenderer cube_r76;
    private final AdvancedModelRenderer bottomLegright10;
    private final AdvancedModelRenderer cube_r77;
    private final AdvancedModelRenderer cube_r78;
    private final AdvancedModelRenderer topLegleft10;
    private final AdvancedModelRenderer cube_r79;
    private final AdvancedModelRenderer cube_r80;
    private final AdvancedModelRenderer topLegright10;
    private final AdvancedModelRenderer cube_r81;
    private final AdvancedModelRenderer cube_r82;
    private final AdvancedModelRenderer topLegleft11;
    private final AdvancedModelRenderer cube_r83;
    private final AdvancedModelRenderer cube_r84;
    private final AdvancedModelRenderer topLegright11;
    private final AdvancedModelRenderer cube_r85;
    private final AdvancedModelRenderer cube_r86;

    public ModelUrsactis() {
        this.textureWidth = 55;
        this.textureHeight = 55;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 30, 16, -1.0F, -3.01F, -6.8F, 2, 2, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 45, 19, -0.5F, -3.01F, -6.84F, 1, 2, 0, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 33, -1.0F, -3.01F, -7.8F, 2, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 7, 25, -0.5F, -2.91F, -8.1F, 1, 1, 2, 0.0F, false));

        this.headLegLeft = new AdvancedModelRenderer(this);
        this.headLegLeft.setRotationPoint(0.7F, -1.5F, -6.55F);
        this.head.addChild(headLegLeft);
        this.setRotateAngle(headLegLeft, 0.0547F, 0.0102F, 0.2293F);
        this.headLegLeft.cubeList.add(new ModelBox(headLegLeft, 39, 42, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.headLegLeft.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 13, 19, -0.1183F, -0.5F, 0.2274F, 5, 1, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.headLegLeft.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0019F, -0.0436F, -0.0437F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 21, -0.0607F, -0.5F, 0.1059F, 5, 1, 0, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.headLegLeft.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.0087F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 4, -0.0017F, -0.5F, -0.1F, 5, 1, 0, 0.0F, false));

        this.headLegRight = new AdvancedModelRenderer(this);
        this.headLegRight.setRotationPoint(-0.7F, -1.5F, -6.55F);
        this.head.addChild(headLegRight);
        this.setRotateAngle(headLegRight, 0.0547F, -0.0102F, -0.2293F);
        this.headLegRight.cubeList.add(new ModelBox(headLegRight, 39, 42, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.headLegRight.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.1745F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 19, -4.8817F, -0.5F, 0.2274F, 5, 1, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.headLegRight.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0019F, 0.0436F, 0.0437F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 21, -4.9393F, -0.5F, 0.1059F, 5, 1, 0, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.headLegRight.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0087F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 21, 4, -4.9983F, -0.5F, -0.1F, 5, 1, 0, 0.0F, true));

        this.appendageleft = new AdvancedModelRenderer(this);
        this.appendageleft.setRotationPoint(1.0F, -2.6F, -7.3F);
        this.head.addChild(appendageleft);
        this.setRotateAngle(appendageleft, -0.1427F, -0.2367F, 0.2237F);
        this.appendageleft.cubeList.add(new ModelBox(appendageleft, 14, 13, -0.1F, 0.1F, -0.5F, 3, 0, 3, 0.0F, false));

        this.appendageright = new AdvancedModelRenderer(this);
        this.appendageright.setRotationPoint(-1.0F, -2.6F, -7.3F);
        this.head.addChild(appendageright);
        this.setRotateAngle(appendageright, -0.1427F, 0.2367F, -0.2237F);
        this.appendageright.cubeList.add(new ModelBox(appendageright, 14, 13, -2.9F, 0.1F, -0.5F, 3, 0, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -2.25F, -5.8F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 28, 29, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 25, 37, -0.01F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 37, -0.99F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft = new AdvancedModelRenderer(this);
        this.bottomLegleft.setRotationPoint(1.0F, 0.75F, 0.55F);
        this.body.addChild(bottomLegleft);
        this.setRotateAngle(bottomLegleft, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft.cubeList.add(new ModelBox(bottomLegleft, 43, 44, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.1745F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 37, 40, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.0087F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 38, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright = new AdvancedModelRenderer(this);
        this.bottomLegright.setRotationPoint(-1.0F, 0.75F, 0.55F);
        this.body.addChild(bottomLegright);
        this.setRotateAngle(bottomLegright, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright.cubeList.add(new ModelBox(bottomLegright, 43, 44, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.1745F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 37, 40, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0087F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 38, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft = new AdvancedModelRenderer(this);
        this.topLegleft.setRotationPoint(1.0F, -0.45F, 0.55F);
        this.body.addChild(topLegleft);
        this.setRotateAngle(topLegleft, 0.0341F, 0.1264F, -0.4342F);
        this.topLegleft.cubeList.add(new ModelBox(topLegleft, 44, 40, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));
        this.topLegleft.cubeList.add(new ModelBox(topLegleft, 0, 19, 0.659F, -0.4289F, -0.2F, 6, 1, 0, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.1745F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 12, 0.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, false));

        this.topLegright = new AdvancedModelRenderer(this);
        this.topLegright.setRotationPoint(-1.0F, -0.45F, 0.55F);
        this.body.addChild(topLegright);
        this.setRotateAngle(topLegright, 0.0341F, -0.1264F, 0.4342F);
        this.topLegright.cubeList.add(new ModelBox(topLegright, 44, 40, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));
        this.topLegright.cubeList.add(new ModelBox(topLegright, 0, 19, -6.659F, -0.4289F, -0.2F, 6, 1, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.1745F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 12, -5.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 25, -1.0F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 37, 16, -0.01F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 35, 36, -0.99F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft2 = new AdvancedModelRenderer(this);
        this.bottomLegleft2.setRotationPoint(1.0F, 0.75F, 0.6F);
        this.body2.addChild(bottomLegleft2);
        this.setRotateAngle(bottomLegleft2, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft2.cubeList.add(new ModelBox(bottomLegleft2, 34, 42, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.1745F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 40, 30, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0087F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 36, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright2 = new AdvancedModelRenderer(this);
        this.bottomLegright2.setRotationPoint(-1.0F, 0.75F, 0.6F);
        this.body2.addChild(bottomLegright2);
        this.setRotateAngle(bottomLegright2, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright2.cubeList.add(new ModelBox(bottomLegright2, 34, 42, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.1745F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 40, 30, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0087F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 40, 36, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft2 = new AdvancedModelRenderer(this);
        this.topLegleft2.setRotationPoint(1.0F, -0.45F, 0.6F);
        this.body2.addChild(topLegleft2);
        this.setRotateAngle(topLegleft2, -0.0152F, 0.0859F, -0.3934F);
        this.topLegleft2.cubeList.add(new ModelBox(topLegleft2, 25, 44, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.1745F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 22, 23, 0.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, -0.0436F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 15, 17, 0.0F, -0.2F, 0.1F, 7, 1, 0, 0.0F, false));

        this.topLegright2 = new AdvancedModelRenderer(this);
        this.topLegright2.setRotationPoint(-1.0F, -0.45F, 0.6F);
        this.body2.addChild(topLegright2);
        this.setRotateAngle(topLegright2, -0.0152F, -0.0859F, 0.3934F);
        this.topLegright2.cubeList.add(new ModelBox(topLegright2, 25, 44, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.1745F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 22, 23, -5.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.0436F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 15, 17, -7.0F, -0.2F, 0.1F, 7, 1, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 21, 29, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 36, 32, -0.01F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 15, 36, -0.99F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));

        this.topLegleft3 = new AdvancedModelRenderer(this);
        this.topLegleft3.setRotationPoint(1.0F, -0.45F, 0.55F);
        this.body3.addChild(topLegleft3);
        this.setRotateAngle(topLegleft3, 0.0F, 0.0F, -0.48F);
        this.topLegleft3.cubeList.add(new ModelBox(topLegleft3, 20, 44, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));
        this.topLegleft3.cubeList.add(new ModelBox(topLegleft3, 0, 14, 0.659F, -0.4289F, -0.2F, 8, 1, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.2182F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 11, 23, 0.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, false));

        this.topLegright3 = new AdvancedModelRenderer(this);
        this.topLegright3.setRotationPoint(-1.0F, -0.45F, 0.55F);
        this.body3.addChild(topLegright3);
        this.setRotateAngle(topLegright3, 0.0F, 0.0F, 0.48F);
        this.topLegright3.cubeList.add(new ModelBox(topLegright3, 20, 44, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));
        this.topLegright3.cubeList.add(new ModelBox(topLegright3, 0, 14, -8.659F, -0.4289F, -0.2F, 8, 1, 0, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright3.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, 0.2182F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 11, 23, -5.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, true));

        this.bottomLegleft3 = new AdvancedModelRenderer(this);
        this.bottomLegleft3.setRotationPoint(1.0F, 0.75F, 0.55F);
        this.body3.addChild(bottomLegleft3);
        this.setRotateAngle(bottomLegleft3, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft3.cubeList.add(new ModelBox(bottomLegleft3, 29, 42, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft3.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, -0.1745F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 28, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft3.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, -0.0087F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 30, 40, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright3 = new AdvancedModelRenderer(this);
        this.bottomLegright3.setRotationPoint(-1.0F, 0.75F, 0.55F);
        this.body3.addChild(bottomLegright3);
        this.setRotateAngle(bottomLegright3, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright3.cubeList.add(new ModelBox(bottomLegright3, 29, 42, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.1745F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 40, 28, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0087F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 40, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 14, 29, -1.0F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 10, 36, -0.01F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 5, 36, -0.99F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft4 = new AdvancedModelRenderer(this);
        this.bottomLegleft4.setRotationPoint(1.0F, 0.75F, 0.6F);
        this.body4.addChild(bottomLegleft4);
        this.setRotateAngle(bottomLegleft4, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft4.cubeList.add(new ModelBox(bottomLegleft4, 42, 16, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, -0.1745F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 24, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0F, -0.0087F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 40, 26, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright4 = new AdvancedModelRenderer(this);
        this.bottomLegright4.setRotationPoint(-1.0F, 0.75F, 0.6F);
        this.body4.addChild(bottomLegright4);
        this.setRotateAngle(bottomLegright4, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright4.cubeList.add(new ModelBox(bottomLegright4, 42, 16, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0F, 0.1745F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 40, 24, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright4.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0F, 0.0087F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 40, 26, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft4 = new AdvancedModelRenderer(this);
        this.topLegleft4.setRotationPoint(1.0F, -0.45F, 0.6F);
        this.body4.addChild(topLegleft4);
        this.setRotateAngle(topLegleft4, 0.0F, 0.0F, -0.48F);
        this.topLegleft4.cubeList.add(new ModelBox(topLegleft4, 15, 44, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft4.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.1745F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 23, 0.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft4.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, -0.0436F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 12, 0.0F, -0.2F, 0.1F, 8, 1, 0, 0.0F, false));

        this.topLegright4 = new AdvancedModelRenderer(this);
        this.topLegright4.setRotationPoint(-1.0F, -0.45F, 0.6F);
        this.body4.addChild(topLegright4);
        this.setRotateAngle(topLegright4, 0.0F, 0.0F, 0.48F);
        this.topLegright4.cubeList.add(new ModelBox(topLegright4, 15, 44, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright4.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 0.1745F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 23, -5.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, true));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright4.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.0F, 0.0436F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 12, -8.0F, -0.2F, 0.1F, 8, 1, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 7, 29, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 36, 0, -0.01F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 0, 36, -0.99F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft5 = new AdvancedModelRenderer(this);
        this.bottomLegleft5.setRotationPoint(1.0F, 0.75F, 0.55F);
        this.body5.addChild(bottomLegleft5);
        this.setRotateAngle(bottomLegleft5, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft5.cubeList.add(new ModelBox(bottomLegleft5, 5, 42, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft5.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 0.0F, -0.1745F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 7, 40, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft5.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 0.0F, -0.0087F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 40, 14, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright5 = new AdvancedModelRenderer(this);
        this.bottomLegright5.setRotationPoint(-1.0F, 0.75F, 0.55F);
        this.body5.addChild(bottomLegright5);
        this.setRotateAngle(bottomLegright5, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright5.cubeList.add(new ModelBox(bottomLegright5, 5, 42, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright5.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 0.0F, 0.1745F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 7, 40, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright5.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.0F, 0.0087F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 40, 14, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft5 = new AdvancedModelRenderer(this);
        this.topLegleft5.setRotationPoint(1.0F, -0.45F, 0.55F);
        this.body5.addChild(topLegleft5);
        this.setRotateAngle(topLegleft5, 0.0F, -0.0873F, -0.48F);
        this.topLegleft5.cubeList.add(new ModelBox(topLegleft5, 5, 45, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft5.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.0F, -0.1745F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 22, 21, 0.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft5.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0F, -0.0436F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 10, 0.0F, -0.2F, 0.1F, 8, 1, 0, 0.0F, false));

        this.topLegright5 = new AdvancedModelRenderer(this);
        this.topLegright5.setRotationPoint(-1.0F, -0.45F, 0.55F);
        this.body5.addChild(topLegright5);
        this.setRotateAngle(topLegright5, 0.0F, 0.0873F, 0.48F);
        this.topLegright5.cubeList.add(new ModelBox(topLegright5, 5, 45, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright5.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 0.0F, 0.1745F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 22, 21, -5.0F, -0.2F, 0.4F, 5, 1, 0, 0.0F, true));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright5.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0436F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 10, -8.0F, -0.2F, 0.1F, 8, 1, 0, 0.0F, true));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body5.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 29, 0, -1.0F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 41, 0, -0.01F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 14, 40, -0.99F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft6 = new AdvancedModelRenderer(this);
        this.bottomLegleft6.setRotationPoint(1.0F, 0.75F, 0.6F);
        this.body6.addChild(bottomLegleft6);
        this.setRotateAngle(bottomLegleft6, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft6.cubeList.add(new ModelBox(bottomLegleft6, 0, 42, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft6.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, -0.1745F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 39, 10, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft6.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, -0.0087F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 0, 40, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright6 = new AdvancedModelRenderer(this);
        this.bottomLegright6.setRotationPoint(-1.0F, 0.75F, 0.6F);
        this.body6.addChild(bottomLegright6);
        this.setRotateAngle(bottomLegright6, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright6.cubeList.add(new ModelBox(bottomLegright6, 0, 42, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright6.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.1745F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 39, 10, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright6.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.0F, 0.0087F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 0, 40, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft6 = new AdvancedModelRenderer(this);
        this.topLegleft6.setRotationPoint(1.0F, -0.45F, 0.6F);
        this.body6.addChild(topLegleft6);
        this.setRotateAngle(topLegleft6, 0.0F, -0.2182F, -0.48F);
        this.topLegleft6.cubeList.add(new ModelBox(topLegleft6, 10, 43, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft6.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0F, -0.1745F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 17, 10, 0.0F, -0.2F, 0.4F, 7, 1, 0, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft6.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 0.0F, -0.0436F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 8, 0.0F, -0.2F, 0.1F, 8, 1, 0, 0.0F, false));

        this.topLegright6 = new AdvancedModelRenderer(this);
        this.topLegright6.setRotationPoint(-1.0F, -0.45F, 0.6F);
        this.body6.addChild(topLegright6);
        this.setRotateAngle(topLegright6, 0.0F, 0.2182F, 0.48F);
        this.topLegright6.cubeList.add(new ModelBox(topLegright6, 10, 43, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright6.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0F, 0.1745F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 17, 10, -7.0F, -0.2F, 0.4F, 7, 1, 0, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright6.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 0.0F, 0.0436F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 8, -8.0F, -0.2F, 0.1F, 8, 1, 0, 0.0F, true));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body6.addChild(body7);
        this.body7.cubeList.add(new ModelBox(body7, 0, 29, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 35, 28, -0.01F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body7.cubeList.add(new ModelBox(body7, 35, 24, -0.99F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));

        this.topLegleft7 = new AdvancedModelRenderer(this);
        this.topLegleft7.setRotationPoint(1.0F, -0.45F, 0.55F);
        this.body7.addChild(topLegleft7);
        this.setRotateAngle(topLegleft7, 0.0F, -0.3927F, -0.48F);
        this.topLegleft7.cubeList.add(new ModelBox(topLegleft7, 7, 33, -1.241F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft7.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 0.0F, -0.1745F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 6, 0.0F, -0.2F, 0.4F, 8, 1, 0, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft7.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 0.0F, -0.0436F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 2, 0.0F, -0.2F, 0.1F, 14, 1, 0, 0.0F, false));

        this.topLegright7 = new AdvancedModelRenderer(this);
        this.topLegright7.setRotationPoint(-1.0F, -0.45F, 0.55F);
        this.body7.addChild(topLegright7);
        this.setRotateAngle(topLegright7, 0.0F, 0.3927F, 0.48F);
        this.topLegright7.cubeList.add(new ModelBox(topLegright7, 7, 33, -0.759F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, true));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright7.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 0.0F, 0.1745F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 6, -8.0F, -0.2F, 0.4F, 8, 1, 0, 0.0F, true));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright7.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 0.0F, 0.0436F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 2, -14.0F, -0.2F, 0.1F, 14, 1, 0, 0.0F, true));

        this.bottomLegleft7 = new AdvancedModelRenderer(this);
        this.bottomLegleft7.setRotationPoint(1.0F, 0.75F, 0.55F);
        this.body7.addChild(bottomLegleft7);
        this.setRotateAngle(bottomLegleft7, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft7.cubeList.add(new ModelBox(bottomLegleft7, 24, 41, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft7.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.0F, -0.1745F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 39, 6, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft7.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 0.0F, -0.0087F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 39, 8, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright7 = new AdvancedModelRenderer(this);
        this.bottomLegright7.setRotationPoint(-1.0F, 0.75F, 0.55F);
        this.body7.addChild(bottomLegright7);
        this.setRotateAngle(bottomLegright7, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright7.cubeList.add(new ModelBox(bottomLegright7, 24, 41, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright7.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.0F, 0.1745F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 39, 6, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright7.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0087F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 39, 8, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.body8 = new AdvancedModelRenderer(this);
        this.body8.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body7.addChild(body8);
        this.body8.cubeList.add(new ModelBox(body8, 28, 25, -1.0F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 31, 33, -0.01F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body8.cubeList.add(new ModelBox(body8, 26, 33, -0.99F, -0.75F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft8 = new AdvancedModelRenderer(this);
        this.bottomLegleft8.setRotationPoint(1.0F, 0.75F, 0.6F);
        this.body8.addChild(bottomLegleft8);
        this.setRotateAngle(bottomLegleft8, 0.0F, 0.0F, 0.3054F);
        this.bottomLegleft8.cubeList.add(new ModelBox(bottomLegleft8, 19, 41, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft8.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, -0.1745F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 38, 22, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft8.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.0F, -0.0087F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 39, 4, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright8 = new AdvancedModelRenderer(this);
        this.bottomLegright8.setRotationPoint(-1.0F, 0.75F, 0.6F);
        this.body8.addChild(bottomLegright8);
        this.setRotateAngle(bottomLegright8, 0.0F, 0.0F, -0.3054F);
        this.bottomLegright8.cubeList.add(new ModelBox(bottomLegright8, 19, 41, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright8.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 0.1745F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 38, 22, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright8.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 0.0F, 0.0087F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 39, 4, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft8 = new AdvancedModelRenderer(this);
        this.topLegleft8.setRotationPoint(1.0F, -0.45F, 0.6F);
        this.body8.addChild(topLegleft8);
        this.setRotateAngle(topLegleft8, 0.0F, -0.576F, -0.48F);
        this.topLegleft8.cubeList.add(new ModelBox(topLegleft8, 0, 33, -1.241F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft8.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 0.0F, -0.1745F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 17, 8, 0.0F, -0.2F, 0.4F, 7, 1, 0, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft8.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 0.0F, -0.0436F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 0, 0.0F, -0.2F, 0.1F, 14, 1, 0, 0.0F, false));

        this.topLegright8 = new AdvancedModelRenderer(this);
        this.topLegright8.setRotationPoint(-1.0F, -0.45F, 0.6F);
        this.body8.addChild(topLegright8);
        this.setRotateAngle(topLegright8, 0.0F, 0.576F, 0.48F);
        this.topLegright8.cubeList.add(new ModelBox(topLegright8, 0, 33, -0.759F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright8.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 0.0F, 0.1745F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 17, 8, -7.0F, -0.2F, 0.4F, 7, 1, 0, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright8.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 0.0F, 0.0436F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 0, -14.0F, -0.2F, 0.1F, 14, 1, 0, 0.0F, true));

        this.body9 = new AdvancedModelRenderer(this);
        this.body9.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body8.addChild(body9);
        this.body9.cubeList.add(new ModelBox(body9, 21, 25, -1.0F, -0.75F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 21, 33, -0.01F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));
        this.body9.cubeList.add(new ModelBox(body9, 33, 20, -0.99F, -0.74F, 0.75F, 1, 2, 1, 0.0F, false));

        this.bottomLegleft9 = new AdvancedModelRenderer(this);
        this.bottomLegleft9.setRotationPoint(1.0F, 0.75F, 0.55F);
        this.body9.addChild(bottomLegleft9);
        this.setRotateAngle(bottomLegleft9, 0.0F, -0.1745F, 0.3054F);
        this.bottomLegleft9.cubeList.add(new ModelBox(bottomLegleft9, 30, 37, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft9.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 0.0F, -0.1745F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 35, 12, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r68 = new AdvancedModelRenderer(this);
        this.cube_r68.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft9.addChild(cube_r68);
        this.setRotateAngle(cube_r68, 0.0F, -0.0087F, 0.0F);
        this.cube_r68.cubeList.add(new ModelBox(cube_r68, 38, 20, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright9 = new AdvancedModelRenderer(this);
        this.bottomLegright9.setRotationPoint(-1.0F, 0.75F, 0.55F);
        this.body9.addChild(bottomLegright9);
        this.setRotateAngle(bottomLegright9, 0.0F, 0.1745F, -0.3054F);
        this.bottomLegright9.cubeList.add(new ModelBox(bottomLegright9, 30, 37, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r69 = new AdvancedModelRenderer(this);
        this.cube_r69.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright9.addChild(cube_r69);
        this.setRotateAngle(cube_r69, 0.0F, 0.1745F, 0.0F);
        this.cube_r69.cubeList.add(new ModelBox(cube_r69, 35, 12, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r70 = new AdvancedModelRenderer(this);
        this.cube_r70.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright9.addChild(cube_r70);
        this.setRotateAngle(cube_r70, 0.0F, 0.0087F, 0.0F);
        this.cube_r70.cubeList.add(new ModelBox(cube_r70, 38, 20, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft9 = new AdvancedModelRenderer(this);
        this.topLegleft9.setRotationPoint(1.0F, -0.45F, 0.55F);
        this.body9.addChild(topLegleft9);
        this.setRotateAngle(topLegleft9, 0.0F, -0.7941F, -0.48F);
        this.topLegleft9.cubeList.add(new ModelBox(topLegleft9, 32, 7, -1.241F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, false));

        this.cube_r71 = new AdvancedModelRenderer(this);
        this.cube_r71.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft9.addChild(cube_r71);
        this.setRotateAngle(cube_r71, 0.0F, -0.1745F, 0.0F);
        this.cube_r71.cubeList.add(new ModelBox(cube_r71, 17, 6, 0.0F, -0.2F, 0.4F, 7, 1, 0, 0.0F, false));

        this.cube_r72 = new AdvancedModelRenderer(this);
        this.cube_r72.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft9.addChild(cube_r72);
        this.setRotateAngle(cube_r72, 0.0F, -0.0436F, 0.0F);
        this.cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 4, 0.0F, -0.2F, 0.1F, 10, 1, 0, 0.0F, false));

        this.topLegright9 = new AdvancedModelRenderer(this);
        this.topLegright9.setRotationPoint(-1.0F, -0.45F, 0.55F);
        this.body9.addChild(topLegright9);
        this.setRotateAngle(topLegright9, 0.0F, 0.7941F, 0.48F);
        this.topLegright9.cubeList.add(new ModelBox(topLegright9, 32, 7, -0.759F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, true));

        this.cube_r73 = new AdvancedModelRenderer(this);
        this.cube_r73.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright9.addChild(cube_r73);
        this.setRotateAngle(cube_r73, 0.0F, 0.1745F, 0.0F);
        this.cube_r73.cubeList.add(new ModelBox(cube_r73, 17, 6, -7.0F, -0.2F, 0.4F, 7, 1, 0, 0.0F, true));

        this.cube_r74 = new AdvancedModelRenderer(this);
        this.cube_r74.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright9.addChild(cube_r74);
        this.setRotateAngle(cube_r74, 0.0F, 0.0436F, 0.0F);
        this.cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 4, -10.0F, -0.2F, 0.1F, 10, 1, 0, 0.0F, true));

        this.body10 = new AdvancedModelRenderer(this);
        this.body10.setRotationPoint(0.0F, 0.0F, 1.75F);
        this.body9.addChild(body10);
        this.body10.cubeList.add(new ModelBox(body10, 14, 25, -1.0F, -0.76F, 0.0F, 2, 2, 1, 0.0F, false));
        this.body10.cubeList.add(new ModelBox(body10, 45, 11, -0.5F, -0.75F, 0.75F, 1, 1, 1, 0.0F, false));

        this.bottomLegleft10 = new AdvancedModelRenderer(this);
        this.bottomLegleft10.setRotationPoint(0.6F, 0.75F, 0.5F);
        this.body10.addChild(bottomLegleft10);
        this.setRotateAngle(bottomLegleft10, 0.0F, -0.6981F, 0.3054F);
        this.bottomLegleft10.cubeList.add(new ModelBox(bottomLegleft10, 41, 32, -0.241F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r75 = new AdvancedModelRenderer(this);
        this.cube_r75.setRotationPoint(0.659F, 0.2289F, 0.1F);
        this.bottomLegleft10.addChild(cube_r75);
        this.setRotateAngle(cube_r75, 0.0F, -0.1745F, 0.0F);
        this.cube_r75.cubeList.add(new ModelBox(cube_r75, 32, 10, -0.1531F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, false));

        this.cube_r76 = new AdvancedModelRenderer(this);
        this.cube_r76.setRotationPoint(0.659F, -0.0711F, -0.3F);
        this.bottomLegleft10.addChild(cube_r76);
        this.setRotateAngle(cube_r76, 0.0F, -0.0087F, 0.0F);
        this.cube_r76.cubeList.add(new ModelBox(cube_r76, 33, 14, 0.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, false));

        this.bottomLegright10 = new AdvancedModelRenderer(this);
        this.bottomLegright10.setRotationPoint(-0.6F, 0.75F, 0.5F);
        this.body10.addChild(bottomLegright10);
        this.setRotateAngle(bottomLegright10, 0.0F, 0.6981F, -0.3054F);
        this.bottomLegright10.cubeList.add(new ModelBox(bottomLegright10, 41, 32, -0.759F, -0.5711F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r77 = new AdvancedModelRenderer(this);
        this.cube_r77.setRotationPoint(-0.659F, 0.2289F, 0.1F);
        this.bottomLegright10.addChild(cube_r77);
        this.setRotateAngle(cube_r77, 0.0F, 0.1745F, 0.0F);
        this.cube_r77.cubeList.add(new ModelBox(cube_r77, 32, 10, -2.8469F, -0.8F, 0.0304F, 3, 1, 0, 0.0F, true));

        this.cube_r78 = new AdvancedModelRenderer(this);
        this.cube_r78.setRotationPoint(-0.659F, -0.0711F, -0.3F);
        this.bottomLegright10.addChild(cube_r78);
        this.setRotateAngle(cube_r78, 0.0F, 0.0087F, 0.0F);
        this.cube_r78.cubeList.add(new ModelBox(cube_r78, 33, 14, -3.0F, -0.5F, 0.1F, 3, 1, 0, 0.0F, true));

        this.topLegleft10 = new AdvancedModelRenderer(this);
        this.topLegleft10.setRotationPoint(1.0F, -0.45F, 0.8F);
        this.body10.addChild(topLegleft10);
        this.setRotateAngle(topLegleft10, 0.0F, -1.0123F, -0.48F);
        this.topLegleft10.cubeList.add(new ModelBox(topLegleft10, 32, 4, -1.241F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, false));

        this.cube_r79 = new AdvancedModelRenderer(this);
        this.cube_r79.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft10.addChild(cube_r79);
        this.setRotateAngle(cube_r79, 0.0F, -0.1745F, 0.0F);
        this.cube_r79.cubeList.add(new ModelBox(cube_r79, 24, 14, 0.0F, -0.2F, 0.4F, 4, 1, 0, 0.0F, false));

        this.cube_r80 = new AdvancedModelRenderer(this);
        this.cube_r80.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft10.addChild(cube_r80);
        this.setRotateAngle(cube_r80, 0.0F, -0.0436F, 0.0F);
        this.cube_r80.cubeList.add(new ModelBox(cube_r80, 0, 17, 0.0F, -0.2F, 0.1F, 7, 1, 0, 0.0F, false));

        this.topLegright10 = new AdvancedModelRenderer(this);
        this.topLegright10.setRotationPoint(-1.0F, -0.45F, 0.8F);
        this.body10.addChild(topLegright10);
        this.setRotateAngle(topLegright10, 0.0F, 1.0123F, 0.48F);
        this.topLegright10.cubeList.add(new ModelBox(topLegright10, 32, 4, -0.759F, -0.4289F, -0.55F, 2, 1, 1, 0.0F, true));

        this.cube_r81 = new AdvancedModelRenderer(this);
        this.cube_r81.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright10.addChild(cube_r81);
        this.setRotateAngle(cube_r81, 0.0F, 0.1745F, 0.0F);
        this.cube_r81.cubeList.add(new ModelBox(cube_r81, 24, 14, -4.0F, -0.2F, 0.4F, 4, 1, 0, 0.0F, true));

        this.cube_r82 = new AdvancedModelRenderer(this);
        this.cube_r82.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright10.addChild(cube_r82);
        this.setRotateAngle(cube_r82, 0.0F, 0.0436F, 0.0F);
        this.cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 17, -7.0F, -0.2F, 0.1F, 7, 1, 0, 0.0F, true));

        this.topLegleft11 = new AdvancedModelRenderer(this);
        this.topLegleft11.setRotationPoint(0.3F, -0.45F, 0.7F);
        this.body10.addChild(topLegleft11);
        this.setRotateAngle(topLegleft11, 0.0F, -1.3614F, -0.48F);
        this.topLegleft11.cubeList.add(new ModelBox(topLegleft11, 0, 45, -0.241F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, false));

        this.cube_r83 = new AdvancedModelRenderer(this);
        this.cube_r83.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft11.addChild(cube_r83);
        this.setRotateAngle(cube_r83, 0.0F, -0.1745F, 0.0F);
        this.cube_r83.cubeList.add(new ModelBox(cube_r83, 24, 19, 0.0F, -0.2F, 0.4F, 2, 1, 0, 0.0F, false));

        this.cube_r84 = new AdvancedModelRenderer(this);
        this.cube_r84.setRotationPoint(0.659F, -0.2289F, -0.3F);
        this.topLegleft11.addChild(cube_r84);
        this.setRotateAngle(cube_r84, 0.0F, -0.0436F, 0.0F);
        this.cube_r84.cubeList.add(new ModelBox(cube_r84, 11, 21, 0.0F, -0.2F, 0.1F, 5, 1, 0, 0.0F, false));

        this.topLegright11 = new AdvancedModelRenderer(this);
        this.topLegright11.setRotationPoint(-0.3F, -0.45F, 0.7F);
        this.body10.addChild(topLegright11);
        this.setRotateAngle(topLegright11, 0.0F, 1.3614F, 0.48F);
        this.topLegright11.cubeList.add(new ModelBox(topLegright11, 0, 45, -0.759F, -0.4289F, -0.55F, 1, 1, 1, 0.0F, true));

        this.cube_r85 = new AdvancedModelRenderer(this);
        this.cube_r85.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright11.addChild(cube_r85);
        this.setRotateAngle(cube_r85, 0.0F, 0.1745F, 0.0F);
        this.cube_r85.cubeList.add(new ModelBox(cube_r85, 24, 19, -2.0F, -0.2F, 0.4F, 2, 1, 0, 0.0F, true));

        this.cube_r86 = new AdvancedModelRenderer(this);
        this.cube_r86.setRotationPoint(-0.659F, -0.2289F, -0.3F);
        this.topLegright11.addChild(cube_r86);
        this.setRotateAngle(cube_r86, 0.0F, 0.0436F, 0.0F);
        this.cube_r86.cubeList.add(new ModelBox(cube_r86, 11, 21, -5.0F, -0.2F, 0.1F, 5, 1, 0, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.head.render(f5 * 0.25F);
        this.head.render(f5);
    }
    public void renderStaticDisplayCase(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body7, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body8, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body9, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body10, 0.0F, 0.0F, 0.0F);
        this.head.offsetZ = -0.02F;
        this.head.offsetY = -0.2F;
        this.head.render(0.01F);
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body6, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body7, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(body8, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body9, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(body10, 0.0F, 0.0F, 0.0F);
        this.head.offsetY = -0.05F;
        this.head.render(0.01F);
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.head.offsetY = 1.17F;
        //this.gill.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.gill.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.body5, this.body6, this.body7, this.body8, this.body9, this.body10};
        AdvancedModelRenderer[] legsL = {this.headLegLeft, this.bottomLegleft, this.bottomLegleft2, this.bottomLegleft3, this.bottomLegleft4, this.bottomLegleft5, this.bottomLegleft6, this.bottomLegleft7, this.bottomLegleft8, this.bottomLegleft9, this.bottomLegleft10};
        AdvancedModelRenderer[] legsR = {this.headLegRight, this.bottomLegright, this.bottomLegright2, this.bottomLegright3, this.bottomLegright4, this.bottomLegright5, this.bottomLegright6, this.bottomLegright7, this.bottomLegright8, this.bottomLegright9, this.bottomLegright10};
        float speed = 0.17F;
        if (!e.isInWater()) {
            speed = 0.2F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            if(e.isInWater()) {

                this.chainWave(fishTail, speed, 0.01F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.05F, -6, f2, 5F);
                this.chainSwing(legsL, speed, 0.1F, -3, f2, 0.7F);
                this.chainSwing(legsR, speed, 0.1F, -3, f2, 0.7F);
                this.walk(appendageleft, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
                this.walk(appendageright, speed, 0.5F, false, 0, -0.5F, f2, 0.3F);
                this.swing(head, speed, 0.4F, true, 0, 0, f2, 1);
            }else  {
                this.chainSwing(fishTail, speed, 0.1F, -3, f2, 3F);
                //this.head.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.07F;
                this.bob(head, -speed, 5F, false, f2, 1);
            }
        }
    }
}
