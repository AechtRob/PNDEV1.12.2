package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDugaldia;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDugaldia extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer jawcoverright;
    private final AdvancedModelRenderer jawcoverleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer insidejawbaseright;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer insidejawbaseleft;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer insidejawbaseright2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer insidejawbaseleft2;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer jawright;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer jawrightinside;
    private final AdvancedModelRenderer jawleft;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer jawleftinside;
    private final AdvancedModelRenderer lipright;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer lipleft;
    private final AdvancedModelRenderer cube_r22;

    private ModelAnimator animator;

    public ModelDugaldia() {
        this.textureWidth = 48;
        this.textureHeight = 48;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.head.cubeList.add(new ModelBox(head, 20, 0, -2.0F, -3.0F, -4.25F, 4, 6, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 24, -1.5F, 0.05F, -5.85F, 3, 3, 2, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 10, -1.5F, -1.5F, -6.9F, 3, 1, 1, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -1.45F, -9.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3142F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 30, -2.0F, 0.0F, 3.0F, 3, 5, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 31, -2.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.125F, -7.075F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 30, -2.0F, -2.0F, -1.0F, 3, 2, 3, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.5F, -0.1F, -8.1F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, 0.0F, -1.0F, -1.0F, 1, 1, 0, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -0.35F, -8.1F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 0, -2.0F, -1.0F, -1.0F, 3, 1, 2, 0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-2.0F, 2.0F, -0.25F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, 0.2182F, -0.3054F, 0.3491F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 11, 18, 0.0F, -0.5F, -1.0F, 0, 4, 4, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(2.0F, 2.0F, -0.25F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, 0.2182F, 0.3054F, -0.3491F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 11, 18, 0.0F, -0.5F, -1.0F, 0, 4, 4, 0.0F, true));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, 0.0F, -0.25F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -2.0F, -3.0F, -0.5F, 4, 6, 6, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.25F, 5.5F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 14, 12, -1.5F, -2.6F, -0.75F, 3, 5, 5, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, 3.1F, 0.25F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1614F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 22, -2.0F, -1.0F, -1.0F, 3, 1, 5, -0.01F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-0.75F, 2.75F, 2.25F);
        this.body2.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.6109F, 0.0F, 0.3054F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 14, 1, 0.0F, -0.5F, -1.0F, 0, 2, 2, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(0.75F, 2.75F, 2.25F);
        this.body2.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.6109F, 0.0F, -0.3054F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 14, 1, 0.0F, -0.5F, -1.0F, 0, 2, 2, 0.0F, true));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 4.25F);
        this.body2.addChild(body3);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-1.0F, 2.075F, 0.5F);
        this.body3.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3403F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, 1.0F, 0.0F, -1.0F, 0, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 2.175F, 0.5F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3403F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 10, -1.0F, -2.0F, -1.0F, 2, 2, 5, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.0F, -1.25F, 2.4F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 1.0F, -3.0F, -1.0F, 0, 2, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, 0.4F);
        this.body3.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 22, -1.0F, -3.0F, -1.0F, 2, 3, 5, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 4.6F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 5, 0.0F, -5.5F, 2.9F, 0, 10, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 1.25F, -0.1F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.1309F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 25, 0.0F, -1.0F, -1.0F, 1, 1, 5, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 0.5F, -0.1F);
        this.body4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 25, 17, 0.0F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));

        this.jawcoverright = new AdvancedModelRenderer(this);
        this.jawcoverright.setRotationPoint(-1.25F, 1.2F, -2.6F);
        this.head.addChild(jawcoverright);
        this.jawcoverright.cubeList.add(new ModelBox(jawcoverright, 34, 7, 0.0F, -1.25F, -3.25F, 1, 3, 3, 0.0F, false));

        this.jawcoverleft = new AdvancedModelRenderer(this);
        this.jawcoverleft.setRotationPoint(1.25F, 1.2F, -2.6F);
        this.head.addChild(jawcoverleft);
        this.jawcoverleft.cubeList.add(new ModelBox(jawcoverleft, 34, 7, -1.0F, -1.25F, -3.25F, 1, 3, 3, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, -5.9F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 4, -1.0F, 1.625F, -1.45F, 2, 1, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.4F, 0.65F, -3.75F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.6981F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 2, 2, -0.1F, -1.3F, -1.0F, 1, 1, 0, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 31, -0.1F, -1.0F, -1.0F, 1, 1, 4, 0.01F, false));

        this.insidejawbaseright = new AdvancedModelRenderer(this);
        this.insidejawbaseright.setRotationPoint(-0.4F, 0.65F, -3.75F);
        this.jaw.addChild(insidejawbaseright);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.insidejawbaseright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.6981F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 7, 35, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.insidejawbaseleft = new AdvancedModelRenderer(this);
        this.insidejawbaseleft.setRotationPoint(0.4F, 0.65F, -3.75F);
        this.jaw.addChild(insidejawbaseleft);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.insidejawbaseleft.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.6981F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 7, 35, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, true));

        this.insidejawbaseright2 = new AdvancedModelRenderer(this);
        this.insidejawbaseright2.setRotationPoint(-0.4F, 0.65F, -3.75F);
        this.jaw.addChild(insidejawbaseright2);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.insidejawbaseright2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.6981F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 32, 0, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.01F, false));

        this.insidejawbaseleft2 = new AdvancedModelRenderer(this);
        this.insidejawbaseleft2.setRotationPoint(0.4F, 0.65F, -3.75F);
        this.jaw.addChild(insidejawbaseleft2);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.insidejawbaseleft2.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.6981F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 0, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.01F, true));

        this.jawright = new AdvancedModelRenderer(this);
        this.jawright.setRotationPoint(-0.15F, -0.5F, -4.0F);
        this.jaw.addChild(jawright);
        this.setRotateAngle(jawright, 0.0F, -0.192F, 0.0F);
        this.jawright.cubeList.add(new ModelBox(jawright, 36, 29, -0.5F, 0.125F, 2.55F, 1, 3, 2, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.5F, 1.075F, 1.25F);
        this.jawright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, 0.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 15, 35, 0.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, 1.15F, 0.25F);
        this.jawright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.6981F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 32, 17, 0.0F, -1.0F, -1.0F, 1, 1, 4, 0.01F, false));

        this.jawrightinside = new AdvancedModelRenderer(this);
        this.jawrightinside.setRotationPoint(-0.5F, 3.125F, 2.55F);
        this.jawright.addChild(jawrightinside);
        this.jawrightinside.cubeList.add(new ModelBox(jawrightinside, 29, 36, 0.0F, -3.0F, 0.0F, 1, 3, 2, -0.02F, false));

        this.jawleft = new AdvancedModelRenderer(this);
        this.jawleft.setRotationPoint(0.15F, -0.5F, -4.0F);
        this.jaw.addChild(jawleft);
        this.setRotateAngle(jawleft, 0.0F, 0.192F, 0.0F);
        this.jawleft.cubeList.add(new ModelBox(jawleft, 36, 29, -0.5F, 0.125F, 2.55F, 1, 3, 2, -0.01F, true));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 1.075F, 1.25F);
        this.jawleft.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, -1.0F, 0.0F, 0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 15, 35, -1.0F, -1.0F, -1.0F, 1, 1, 3, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.15F, 0.25F);
        this.jawleft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.6981F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 17, -1.0F, -1.0F, -1.0F, 1, 1, 4, 0.01F, true));

        this.jawleftinside = new AdvancedModelRenderer(this);
        this.jawleftinside.setRotationPoint(0.5F, 3.125F, 2.55F);
        this.jawleft.addChild(jawleftinside);
        this.jawleftinside.cubeList.add(new ModelBox(jawleftinside, 29, 36, -1.0F, -3.0F, 0.0F, 1, 3, 2, -0.02F, true));

        this.lipright = new AdvancedModelRenderer(this);
        this.lipright.setRotationPoint(-0.85F, -0.45F, -8.9F);
        this.head.addChild(lipright);
        this.lipright.cubeList.add(new ModelBox(lipright, 35, 36, -0.75F, -0.3F, 0.0F, 1, 2, 2, 0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.75F, 1.7F, 0.0F);
        this.lipright.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.9599F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 23, 35, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

        this.lipleft = new AdvancedModelRenderer(this);
        this.lipleft.setRotationPoint(0.85F, -0.45F, -8.9F);
        this.head.addChild(lipleft);
        this.lipleft.cubeList.add(new ModelBox(lipleft, 35, 36, -0.25F, -0.3F, 0.0F, 1, 2, 2, 0.01F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.75F, 1.7F, 0.0F);
        this.lipleft.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.9599F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 23, 35, -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

//    public void renderStaticWall(float f) {
//        this.head.rotateAngleY = (float) Math.toRadians(90);
//        this.head.offsetY = -0.2F;
//        this.head.offsetX = -0.15F;
//        this.head.offsetZ = -0.4F;
//        this.head.render(0.01F);
//        resetToDefaultPose();
//    }
//    public void renderStaticFloor(float f) {
//        this.setRotateAngle(head, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body1, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body3, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(body4, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(jaw, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(jawleft, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(jawright, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(lipleft, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(lipright, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(jawcoverleft, 0.0F, 0.0F, 0.0F);
//        this.setRotateAngle(jawcoverright, 0.0F, 0.0F, 0.0F);
//        this.head.offsetY = -0.1F;
//        this.head.render(0.01f);
//        resetToDefaultPose();
//    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -2.0F;
        this.head.offsetX = 0.438F;
        this.head.rotateAngleY = (float)Math.toRadians(225);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 3.33F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDugaldia ee = (EntityPrehistoricFloraDugaldia) entitylivingbaseIn;

        if (ee.getIsFast()) { //Running
            animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        } else {
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }

        if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) {
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDugaldia entity = (EntityPrehistoricFloraDugaldia) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.15);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0), pectoralfinright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*3), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-3));
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+90))*-5), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+120))*-10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+190))*13), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*17), body4.rotateAngleZ + (float) Math.toRadians(0));
       
    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDugaldia entity = (EntityPrehistoricFloraDugaldia) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*3), head.rotateAngleZ + (float) Math.toRadians(0));
        this.head.rotationPointX = this.head.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-0.15);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);
        this.setRotateAngle(pectoralfinright, pectoralfinright.rotateAngleX + (float) Math.toRadians(0), pectoralfinright.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-3), pectoralfinright.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*3));
        this.setRotateAngle(pectoralfinleft, pectoralfinleft.rotateAngleX + (float) Math.toRadians(0), pectoralfinleft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*3), pectoralfinleft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720))*-3));
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(0), body1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+90))*-5), body1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+120))*-10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(0), body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720+190))*13), body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(0), body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*720-200))*17), body4.rotateAngleZ + (float) Math.toRadians(0));
       
    }


    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDugaldia entity = (EntityPrehistoricFloraDugaldia) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-71.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*90-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -71.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*90 + (((tickAnim - 15) / 10) * (74.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*100-(-71.225+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*90)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 74.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*100 + (((tickAnim - 25) / 10) * (35.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30-(74.975+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+100))*100)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 35.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30 + (((tickAnim - 35) / 5) * (0-(35.6+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*30)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (60-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 60 + (((tickAnim - 10) / 30) * (60-(60)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 60 + (((tickAnim - 40) / 10) * (0-(60)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(insidejawbaseright, insidejawbaseright.rotateAngleX + (float) Math.toRadians(xx), insidejawbaseright.rotateAngleY + (float) Math.toRadians(yy), insidejawbaseright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -1 + (((tickAnim - 10) / 30) * (-1-(-1)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1 + (((tickAnim - 40) / 10) * (0-(-1)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.insidejawbaseright.rotationPointX = this.insidejawbaseright.rotationPointX + (float)(xx);
        this.insidejawbaseright.rotationPointY = this.insidejawbaseright.rotationPointY - (float)(yy);
        this.insidejawbaseright.rotationPointZ = this.insidejawbaseright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-50-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -50 + (((tickAnim - 10) / 30) * (-50-(-50)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -50 + (((tickAnim - 40) / 10) * (0-(-50)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawright, jawright.rotateAngleX + (float) Math.toRadians(xx), jawright.rotateAngleY + (float) Math.toRadians(yy), jawright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (52-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (-10-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 52 + (((tickAnim - 5) / 5) * (55-(52)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 10) / 30) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 55 + (((tickAnim - 10) / 30) * (55-(55)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -10 + (((tickAnim - 40) / 5) * (-5-(-10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 55 + (((tickAnim - 40) / 5) * (52-(55)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 45) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 52 + (((tickAnim - 45) / 5) * (0-(52)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lipright, lipright.rotateAngleX + (float) Math.toRadians(xx), lipright.rotateAngleY + (float) Math.toRadians(yy), lipright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.16409-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (23.97625-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (52.95814-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 12.16409 + (((tickAnim - 10) / 30) * (12.16409-(12.16409)));
            yy = 23.97625 + (((tickAnim - 10) / 30) * (23.97625-(23.97625)));
            zz = 52.95814 + (((tickAnim - 10) / 30) * (52.95814-(52.95814)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.16409 + (((tickAnim - 40) / 10) * (0-(12.16409)));
            yy = 23.97625 + (((tickAnim - 40) / 10) * (0-(23.97625)));
            zz = 52.95814 + (((tickAnim - 40) / 10) * (0-(52.95814)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawcoverright, jawcoverright.rotateAngleX + (float) Math.toRadians(xx), jawcoverright.rotateAngleY + (float) Math.toRadians(yy), jawcoverright.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 30) * (0.4-(0.4)));
            zz = -1.5 + (((tickAnim - 10) / 30) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 40) / 10) * (0-(0.4)));
            zz = -1.5 + (((tickAnim - 40) / 10) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jawcoverright.rotationPointX = this.jawcoverright.rotationPointX + (float)(xx);
        this.jawcoverright.rotationPointY = this.jawcoverright.rotationPointY - (float)(yy);
        this.jawcoverright.rotationPointZ = this.jawcoverright.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.92628-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.96808-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (13.21756-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -6.92628 + (((tickAnim - 10) / 30) * (-6.92628-(-6.92628)));
            yy = -18.96808 + (((tickAnim - 10) / 30) * (-18.96808-(-18.96808)));
            zz = 13.21756 + (((tickAnim - 10) / 30) * (13.21756-(13.21756)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.92628 + (((tickAnim - 40) / 10) * (0-(-6.92628)));
            yy = -18.96808 + (((tickAnim - 40) / 10) * (0-(-18.96808)));
            zz = 13.21756 + (((tickAnim - 40) / 10) * (0-(13.21756)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(insidejawbaseright2, insidejawbaseright2.rotateAngleX + (float) Math.toRadians(xx), insidejawbaseright2.rotateAngleY + (float) Math.toRadians(yy), insidejawbaseright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-1.15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -1.15 + (((tickAnim - 10) / 30) * (-1.15-(-1.15)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -1.15 + (((tickAnim - 40) / 10) * (0-(-1.15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.insidejawbaseright2.rotationPointX = this.insidejawbaseright2.rotationPointX + (float)(xx);
        this.insidejawbaseright2.rotationPointY = this.insidejawbaseright2.rotationPointY - (float)(yy);
        this.insidejawbaseright2.rotationPointZ = this.insidejawbaseright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 32.5 + (((tickAnim - 10) / 30) * (32.5-(32.5)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 32.5 + (((tickAnim - 40) / 10) * (0-(32.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawrightinside, jawrightinside.rotateAngleX + (float) Math.toRadians(xx), jawrightinside.rotateAngleY + (float) Math.toRadians(yy), jawrightinside.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0.35 + (((tickAnim - 10) / 30) * (0.35-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.35 + (((tickAnim - 40) / 10) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jawrightinside.rotationPointX = this.jawrightinside.rotationPointX + (float)(xx);
        this.jawrightinside.rotationPointY = this.jawrightinside.rotationPointY - (float)(yy);
        this.jawrightinside.rotationPointZ = this.jawrightinside.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-52-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -5 + (((tickAnim - 5) / 5) * (-10-(-5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -52 + (((tickAnim - 5) / 5) * (-55-(-52)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -10 + (((tickAnim - 10) / 30) * (-10-(-10)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = -55 + (((tickAnim - 10) / 30) * (-55-(-55)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -10 + (((tickAnim - 40) / 5) * (-5-(-10)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = -55 + (((tickAnim - 40) / 5) * (-52-(-55)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 45) / 5) * (0-(-5)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = -52 + (((tickAnim - 45) / 5) * (0-(-52)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lipleft, lipleft.rotateAngleX + (float) Math.toRadians(xx), lipleft.rotateAngleY + (float) Math.toRadians(yy), lipleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (50-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 50 + (((tickAnim - 10) / 30) * (50-(50)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 50 + (((tickAnim - 40) / 10) * (0-(50)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawleft, jawleft.rotateAngleX + (float) Math.toRadians(xx), jawleft.rotateAngleY + (float) Math.toRadians(yy), jawleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-32.5-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = -32.5 + (((tickAnim - 10) / 30) * (-32.5-(-32.5)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = -32.5 + (((tickAnim - 40) / 10) * (0-(-32.5)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawleftinside, jawleftinside.rotateAngleX + (float) Math.toRadians(xx), jawleftinside.rotateAngleY + (float) Math.toRadians(yy), jawleftinside.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0.35 + (((tickAnim - 10) / 30) * (0.35-(0.35)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0.35 + (((tickAnim - 40) / 10) * (0-(0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jawleftinside.rotationPointX = this.jawleftinside.rotationPointX + (float)(xx);
        this.jawleftinside.rotationPointY = this.jawleftinside.rotationPointY - (float)(yy);
        this.jawleftinside.rotationPointZ = this.jawleftinside.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (12.16409-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-23.9762-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-52.9581-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 12.16409 + (((tickAnim - 10) / 30) * (12.16409-(12.16409)));
            yy = -23.9762 + (((tickAnim - 10) / 30) * (-23.9762-(-23.9762)));
            zz = -52.9581 + (((tickAnim - 10) / 30) * (-52.9581-(-52.9581)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 12.16409 + (((tickAnim - 40) / 10) * (0-(12.16409)));
            yy = -23.9762 + (((tickAnim - 40) / 10) * (0-(-23.9762)));
            zz = -52.9581 + (((tickAnim - 40) / 10) * (0-(-52.9581)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jawcoverleft, jawcoverleft.rotateAngleX + (float) Math.toRadians(xx), jawcoverleft.rotateAngleY + (float) Math.toRadians(yy), jawcoverleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.5-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0.4 + (((tickAnim - 10) / 30) * (0.4-(0.4)));
            zz = -1.5 + (((tickAnim - 10) / 30) * (-1.5-(-1.5)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.4 + (((tickAnim - 40) / 10) * (0-(0.4)));
            zz = -1.5 + (((tickAnim - 40) / 10) * (0-(-1.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.jawcoverleft.rotationPointX = this.jawcoverleft.rotationPointX + (float)(xx);
        this.jawcoverleft.rotationPointY = this.jawcoverleft.rotationPointY - (float)(yy);
        this.jawcoverleft.rotationPointZ = this.jawcoverleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(insidejawbaseleft, insidejawbaseleft.rotateAngleX + (float) Math.toRadians(xx), insidejawbaseleft.rotateAngleY + (float) Math.toRadians(yy), insidejawbaseleft.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 1 + (((tickAnim - 10) / 30) * (1-(1)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 40) / 10) * (0-(1)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.insidejawbaseleft.rotationPointX = this.insidejawbaseleft.rotationPointX + (float)(xx);
        this.insidejawbaseleft.rotationPointY = this.insidejawbaseleft.rotationPointY - (float)(yy);
        this.insidejawbaseleft.rotationPointZ = this.insidejawbaseleft.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.92628-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (18.9681-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-13.2176-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -6.92628 + (((tickAnim - 10) / 30) * (-6.92628-(-6.92628)));
            yy = 18.9681 + (((tickAnim - 10) / 30) * (18.9681-(18.9681)));
            zz = -13.2176 + (((tickAnim - 10) / 30) * (-13.2176-(-13.2176)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -6.92628 + (((tickAnim - 40) / 10) * (0-(-6.92628)));
            yy = 18.9681 + (((tickAnim - 40) / 10) * (0-(18.9681)));
            zz = -13.2176 + (((tickAnim - 40) / 10) * (0-(-13.2176)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(insidejawbaseleft2, insidejawbaseleft2.rotateAngleX + (float) Math.toRadians(xx), insidejawbaseleft2.rotateAngleY + (float) Math.toRadians(yy), insidejawbaseleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.15-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 1.15 + (((tickAnim - 10) / 30) * (1.15-(1.15)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.15 + (((tickAnim - 40) / 10) * (0-(1.15)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.insidejawbaseleft2.rotationPointX = this.insidejawbaseleft2.rotationPointX + (float)(xx);
        this.insidejawbaseleft2.rotationPointY = this.insidejawbaseleft2.rotationPointY - (float)(yy);
        this.insidejawbaseleft2.rotationPointZ = this.insidejawbaseleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-10-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 15) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 25) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-10-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body1, body1.rotateAngleX + (float) Math.toRadians(xx), body1.rotateAngleY + (float) Math.toRadians(yy), body1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 9) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 1) * (34.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 34.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40 + (((tickAnim - 10) / 5) * (-14.5-(34.725+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -14.5 + (((tickAnim - 15) / 10) * (-47.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-60))*50-(-14.5)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = -47.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-60))*50 + (((tickAnim - 25) / 10) * (-15.125-(-47.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-60))*50)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -15.125 + (((tickAnim - 35) / 5) * (-34.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40-(-15.125)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 41) {
            xx = 0 + (((tickAnim - 40) / 1) * (0-(0)));
            yy = -34.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40 + (((tickAnim - 40) / 1) * (0-(-34.55+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-40)));
            zz = 0 + (((tickAnim - 40) / 1) * (0-(0)));
        }
        else if (tickAnim >= 41 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            yy = 0 + (((tickAnim - 41) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 41) / 19) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(xx), body2.rotateAngleY + (float) Math.toRadians(yy), body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-10-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 15) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 25) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-10-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body3, body3.rotateAngleX + (float) Math.toRadians(xx), body3.rotateAngleY + (float) Math.toRadians(yy), body3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (-10-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 15) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 15) / 5) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (10-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 10 + (((tickAnim - 25) / 5) * (0-(10)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (-10-(0)));
            zz = 0 + (((tickAnim - 30) / 5) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = -10 + (((tickAnim - 35) / 5) * (0-(-10)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body4, body4.rotateAngleX + (float) Math.toRadians(xx), body4.rotateAngleY + (float) Math.toRadians(yy), body4.rotateAngleZ + (float) Math.toRadians(zz));

    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.body4};

        EntityPrehistoricFloraDugaldia ee = (EntityPrehistoricFloraDugaldia) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

        if (!e.isInWater()) {
            this.head.rotateAngleZ = (float) Math.toRadians(90);
            this.head.offsetY = 0.35F;
            this.bob(head, 0.5f, 2.5F, false, f2, 1);
            this.chainWave(fishTail, 0.26f * 1.7F, 0.028F, -0.2, f2, 0.8F);
            this.chainSwing(fishTail, 0.26f * 1.7F, 0.28F, -0.55, f2, 0.4F);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

