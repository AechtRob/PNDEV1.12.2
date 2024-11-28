package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSilvanerpeton;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelSilvanerpeton extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer legright;
    private final AdvancedModelRenderer legright2;
    private final AdvancedModelRenderer legright3;
    private final AdvancedModelRenderer legleft;
    private final AdvancedModelRenderer legleft2;
    private final AdvancedModelRenderer legleft3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer armright;
    private final AdvancedModelRenderer armright2;
    private final AdvancedModelRenderer armright3;
    private final AdvancedModelRenderer armleft;
    private final AdvancedModelRenderer armleft2;
    private final AdvancedModelRenderer armleft3;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer cube_r16;

    private ModelAnimator animator;

    public ModelSilvanerpeton() {
        this.textureWidth = 48;
        this.textureHeight = 40;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 21.0F, 3.25F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 17, -2.0F, -1.85F, -0.975F, 4, 1, 5, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, 0.95F, 0.05F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0349F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 10, -3.0F, -2.0F, -1.0F, 4, 2, 5, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -1.45F, 4.05F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.2618F, 0.0F, 0.0F);
        this.tail1.cubeList.add(new ModelBox(tail1, 18, 21, -1.0F, -0.225F, -0.5F, 2, 2, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.15F, 3.5F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.2618F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 23, -0.5F, 0.55F, -0.5F, 1, 1, 5, 0.01F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 27, -0.5F, -0.05F, -0.5F, 1, 1, 5, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.5F, 4.25F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.5236F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 24, 0, -0.5F, -0.25F, -0.5F, 1, 1, 5, -0.01F, false));

        this.legright = new AdvancedModelRenderer(this);
        this.legright.setRotationPoint(-2.0F, -0.2F, 1.75F);
        this.hips.addChild(legright);
        this.setRotateAngle(legright, 0.0F, 0.2182F, -0.6283F);
        this.legright.cubeList.add(new ModelBox(legright, 12, 33, -2.5F, -0.4F, -1.0F, 3, 1, 2, 0.01F, false));

        this.legright2 = new AdvancedModelRenderer(this);
        this.legright2.setRotationPoint(-2.5F, -0.4F, 0.0F);
        this.legright.addChild(legright2);
        this.setRotateAngle(legright2, 0.0F, -0.0873F, -0.9599F);
        this.legright2.cubeList.add(new ModelBox(legright2, 36, 3, -2.0F, 0.0F, -0.75F, 2, 1, 1, 0.0F, false));
        this.legright2.cubeList.add(new ModelBox(legright2, 36, 5, -2.0F, 0.0F, -0.25F, 2, 1, 1, -0.01F, false));

        this.legright3 = new AdvancedModelRenderer(this);
        this.legright3.setRotationPoint(-2.0F, 0.5F, 0.0F);
        this.legright2.addChild(legright3);
        this.setRotateAngle(legright3, 0.1745F, -0.0175F, 0.0F);
        this.legright3.cubeList.add(new ModelBox(legright3, 34, 10, 0.0F, -2.75F, -2.5F, 0, 3, 3, 0.0F, false));

        this.legleft = new AdvancedModelRenderer(this);
        this.legleft.setRotationPoint(2.0F, -0.2F, 1.75F);
        this.hips.addChild(legleft);
        this.setRotateAngle(legleft, 0.0F, -0.2182F, 0.6283F);
        this.legleft.cubeList.add(new ModelBox(legleft, 12, 33, -0.5F, -0.4F, -1.0F, 3, 1, 2, 0.01F, true));

        this.legleft2 = new AdvancedModelRenderer(this);
        this.legleft2.setRotationPoint(2.5F, -0.4F, 0.0F);
        this.legleft.addChild(legleft2);
        this.setRotateAngle(legleft2, 0.0F, 0.0873F, 0.9599F);
        this.legleft2.cubeList.add(new ModelBox(legleft2, 36, 3, 0.0F, 0.0F, -0.75F, 2, 1, 1, 0.0F, true));
        this.legleft2.cubeList.add(new ModelBox(legleft2, 36, 5, 0.0F, 0.0F, -0.25F, 2, 1, 1, -0.01F, true));

        this.legleft3 = new AdvancedModelRenderer(this);
        this.legleft3.setRotationPoint(2.0F, 0.5F, 0.0F);
        this.legleft2.addChild(legleft3);
        this.setRotateAngle(legleft3, 0.1745F, 0.0175F, 0.0F);
        this.legleft3.cubeList.add(new ModelBox(legleft3, 34, 10, 0.0F, -2.75F, -2.5F, 0, 3, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -0.4F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.5F, -0.95F, -6.7F, 5, 3, 7, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, 0.0F, -6.7F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 18, 10, -2.0F, 0.0F, -3.15F, 4, 2, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, 0.2F, -2.15F);
        this.chest.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 16, -3.0F, -1.0F, -1.0F, 4, 1, 4, -0.01F, false));

        this.armright = new AdvancedModelRenderer(this);
        this.armright.setRotationPoint(-2.0F, 1.4F, -1.55F);
        this.chest.addChild(armright);
        this.setRotateAngle(armright, 0.0F, -0.3054F, -0.6981F);
        this.armright.cubeList.add(new ModelBox(armright, 36, 7, -1.5F, -0.5F, -0.75F, 2, 1, 1, 0.0F, false));
        this.armright.cubeList.add(new ModelBox(armright, 10, 36, -1.5F, -0.5F, -0.25F, 2, 1, 1, -0.01F, false));

        this.armright2 = new AdvancedModelRenderer(this);
        this.armright2.setRotationPoint(-1.5F, -0.5F, 0.0F);
        this.armright.addChild(armright2);
        this.setRotateAngle(armright2, 0.0F, 0.0F, -0.6196F);
        this.armright2.cubeList.add(new ModelBox(armright2, 16, 36, -2.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, false));

        this.armright3 = new AdvancedModelRenderer(this);
        this.armright3.setRotationPoint(-2.0F, 0.5F, 0.0F);
        this.armright2.addChild(armright3);
        this.setRotateAngle(armright3, 0.3491F, 0.2182F, -0.2618F);
        this.armright3.cubeList.add(new ModelBox(armright3, 34, 16, 0.0F, -2.0F, -1.5F, 0, 2, 3, 0.0F, false));

        this.armleft = new AdvancedModelRenderer(this);
        this.armleft.setRotationPoint(2.0F, 1.4F, -1.55F);
        this.chest.addChild(armleft);
        this.setRotateAngle(armleft, 0.0F, 0.3054F, 0.6981F);
        this.armleft.cubeList.add(new ModelBox(armleft, 36, 7, -0.5F, -0.5F, -0.75F, 2, 1, 1, 0.0F, true));
        this.armleft.cubeList.add(new ModelBox(armleft, 10, 36, -0.5F, -0.5F, -0.25F, 2, 1, 1, -0.01F, true));

        this.armleft2 = new AdvancedModelRenderer(this);
        this.armleft2.setRotationPoint(1.5F, -0.5F, 0.0F);
        this.armleft.addChild(armleft2);
        this.setRotateAngle(armleft2, 0.0F, 0.0F, 0.6196F);
        this.armleft2.cubeList.add(new ModelBox(armleft2, 16, 36, 0.0F, 0.0F, -0.5F, 2, 1, 1, 0.0F, true));

        this.armleft3 = new AdvancedModelRenderer(this);
        this.armleft3.setRotationPoint(2.0F, 0.5F, 0.0F);
        this.armleft2.addChild(armleft3);
        this.setRotateAngle(armleft3, 0.3491F, -0.2182F, 0.2618F);
        this.armleft3.cubeList.add(new ModelBox(armleft3, 34, 16, 0.0F, -2.0F, -1.5F, 0, 2, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 0.0F, -3.15F);
        this.chest.addChild(neck);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.5F, 0.325F, 0.05F);
        this.neck.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0873F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 32, -2.0F, -1.0F, -1.0F, 3, 1, 2, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 1.95F, -0.075F);
        this.neck.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0436F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 21, -2.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.0F, -0.65F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 36, 25, -0.5F, -1.0F, -5.0F, 1, 1, 1, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 24, 27, -1.0F, -1.0F, -4.0F, 2, 1, 4, 0.015F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 35, -1.725F, -1.0F, -1.8F, 1, 1, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 35, 0.725F, -1.0F, -1.8F, 1, 1, 2, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -1.5F, -3.1F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 6, -2.5F, 0.0F, 0.0F, 3, 1, 3, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, -1.0F, -5.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 25, -1.5F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.5F, -1.0F, -5.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.5672F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 23, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.575F, -1.0F, -3.3F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0785F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 32, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.01F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-1.575F, -1.0F, -3.3F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0785F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 34, 32, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -1.0F, -5.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5672F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 12, 23, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 35, -1.725F, 0.0F, -1.8F, 1, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 29, -1.0F, 0.0F, -4.0F, 2, 1, 4, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 34, -1.5F, -1.0F, -2.0F, 3, 1, 2, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 34, 35, 0.725F, 0.0F, -1.8F, 1, 1, 2, -0.01F, true));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 29, -0.5F, 0.0F, -4.95F, 1, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.575F, 0.0F, -3.3F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0785F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 0, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.5672F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 28, 35, -1.0F, 0.0F, 0.05F, 1, 1, 2, -0.01F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 35, 0.0F, 0.0F, 0.05F, 1, 1, 2, -0.01F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.575F, 0.0F, -3.3F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.0785F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-0.6F, -1.5F, -2.55F);
        this.head.addChild(eyeright);
        this.setRotateAngle(eyeright, 0.0F, -0.0349F, 0.1309F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.0F, 1.0F, 0.5F);
        this.eyeright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.0436F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 37, 0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.6F, -1.5F, -2.55F);
        this.head.addChild(eyeleft);
        this.setRotateAngle(eyeleft, 0.0F, 0.0349F, -0.1309F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.0F, 1.0F, 0.5F);
        this.eyeleft.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0436F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 37, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -2.0F;
        this.hips.offsetX = -1.338F;
        this.hips.rotateAngleY = (float)Math.toRadians(200);
        this.hips.rotateAngleX = (float)Math.toRadians(8);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 1.63F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.Hip.offsetZ = -0.4F;
        //this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 6, head);

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};

        EntityPrehistoricFloraSilvanerpeton entitySilesaurus = (EntityPrehistoricFloraSilvanerpeton) e;
        ((EntityPrehistoricFloraSilvanerpeton)e).tailBuffer.applyChainSwingBuffer(Tail);

        if (entitySilesaurus.getAnimation() == entitySilesaurus.LAY_ANIMATION) {

        }
        else {
            if (!entitySilesaurus.isReallyInWater()) {

                if (f3 == 0.0F || !entitySilesaurus.getIsMoving()) {

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (entitySilesaurus.getIsFast()) { //Running


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

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraSilvanerpeton ee = (EntityPrehistoricFloraSilvanerpeton) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            animSwim(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

        }

        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSilvanerpeton entity = (EntityPrehistoricFloraSilvanerpeton) entitylivingbaseIn;
        int animCycle = 25;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 6.2985 + (((tickAnim - 0) / 13) * (58.63454-(6.2985)));
            yy = -48.78147 + (((tickAnim - 0) / 13) * (19.9536-(-48.78147)));
            zz = -10.56548 + (((tickAnim - 0) / 13) * (20.6559-(-10.56548)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 58.63454 + (((tickAnim - 13) / 6) * (-8.79513-(58.63454)));
            yy = 19.9536 + (((tickAnim - 13) / 6) * (-23.6209-(19.9536)));
            zz = 20.6559 + (((tickAnim - 13) / 6) * (47.8662-(20.6559)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -8.79513 + (((tickAnim - 19) / 6) * (6.2985-(-8.79513)));
            yy = -23.6209 + (((tickAnim - 19) / 6) * (-48.78147-(-23.6209)));
            zz = 47.8662 + (((tickAnim - 19) / 6) * (-10.56548-(47.8662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (64.82227-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-12.61504-(0)));
            zz = 21.5 + (((tickAnim - 0) / 13) * (-3.1474-(21.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 64.82227 + (((tickAnim - 13) / 6) * (-1.18195-(64.82227)));
            yy = -12.61504 + (((tickAnim - 13) / 6) * (-1.2977-(-12.61504)));
            zz = -3.1474 + (((tickAnim - 13) / 6) * (-25.0697-(-3.1474)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -1.18195 + (((tickAnim - 19) / 6) * (0-(-1.18195)));
            yy = -1.2977 + (((tickAnim - 19) / 6) * (0-(-1.2977)));
            zz = -25.0697 + (((tickAnim - 19) / 6) * (21.5-(-25.0697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0.275 + (((tickAnim - 13) / 12) * (0-(0.275)));
            yy = -0.55 + (((tickAnim - 13) / 12) * (0-(-0.55)));
            zz = -0.225 + (((tickAnim - 13) / 12) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -8.49782 + (((tickAnim - 0) / 3) * (-6.06164-(-8.49782)));
            yy = 30.09255 + (((tickAnim - 0) / 3) * (4.46734-(30.09255)));
            zz = -17.81303 + (((tickAnim - 0) / 3) * (-12.48448-(-17.81303)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -6.06164 + (((tickAnim - 3) / 2) * (-20.02203-(-6.06164)));
            yy = 4.46734 + (((tickAnim - 3) / 2) * (-11.06887-(4.46734)));
            zz = -12.48448 + (((tickAnim - 3) / 2) * (-7.95741-(-12.48448)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -20.02203 + (((tickAnim - 5) / 8) * (-44.89008-(-20.02203)));
            yy = -11.06887 + (((tickAnim - 5) / 8) * (19.3409-(-11.06887)));
            zz = -7.95741 + (((tickAnim - 5) / 8) * (-44.4513-(-7.95741)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -44.89008 + (((tickAnim - 13) / 1) * (-35.36074-(-44.89008)));
            yy = 19.3409 + (((tickAnim - 13) / 1) * (53.8169-(19.3409)));
            zz = -44.4513 + (((tickAnim - 13) / 1) * (-80.0572-(-44.4513)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -35.36074 + (((tickAnim - 14) / 3) * (-47.49756-(-35.36074)));
            yy = 53.8169 + (((tickAnim - 14) / 3) * (36.8884-(53.8169)));
            zz = -80.0572 + (((tickAnim - 14) / 3) * (-106.4342-(-80.0572)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = -47.49756 + (((tickAnim - 17) / 2) * (-12.56664-(-47.49756)));
            yy = 36.8884 + (((tickAnim - 17) / 2) * (30.5402-(36.8884)));
            zz = -106.4342 + (((tickAnim - 17) / 2) * (-77.4677-(-106.4342)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -12.56664 + (((tickAnim - 19) / 4) * (-7.23654-(-12.56664)));
            yy = 30.5402 + (((tickAnim - 19) / 4) * (6.1421-(30.5402)));
            zz = -77.4677 + (((tickAnim - 19) / 4) * (-14.5292-(-77.4677)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -7.23654 + (((tickAnim - 23) / 2) * (-8.49782-(-7.23654)));
            yy = 6.1421 + (((tickAnim - 23) / 2) * (30.09255-(6.1421)));
            zz = -14.5292 + (((tickAnim - 23) / 2) * (-17.81303-(-14.5292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0.235-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0.235 + (((tickAnim - 3) / 2) * (0.3-(0.235)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0.3 + (((tickAnim - 5) / 3) * (0.855-(0.3)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0.855 + (((tickAnim - 8) / 5) * (0.65-(0.855)));
            yy = -0.425 + (((tickAnim - 8) / 5) * (-0.225-(-0.425)));
            zz = 0.225 + (((tickAnim - 8) / 5) * (0-(0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0.65 + (((tickAnim - 13) / 4) * (1.755-(0.65)));
            yy = -0.225 + (((tickAnim - 13) / 4) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 1.755 + (((tickAnim - 17) / 2) * (1.025-(1.755)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 1.025 + (((tickAnim - 19) / 4) * (0.2-(1.025)));
            yy = 0 + (((tickAnim - 19) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 0.2 + (((tickAnim - 23) / 2) * (0-(0.2)));
            yy = 0 + (((tickAnim - 23) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 58.63454 + (((tickAnim - 0) / 7) * (-8.79513-(58.63454)));
            yy = -19.9536 + (((tickAnim - 0) / 7) * (23.62091-(-19.9536)));
            zz = -20.65589 + (((tickAnim - 0) / 7) * (-47.86623-(-20.65589)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -8.79513 + (((tickAnim - 7) / 6) * (6.2985-(-8.79513)));
            yy = 23.62091 + (((tickAnim - 7) / 6) * (48.7815-(23.62091)));
            zz = -47.86623 + (((tickAnim - 7) / 6) * (10.5655-(-47.86623)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 6.2985 + (((tickAnim - 13) / 12) * (58.63454-(6.2985)));
            yy = 48.7815 + (((tickAnim - 13) / 12) * (-19.9536-(48.7815)));
            zz = 10.5655 + (((tickAnim - 13) / 12) * (-20.65589-(10.5655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 64.82227 + (((tickAnim - 0) / 7) * (-1.18195-(64.82227)));
            yy = -12.61504 + (((tickAnim - 0) / 7) * (1.29773-(-12.61504)));
            zz = -3.1474 + (((tickAnim - 0) / 7) * (25.06965-(-3.1474)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -1.18195 + (((tickAnim - 7) / 6) * (0-(-1.18195)));
            yy = 1.29773 + (((tickAnim - 7) / 6) * (0-(1.29773)));
            zz = 25.06965 + (((tickAnim - 7) / 6) * (-21.5-(25.06965)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (64.82227-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-12.61504-(0)));
            zz = -21.5 + (((tickAnim - 13) / 12) * (-3.1474-(-21.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = -0.275 + (((tickAnim - 0) / 13) * (0-(-0.275)));
            yy = -0.55 + (((tickAnim - 0) / 13) * (0-(-0.55)));
            zz = -0.225 + (((tickAnim - 0) / 13) * (0-(-0.225)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -44.89008 + (((tickAnim - 0) / 2) * (-35.36074-(-44.89008)));
            yy = -19.34088 + (((tickAnim - 0) / 2) * (-53.81687-(-19.34088)));
            zz = 44.45134 + (((tickAnim - 0) / 2) * (80.05717-(44.45134)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -35.36074 + (((tickAnim - 2) / 2) * (-47.49756-(-35.36074)));
            yy = -53.81687 + (((tickAnim - 2) / 2) * (-36.88838-(-53.81687)));
            zz = 80.05717 + (((tickAnim - 2) / 2) * (106.43418-(80.05717)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -47.49756 + (((tickAnim - 4) / 3) * (-12.56664-(-47.49756)));
            yy = -36.88838 + (((tickAnim - 4) / 3) * (-30.54022-(-36.88838)));
            zz = 106.43418 + (((tickAnim - 4) / 3) * (77.46769-(106.43418)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -12.56664 + (((tickAnim - 7) / 3) * (-7.23654-(-12.56664)));
            yy = -30.54022 + (((tickAnim - 7) / 3) * (-6.14205-(-30.54022)));
            zz = 77.46769 + (((tickAnim - 7) / 3) * (14.52921-(77.46769)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -7.23654 + (((tickAnim - 10) / 3) * (-8.49782-(-7.23654)));
            yy = -6.14205 + (((tickAnim - 10) / 3) * (-30.0925-(-6.14205)));
            zz = 14.52921 + (((tickAnim - 10) / 3) * (17.813-(14.52921)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -8.49782 + (((tickAnim - 13) / 3) * (-6.31846-(-8.49782)));
            yy = -30.0925 + (((tickAnim - 13) / 3) * (1.00467-(-30.0925)));
            zz = 17.813 + (((tickAnim - 13) / 3) * (16.85291-(17.813)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -6.31846 + (((tickAnim - 16) / 2) * (-4.60701-(-6.31846)));
            yy = 1.00467 + (((tickAnim - 16) / 2) * (19.90258-(1.00467)));
            zz = 16.85291 + (((tickAnim - 16) / 2) * (2.62701-(16.85291)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -4.60701 + (((tickAnim - 18) / 7) * (-44.89008-(-4.60701)));
            yy = 19.90258 + (((tickAnim - 18) / 7) * (-19.34088-(19.90258)));
            zz = 2.62701 + (((tickAnim - 18) / 7) * (44.45134-(2.62701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-1.755-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 7) {
            xx = -1.755 + (((tickAnim - 4) / 3) * (-1.025-(-1.755)));
            yy = 0 + (((tickAnim - 4) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 3) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -1.025 + (((tickAnim - 7) / 3) * (0-(-1.025)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -0.15 + (((tickAnim - 13) / 3) * (-0.36-(-0.15)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -0.36 + (((tickAnim - 16) / 2) * (-0.35-(-0.36)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 18) {
            xx = -0.35 + (((tickAnim - 18) / 0) * (-0.2-(-0.35)));
            yy = 0 + (((tickAnim - 18) / 0) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 0) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 21) {
            xx = -0.2 + (((tickAnim - 18) / 3) * (-0.855-(-0.2)));
            yy = 0 + (((tickAnim - 18) / 3) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 18) / 3) * (0.225-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 25) {
            xx = -0.855 + (((tickAnim - 21) / 4) * (0-(-0.855)));
            yy = -0.425 + (((tickAnim - 21) / 4) * (0-(-0.425)));
            zz = 0.225 + (((tickAnim - 21) / 4) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 25.33825 + (((tickAnim - 0) / 7) * (10.82636-(25.33825)));
            yy = 56.62356 + (((tickAnim - 0) / 7) * (15.10971-(56.62356)));
            zz = 19.29537 + (((tickAnim - 0) / 7) * (65.67175-(19.29537)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 10.82636 + (((tickAnim - 7) / 6) * (16.40701-(10.82636)));
            yy = 15.10971 + (((tickAnim - 7) / 6) * (-20.3198-(15.10971)));
            zz = 65.67175 + (((tickAnim - 7) / 6) * (-25.9829-(65.67175)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 16.40701 + (((tickAnim - 13) / 12) * (25.33825-(16.40701)));
            yy = -20.3198 + (((tickAnim - 13) / 12) * (56.62356-(-20.3198)));
            zz = -25.9829 + (((tickAnim - 13) / 12) * (19.29537-(-25.9829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 86.25 + (((tickAnim - 0) / 3) * (84.08025-(86.25)));
            yy = 10.5 + (((tickAnim - 0) / 3) * (19.60984-(10.5)));
            zz = 0 + (((tickAnim - 0) / 3) * (-29.58701-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 84.08025 + (((tickAnim - 3) / 4) * (82.14217-(84.08025)));
            yy = 19.60984 + (((tickAnim - 3) / 4) * (-11.542-(19.60984)));
            zz = -29.58701 + (((tickAnim - 3) / 4) * (-62.24096-(-29.58701)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 82.14217 + (((tickAnim - 7) / 3) * (36.67972-(82.14217)));
            yy = -11.542 + (((tickAnim - 7) / 3) * (-47.45847-(-11.542)));
            zz = -62.24096 + (((tickAnim - 7) / 3) * (10.95078-(-62.24096)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 36.67972 + (((tickAnim - 10) / 3) * (19.623-(36.67972)));
            yy = -47.45847 + (((tickAnim - 10) / 3) * (-7.6312-(-47.45847)));
            zz = 10.95078 + (((tickAnim - 10) / 3) * (20.4284-(10.95078)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 19.623 + (((tickAnim - 13) / 12) * (86.25-(19.623)));
            yy = -7.6312 + (((tickAnim - 13) / 12) * (10.5-(-7.6312)));
            zz = 20.4284 + (((tickAnim - 13) / 12) * (0-(20.4284)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0.6 + (((tickAnim - 0) / 13) * (0-(0.6)));
            yy = -0.525 + (((tickAnim - 0) / 13) * (0-(-0.525)));
            zz = -0.45 + (((tickAnim - 0) / 13) * (0-(-0.45)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0.6-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-17.19639-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.39634-(0)));
            zz = -56.75 + (((tickAnim - 0) / 3) * (-103.62968-(-56.75)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -17.19639 + (((tickAnim - 3) / 4) * (-21.06422-(-17.19639)));
            yy = 2.39634 + (((tickAnim - 3) / 4) * (-3.70724-(2.39634)));
            zz = -103.62968 + (((tickAnim - 3) / 4) * (-85.39899-(-103.62968)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -21.06422 + (((tickAnim - 7) / 3) * (-14.66276-(-21.06422)));
            yy = -3.70724 + (((tickAnim - 7) / 3) * (-6.72387-(-3.70724)));
            zz = -85.39899 + (((tickAnim - 7) / 3) * (-87.55442-(-85.39899)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -14.66276 + (((tickAnim - 10) / 3) * (-3.02102-(-14.66276)));
            yy = -6.72387 + (((tickAnim - 10) / 3) * (10.5108-(-6.72387)));
            zz = -87.55442 + (((tickAnim - 10) / 3) * (-17.6027-(-87.55442)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -3.02102 + (((tickAnim - 13) / 5) * (5.40855-(-3.02102)));
            yy = 10.5108 + (((tickAnim - 13) / 5) * (-27.90775-(10.5108)));
            zz = -17.6027 + (((tickAnim - 13) / 5) * (0.99002-(-17.6027)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 5.40855 + (((tickAnim - 18) / 4) * (8.88684-(5.40855)));
            yy = -27.90775 + (((tickAnim - 18) / 4) * (-7.79465-(-27.90775)));
            zz = 0.99002 + (((tickAnim - 18) / 4) * (-36.62495-(0.99002)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 8.88684 + (((tickAnim - 22) / 3) * (0-(8.88684)));
            yy = -7.79465 + (((tickAnim - 22) / 3) * (0-(-7.79465)));
            zz = -36.62495 + (((tickAnim - 22) / 3) * (-56.75-(-36.62495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0.8 + (((tickAnim - 7) / 3) * (0.825-(0.8)));
            yy = 0.225 + (((tickAnim - 7) / 3) * (0.36-(0.225)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0.825 + (((tickAnim - 10) / 3) * (0.1-(0.825)));
            yy = 0.36 + (((tickAnim - 10) / 3) * (0-(0.36)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.1 + (((tickAnim - 13) / 2) * (0.63-(0.1)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0.08-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 16) {
            xx = 0.63 + (((tickAnim - 15) / 1) * (0.715-(0.63)));
            yy = 0 + (((tickAnim - 15) / 1) * (0-(0)));
            zz = 0.08 + (((tickAnim - 15) / 1) * (0.125-(0.08)));
        }
        else if (tickAnim >= 16 && tickAnim < 17) {
            xx = 0.715 + (((tickAnim - 16) / 1) * (0.805-(0.715)));
            yy = 0 + (((tickAnim - 16) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 16) / 1) * (0-(0.125)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0.805 + (((tickAnim - 17) / 1) * (0.71-(0.805)));
            yy = 0 + (((tickAnim - 17) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 1) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0.71 + (((tickAnim - 18) / 4) * (0.845-(0.71)));
            yy = 0 + (((tickAnim - 18) / 4) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0.845 + (((tickAnim - 22) / 3) * (0-(0.845)));
            yy = -0.375 + (((tickAnim - 22) / 3) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 22) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 16.40701 + (((tickAnim - 0) / 13) * (25.33825-(16.40701)));
            yy = 20.31984 + (((tickAnim - 0) / 13) * (-56.6236-(20.31984)));
            zz = 25.98292 + (((tickAnim - 0) / 13) * (-19.2954-(25.98292)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 25.33825 + (((tickAnim - 13) / 6) * (10.82636-(25.33825)));
            yy = -56.6236 + (((tickAnim - 13) / 6) * (-15.1097-(-56.6236)));
            zz = -19.2954 + (((tickAnim - 13) / 6) * (-65.6718-(-19.2954)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 10.82636 + (((tickAnim - 19) / 6) * (16.40701-(10.82636)));
            yy = -15.1097 + (((tickAnim - 19) / 6) * (20.31984-(-15.1097)));
            zz = -65.6718 + (((tickAnim - 19) / 6) * (25.98292-(-65.6718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 19.62301 + (((tickAnim - 0) / 13) * (89.37261-(19.62301)));
            yy = 7.63119 + (((tickAnim - 0) / 13) * (-11.12502-(7.63119)));
            zz = -20.42839 + (((tickAnim - 0) / 13) * (-16.5336-(-20.42839)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 89.37261 + (((tickAnim - 13) / 2) * (84.08025-(89.37261)));
            yy = -11.12502 + (((tickAnim - 13) / 2) * (-19.6098-(-11.12502)));
            zz = -16.5336 + (((tickAnim - 13) / 2) * (29.587-(-16.5336)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = 84.08025 + (((tickAnim - 15) / 4) * (82.14217-(84.08025)));
            yy = -19.6098 + (((tickAnim - 15) / 4) * (11.542-(-19.6098)));
            zz = 29.587 + (((tickAnim - 15) / 4) * (62.241-(29.587)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = 82.14217 + (((tickAnim - 19) / 4) * (36.67972-(82.14217)));
            yy = 11.542 + (((tickAnim - 19) / 4) * (47.4585-(11.542)));
            zz = 62.241 + (((tickAnim - 19) / 4) * (-10.9508-(62.241)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 36.67972 + (((tickAnim - 23) / 2) * (19.62301-(36.67972)));
            yy = 47.4585 + (((tickAnim - 23) / 2) * (7.63119-(47.4585)));
            zz = -10.9508 + (((tickAnim - 23) / 2) * (-20.42839-(-10.9508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.45-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -0.6 + (((tickAnim - 13) / 12) * (0-(-0.6)));
            yy = -0.525 + (((tickAnim - 13) / 12) * (0-(-0.525)));
            zz = -0.45 + (((tickAnim - 13) / 12) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = -3.02102 + (((tickAnim - 0) / 4) * (10.77554-(-3.02102)));
            yy = -10.5108 + (((tickAnim - 0) / 4) * (30.62325-(-10.5108)));
            zz = 17.60268 + (((tickAnim - 0) / 4) * (1.81369-(17.60268)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10.77554 + (((tickAnim - 4) / 4) * (5.89124-(10.77554)));
            yy = 30.62325 + (((tickAnim - 4) / 4) * (42.01385-(30.62325)));
            zz = 1.81369 + (((tickAnim - 4) / 4) * (-0.6633-(1.81369)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 5.89124 + (((tickAnim - 8) / 2) * (-8.27522-(5.89124)));
            yy = 42.01385 + (((tickAnim - 8) / 2) * (24.77269-(42.01385)));
            zz = -0.6633 + (((tickAnim - 8) / 2) * (6.59574-(-0.6633)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -8.27522 + (((tickAnim - 10) / 3) * (0-(-8.27522)));
            yy = 24.77269 + (((tickAnim - 10) / 3) * (0-(24.77269)));
            zz = 6.59574 + (((tickAnim - 10) / 3) * (56.75-(6.59574)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (-17.19639-(0)));
            yy = 0 + (((tickAnim - 13) / 2) * (2.39634-(0)));
            zz = 56.75 + (((tickAnim - 13) / 2) * (103.6297-(56.75)));
        }
        else if (tickAnim >= 15 && tickAnim < 19) {
            xx = -17.19639 + (((tickAnim - 15) / 4) * (-21.06422-(-17.19639)));
            yy = 2.39634 + (((tickAnim - 15) / 4) * (3.7072-(2.39634)));
            zz = 103.6297 + (((tickAnim - 15) / 4) * (85.399-(103.6297)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -21.06422 + (((tickAnim - 19) / 4) * (-14.66276-(-21.06422)));
            yy = 3.7072 + (((tickAnim - 19) / 4) * (-6.72387-(3.7072)));
            zz = 85.399 + (((tickAnim - 19) / 4) * (87.5544-(85.399)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -14.66276 + (((tickAnim - 23) / 2) * (-3.02102-(-14.66276)));
            yy = -6.72387 + (((tickAnim - 23) / 2) * (-10.5108-(-6.72387)));
            zz = 87.5544 + (((tickAnim - 23) / 2) * (17.60268-(87.5544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -0.25 + (((tickAnim - 0) / 2) * (-0.61-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.125-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.61 + (((tickAnim - 2) / 1) * (-0.61-(-0.61)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 2) / 1) * (0.125-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.61 + (((tickAnim - 3) / 1) * (-0.615-(-0.61)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 3) / 1) * (0-(0.125)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -0.615 + (((tickAnim - 4) / 4) * (-0.305-(-0.615)));
            yy = 0 + (((tickAnim - 4) / 4) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -0.305 + (((tickAnim - 8) / 2) * (-0.555-(-0.305)));
            yy = -0.375 + (((tickAnim - 8) / 2) * (-0.5-(-0.375)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -0.555 + (((tickAnim - 10) / 3) * (-0.225-(-0.555)));
            yy = -0.5 + (((tickAnim - 10) / 3) * (-0.2-(-0.5)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = -0.225 + (((tickAnim - 13) / 6) * (-0.8-(-0.225)));
            yy = -0.2 + (((tickAnim - 13) / 6) * (0.225-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 23) {
            xx = -0.8 + (((tickAnim - 19) / 4) * (-0.825-(-0.8)));
            yy = 0.225 + (((tickAnim - 19) / 4) * (0.36-(0.225)));
            zz = 0 + (((tickAnim - 19) / 4) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -0.825 + (((tickAnim - 23) / 2) * (-0.25-(-0.825)));
            yy = 0.36 + (((tickAnim - 23) / 2) * (0-(0.36)));
            zz = 0 + (((tickAnim - 23) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*1.2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288))*0.15);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5))*0.15);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-100))*5), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-3.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-200))*10), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(3.33102), tail3.rotateAngleY + (float) Math.toRadians(1.5363+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-250))*15), tail3.rotateAngleZ + (float) Math.toRadians(-2.06768));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-120))*-5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-50))*-7), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288+50))*1));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288/0.5-50))*-1.3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-150))*-5), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*288-130))*7), head.rotateAngleZ + (float) Math.toRadians(0));


    }
    public void animSwim(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSilvanerpeton entity = (EntityPrehistoricFloraSilvanerpeton) entitylivingbaseIn;
        int animCycle = 12;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-15), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(8.75), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575+50))*15), tail1.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(15.5), tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*-25), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-28.75), tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-150))*-35), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(75.00261), legright.rotateAngleY + (float) Math.toRadians(37.8907+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-8), legright.rotateAngleZ + (float) Math.toRadians(22.6246+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-5));
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(-60.48427), legright3.rotateAngleY + (float) Math.toRadians(1.1862), legright3.rotateAngleZ + (float) Math.toRadians(-72.1467));
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(75.00261), legleft.rotateAngleY + (float) Math.toRadians(-37.8907+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-8), legleft.rotateAngleZ + (float) Math.toRadians(-22.6246+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575))*-5));
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(-60.48427), legleft3.rotateAngleY + (float) Math.toRadians(-1.18623), legleft3.rotateAngleZ + (float) Math.toRadians(72.14675));
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-50))*15), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-200))*-15), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(68.11319), armright.rotateAngleY + (float) Math.toRadians(63.97767), armright.rotateAngleZ + (float) Math.toRadians(25.93548));
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(-20.23664), armright3.rotateAngleY + (float) Math.toRadians(0.1543), armright3.rotateAngleZ + (float) Math.toRadians(-74.9953));
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(68.11319), armleft.rotateAngleY + (float) Math.toRadians(-63.9777), armleft.rotateAngleZ + (float) Math.toRadians(-25.9355));
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(-20.23664), armleft3.rotateAngleY + (float) Math.toRadians(0.1543), armleft3.rotateAngleZ + (float) Math.toRadians(74.9953));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-100))*-15), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*575-180))*-15), head.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraSilvanerpeton entity = (EntityPrehistoricFloraSilvanerpeton) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 6.2985 + (((tickAnim - 0) / 8) * (58.63454-(6.2985)));
            yy = -48.78147 + (((tickAnim - 0) / 8) * (19.9536-(-48.78147)));
            zz = -10.56548 + (((tickAnim - 0) / 8) * (20.6559-(-10.56548)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 58.63454 + (((tickAnim - 8) / 4) * (-8.79513-(58.63454)));
            yy = 19.9536 + (((tickAnim - 8) / 4) * (-23.6209-(19.9536)));
            zz = 20.6559 + (((tickAnim - 8) / 4) * (47.8662-(20.6559)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -8.79513 + (((tickAnim - 12) / 3) * (6.2985-(-8.79513)));
            yy = -23.6209 + (((tickAnim - 12) / 3) * (-48.78147-(-23.6209)));
            zz = 47.8662 + (((tickAnim - 12) / 3) * (-10.56548-(47.8662)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright, legright.rotateAngleX + (float) Math.toRadians(xx), legright.rotateAngleY + (float) Math.toRadians(yy), legright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (64.82227-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-12.61504-(0)));
            zz = 21.5 + (((tickAnim - 0) / 8) * (-3.1474-(21.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 64.82227 + (((tickAnim - 8) / 4) * (-1.18195-(64.82227)));
            yy = -12.61504 + (((tickAnim - 8) / 4) * (-1.2977-(-12.61504)));
            zz = -3.1474 + (((tickAnim - 8) / 4) * (-25.0697-(-3.1474)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -1.18195 + (((tickAnim - 12) / 3) * (0-(-1.18195)));
            yy = -1.2977 + (((tickAnim - 12) / 3) * (0-(-1.2977)));
            zz = -25.0697 + (((tickAnim - 12) / 3) * (21.5-(-25.0697)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright2, legright2.rotateAngleX + (float) Math.toRadians(xx), legright2.rotateAngleY + (float) Math.toRadians(yy), legright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0.275-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.225-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0.275 + (((tickAnim - 8) / 7) * (0-(0.275)));
            yy = -0.55 + (((tickAnim - 8) / 7) * (0-(-0.55)));
            zz = -0.225 + (((tickAnim - 8) / 7) * (0-(-0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright2.rotationPointX = this.legright2.rotationPointX + (float)(xx);
        this.legright2.rotationPointY = this.legright2.rotationPointY - (float)(yy);
        this.legright2.rotationPointZ = this.legright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = -8.49782 + (((tickAnim - 0) / 2) * (-6.06164-(-8.49782)));
            yy = 30.09255 + (((tickAnim - 0) / 2) * (4.46734-(30.09255)));
            zz = -17.81303 + (((tickAnim - 0) / 2) * (-12.48448-(-17.81303)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -6.06164 + (((tickAnim - 2) / 1) * (-20.02203-(-6.06164)));
            yy = 4.46734 + (((tickAnim - 2) / 1) * (-11.06887-(4.46734)));
            zz = -12.48448 + (((tickAnim - 2) / 1) * (-7.95741-(-12.48448)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -20.02203 + (((tickAnim - 3) / 5) * (-44.89008-(-20.02203)));
            yy = -11.06887 + (((tickAnim - 3) / 5) * (19.3409-(-11.06887)));
            zz = -7.95741 + (((tickAnim - 3) / 5) * (-44.4513-(-7.95741)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = -44.89008 + (((tickAnim - 8) / 0) * (-35.36074-(-44.89008)));
            yy = 19.3409 + (((tickAnim - 8) / 0) * (53.8169-(19.3409)));
            zz = -44.4513 + (((tickAnim - 8) / 0) * (-80.0572-(-44.4513)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -35.36074 + (((tickAnim - 8) / 2) * (-47.49756-(-35.36074)));
            yy = 53.8169 + (((tickAnim - 8) / 2) * (36.8884-(53.8169)));
            zz = -80.0572 + (((tickAnim - 8) / 2) * (-106.4342-(-80.0572)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = -47.49756 + (((tickAnim - 10) / 2) * (-12.56664-(-47.49756)));
            yy = 36.8884 + (((tickAnim - 10) / 2) * (30.5402-(36.8884)));
            zz = -106.4342 + (((tickAnim - 10) / 2) * (-77.4677-(-106.4342)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -12.56664 + (((tickAnim - 12) / 1) * (-7.23654-(-12.56664)));
            yy = 30.5402 + (((tickAnim - 12) / 1) * (6.1421-(30.5402)));
            zz = -77.4677 + (((tickAnim - 12) / 1) * (-14.5292-(-77.4677)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -7.23654 + (((tickAnim - 13) / 2) * (-8.49782-(-7.23654)));
            yy = 6.1421 + (((tickAnim - 13) / 2) * (30.09255-(6.1421)));
            zz = -14.5292 + (((tickAnim - 13) / 2) * (-17.81303-(-14.5292)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legright3, legright3.rotateAngleX + (float) Math.toRadians(xx), legright3.rotateAngleY + (float) Math.toRadians(yy), legright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0.125 + (((tickAnim - 0) / 2) * (0.385-(0.125)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0.385 + (((tickAnim - 2) / 1) * (0.6-(0.385)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 0.6 + (((tickAnim - 3) / 1) * (1.055-(0.6)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0.225-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.055 + (((tickAnim - 4) / 4) * (0.65-(1.055)));
            yy = -0.425 + (((tickAnim - 4) / 4) * (-0.225-(-0.425)));
            zz = 0.225 + (((tickAnim - 4) / 4) * (0-(0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0.65 + (((tickAnim - 8) / 2) * (1.755-(0.65)));
            yy = -0.225 + (((tickAnim - 8) / 2) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 1.755 + (((tickAnim - 10) / 2) * (1.025-(1.755)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 1.025 + (((tickAnim - 12) / 1) * (0.2-(1.025)));
            yy = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.2 + (((tickAnim - 13) / 2) * (0-(0.2)));
            yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legright3.rotationPointX = this.legright3.rotationPointX + (float)(xx);
        this.legright3.rotationPointY = this.legright3.rotationPointY - (float)(yy);
        this.legright3.rotationPointZ = this.legright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 58.63454 + (((tickAnim - 0) / 4) * (-8.79513-(58.63454)));
            yy = -19.9536 + (((tickAnim - 0) / 4) * (23.62091-(-19.9536)));
            zz = -20.65589 + (((tickAnim - 0) / 4) * (-47.86623-(-20.65589)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -8.79513 + (((tickAnim - 4) / 4) * (6.2985-(-8.79513)));
            yy = 23.62091 + (((tickAnim - 4) / 4) * (48.7815-(23.62091)));
            zz = -47.86623 + (((tickAnim - 4) / 4) * (10.5655-(-47.86623)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 6.2985 + (((tickAnim - 8) / 7) * (58.63454-(6.2985)));
            yy = 48.7815 + (((tickAnim - 8) / 7) * (-19.9536-(48.7815)));
            zz = 10.5655 + (((tickAnim - 8) / 7) * (-20.65589-(10.5655)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft, legleft.rotateAngleX + (float) Math.toRadians(xx), legleft.rotateAngleY + (float) Math.toRadians(yy), legleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 64.82227 + (((tickAnim - 0) / 4) * (-1.18195-(64.82227)));
            yy = -12.61504 + (((tickAnim - 0) / 4) * (1.29773-(-12.61504)));
            zz = -3.1474 + (((tickAnim - 0) / 4) * (25.06965-(-3.1474)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -1.18195 + (((tickAnim - 4) / 4) * (0-(-1.18195)));
            yy = 1.29773 + (((tickAnim - 4) / 4) * (0-(1.29773)));
            zz = 25.06965 + (((tickAnim - 4) / 4) * (-21.5-(25.06965)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (64.82227-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-12.61504-(0)));
            zz = -21.5 + (((tickAnim - 8) / 7) * (-3.1474-(-21.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft2, legleft2.rotateAngleX + (float) Math.toRadians(xx), legleft2.rotateAngleY + (float) Math.toRadians(yy), legleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -0.275 + (((tickAnim - 0) / 8) * (0-(-0.275)));
            yy = -0.55 + (((tickAnim - 0) / 8) * (0-(-0.55)));
            zz = -0.225 + (((tickAnim - 0) / 8) * (0-(-0.225)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-0.275-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.55-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.225-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft2.rotationPointX = this.legleft2.rotationPointX + (float)(xx);
        this.legleft2.rotationPointY = this.legleft2.rotationPointY - (float)(yy);
        this.legleft2.rotationPointZ = this.legleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -44.89008 + (((tickAnim - 0) / 1) * (-35.36074-(-44.89008)));
            yy = -19.34088 + (((tickAnim - 0) / 1) * (-53.81687-(-19.34088)));
            zz = 44.45134 + (((tickAnim - 0) / 1) * (80.05717-(44.45134)));
        }
        else if (tickAnim >= 1 && tickAnim < 3) {
            xx = -35.36074 + (((tickAnim - 1) / 2) * (-47.49756-(-35.36074)));
            yy = -53.81687 + (((tickAnim - 1) / 2) * (-36.88838-(-53.81687)));
            zz = 80.05717 + (((tickAnim - 1) / 2) * (106.43418-(80.05717)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -47.49756 + (((tickAnim - 3) / 1) * (-12.56664-(-47.49756)));
            yy = -36.88838 + (((tickAnim - 3) / 1) * (-30.54022-(-36.88838)));
            zz = 106.43418 + (((tickAnim - 3) / 1) * (77.46769-(106.43418)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -12.56664 + (((tickAnim - 4) / 2) * (-7.23654-(-12.56664)));
            yy = -30.54022 + (((tickAnim - 4) / 2) * (-6.14205-(-30.54022)));
            zz = 77.46769 + (((tickAnim - 4) / 2) * (14.52921-(77.46769)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -7.23654 + (((tickAnim - 6) / 2) * (-8.49782-(-7.23654)));
            yy = -6.14205 + (((tickAnim - 6) / 2) * (-30.0925-(-6.14205)));
            zz = 14.52921 + (((tickAnim - 6) / 2) * (17.813-(14.52921)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -8.49782 + (((tickAnim - 8) / 1) * (-6.31846-(-8.49782)));
            yy = -30.0925 + (((tickAnim - 8) / 1) * (1.00467-(-30.0925)));
            zz = 17.813 + (((tickAnim - 8) / 1) * (16.85291-(17.813)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
            xx = -6.31846 + (((tickAnim - 9) / 2) * (-4.60701-(-6.31846)));
            yy = 1.00467 + (((tickAnim - 9) / 2) * (19.90258-(1.00467)));
            zz = 16.85291 + (((tickAnim - 9) / 2) * (2.62701-(16.85291)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
            xx = -4.60701 + (((tickAnim - 11) / 4) * (-44.89008-(-4.60701)));
            yy = 19.90258 + (((tickAnim - 11) / 4) * (-19.34088-(19.90258)));
            zz = 2.62701 + (((tickAnim - 11) / 4) * (44.45134-(2.62701)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(legleft3, legleft3.rotateAngleX + (float) Math.toRadians(xx), legleft3.rotateAngleY + (float) Math.toRadians(yy), legleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-1.755-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -1.755 + (((tickAnim - 3) / 1) * (-1.025-(-1.755)));
            yy = 0 + (((tickAnim - 3) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -1.025 + (((tickAnim - 4) / 2) * (0-(-1.025)));
            yy = 0 + (((tickAnim - 4) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (-0.15-(0)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = -0.15 + (((tickAnim - 8) / 1) * (-0.585-(-0.15)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = -0.585 + (((tickAnim - 9) / 1) * (-0.55-(-0.585)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = -0.55 + (((tickAnim - 10) / 1) * (-0.4-(-0.55)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -0.4 + (((tickAnim - 11) / 2) * (-0.855-(-0.4)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0.225-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.855 + (((tickAnim - 13) / 2) * (0-(-0.855)));
            yy = -0.425 + (((tickAnim - 13) / 2) * (0-(-0.425)));
            zz = 0.225 + (((tickAnim - 13) / 2) * (0-(0.225)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.legleft3.rotationPointX = this.legleft3.rotationPointX + (float)(xx);
        this.legleft3.rotationPointY = this.legleft3.rotationPointY - (float)(yy);
        this.legleft3.rotationPointZ = this.legleft3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 25.33825 + (((tickAnim - 0) / 4) * (10.82636-(25.33825)));
            yy = 56.62356 + (((tickAnim - 0) / 4) * (15.10971-(56.62356)));
            zz = 19.29537 + (((tickAnim - 0) / 4) * (65.67175-(19.29537)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 10.82636 + (((tickAnim - 4) / 4) * (16.40701-(10.82636)));
            yy = 15.10971 + (((tickAnim - 4) / 4) * (-20.3198-(15.10971)));
            zz = 65.67175 + (((tickAnim - 4) / 4) * (-25.9829-(65.67175)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 16.40701 + (((tickAnim - 8) / 7) * (25.33825-(16.40701)));
            yy = -20.3198 + (((tickAnim - 8) / 7) * (56.62356-(-20.3198)));
            zz = -25.9829 + (((tickAnim - 8) / 7) * (19.29537-(-25.9829)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright, armright.rotateAngleX + (float) Math.toRadians(xx), armright.rotateAngleY + (float) Math.toRadians(yy), armright.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 86.25 + (((tickAnim - 0) / 2) * (84.08025-(86.25)));
            yy = 10.5 + (((tickAnim - 0) / 2) * (19.60984-(10.5)));
            zz = 0 + (((tickAnim - 0) / 2) * (-29.58701-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 84.08025 + (((tickAnim - 2) / 2) * (82.14217-(84.08025)));
            yy = 19.60984 + (((tickAnim - 2) / 2) * (-11.542-(19.60984)));
            zz = -29.58701 + (((tickAnim - 2) / 2) * (-62.24096-(-29.58701)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 82.14217 + (((tickAnim - 4) / 2) * (36.67972-(82.14217)));
            yy = -11.542 + (((tickAnim - 4) / 2) * (-47.45847-(-11.542)));
            zz = -62.24096 + (((tickAnim - 4) / 2) * (10.95078-(-62.24096)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 36.67972 + (((tickAnim - 6) / 2) * (19.623-(36.67972)));
            yy = -47.45847 + (((tickAnim - 6) / 2) * (-7.6312-(-47.45847)));
            zz = 10.95078 + (((tickAnim - 6) / 2) * (20.4284-(10.95078)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 19.623 + (((tickAnim - 8) / 7) * (86.25-(19.623)));
            yy = -7.6312 + (((tickAnim - 8) / 7) * (10.5-(-7.6312)));
            zz = 20.4284 + (((tickAnim - 8) / 7) * (0-(20.4284)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright2, armright2.rotateAngleX + (float) Math.toRadians(xx), armright2.rotateAngleY + (float) Math.toRadians(yy), armright2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0.6 + (((tickAnim - 0) / 8) * (0-(0.6)));
            yy = -0.525 + (((tickAnim - 0) / 8) * (0-(-0.525)));
            zz = -0.45 + (((tickAnim - 0) / 8) * (0-(-0.45)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0.6-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright2.rotationPointX = this.armright2.rotationPointX + (float)(xx);
        this.armright2.rotationPointY = this.armright2.rotationPointY - (float)(yy);
        this.armright2.rotationPointZ = this.armright2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (-17.19639-(0)));
            yy = 0 + (((tickAnim - 0) / 2) * (2.39634-(0)));
            zz = -56.75 + (((tickAnim - 0) / 2) * (-103.62968-(-56.75)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = -17.19639 + (((tickAnim - 2) / 2) * (-21.06422-(-17.19639)));
            yy = 2.39634 + (((tickAnim - 2) / 2) * (-3.70724-(2.39634)));
            zz = -103.62968 + (((tickAnim - 2) / 2) * (-85.39899-(-103.62968)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -21.06422 + (((tickAnim - 4) / 2) * (-14.66276-(-21.06422)));
            yy = -3.70724 + (((tickAnim - 4) / 2) * (-6.72387-(-3.70724)));
            zz = -85.39899 + (((tickAnim - 4) / 2) * (-87.55442-(-85.39899)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -14.66276 + (((tickAnim - 6) / 2) * (-3.02102-(-14.66276)));
            yy = -6.72387 + (((tickAnim - 6) / 2) * (10.5108-(-6.72387)));
            zz = -87.55442 + (((tickAnim - 6) / 2) * (-17.6027-(-87.55442)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = -3.02102 + (((tickAnim - 8) / 3) * (5.40855-(-3.02102)));
            yy = 10.5108 + (((tickAnim - 8) / 3) * (-27.90775-(10.5108)));
            zz = -17.6027 + (((tickAnim - 8) / 3) * (0.99002-(-17.6027)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 5.40855 + (((tickAnim - 11) / 2) * (8.88684-(5.40855)));
            yy = -27.90775 + (((tickAnim - 11) / 2) * (-7.79465-(-27.90775)));
            zz = 0.99002 + (((tickAnim - 11) / 2) * (-36.62495-(0.99002)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 8.88684 + (((tickAnim - 13) / 2) * (0-(8.88684)));
            yy = -7.79465 + (((tickAnim - 13) / 2) * (0-(-7.79465)));
            zz = -36.62495 + (((tickAnim - 13) / 2) * (-56.75-(-36.62495)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armright3, armright3.rotateAngleX + (float) Math.toRadians(xx), armright3.rotateAngleY + (float) Math.toRadians(yy), armright3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0.8-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 0.8 + (((tickAnim - 4) / 2) * (0.825-(0.8)));
            yy = 0.225 + (((tickAnim - 4) / 2) * (0.36-(0.225)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0.825 + (((tickAnim - 6) / 2) * (0.1-(0.825)));
            yy = 0.36 + (((tickAnim - 6) / 2) * (0-(0.36)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0.1 + (((tickAnim - 8) / 1) * (0.715-(0.1)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0.125-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0.715 + (((tickAnim - 9) / 1) * (0.805-(0.715)));
            yy = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 9) / 1) * (0-(0.125)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
            xx = 0.805 + (((tickAnim - 10) / 1) * (0.71-(0.805)));
            yy = 0 + (((tickAnim - 10) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 1) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0.71 + (((tickAnim - 11) / 2) * (0.845-(0.71)));
            yy = 0 + (((tickAnim - 11) / 2) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0.845 + (((tickAnim - 13) / 2) * (0-(0.845)));
            yy = -0.375 + (((tickAnim - 13) / 2) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armright3.rotationPointX = this.armright3.rotationPointX + (float)(xx);
        this.armright3.rotationPointY = this.armright3.rotationPointY - (float)(yy);
        this.armright3.rotationPointZ = this.armright3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 16.40701 + (((tickAnim - 0) / 8) * (25.33825-(16.40701)));
            yy = 20.31984 + (((tickAnim - 0) / 8) * (-56.6236-(20.31984)));
            zz = 25.98292 + (((tickAnim - 0) / 8) * (-19.2954-(25.98292)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 25.33825 + (((tickAnim - 8) / 4) * (10.82636-(25.33825)));
            yy = -56.6236 + (((tickAnim - 8) / 4) * (-15.1097-(-56.6236)));
            zz = -19.2954 + (((tickAnim - 8) / 4) * (-65.6718-(-19.2954)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 10.82636 + (((tickAnim - 12) / 3) * (16.40701-(10.82636)));
            yy = -15.1097 + (((tickAnim - 12) / 3) * (20.31984-(-15.1097)));
            zz = -65.6718 + (((tickAnim - 12) / 3) * (25.98292-(-65.6718)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft, armleft.rotateAngleX + (float) Math.toRadians(xx), armleft.rotateAngleY + (float) Math.toRadians(yy), armleft.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 19.62301 + (((tickAnim - 0) / 8) * (89.37261-(19.62301)));
            yy = 7.63119 + (((tickAnim - 0) / 8) * (-11.12502-(7.63119)));
            zz = -20.42839 + (((tickAnim - 0) / 8) * (-16.5336-(-20.42839)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 89.37261 + (((tickAnim - 8) / 1) * (84.08025-(89.37261)));
            yy = -11.12502 + (((tickAnim - 8) / 1) * (-19.6098-(-11.12502)));
            zz = -16.5336 + (((tickAnim - 8) / 1) * (29.587-(-16.5336)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 84.08025 + (((tickAnim - 9) / 3) * (82.14217-(84.08025)));
            yy = -19.6098 + (((tickAnim - 9) / 3) * (11.542-(-19.6098)));
            zz = 29.587 + (((tickAnim - 9) / 3) * (62.241-(29.587)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 82.14217 + (((tickAnim - 12) / 1) * (36.67972-(82.14217)));
            yy = 11.542 + (((tickAnim - 12) / 1) * (47.4585-(11.542)));
            zz = 62.241 + (((tickAnim - 12) / 1) * (-10.9508-(62.241)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 36.67972 + (((tickAnim - 13) / 2) * (19.62301-(36.67972)));
            yy = 47.4585 + (((tickAnim - 13) / 2) * (7.63119-(47.4585)));
            zz = -10.9508 + (((tickAnim - 13) / 2) * (-20.42839-(-10.9508)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft2, armleft2.rotateAngleX + (float) Math.toRadians(xx), armleft2.rotateAngleY + (float) Math.toRadians(yy), armleft2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-0.6-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.45-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -0.6 + (((tickAnim - 8) / 7) * (0-(-0.6)));
            yy = -0.525 + (((tickAnim - 8) / 7) * (0-(-0.525)));
            zz = -0.45 + (((tickAnim - 8) / 7) * (0-(-0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft2.rotationPointX = this.armleft2.rotationPointX + (float)(xx);
        this.armleft2.rotationPointY = this.armleft2.rotationPointY - (float)(yy);
        this.armleft2.rotationPointZ = this.armleft2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -3.02102 + (((tickAnim - 0) / 3) * (10.77554-(-3.02102)));
            yy = -10.5108 + (((tickAnim - 0) / 3) * (30.62325-(-10.5108)));
            zz = 17.60268 + (((tickAnim - 0) / 3) * (1.81369-(17.60268)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = 10.77554 + (((tickAnim - 3) / 1) * (5.89124-(10.77554)));
            yy = 30.62325 + (((tickAnim - 3) / 1) * (42.01385-(30.62325)));
            zz = 1.81369 + (((tickAnim - 3) / 1) * (-0.6633-(1.81369)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = 5.89124 + (((tickAnim - 4) / 2) * (-8.27522-(5.89124)));
            yy = 42.01385 + (((tickAnim - 4) / 2) * (24.77269-(42.01385)));
            zz = -0.6633 + (((tickAnim - 4) / 2) * (6.59574-(-0.6633)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -8.27522 + (((tickAnim - 6) / 2) * (0-(-8.27522)));
            yy = 24.77269 + (((tickAnim - 6) / 2) * (0-(24.77269)));
            zz = 6.59574 + (((tickAnim - 6) / 2) * (56.75-(6.59574)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (-17.19639-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (2.39634-(0)));
            zz = 56.75 + (((tickAnim - 8) / 1) * (103.6297-(56.75)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = -17.19639 + (((tickAnim - 9) / 3) * (-21.06422-(-17.19639)));
            yy = 2.39634 + (((tickAnim - 9) / 3) * (3.7072-(2.39634)));
            zz = 103.6297 + (((tickAnim - 9) / 3) * (85.399-(103.6297)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -21.06422 + (((tickAnim - 12) / 1) * (-14.66276-(-21.06422)));
            yy = 3.7072 + (((tickAnim - 12) / 1) * (-6.72387-(3.7072)));
            zz = 85.399 + (((tickAnim - 12) / 1) * (87.5544-(85.399)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -14.66276 + (((tickAnim - 13) / 2) * (-3.02102-(-14.66276)));
            yy = -6.72387 + (((tickAnim - 13) / 2) * (-10.5108-(-6.72387)));
            zz = 87.5544 + (((tickAnim - 13) / 2) * (17.60268-(87.5544)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(armleft3, armleft3.rotateAngleX + (float) Math.toRadians(xx), armleft3.rotateAngleY + (float) Math.toRadians(yy), armleft3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = -0.25 + (((tickAnim - 0) / 1) * (-0.61-(-0.25)));
            yy = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 1) * (0.125-(0)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = -0.61 + (((tickAnim - 1) / 1) * (-0.61-(-0.61)));
            yy = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 1) / 1) * (0.125-(0.125)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = -0.61 + (((tickAnim - 2) / 1) * (-0.615-(-0.61)));
            yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            zz = 0.125 + (((tickAnim - 2) / 1) * (0-(0.125)));
        }
        else if (tickAnim >= 3 && tickAnim < 4) {
            xx = -0.615 + (((tickAnim - 3) / 1) * (-0.305-(-0.615)));
            yy = 0 + (((tickAnim - 3) / 1) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 3) / 1) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 6) {
            xx = -0.305 + (((tickAnim - 4) / 2) * (-0.555-(-0.305)));
            yy = -0.375 + (((tickAnim - 4) / 2) * (-0.5-(-0.375)));
            zz = 0 + (((tickAnim - 4) / 2) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -0.555 + (((tickAnim - 6) / 2) * (-0.225-(-0.555)));
            yy = -0.5 + (((tickAnim - 6) / 2) * (-0.2-(-0.5)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -0.225 + (((tickAnim - 8) / 4) * (-0.8-(-0.225)));
            yy = -0.2 + (((tickAnim - 8) / 4) * (0.225-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = -0.8 + (((tickAnim - 12) / 1) * (-0.825-(-0.8)));
            yy = 0.225 + (((tickAnim - 12) / 1) * (0.36-(0.225)));
            zz = 0 + (((tickAnim - 12) / 1) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -0.825 + (((tickAnim - 13) / 2) * (-0.25-(-0.825)));
            yy = 0.36 + (((tickAnim - 13) / 2) * (0-(0.36)));
            zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.armleft3.rotationPointX = this.armleft3.rotationPointX + (float)(xx);
        this.armleft3.rotationPointY = this.armleft3.rotationPointY - (float)(yy);
        this.armleft3.rotationPointZ = this.armleft3.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*2), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*10), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-4));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.25);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*0.2);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-1.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*10), tail1.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-3.5), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*20), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(1.83102), tail3.rotateAngleY + (float) Math.toRadians(1.5363+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-250))*35), tail3.rotateAngleZ + (float) Math.toRadians(-2.06768));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-120))*-10), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0), chest.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-17), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*-1.3), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*-10), neck.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-130))*17), head.rotateAngleZ + (float) Math.toRadians(0));


    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraSilvanerpeton entity = (EntityPrehistoricFloraSilvanerpeton) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 6.25 + (((tickAnim - 3) / 3) * (-19.25-(6.25)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -19.25 + (((tickAnim - 6) / 4) * (0-(-19.25)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.075-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = -0.075 + (((tickAnim - 3) / 3) * (0.175-(-0.075)));
            zz = 0 + (((tickAnim - 3) / 3) * (-0.2-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            yy = 0.175 + (((tickAnim - 6) / 4) * (0-(0.175)));
            zz = -0.2 + (((tickAnim - 6) / 4) * (0-(-0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -15.5 + (((tickAnim - 3) / 3) * (-0.5-(-15.5)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -0.5 + (((tickAnim - 6) / 4) * (0-(-0.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (13-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 13 + (((tickAnim - 3) / 3) * (31-(13)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 31 + (((tickAnim - 6) / 2) * (0-(31)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSilvanerpeton e = (EntityPrehistoricFloraSilvanerpeton) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        animator.move(this.head, 0,0,-0.2F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
