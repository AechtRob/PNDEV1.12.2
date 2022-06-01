package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDiania;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDiania extends AdvancedModelBase {
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer leg1;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer legpiece1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer legpiecee1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer leg2;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer legpiece2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer legpiecee2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer back;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leg9;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer legpiece9;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer legpiecee9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer leg10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer legpiece10;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer legpiecee10;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer back2;
    private final AdvancedModelRenderer leg11;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer legpiece11;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer legpiecee11;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leg12;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer legpiece12;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer legpiecee12;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer back3;
    private final AdvancedModelRenderer leg7;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer legpiece7;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer legpiecee7;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer leg8;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer legpiece8;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer legpiecee8;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer back4;
    private final AdvancedModelRenderer leg19;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer legpiece19;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer legpiecee19;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer leg20;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer legpiece20;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer legpiecee20;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer back5;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer leg13;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer legpiece13;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer legpiecee13;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer leg14;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer legpiece14;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer legpiecee14;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leg3;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer legpiece3;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer legpiecee3;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer leg4;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer legpiece4;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer legpiecee4;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer leg5;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer legpiece5;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer legpiecee5;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer leg6;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer legpiece6;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer legpiecee6;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer leg15;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer legpiece15;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer legpiecee15;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer leg16;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer legpiece16;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer legpiecee16;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer leg17;
    private final AdvancedModelRenderer cube_r62;
    private final AdvancedModelRenderer legpiece17;
    private final AdvancedModelRenderer cube_r63;
    private final AdvancedModelRenderer legpiecee17;
    private final AdvancedModelRenderer cube_r64;
    private final AdvancedModelRenderer leg18;
    private final AdvancedModelRenderer cube_r65;
    private final AdvancedModelRenderer legpiece18;
    private final AdvancedModelRenderer cube_r66;
    private final AdvancedModelRenderer legpiecee18;
    private final AdvancedModelRenderer cube_r67;
    private final AdvancedModelRenderer tentacleL;
    private final AdvancedModelRenderer tentacleL2;

    private ModelAnimator animator;

    public ModelDiania() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.bone.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 32, 0, -1.99F, -2.01F, -4.0F, 4, 4, 8, 0.0F, false));

        this.leg1 = new AdvancedModelRenderer(this);
        this.leg1.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.body.addChild(leg1);
        this.setRotateAngle(leg1, 0.0F, 0.0F, 0.1309F);
        this.leg1.cubeList.add(new ModelBox(leg1, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg1.cubeList.add(new ModelBox(leg1, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg1.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece1 = new AdvancedModelRenderer(this);
        this.legpiece1.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg1.addChild(legpiece1);
        this.setRotateAngle(legpiece1, 0.0F, 0.0F, 0.2618F);
        this.legpiece1.cubeList.add(new ModelBox(legpiece1, 32, 16, 0.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, false));
        this.legpiece1.cubeList.add(new ModelBox(legpiece1, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece1.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee1 = new AdvancedModelRenderer(this);
        this.legpiecee1.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece1.addChild(legpiecee1);
        this.setRotateAngle(legpiecee1, 0.0F, 0.0F, 0.4363F);
        this.legpiecee1.cubeList.add(new ModelBox(legpiecee1, 32, 28, 0.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee1.cubeList.add(new ModelBox(legpiecee1, 16, 0, 0.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 1.5708F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg2 = new AdvancedModelRenderer(this);
        this.leg2.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.body.addChild(leg2);
        this.setRotateAngle(leg2, 0.0F, 0.0F, -0.1309F);
        this.leg2.cubeList.add(new ModelBox(leg2, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg2.cubeList.add(new ModelBox(leg2, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg2.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.5708F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece2 = new AdvancedModelRenderer(this);
        this.legpiece2.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg2.addChild(legpiece2);
        this.setRotateAngle(legpiece2, 0.0F, 0.0F, -0.2618F);
        this.legpiece2.cubeList.add(new ModelBox(legpiece2, 32, 16, -6.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, true));
        this.legpiece2.cubeList.add(new ModelBox(legpiece2, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 1.5708F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee2 = new AdvancedModelRenderer(this);
        this.legpiecee2.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece2.addChild(legpiecee2);
        this.setRotateAngle(legpiecee2, 0.0F, 0.0F, -0.4363F);
        this.legpiecee2.cubeList.add(new ModelBox(legpiecee2, 32, 28, -6.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, true));
        this.legpiecee2.cubeList.add(new ModelBox(legpiecee2, 16, 0, -6.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.5708F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.back = new AdvancedModelRenderer(this);
        this.back.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.body.addChild(back);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.0F, 4.0F);
        this.back.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 3.1416F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 4, -2.0F, -4.0F, -4.0F, 4, 4, 8, 0.0F, false));

        this.leg9 = new AdvancedModelRenderer(this);
        this.leg9.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.back.addChild(leg9);
        this.setRotateAngle(leg9, 0.0F, 0.0F, 0.1309F);
        this.leg9.cubeList.add(new ModelBox(leg9, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg9.cubeList.add(new ModelBox(leg9, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg9.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.5708F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece9 = new AdvancedModelRenderer(this);
        this.legpiece9.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg9.addChild(legpiece9);
        this.setRotateAngle(legpiece9, 0.0F, 0.0F, 0.2618F);
        this.legpiece9.cubeList.add(new ModelBox(legpiece9, 32, 16, 0.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, false));
        this.legpiece9.cubeList.add(new ModelBox(legpiece9, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece9.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.5708F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee9 = new AdvancedModelRenderer(this);
        this.legpiecee9.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece9.addChild(legpiecee9);
        this.setRotateAngle(legpiecee9, 0.0F, 0.0F, 0.4363F);
        this.legpiecee9.cubeList.add(new ModelBox(legpiecee9, 32, 28, 0.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee9.cubeList.add(new ModelBox(legpiecee9, 16, 0, 0.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee9.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 1.5708F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg10 = new AdvancedModelRenderer(this);
        this.leg10.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.back.addChild(leg10);
        this.setRotateAngle(leg10, 0.0F, 0.0F, -0.1309F);
        this.leg10.cubeList.add(new ModelBox(leg10, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg10.cubeList.add(new ModelBox(leg10, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg10.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 1.5708F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece10 = new AdvancedModelRenderer(this);
        this.legpiece10.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg10.addChild(legpiece10);
        this.setRotateAngle(legpiece10, 0.0F, 0.0F, -0.2618F);
        this.legpiece10.cubeList.add(new ModelBox(legpiece10, 32, 16, -6.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, true));
        this.legpiece10.cubeList.add(new ModelBox(legpiece10, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece10.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.5708F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee10 = new AdvancedModelRenderer(this);
        this.legpiecee10.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece10.addChild(legpiecee10);
        this.setRotateAngle(legpiecee10, 0.0F, 0.0F, -0.4363F);
        this.legpiecee10.cubeList.add(new ModelBox(legpiecee10, 32, 28, -6.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, true));
        this.legpiecee10.cubeList.add(new ModelBox(legpiecee10, 16, 0, -6.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee10.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.5708F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.back2 = new AdvancedModelRenderer(this);
        this.back2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.back.addChild(back2);
        this.back2.cubeList.add(new ModelBox(back2, 0, 12, -1.99F, -2.01F, 0.0F, 4, 4, 8, 0.0F, false));

        this.leg11 = new AdvancedModelRenderer(this);
        this.leg11.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.back2.addChild(leg11);
        this.setRotateAngle(leg11, 0.0F, 0.0F, 0.1309F);
        this.leg11.cubeList.add(new ModelBox(leg11, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg11.cubeList.add(new ModelBox(leg11, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg11.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 1.5708F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece11 = new AdvancedModelRenderer(this);
        this.legpiece11.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg11.addChild(legpiece11);
        this.setRotateAngle(legpiece11, 0.0F, 0.0F, 0.2618F);
        this.legpiece11.cubeList.add(new ModelBox(legpiece11, 32, 16, 0.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, false));
        this.legpiece11.cubeList.add(new ModelBox(legpiece11, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece11.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 1.5708F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee11 = new AdvancedModelRenderer(this);
        this.legpiecee11.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece11.addChild(legpiecee11);
        this.setRotateAngle(legpiecee11, 0.0F, 0.0F, 0.4363F);
        this.legpiecee11.cubeList.add(new ModelBox(legpiecee11, 32, 28, 0.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee11.cubeList.add(new ModelBox(legpiecee11, 16, 0, 0.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee11.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 1.5708F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg12 = new AdvancedModelRenderer(this);
        this.leg12.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.back2.addChild(leg12);
        this.setRotateAngle(leg12, 0.0F, 0.0F, -0.1309F);
        this.leg12.cubeList.add(new ModelBox(leg12, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg12.cubeList.add(new ModelBox(leg12, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg12.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 1.5708F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece12 = new AdvancedModelRenderer(this);
        this.legpiece12.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg12.addChild(legpiece12);
        this.setRotateAngle(legpiece12, 0.0F, 0.0F, -0.2618F);
        this.legpiece12.cubeList.add(new ModelBox(legpiece12, 32, 16, -6.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, true));
        this.legpiece12.cubeList.add(new ModelBox(legpiece12, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece12.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 1.5708F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee12 = new AdvancedModelRenderer(this);
        this.legpiecee12.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece12.addChild(legpiecee12);
        this.setRotateAngle(legpiecee12, 0.0F, 0.0F, -0.4363F);
        this.legpiecee12.cubeList.add(new ModelBox(legpiecee12, 32, 28, -6.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, true));
        this.legpiecee12.cubeList.add(new ModelBox(legpiecee12, 16, 0, -6.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee12.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 1.5708F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.back3 = new AdvancedModelRenderer(this);
        this.back3.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.back2.addChild(back3);
        this.back3.cubeList.add(new ModelBox(back3, 0, 12, -2.0F, -2.0F, 0.0F, 4, 4, 8, 0.0F, false));

        this.leg7 = new AdvancedModelRenderer(this);
        this.leg7.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.back3.addChild(leg7);
        this.setRotateAngle(leg7, 0.0F, 0.0F, 0.1309F);
        this.leg7.cubeList.add(new ModelBox(leg7, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg7.cubeList.add(new ModelBox(leg7, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg7.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.5708F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece7 = new AdvancedModelRenderer(this);
        this.legpiece7.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg7.addChild(legpiece7);
        this.setRotateAngle(legpiece7, 0.0F, 0.0F, 0.2618F);
        this.legpiece7.cubeList.add(new ModelBox(legpiece7, 32, 16, 0.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, false));
        this.legpiece7.cubeList.add(new ModelBox(legpiece7, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece7.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.5708F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee7 = new AdvancedModelRenderer(this);
        this.legpiecee7.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece7.addChild(legpiecee7);
        this.setRotateAngle(legpiecee7, 0.0F, 0.0F, 0.4363F);
        this.legpiecee7.cubeList.add(new ModelBox(legpiecee7, 32, 28, 0.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee7.cubeList.add(new ModelBox(legpiecee7, 16, 0, 0.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee7.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.5708F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg8 = new AdvancedModelRenderer(this);
        this.leg8.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.back3.addChild(leg8);
        this.setRotateAngle(leg8, 0.0F, 0.0F, -0.1309F);
        this.leg8.cubeList.add(new ModelBox(leg8, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg8.cubeList.add(new ModelBox(leg8, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg8.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 1.5708F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece8 = new AdvancedModelRenderer(this);
        this.legpiece8.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg8.addChild(legpiece8);
        this.setRotateAngle(legpiece8, 0.0F, 0.0F, -0.2618F);
        this.legpiece8.cubeList.add(new ModelBox(legpiece8, 32, 16, -6.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, true));
        this.legpiece8.cubeList.add(new ModelBox(legpiece8, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece8.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.5708F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee8 = new AdvancedModelRenderer(this);
        this.legpiecee8.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece8.addChild(legpiecee8);
        this.setRotateAngle(legpiecee8, 0.0F, 0.0F, -0.4363F);
        this.legpiecee8.cubeList.add(new ModelBox(legpiecee8, 32, 28, -6.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, true));
        this.legpiecee8.cubeList.add(new ModelBox(legpiecee8, 16, 0, -6.0F, 0.0F, -1.0F, 6, 2, 2, 0.0F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee8.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.5708F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.back4 = new AdvancedModelRenderer(this);
        this.back4.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.back3.addChild(back4);
        this.back4.cubeList.add(new ModelBox(back4, 0, 0, -1.99F, -2.01F, 0.0F, 4, 4, 8, 0.0F, false));

        this.leg19 = new AdvancedModelRenderer(this);
        this.leg19.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.back4.addChild(leg19);
        this.setRotateAngle(leg19, 0.0F, 0.0F, 0.1745F);
        this.leg19.cubeList.add(new ModelBox(leg19, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg19.cubeList.add(new ModelBox(leg19, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg19.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.5708F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece19 = new AdvancedModelRenderer(this);
        this.legpiece19.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg19.addChild(legpiece19);
        this.setRotateAngle(legpiece19, 0.0F, 0.0F, 0.3491F);
        this.legpiece19.cubeList.add(new ModelBox(legpiece19, 32, 16, 0.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, false));
        this.legpiece19.cubeList.add(new ModelBox(legpiece19, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece19.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 1.5708F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee19 = new AdvancedModelRenderer(this);
        this.legpiecee19.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece19.addChild(legpiecee19);
        this.setRotateAngle(legpiecee19, 0.0F, 0.0F, 0.5236F);
        this.legpiecee19.cubeList.add(new ModelBox(legpiecee19, 32, 28, -1.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee19.cubeList.add(new ModelBox(legpiecee19, 16, 0, 0.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee19.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 1.5708F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 28, -1.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg20 = new AdvancedModelRenderer(this);
        this.leg20.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.back4.addChild(leg20);
        this.setRotateAngle(leg20, 0.0F, 0.0F, -0.1745F);
        this.leg20.cubeList.add(new ModelBox(leg20, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg20.cubeList.add(new ModelBox(leg20, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg20.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 1.5708F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece20 = new AdvancedModelRenderer(this);
        this.legpiece20.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg20.addChild(legpiece20);
        this.setRotateAngle(legpiece20, 0.0F, 0.0F, -0.3491F);
        this.legpiece20.cubeList.add(new ModelBox(legpiece20, 32, 16, -6.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, true));
        this.legpiece20.cubeList.add(new ModelBox(legpiece20, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece20.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 1.5708F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee20 = new AdvancedModelRenderer(this);
        this.legpiecee20.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece20.addChild(legpiecee20);
        this.setRotateAngle(legpiecee20, 0.0F, 0.0F, -0.5236F);
        this.legpiecee20.cubeList.add(new ModelBox(legpiecee20, 32, 28, -5.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, true));
        this.legpiecee20.cubeList.add(new ModelBox(legpiecee20, 16, 0, -5.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee20.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 1.5708F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 32, 28, -5.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.back5 = new AdvancedModelRenderer(this);
        this.back5.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.back4.addChild(back5);
        this.back5.cubeList.add(new ModelBox(back5, 5, 17, -1.5F, -1.5F, 5.0F, 3, 3, 3, 0.0F, false));
        this.back5.cubeList.add(new ModelBox(back5, 3, 3, -2.0F, -2.0F, 0.0F, 4, 4, 5, 0.0F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(-2.0F, 0.0F, -47.0F);
        this.back5.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -3.1416F, 0.0F, 3.1416F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -3.0F, -1.0F, -58.0F, 2, 2, 1, 0.0F, false));
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -3.0F, -1.0F, -57.0F, 2, 2, 1, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 2.0F, -54.0F);
        this.back5.addChild(cube_r33);
        this.setRotateAngle(cube_r33, 0.0F, 3.1416F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 0, -1.0F, -3.0F, -63.0F, 2, 2, 1, 0.0F, false));

        this.leg13 = new AdvancedModelRenderer(this);
        this.leg13.setRotationPoint(2.0F, 0.0F, 3.0F);
        this.back5.addChild(leg13);
        this.setRotateAngle(leg13, 0.0F, 0.0F, 0.1745F);
        this.leg13.cubeList.add(new ModelBox(leg13, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg13.cubeList.add(new ModelBox(leg13, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg13.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 1.5708F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece13 = new AdvancedModelRenderer(this);
        this.legpiece13.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg13.addChild(legpiece13);
        this.setRotateAngle(legpiece13, 0.0F, 0.0F, 0.3491F);
        this.legpiece13.cubeList.add(new ModelBox(legpiece13, 32, 16, 0.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, false));
        this.legpiece13.cubeList.add(new ModelBox(legpiece13, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece13.addChild(cube_r35);
        this.setRotateAngle(cube_r35, 1.5708F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee13 = new AdvancedModelRenderer(this);
        this.legpiecee13.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece13.addChild(legpiecee13);
        this.setRotateAngle(legpiecee13, 0.0F, 0.0F, 0.5236F);
        this.legpiecee13.cubeList.add(new ModelBox(legpiecee13, 32, 28, -1.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee13.cubeList.add(new ModelBox(legpiecee13, 16, 0, 0.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee13.addChild(cube_r36);
        this.setRotateAngle(cube_r36, 1.5708F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 32, 28, -1.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg14 = new AdvancedModelRenderer(this);
        this.leg14.setRotationPoint(-2.0F, 0.0F, 3.0F);
        this.back5.addChild(leg14);
        this.setRotateAngle(leg14, 0.0F, 0.0F, -0.1745F);
        this.leg14.cubeList.add(new ModelBox(leg14, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg14.cubeList.add(new ModelBox(leg14, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg14.addChild(cube_r37);
        this.setRotateAngle(cube_r37, 1.5708F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece14 = new AdvancedModelRenderer(this);
        this.legpiece14.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg14.addChild(legpiece14);
        this.setRotateAngle(legpiece14, 0.0F, 0.0F, -0.3491F);
        this.legpiece14.cubeList.add(new ModelBox(legpiece14, 32, 16, -6.0F, -0.01F, -0.99F, 6, 2, 2, 0.0F, true));
        this.legpiece14.cubeList.add(new ModelBox(legpiece14, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece14.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 1.5708F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee14 = new AdvancedModelRenderer(this);
        this.legpiecee14.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece14.addChild(legpiecee14);
        this.setRotateAngle(legpiecee14, 0.0F, 0.0F, -0.5236F);
        this.legpiecee14.cubeList.add(new ModelBox(legpiecee14, 32, 28, -5.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, true));
        this.legpiecee14.cubeList.add(new ModelBox(legpiecee14, 16, 0, -5.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee14.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 1.5708F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 32, 28, -5.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 16, 28, -2.0F, -2.0F, -8.0F, 4, 4, 8, 0.0F, false));

        this.leg3 = new AdvancedModelRenderer(this);
        this.leg3.setRotationPoint(2.0F, 0.0F, -5.0F);
        this.body2.addChild(leg3);
        this.setRotateAngle(leg3, 0.0F, 0.0F, 0.1745F);
        this.leg3.cubeList.add(new ModelBox(leg3, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg3.cubeList.add(new ModelBox(leg3, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg3.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 1.5708F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece3 = new AdvancedModelRenderer(this);
        this.legpiece3.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg3.addChild(legpiece3);
        this.setRotateAngle(legpiece3, 0.0F, 0.0F, 0.3491F);
        this.legpiece3.cubeList.add(new ModelBox(legpiece3, 32, 16, 0.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, false));
        this.legpiece3.cubeList.add(new ModelBox(legpiece3, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece3.addChild(cube_r41);
        this.setRotateAngle(cube_r41, 1.5708F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee3 = new AdvancedModelRenderer(this);
        this.legpiecee3.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece3.addChild(legpiecee3);
        this.setRotateAngle(legpiecee3, 0.0F, 0.0F, 0.5236F);
        this.legpiecee3.cubeList.add(new ModelBox(legpiecee3, 32, 28, -1.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee3.cubeList.add(new ModelBox(legpiecee3, 16, 0, 0.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee3.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 1.5708F, 0.0F, 0.0F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 32, 28, -1.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg4 = new AdvancedModelRenderer(this);
        this.leg4.setRotationPoint(-2.0F, 0.0F, -5.0F);
        this.body2.addChild(leg4);
        this.setRotateAngle(leg4, 0.0F, 0.0F, -0.1745F);
        this.leg4.cubeList.add(new ModelBox(leg4, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg4.cubeList.add(new ModelBox(leg4, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg4.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 1.5708F, 0.0F, 0.0F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece4 = new AdvancedModelRenderer(this);
        this.legpiece4.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg4.addChild(legpiece4);
        this.setRotateAngle(legpiece4, 0.0F, 0.0F, -0.3491F);
        this.legpiece4.cubeList.add(new ModelBox(legpiece4, 32, 16, -6.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, true));
        this.legpiece4.cubeList.add(new ModelBox(legpiece4, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece4.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 1.5708F, 0.0F, 0.0F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee4 = new AdvancedModelRenderer(this);
        this.legpiecee4.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece4.addChild(legpiecee4);
        this.setRotateAngle(legpiecee4, 0.0F, 0.0F, -0.5236F);
        this.legpiecee4.cubeList.add(new ModelBox(legpiecee4, 32, 28, -5.0F, -1.0F, 0.0F, 5, 4, 0, 0.0F, true));
        this.legpiecee4.cubeList.add(new ModelBox(legpiecee4, 16, 0, -5.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee4.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 1.5708F, 0.0F, 0.0F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 32, 28, -5.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 24, -1.99F, -2.01F, -8.0F, 4, 4, 8, 0.0F, false));

        this.leg5 = new AdvancedModelRenderer(this);
        this.leg5.setRotationPoint(2.0F, 0.0F, -5.0F);
        this.body3.addChild(leg5);
        this.setRotateAngle(leg5, 0.0F, 0.1309F, 0.1745F);
        this.leg5.cubeList.add(new ModelBox(leg5, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg5.cubeList.add(new ModelBox(leg5, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg5.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 1.5708F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece5 = new AdvancedModelRenderer(this);
        this.legpiece5.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg5.addChild(legpiece5);
        this.setRotateAngle(legpiece5, 0.0F, 0.0F, 0.3491F);
        this.legpiece5.cubeList.add(new ModelBox(legpiece5, 32, 16, 0.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, false));
        this.legpiece5.cubeList.add(new ModelBox(legpiece5, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece5.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 1.5708F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee5 = new AdvancedModelRenderer(this);
        this.legpiecee5.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece5.addChild(legpiecee5);
        this.setRotateAngle(legpiecee5, 0.0F, 0.0F, 0.5236F);
        this.legpiecee5.cubeList.add(new ModelBox(legpiecee5, 32, 28, -1.0F, -1.0F, 0.0F, 6, 4, 0, 0.0F, false));
        this.legpiecee5.cubeList.add(new ModelBox(legpiecee5, 16, 0, 0.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee5.addChild(cube_r48);
        this.setRotateAngle(cube_r48, 1.5708F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 32, 28, -1.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.leg6 = new AdvancedModelRenderer(this);
        this.leg6.setRotationPoint(-2.0F, 0.0F, -5.0F);
        this.body3.addChild(leg6);
        this.setRotateAngle(leg6, 0.0F, -0.1309F, -0.1745F);
        this.leg6.cubeList.add(new ModelBox(leg6, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg6.cubeList.add(new ModelBox(leg6, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg6.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 1.5708F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece6 = new AdvancedModelRenderer(this);
        this.legpiece6.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg6.addChild(legpiece6);
        this.setRotateAngle(legpiece6, 0.0F, 0.0F, -0.3491F);
        this.legpiece6.cubeList.add(new ModelBox(legpiece6, 32, 16, -6.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, true));
        this.legpiece6.cubeList.add(new ModelBox(legpiece6, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece6.addChild(cube_r50);
        this.setRotateAngle(cube_r50, 1.5708F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee6 = new AdvancedModelRenderer(this);
        this.legpiecee6.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece6.addChild(legpiecee6);
        this.setRotateAngle(legpiecee6, 0.0F, 0.0F, -0.5236F);
        this.legpiecee6.cubeList.add(new ModelBox(legpiecee6, 32, 28, -5.0F, -1.0F, 0.0F, 5, 4, 0, 0.0F, true));
        this.legpiecee6.cubeList.add(new ModelBox(legpiecee6, 16, 0, -5.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee6.addChild(cube_r51);
        this.setRotateAngle(cube_r51, 1.5708F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 32, 28, -5.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 24, -2.0F, -2.0F, -8.0F, 4, 4, 8, 0.0F, false));

        this.leg15 = new AdvancedModelRenderer(this);
        this.leg15.setRotationPoint(2.0F, 0.0F, -5.0F);
        this.body4.addChild(leg15);
        this.setRotateAngle(leg15, 0.0F, 0.2618F, 0.1745F);
        this.leg15.cubeList.add(new ModelBox(leg15, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg15.cubeList.add(new ModelBox(leg15, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg15.addChild(cube_r52);
        this.setRotateAngle(cube_r52, 1.5708F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece15 = new AdvancedModelRenderer(this);
        this.legpiece15.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg15.addChild(legpiece15);
        this.setRotateAngle(legpiece15, 0.0F, 0.0F, 0.3491F);
        this.legpiece15.cubeList.add(new ModelBox(legpiece15, 32, 16, 0.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, false));
        this.legpiece15.cubeList.add(new ModelBox(legpiece15, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece15.addChild(cube_r53);
        this.setRotateAngle(cube_r53, 1.5708F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee15 = new AdvancedModelRenderer(this);
        this.legpiecee15.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece15.addChild(legpiecee15);
        this.setRotateAngle(legpiecee15, 0.0F, 0.0F, 0.5236F);
        this.legpiecee15.cubeList.add(new ModelBox(legpiecee15, 32, 28, 0.0F, -1.0F, 0.0F, 5, 4, 0, 0.0F, false));
        this.legpiecee15.cubeList.add(new ModelBox(legpiecee15, 16, 0, 0.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee15.addChild(cube_r54);
        this.setRotateAngle(cube_r54, 1.5708F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 32, 28, 0.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, false));

        this.leg16 = new AdvancedModelRenderer(this);
        this.leg16.setRotationPoint(-2.0F, 0.0F, -5.0F);
        this.body4.addChild(leg16);
        this.setRotateAngle(leg16, 0.0F, -0.2618F, -0.1745F);
        this.leg16.cubeList.add(new ModelBox(leg16, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg16.cubeList.add(new ModelBox(leg16, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg16.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 1.5708F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece16 = new AdvancedModelRenderer(this);
        this.legpiece16.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg16.addChild(legpiece16);
        this.setRotateAngle(legpiece16, 0.0F, 0.0F, -0.3491F);
        this.legpiece16.cubeList.add(new ModelBox(legpiece16, 32, 16, -6.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, true));
        this.legpiece16.cubeList.add(new ModelBox(legpiece16, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece16.addChild(cube_r56);
        this.setRotateAngle(cube_r56, 1.5708F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee16 = new AdvancedModelRenderer(this);
        this.legpiecee16.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece16.addChild(legpiecee16);
        this.setRotateAngle(legpiecee16, 0.0F, 0.0F, -0.5236F);
        this.legpiecee16.cubeList.add(new ModelBox(legpiecee16, 32, 28, -5.0F, -1.0F, 0.0F, 5, 4, 0, 0.0F, true));
        this.legpiecee16.cubeList.add(new ModelBox(legpiecee16, 16, 0, -5.0F, 0.0F, -1.0F, 5, 2, 2, 0.0F, true));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee16.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 1.5708F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 32, 28, -5.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, true));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.body4.addChild(body5);
        this.body5.cubeList.add(new ModelBox(body5, 0, 55, -2.0F, -1.5F, -13.0F, 4, 3, 4, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 3, 16, -1.5F, -1.5F, -5.0F, 3, 3, 5, 0.0F, false));
        this.body5.cubeList.add(new ModelBox(body5, 21, 20, -1.5F, -1.5F, -9.0F, 3, 3, 4, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body5.addChild(cube_r58);
        this.setRotateAngle(cube_r58, 0.0F, 0.0F, -0.2182F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 19, 60, -3.0F, -1.75F, -10.0F, 2, 1, 2, 0.0F, true));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body5.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0F, 0.0F, 0.2182F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 19, 60, 1.0F, -1.75F, -10.0F, 2, 1, 2, 0.0F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.body5.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.4363F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 16, 60, -0.5F, -5.99F, -10.3F, 1, 1, 1, 0.0F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(0.0F, 2.0F, -12.0F);
        this.body5.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.0F, 3.1416F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 0, -1.0F, -3.0F, 1.0F, 2, 2, 1, 0.0F, false));

        this.leg17 = new AdvancedModelRenderer(this);
        this.leg17.setRotationPoint(1.0F, 0.0F, -4.0F);
        this.body5.addChild(leg17);
        this.setRotateAngle(leg17, 0.0F, 0.3491F, 0.2618F);
        this.leg17.cubeList.add(new ModelBox(leg17, 32, 20, 0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
        this.leg17.cubeList.add(new ModelBox(leg17, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.cube_r62 = new AdvancedModelRenderer(this);
        this.cube_r62.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg17.addChild(cube_r62);
        this.setRotateAngle(cube_r62, 1.5708F, 0.0F, 0.0F);
        this.cube_r62.cubeList.add(new ModelBox(cube_r62, 32, 28, 0.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, false));

        this.legpiece17 = new AdvancedModelRenderer(this);
        this.legpiece17.setRotationPoint(6.0F, -1.0F, 0.0F);
        this.leg17.addChild(legpiece17);
        this.setRotateAngle(legpiece17, 0.0F, 0.0F, 0.5236F);
        this.legpiece17.cubeList.add(new ModelBox(legpiece17, 32, 16, 0.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, false));
        this.legpiece17.cubeList.add(new ModelBox(legpiece17, 32, 28, 0.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, false));

        this.cube_r63 = new AdvancedModelRenderer(this);
        this.cube_r63.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece17.addChild(cube_r63);
        this.setRotateAngle(cube_r63, 1.5708F, 0.0F, 0.0F);
        this.cube_r63.cubeList.add(new ModelBox(cube_r63, 32, 28, 0.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, false));

        this.legpiecee17 = new AdvancedModelRenderer(this);
        this.legpiecee17.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.legpiece17.addChild(legpiecee17);
        this.setRotateAngle(legpiecee17, 0.0F, 0.0F, 0.5236F);
        this.legpiecee17.cubeList.add(new ModelBox(legpiecee17, 32, 28, -2.0F, -1.0F, 0.0F, 5, 4, 0, 0.0F, false));
        this.legpiecee17.cubeList.add(new ModelBox(legpiecee17, 16, 0, 0.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.cube_r64 = new AdvancedModelRenderer(this);
        this.cube_r64.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee17.addChild(cube_r64);
        this.setRotateAngle(cube_r64, 1.5708F, 0.0F, 0.0F);
        this.cube_r64.cubeList.add(new ModelBox(cube_r64, 32, 28, -2.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, false));

        this.leg18 = new AdvancedModelRenderer(this);
        this.leg18.setRotationPoint(-1.0F, 0.0F, -4.0F);
        this.body5.addChild(leg18);
        this.setRotateAngle(leg18, 0.0F, -0.3491F, -0.2618F);
        this.leg18.cubeList.add(new ModelBox(leg18, 32, 20, -6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, true));
        this.leg18.cubeList.add(new ModelBox(leg18, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.cube_r65 = new AdvancedModelRenderer(this);
        this.cube_r65.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leg18.addChild(cube_r65);
        this.setRotateAngle(cube_r65, 1.5708F, 0.0F, 0.0F);
        this.cube_r65.cubeList.add(new ModelBox(cube_r65, 32, 28, -6.0F, -2.0F, 0.0F, 6, 4, 0, 0.0F, true));

        this.legpiece18 = new AdvancedModelRenderer(this);
        this.legpiece18.setRotationPoint(-6.0F, -1.0F, 0.0F);
        this.leg18.addChild(legpiece18);
        this.setRotateAngle(legpiece18, 0.0F, 0.0F, -0.5236F);
        this.legpiece18.cubeList.add(new ModelBox(legpiece18, 32, 16, -6.0F, -0.01F, -1.01F, 6, 2, 2, 0.0F, true));
        this.legpiece18.cubeList.add(new ModelBox(legpiece18, 32, 28, -6.0F, -1.0F, -0.05F, 6, 4, 0, 0.0F, true));

        this.cube_r66 = new AdvancedModelRenderer(this);
        this.cube_r66.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiece18.addChild(cube_r66);
        this.setRotateAngle(cube_r66, 1.5708F, 0.0F, 0.0F);
        this.cube_r66.cubeList.add(new ModelBox(cube_r66, 32, 28, -6.0F, -2.0F, -0.1F, 6, 4, 0, 0.0F, true));

        this.legpiecee18 = new AdvancedModelRenderer(this);
        this.legpiecee18.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.legpiece18.addChild(legpiecee18);
        this.setRotateAngle(legpiecee18, 0.0F, 0.0F, -0.5236F);
        this.legpiecee18.cubeList.add(new ModelBox(legpiecee18, 32, 28, -3.0F, -1.0F, 0.0F, 5, 4, 0, 0.0F, true));
        this.legpiecee18.cubeList.add(new ModelBox(legpiecee18, 16, 0, -3.0F, 0.0F, -1.0F, 3, 2, 2, 0.0F, true));

        this.cube_r67 = new AdvancedModelRenderer(this);
        this.cube_r67.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.legpiecee18.addChild(cube_r67);
        this.setRotateAngle(cube_r67, 1.5708F, 0.0F, 0.0F);
        this.cube_r67.cubeList.add(new ModelBox(cube_r67, 32, 28, -3.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, true));

        this.tentacleL = new AdvancedModelRenderer(this);
        this.tentacleL.setRotationPoint(1.25F, -0.25F, -8.5F);
        this.body5.addChild(tentacleL);
        this.setRotateAngle(tentacleL, 0.0F, -0.0873F, 0.3491F);
        this.tentacleL.cubeList.add(new ModelBox(tentacleL, 27, 61, 0.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, false));

        this.tentacleL2 = new AdvancedModelRenderer(this);
        this.tentacleL2.setRotationPoint(-1.25F, -0.25F, -8.5F);
        this.body5.addChild(tentacleL2);
        this.setRotateAngle(tentacleL2, 0.0F, 0.0873F, -0.3491F);
        this.tentacleL2.cubeList.add(new ModelBox(tentacleL2, 27, 61, -4.0F, 0.0F, -3.0F, 4, 0, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.bone.render(f5 * 0.055F);
    }

    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.bone.render(0.004F);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
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
        this.bone.offsetY = 1.4F;

        AdvancedModelRenderer[] bodyF = {this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] bodyB = {this.back, this.back2, this.back3, this.back4, this.back5};

        EntityPrehistoricFloraDiania ee = (EntityPrehistoricFloraDiania) e;

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.faceTarget(f3, f4, 10, body5);
        }

        float legFlapDegree = 0.3F;
        float legWalkDegree = 0.5F;
        float legSwingDegree = 0.2F;
        float legSpeed = 0.23F;
        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.flap(leg17, legSpeed, -legFlapDegree, false, 0, -legFlapDegree, f2, 0.3F);
            this.flap(leg18, legSpeed, legFlapDegree, false, 2F, legFlapDegree, f2, 0.3F);
            this.flap(leg15, legSpeed, -legFlapDegree, false, 2.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg16, legSpeed, legFlapDegree, false, 4.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg5, legSpeed, -legFlapDegree, false, 4.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg6, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg3, legSpeed, -legFlapDegree, false, 6.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg4, legSpeed, legFlapDegree, false, 6.0F, legFlapDegree, f2, 0.3F);

            this.swing(leg17, legSpeed, -legSwingDegree, false, 0, -legSwingDegree, f2, 0.3F);
            this.swing(leg18, legSpeed, legSwingDegree, false, 2F, legSwingDegree, f2, 0.3F);
            this.swing(leg15, legSpeed, -legSwingDegree, false, 2.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg16, legSpeed, legSwingDegree, false, 4.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg5, legSpeed, -legSwingDegree, false, 4.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg6, legSpeed, legSwingDegree, false, 6.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg3, legSpeed, -legSwingDegree, false, 6.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg4, legSpeed, legSwingDegree, false, 6.0F, legSwingDegree, f2, 0.3F);

        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.flap(leg1, legSpeed, -legFlapDegree, false, 8.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg2, legSpeed, legFlapDegree, false, 10.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg9, legSpeed * 1.1F, -legFlapDegree, false, 10.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg10, legSpeed * 1.1F, legFlapDegree, false, 12.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg11, legSpeed * 1.2F, -legFlapDegree, false, 12.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg12, legSpeed * 1.2F, legFlapDegree, false, 14.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg7, legSpeed * 1.2F, -legFlapDegree, false, 14.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg8, legSpeed * 1.2F, legFlapDegree, false, 16.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg19, legSpeed * 1.2F, -legFlapDegree, false, 16.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg20, legSpeed * 1.2F, legFlapDegree, false, 18.0F, legFlapDegree, f2, 0.3F);
            this.flap(leg13, legSpeed * 1.2F, -legFlapDegree, false, 18.0F, -legFlapDegree, f2, 0.3F);
            this.flap(leg14, legSpeed * 1.2F, legFlapDegree, false, 20.0F, legFlapDegree, f2, 0.3F);

            this.swing(leg1, legSpeed, -legSwingDegree, false, 8.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg2, legSpeed, legSwingDegree, false, 10.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg9, legSpeed * 1.1F, -legSwingDegree, false, 10.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg10, legSpeed * 1.1F, legSwingDegree, false, 12.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg11, legSpeed * 1.2F, -legSwingDegree, false, 12.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg12, legSpeed * 1.2F, legSwingDegree, false, 14.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg7, legSpeed * 1.2F, -legSwingDegree, false, 14.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg8, legSpeed * 1.2F, legSwingDegree, false, 16.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg19, legSpeed * 1.2F, -legSwingDegree, false, 16.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg20, legSpeed * 1.2F, legSwingDegree, false, 18.0F, legSwingDegree, f2, 0.3F);
            this.swing(leg13, legSpeed * 1.2F, -legSwingDegree, false, 18.0F, -legSwingDegree, f2, 0.3F);
            this.swing(leg14, legSpeed * 1.2F, legSwingDegree, false, 20.0F, legSwingDegree, f2, 0.3F);

        }

        if (f3 != 0.0f || ee.getAnimation() == ee.LOOK_ANIMATION) {
            this.walk(leg17, legSpeed, -legWalkDegree, false, 0, -legWalkDegree, f2, 0.3F);
            this.walk(leg18, legSpeed, legWalkDegree, false, 2F, legWalkDegree, f2, 0.3F);
            this.walk(leg15, legSpeed, -legWalkDegree, false, 2.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg16, legSpeed, legWalkDegree, false, 4.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg5, legSpeed, -legWalkDegree, false, 4.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg6, legSpeed, legWalkDegree, false, 6.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg3, legSpeed, -legWalkDegree, false, 6.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg4, legSpeed, legWalkDegree, false, 8.0F, legWalkDegree, f2, 0.3F);
        }
        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.walk(leg1, legSpeed, -legWalkDegree, false, 8.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg2, legSpeed, legWalkDegree, false, 10.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg9, legSpeed * 1.1F, -legWalkDegree * 1.1F, false, 10.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg10, legSpeed * 1.1F, legWalkDegree * 1.1F, false, 12.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg11, legSpeed * 1.2F, -legWalkDegree * 1.2F, false, 12.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg12, legSpeed * 1.2F, legWalkDegree * 1.2F, false, 14.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg7, legSpeed * 1.2F, -legWalkDegree * 1.3F, false, 14.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg8, legSpeed * 1.2F, legWalkDegree * 1.3F, false, 16.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg19, legSpeed * 1.2F, -legWalkDegree * 1.4F, false, 16.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg20, legSpeed * 1.2F, legWalkDegree * 1.4F, false, 18.0F, legWalkDegree, f2, 0.3F);
            this.walk(leg13, legSpeed * 1.2F, -legWalkDegree * 1.5F, false, 18.0F, -legWalkDegree, f2, 0.3F);
            this.walk(leg14, legSpeed * 1.2F, legWalkDegree * 1.5F, false, 20.0F, legWalkDegree, f2, 0.3F);
        }

        if (ee.getAnimation() != ee.LOOK_ANIMATION && f3 != 0.0F) {
            this.bob(bone, 1F, 0.05F, false, f2, 1);
        }
        //this.walk(body6, 0.8F, -0.010f, false, 2, 0.15F, f2, 0.8F);

        if (ee.getAnimation() != ee.LOOK_ANIMATION) {
            this.chainWave(bodyF, legSpeed * 0.75F, 0.2f, 0.22F, f2, 0.2F);
            this.chainSwing(bodyF, legSpeed * 0.95F, 0.25F, 0.8F, f2, 0.45F);
        }

        this.chainSwing(bodyB, 0.085F, 0.25f, 0.1, f2, 0.15F);

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDiania e = (EntityPrehistoricFloraDiania) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.LOOK_ANIMATION);
        animator.startKeyframe(60);
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-7.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(20), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-7.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(20), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(12.5), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-7.5), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(20), (float) Math.toRadians(5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.startKeyframe(30);
        animator.rotate(this.body2, (float) Math.toRadians(-17.5), (float) Math.toRadians(-12.5), (float) Math.toRadians(0));
        animator.rotate(this.body3, (float) Math.toRadians(-17.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.body4, (float) Math.toRadians(-7.5), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.rotate(this.body5, (float) Math.toRadians(20), (float) Math.toRadians(-5), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(15);
        animator.resetKeyframe(60);
    }
}
