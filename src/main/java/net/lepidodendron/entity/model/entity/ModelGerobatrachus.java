package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraGerobatrachus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelGerobatrachus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfluke3;
    private final AdvancedModelRenderer tailfluke4;
    private final AdvancedModelRenderer tailfluke2;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightArm;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightArm3;
    private final AdvancedModelRenderer leftArm;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftArm3;

    private ModelAnimator animator;

    public ModelGerobatrachus() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 23.0F, 0.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -0.875F, 4.0F);
        this.root.addChild(hips);
        this.setRotateAngle(hips, -0.0213F, 0.0F, 0.0F);
        this.hips.cubeList.add(new ModelBox(hips, 0, 26, -2.5F, -0.24F, -3.9847F, 5, 2, 4, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.31F, -0.1547F);
        this.hips.addChild(body2);
        this.setRotateAngle(body2, -0.2972F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 22, 22, -2.0F, -0.5F, 0.0F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.01F, 0.65F, 1.035F);
        this.body2.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 24, -2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.25F, 1.5F);
        this.body2.addChild(tail);
        this.setRotateAngle(tail, 0.3396F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 0, 11, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.0F, 1.3F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0213F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 6, 3, -1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.4F, 0.075F);
        this.tail2.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2051F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 15, 0.0F, -1.0F, 0.0F, 0, 1, 2, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(-0.01F, 0.01F, 1.8F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0213F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 29, 17, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.01F, 0.01F, 1.7F);
        this.tail3.addChild(tailend);
        this.setRotateAngle(tailend, -0.0213F, 0.0F, 0.0F);
        this.tailend.cubeList.add(new ModelBox(tailend, 36, 17, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.tailfluke3 = new AdvancedModelRenderer(this);
        this.tailfluke3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailend.addChild(tailfluke3);
        this.tailfluke3.cubeList.add(new ModelBox(tailfluke3, 18, 0, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.tailfluke4 = new AdvancedModelRenderer(this);
        this.tailfluke4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tailend.addChild(tailfluke4);
        this.tailfluke4.cubeList.add(new ModelBox(tailfluke4, 5, 2, 0.0F, -0.5F, 0.0F, 0, 1, 1, 0.0F, false));

        this.tailfluke2 = new AdvancedModelRenderer(this);
        this.tailfluke2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tail3.addChild(tailfluke2);
        this.tailfluke2.cubeList.add(new ModelBox(tailfluke2, 13, 0, 0.0F, -1.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(1.0F, 0.4F, 1.0F);
        this.body2.addChild(leftLeg);
        this.setRotateAngle(leftLeg, 0.3249F, 0.0917F, 0.183F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 10, 14, 0.0F, -0.425F, 0.0F, 3, 1, 1, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(2.825F, 0.1F, 0.8F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, -0.018F, 0.0598F, -0.0281F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 2, 7, -0.8557F, -0.516F, -0.0953F, 1, 1, 2, 0.0F, false));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(-0.1557F, 0.184F, 1.7047F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0435F, -0.6796F, -0.1133F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 13, 5, -0.5671F, 0.0098F, -1.459F, 4, 0, 3, 0.0F, false));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-1.0F, 0.4F, 1.0F);
        this.body2.addChild(rightLeg);
        this.setRotateAngle(rightLeg, 0.3249F, -0.0917F, -0.183F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 10, 14, -3.0F, -0.425F, 0.0F, 3, 1, 1, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-2.825F, 0.1F, 0.8F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, -0.018F, -0.0598F, 0.0281F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 2, 7, -0.1443F, -0.516F, -0.0953F, 1, 1, 2, 0.0F, true));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(0.1557F, 0.184F, 1.7047F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0435F, 0.6796F, 0.1133F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 13, 5, -3.4329F, 0.0098F, -1.459F, 4, 0, 3, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.01F, 0.77F, -3.4847F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.0213F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 19, 26, -2.5F, -1.0F, -4.0F, 5, 2, 4, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.01F, 0.01F, -3.8F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 25, 5, -2.5F, -1.0F, -1.0F, 5, 2, 1, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, -0.6F, -0.4F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.0637F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 33, 9, -1.5F, -0.5F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.01F, 0.525F, 0.275F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0567F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 21, -2.5F, -0.5F, -1.5F, 5, 1, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.075F, -2.9F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0567F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 13, -1.0F, -0.515F, -1.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.15F, -3.95F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 50, 7, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.72F, 0.275F, -3.775F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1537F, -1.1405F, 0.1258F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 4, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.7F, 0.275F, -3.775F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1537F, 1.1405F, -0.1258F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-1.595F, 0.49F, -0.875F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.08F, -0.3829F, 0.0299F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 15, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.575F, 0.49F, -0.875F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.08F, 0.3829F, -0.0299F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 15, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-0.45F, -0.4F, -2.3F);
        this.head.addChild(lefteye);
        this.setRotateAngle(lefteye, -0.2122F, -0.2335F, 0.3821F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 23, 1, -1.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(0.45F, -0.4F, -2.3F);
        this.head.addChild(righteye);
        this.setRotateAngle(righteye, -0.2122F, 0.2335F, -0.3821F);
        this.righteye.cubeList.add(new ModelBox(righteye, 30, 1, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.01F, 0.6F, -0.2F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 37, 2, -2.5F, 0.0F, -1.0F, 5, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.325F, 0.465F, -1.025F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0218F, 0.3665F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 16, -1.9684F, -0.5182F, -2.9017F, 2, 1, 3, 0.0F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.325F, 0.465F, -1.025F);
        this.jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0218F, -0.3665F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 18, 16, -0.0316F, -0.5182F, -2.9017F, 2, 1, 3, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.675F, 0.375F, -3.5F);
        this.jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0159F, 0.4273F, -0.0384F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 3, -0.5F, -0.485F, -0.5F, 1, 1, 1, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.675F, 0.375F, -3.5F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0159F, -0.4273F, 0.0384F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 3, -0.5F, -0.485F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.375F, -2.13F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0087F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 20, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.0F, false));

        this.rightArm = new AdvancedModelRenderer(this);
        this.rightArm.setRotationPoint(-2.3F, 0.3F, -3.8F);
        this.body.addChild(rightArm);
        this.setRotateAngle(rightArm, 0.0F, 0.658F, -0.2546F);
        this.rightArm.cubeList.add(new ModelBox(rightArm, 42, 15, -2.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(-1.69F, 0.0F, 0.5F);
        this.rightArm.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -1.5284F, -0.2335F, 0.2759F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 47, 25, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.rightArm3 = new AdvancedModelRenderer(this);
        this.rightArm3.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.rightArm2.addChild(rightArm3);
        this.setRotateAngle(rightArm3, 1.4434F, 0.0F, -0.1911F);
        this.rightArm3.cubeList.add(new ModelBox(rightArm3, 43, 5, -1.5F, 0.0F, -2.0F, 3, 0, 2, 0.0F, false));

        this.leftArm = new AdvancedModelRenderer(this);
        this.leftArm.setRotationPoint(2.3F, 0.3F, -3.8F);
        this.body.addChild(leftArm);
        this.setRotateAngle(leftArm, 0.0F, -0.658F, 0.2546F);
        this.leftArm.cubeList.add(new ModelBox(leftArm, 43, 18, 0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(1.69F, 0.0F, 0.5F);
        this.leftArm.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -1.5284F, 0.2335F, -0.2759F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 46, 21, -0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.leftArm3 = new AdvancedModelRenderer(this);
        this.leftArm3.setRotationPoint(0.0F, 1.9F, 0.0F);
        this.leftArm2.addChild(leftArm3);
        this.setRotateAngle(leftArm3, 1.4434F, 0.0F, 0.1911F);
        this.leftArm3.cubeList.add(new ModelBox(leftArm3, 36, 5, -1.5F, 0.0F, -2.0F, 3, 0, 2, 0.0F, false));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.25F;
        this.root.offsetX = 0.5F;
        this.root.offsetZ = 1.8F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(1);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 3.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingrootIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingrootIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraGerobatrachus ee = (EntityPrehistoricFloraGerobatrachus) entitylivingrootIn;
        if (ee.isReallyInWater()) {
            animSwim(entitylivingrootIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {
            if (ee.getIsFast()) {
                animRun(entitylivingrootIn, limbSwing, limbSwingAmount, partialTickTime);
            } else {
                animWalk(entitylivingrootIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }
    }
    
    public void animSwim(EntityLivingBase entitylivingrootIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGerobatrachus entity = (EntityPrehistoricFloraGerobatrachus) entitylivingrootIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*8), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*0.5);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-8), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-6), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-10), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+200))*15), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(0), tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*-19), tailend.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(11.85222), leftLeg.rotateAngleY + (float) Math.toRadians(-38.7554733784+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-8), leftLeg.rotateAngleZ + (float) Math.toRadians(18.43571));
        this.leftLeg.rotationPointX = this.leftLeg.rotationPointX + (float)(0);
        this.leftLeg.rotationPointY = this.leftLeg.rotationPointY - (float)(0);
        this.leftLeg.rotationPointZ = this.leftLeg.rotationPointZ + (float)(-0.825);


        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(-7.77458), leftLeg2.rotateAngleY + (float) Math.toRadians(23.6193906065+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*8), leftLeg2.rotateAngleZ + (float) Math.toRadians(12.85299));
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(0);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(-0.35);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(-0.275);


        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(-36+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*-15), leftLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(-0.125);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(0);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(11.85222), rightLeg.rotateAngleY + (float) Math.toRadians(38.7554733784+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-8), rightLeg.rotateAngleZ + (float) Math.toRadians(-18.43571));
        this.rightLeg.rotationPointX = this.rightLeg.rotationPointX + (float)(0);
        this.rightLeg.rotationPointY = this.rightLeg.rotationPointY - (float)(0);
        this.rightLeg.rotationPointZ = this.rightLeg.rotationPointZ + (float)(-0.825);


        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(-7.77458), rightLeg2.rotateAngleY + (float) Math.toRadians(-23.6193906065+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*8), rightLeg2.rotateAngleZ + (float) Math.toRadians(-12.85299));
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(0);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(-0.35);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(-0.275);


        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0), rightLeg3.rotateAngleY + (float) Math.toRadians(36+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+300))*-15), rightLeg3.rotateAngleZ + (float) Math.toRadians(0));
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(0.1);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(0);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(0);


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-8), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0), neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*8), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0.2);


        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(0), rightArm.rotateAngleY + (float) Math.toRadians(32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-3), rightArm.rotateAngleZ + (float) Math.toRadians(0));
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(-0.45);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(0);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(0);


        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(99.19149), rightArm2.rotateAngleY + (float) Math.toRadians(20.25654), rightArm2.rotateAngleZ + (float) Math.toRadians(64.91004));


        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(11.19312), rightArm3.rotateAngleY + (float) Math.toRadians(-0.66842), rightArm3.rotateAngleZ + (float) Math.toRadians(9.72728));


        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(0), leftArm.rotateAngleY + (float) Math.toRadians(-32.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*-3), leftArm.rotateAngleZ + (float) Math.toRadians(0));
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(0.45);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(0);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(0);


        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(99.19149), leftArm2.rotateAngleY + (float) Math.toRadians(-20.25654), leftArm2.rotateAngleZ + (float) Math.toRadians(-64.91004));


        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(9.69872), leftArm3.rotateAngleY + (float) Math.toRadians(0.49878), leftArm3.rotateAngleZ + (float) Math.toRadians(-11.73956));

    }

    public void animRun(EntityLivingBase entitylivingrootIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGerobatrachus entity = (EntityPrehistoricFloraGerobatrachus) entitylivingrootIn;
        int animCycle = 15;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-50))*3), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+60))*-12), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-120))*-0.35);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*0.55);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5))*3), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+90))*15), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(-0.45);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-50))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+150))*-12), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-100))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+100))*-12), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+50))*-12), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480-200))*1), tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480))*-15), tailend.rotateAngleZ + (float) Math.toRadians(0));



         if (tickAnim >= 0 && tickAnim < 8) {
        xx = 8.46823 + (((tickAnim - 0) / 8) * (-10.33752-(8.46823)));
        yy = 46.02174 + (((tickAnim - 0) / 8) * (-32.27196-(46.02174)));
        zz = 10.63953 + (((tickAnim - 0) / 8) * (-17.33077-(10.63953)));
    }
            else if (tickAnim >= 8 && tickAnim < 9) {
    xx = -10.33752 + (((tickAnim - 8) / 1) * (-9.36794-(-10.33752)));
    yy = -32.27196 + (((tickAnim - 8) / 1) * (84.713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150-(-32.27196)));
    zz = -17.33077 + (((tickAnim - 8) / 1) * (-21.67053-(-17.33077)));
}
        else if (tickAnim >= 9 && tickAnim < 13) {
xx = -9.36794 + (((tickAnim - 9) / 4) * (-8.27644-(-9.36794)));
yy = 84.713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150 + (((tickAnim - 9) / 4) * (44.282-(84.713+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150)));
zz = -21.67053 + (((tickAnim - 9) / 4) * (22.6513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*150-(-21.67053)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = -8.27644 + (((tickAnim - 13) / 2) * (8.46823-(-8.27644)));
yy = 44.282 + (((tickAnim - 13) / 2) * (46.02174-(44.282)));
zz = 22.6513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*150 + (((tickAnim - 13) / 2) * (10.63953-(22.6513+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*150)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 3) {
xx = -18.41803 + (((tickAnim - 0) / 3) * (-9.24333-(-18.41803)));
yy = 4.71747 + (((tickAnim - 0) / 3) * (30.83482-(4.71747)));
zz = -1.6659 + (((tickAnim - 0) / 3) * (-4.52435-(-1.6659)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
xx = -9.24333 + (((tickAnim - 3) / 5) * (5.77425-(-9.24333)));
yy = 30.83482 + (((tickAnim - 3) / 5) * (16.04542-(30.83482)));
zz = -4.52435 + (((tickAnim - 3) / 5) * (8.21833-(-4.52435)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = 5.77425 + (((tickAnim - 8) / 1) * (0.63834-(5.77425)));
yy = 16.04542 + (((tickAnim - 8) / 1) * (97.5659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520-(16.04542)));
zz = 8.21833 + (((tickAnim - 8) / 1) * (9.31732-(8.21833)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
xx = 0.63834 + (((tickAnim - 9) / 2) * (6.54492-(0.63834)));
yy = 97.5659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520 + (((tickAnim - 9) / 2) * (-30.49931-(97.5659+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520)));
zz = 9.31732 + (((tickAnim - 9) / 2) * (2.87404-(9.31732)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = 6.54492 + (((tickAnim - 11) / 4) * (-18.41803-(6.54492)));
yy = -30.49931 + (((tickAnim - 11) / 4) * (4.71747-(-30.49931)));
zz = 2.87404 + (((tickAnim - 11) / 4) * (-1.6659-(2.87404)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 3) {
xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 3) * (-0.275-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
zz = -0.275 + (((tickAnim - 3) / 5) * (0-(-0.275)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
zz = 0 + (((tickAnim - 8) / 1) * (-0.35-(0)));
        }
       else if (tickAnim >= 9 && tickAnim < 11) {
xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
zz = -0.35 + (((tickAnim - 9) / 2) * (0.125-(-0.35)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
xx = 0 + (((tickAnim - 11) / 2) * (0.075-(0)));
yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
zz = 0.125 + (((tickAnim - 11) / 2) * (0.06-(0.125)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = 0.075 + (((tickAnim - 13) / 2) * (0-(0.075)));
yy = 0 + (((tickAnim - 13) / 2) * (0-(0)));
zz = 0.06 + (((tickAnim - 13) / 2) * (0-(0.06)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 3) {
xx = 13.1745 + (((tickAnim - 0) / 3) * (3.55206-(13.1745)));
yy = 44.84653 + (((tickAnim - 0) / 3) * (90.2701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520-(44.84653)));
zz = 12.03828 + (((tickAnim - 0) / 3) * (14.80346-(12.03828)));
        }
       else if (tickAnim >= 3 && tickAnim < 9) {
xx = 3.55206 + (((tickAnim - 3) / 6) * (39.10438-(3.55206)));
yy = 90.2701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520 + (((tickAnim - 3) / 6) * (-26.17143-(90.2701+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520)));
zz = 14.80346 + (((tickAnim - 3) / 6) * (-35.47097-(14.80346)));
        }
        else if (tickAnim >= 9 && tickAnim < 13) {
xx = 39.10438 + (((tickAnim - 9) / 4) * (8.7698-(39.10438)));
yy = -26.17143 + (((tickAnim - 9) / 4) * (70.06937-(-26.17143)));
zz = -35.47097 + (((tickAnim - 9) / 4) * (3.55478-(-35.47097)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = 8.7698 + (((tickAnim - 13) / 2) * (13.1745-(8.7698)));
yy = 70.06937 + (((tickAnim - 13) / 2) * (44.84653-(70.06937)));
zz = 3.55478 + (((tickAnim - 13) / 2) * (12.03828-(3.55478)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 3) {
xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 3) * (0.355-(0)));
zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
xx = 0 + (((tickAnim - 3) / 10) * (0-(0)));
yy = 0.355 + (((tickAnim - 3) / 10) * (0.375-(0.355)));
zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
yy = 0.375 + (((tickAnim - 13) / 2) * (0-(0.375)));
zz = 0 + (((tickAnim - 13) / 2) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 2) {
xx = -10.33752 + (((tickAnim - 0) / 2) * (-15.00804-(-10.33752)));
yy = 32.27196 + (((tickAnim - 0) / 2) * (-145.1529+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250-(32.27196)));
zz = 17.33077 + (((tickAnim - 0) / 2) * (14.81567-(17.33077)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
xx = -15.00804 + (((tickAnim - 2) / 4) * (-5.26231-(-15.00804)));
yy = -145.1529+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250 + (((tickAnim - 2) / 4) * (-44.748-(-145.1529+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-250)));
zz = 14.81567 + (((tickAnim - 2) / 4) * (-334.7682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-850-(14.81567)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = -5.26231 + (((tickAnim - 6) / 2) * (8.46823-(-5.26231)));
yy = -44.748 + (((tickAnim - 6) / 2) * (-46.02174-(-44.748)));
zz = -334.7682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-850 + (((tickAnim - 6) / 2) * (-10.63953-(-334.7682+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-850)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
xx = 8.46823 + (((tickAnim - 8) / 7) * (-10.33752-(8.46823)));
yy = -46.02174 + (((tickAnim - 8) / 7) * (32.27196-(-46.02174)));
zz = -10.63953 + (((tickAnim - 8) / 7) * (17.33077-(-10.63953)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




         if (tickAnim >= 0 && tickAnim < 2) {
xx = 5.77425 + (((tickAnim - 0) / 2) * (-32.2596+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*100-(5.77425)));
yy = -16.04542 + (((tickAnim - 0) / 2) * (385.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40+50))*-500-(-16.04542)));
zz = -8.21833 + (((tickAnim - 0) / 2) * (-9.75979-(-8.21833)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
xx = -32.2596+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*100 + (((tickAnim - 2) / 6) * (-16.94258-(-32.2596+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*100)));
yy = 385.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40+50))*-500 + (((tickAnim - 2) / 6) * (-17.60112-(385.0331+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40+50))*-500)));
zz = -9.75979 + (((tickAnim - 2) / 6) * (-4.76369-(-9.75979)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
xx = -16.94258 + (((tickAnim - 8) / 7) * (5.77425-(-16.94258)));
yy = -17.60112 + (((tickAnim - 8) / 7) * (-16.04542-(-17.60112)));
zz = -4.76369 + (((tickAnim - 8) / 7) * (-8.21833-(-4.76369)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 2) {
xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 2) * (-0.35-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
zz = -0.35 + (((tickAnim - 2) / 1) * (0.15-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
zz = 0.15 + (((tickAnim - 3) / 2) * (0.2-(0.15)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
zz = 0.2 + (((tickAnim - 5) / 3) * (-0.15-(0.2)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
zz = -0.15 + (((tickAnim - 8) / 7) * (0-(-0.15)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 2) {
xx = 11.56824 + (((tickAnim - 0) / 2) * (21.58513-(11.56824)));
yy = 13.60841 + (((tickAnim - 0) / 2) * (7.83451-(13.60841)));
zz = 6.99288 + (((tickAnim - 0) / 2) * (14.66169-(6.99288)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
xx = 21.58513 + (((tickAnim - 2) / 4) * (15.39917-(21.58513)));
yy = 7.83451 + (((tickAnim - 2) / 4) * (-67.03346-(7.83451)));
zz = 14.66169 + (((tickAnim - 2) / 4) * (-16.91939-(14.66169)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = 15.39917 + (((tickAnim - 6) / 2) * (18.63214-(15.39917)));
yy = -67.03346 + (((tickAnim - 6) / 2) * (-55.08281-(-67.03346)));
zz = -16.91939 + (((tickAnim - 6) / 2) * (-10.40955-(-16.91939)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
xx = 18.63214 + (((tickAnim - 8) / 3) * (14.03791-(18.63214)));
yy = -55.08281 + (((tickAnim - 8) / 3) * (-171.7427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*500-(-55.08281)));
zz = -10.40955 + (((tickAnim - 8) / 3) * (-9.34383-(-10.40955)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = 14.03791 + (((tickAnim - 11) / 4) * (11.56824-(14.03791)));
yy = -171.7427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*500 + (((tickAnim - 11) / 4) * (13.60841-(-171.7427+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*500)));
zz = -9.34383 + (((tickAnim - 11) / 4) * (6.99288-(-9.34383)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 6) {
xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
yy = 0.5 + (((tickAnim - 0) / 6) * (0.375-(0.5)));
zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
yy = 0.375 + (((tickAnim - 6) / 2) * (0-(0.375)));
zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 3) * (0.225-(0)));
zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
yy = 0.225 + (((tickAnim - 11) / 4) * (0.5-(0.225)));
zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5-80))*-3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480+40))*12), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-9.75), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(-3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*480/0.5+60))*3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



         if (tickAnim >= 0 && tickAnim < 8) {
xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
yy = -74.5 + (((tickAnim - 0) / 8) * (44.75-(-74.5)));
zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = 0 + (((tickAnim - 8) / 1) * (55.16872-(0)));
yy = 44.75 + (((tickAnim - 8) / 1) * (45.91847-(44.75)));
zz = 0 + (((tickAnim - 8) / 1) * (43.0804-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
xx = 55.16872 + (((tickAnim - 9) / 2) * (33.50217-(55.16872)));
yy = 45.91847 + (((tickAnim - 9) / 2) * (-18.85724-(45.91847)));
zz = 43.0804 + (((tickAnim - 9) / 2) * (27.18984-(43.0804)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
xx = 33.50217 + (((tickAnim - 11) / 2) * (-3.49014-(33.50217)));
yy = -18.85724 + (((tickAnim - 11) / 2) * (-63.185-(-18.85724)));
zz = 27.18984 + (((tickAnim - 11) / 2) * (13.06158-(27.18984)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = -3.49014 + (((tickAnim - 13) / 2) * (0-(-3.49014)));
yy = -63.185 + (((tickAnim - 13) / 2) * (-74.5-(-63.185)));
zz = 13.06158 + (((tickAnim - 13) / 2) * (0-(13.06158)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 8) {
xx = 0.475 + (((tickAnim - 0) / 8) * (-0.6-(0.475)));
yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = -0.6 + (((tickAnim - 8) / 1) * (-0.6-(-0.6)));
yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
xx = -0.6 + (((tickAnim - 9) / 6) * (0.475-(-0.6)));
yy = 0 + (((tickAnim - 9) / 6) * (0-(0)));
zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 3) {
xx = 19.06215 + (((tickAnim - 0) / 3) * (-7.40133-(19.06215)));
yy = 50.95122 + (((tickAnim - 0) / 3) * (37.75577-(50.95122)));
zz = 2.35713 + (((tickAnim - 0) / 3) * (3.2103-(2.35713)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
xx = -7.40133 + (((tickAnim - 3) / 5) * (19.25294-(-7.40133)));
yy = 37.75577 + (((tickAnim - 3) / 5) * (47.8921-(37.75577)));
zz = 3.2103 + (((tickAnim - 3) / 5) * (-11.83914-(3.2103)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = 19.25294 + (((tickAnim - 8) / 1) * (39.74497-(19.25294)));
yy = 47.8921 + (((tickAnim - 8) / 1) * (48.30298-(47.8921)));
zz = -11.83914 + (((tickAnim - 8) / 1) * (34.37695-(-11.83914)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
xx = 39.74497 + (((tickAnim - 9) / 2) * (-1.14931-(39.74497)));
yy = 48.30298 + (((tickAnim - 9) / 2) * (49.18573-(48.30298)));
zz = 34.37695 + (((tickAnim - 9) / 2) * (23.70368-(34.37695)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
xx = -1.14931 + (((tickAnim - 11) / 2) * (-1.96534-(-1.14931)));
yy = 49.18573 + (((tickAnim - 11) / 2) * (51.55387-(49.18573)));
zz = 23.70368 + (((tickAnim - 11) / 2) * (-4.84536-(23.70368)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = -1.96534 + (((tickAnim - 13) / 2) * (19.06215-(-1.96534)));
yy = 51.55387 + (((tickAnim - 13) / 2) * (50.95122-(51.55387)));
zz = -4.84536 + (((tickAnim - 13) / 2) * (2.35713-(-4.84536)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 8) {
xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 3) {
xx = -2.39654 + (((tickAnim - 0) / 3) * (7.05441-(-2.39654)));
yy = -1.24512 + (((tickAnim - 0) / 3) * (1.66009-(-1.24512)));
zz = 15.98576 + (((tickAnim - 0) / 3) * (8.2135-(15.98576)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
xx = 7.05441 + (((tickAnim - 3) / 5) * (-30.0694-(7.05441)));
yy = 1.66009 + (((tickAnim - 3) / 5) * (5.29159-(1.66009)));
zz = 8.2135 + (((tickAnim - 3) / 5) * (-1.50181-(8.2135)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = -30.0694 + (((tickAnim - 8) / 1) * (-14.43307-(-30.0694)));
yy = 5.29159 + (((tickAnim - 8) / 1) * (33.36915-(5.29159)));
zz = -1.50181 + (((tickAnim - 8) / 1) * (-1.18039-(-1.50181)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
xx = -14.43307 + (((tickAnim - 9) / 1) * (70.2273-(-14.43307)));
yy = 33.36915 + (((tickAnim - 9) / 1) * (12.42167-(33.36915)));
zz = -1.18039 + (((tickAnim - 9) / 1) * (10.44045-(-1.18039)));
        }
        else if (tickAnim >= 10 && tickAnim < 11) {
xx = 70.2273 + (((tickAnim - 10) / 1) * (38.82911-(70.2273)));
yy = 12.42167 + (((tickAnim - 10) / 1) * (21.83106-(12.42167)));
zz = 10.44045 + (((tickAnim - 10) / 1) * (4.54166-(10.44045)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
xx = 38.82911 + (((tickAnim - 11) / 2) * (-2.03372-(38.82911)));
yy = 21.83106 + (((tickAnim - 11) / 2) * (10.29297-(21.83106)));
zz = 4.54166 + (((tickAnim - 11) / 2) * (10.26371-(4.54166)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = -2.03372 + (((tickAnim - 13) / 2) * (-2.39654-(-2.03372)));
yy = 10.29297 + (((tickAnim - 13) / 2) * (-1.24512-(10.29297)));
zz = 10.26371 + (((tickAnim - 13) / 2) * (15.98576-(10.26371)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 2) {
xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 2) * (-0.375-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
zz = -0.375 + (((tickAnim - 2) / 1) * (-0.4-(-0.375)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
yy = 0 + (((tickAnim - 3) / 3) * (0.275-(0)));
zz = -0.4 + (((tickAnim - 3) / 3) * (-0.5-(-0.4)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
yy = 0.275 + (((tickAnim - 6) / 2) * (0-(0.275)));
zz = -0.5 + (((tickAnim - 6) / 2) * (0-(-0.5)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
zz = 0 + (((tickAnim - 9) / 2) * (-0.175-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
yy = 0 + (((tickAnim - 11) / 4) * (0-(0)));
zz = -0.175 + (((tickAnim - 11) / 4) * (0-(-0.175)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 2) {
xx = 0 + (((tickAnim - 0) / 2) * (55.16872-(0)));
yy = -44.75 + (((tickAnim - 0) / 2) * (-45.91847-(-44.75)));
zz = 0 + (((tickAnim - 0) / 2) * (-43.0804-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
xx = 55.16872 + (((tickAnim - 2) / 1) * (33.50217-(55.16872)));
yy = -45.91847 + (((tickAnim - 2) / 1) * (18.85724-(-45.91847)));
zz = -43.0804 + (((tickAnim - 2) / 1) * (-27.18984-(-43.0804)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
xx = 33.50217 + (((tickAnim - 3) / 3) * (-3.49014-(33.50217)));
yy = 18.85724 + (((tickAnim - 3) / 3) * (63.185-(18.85724)));
zz = -27.18984 + (((tickAnim - 3) / 3) * (-13.06158-(-27.18984)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = -3.49014 + (((tickAnim - 6) / 2) * (0-(-3.49014)));
yy = 63.185 + (((tickAnim - 6) / 2) * (74.5-(63.185)));
zz = -13.06158 + (((tickAnim - 6) / 2) * (0-(-13.06158)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
yy = 74.5 + (((tickAnim - 8) / 7) * (-44.75-(74.5)));
zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 2) {
xx = 0.6 + (((tickAnim - 0) / 2) * (0.6-(0.6)));
yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
xx = 0.6 + (((tickAnim - 2) / 6) * (-0.475-(0.6)));
yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
xx = -0.475 + (((tickAnim - 8) / 7) * (0.6-(-0.475)));
yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 2) {
xx = 24.75294 + (((tickAnim - 0) / 2) * (39.74497-(24.75294)));
yy = -47.8921 + (((tickAnim - 0) / 2) * (-48.30298-(-47.8921)));
zz = 11.83914 + (((tickAnim - 0) / 2) * (-34.37695-(11.83914)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
xx = 39.74497 + (((tickAnim - 2) / 1) * (-1.14931-(39.74497)));
yy = -48.30298 + (((tickAnim - 2) / 1) * (-49.18573-(-48.30298)));
zz = -34.37695 + (((tickAnim - 2) / 1) * (-23.70368-(-34.37695)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
xx = -1.14931 + (((tickAnim - 3) / 3) * (-1.96534-(-1.14931)));
yy = -49.18573 + (((tickAnim - 3) / 3) * (-51.55387-(-49.18573)));
zz = -23.70368 + (((tickAnim - 3) / 3) * (4.84536-(-23.70368)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = -1.96534 + (((tickAnim - 6) / 2) * (19.06215-(-1.96534)));
yy = -51.55387 + (((tickAnim - 6) / 2) * (-50.95122-(-51.55387)));
zz = 4.84536 + (((tickAnim - 6) / 2) * (-2.35713-(4.84536)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
xx = 19.06215 + (((tickAnim - 8) / 3) * (-7.15907-(19.06215)));
yy = -50.95122 + (((tickAnim - 8) / 3) * (-25.62981-(-50.95122)));
zz = -2.35713 + (((tickAnim - 8) / 3) * (-3.03454-(-2.35713)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = -7.15907 + (((tickAnim - 11) / 4) * (24.75294-(-7.15907)));
yy = -25.62981 + (((tickAnim - 11) / 4) * (-47.8921-(-25.62981)));
zz = -3.03454 + (((tickAnim - 11) / 4) * (11.83914-(-3.03454)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 8) {
xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 3) * (0.2-(0)));
zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = 0 + (((tickAnim - 11) / 4) * (0-(0)));
yy = 0.2 + (((tickAnim - 11) / 4) * (0-(0.2)));
zz = 0 + (((tickAnim - 11) / 4) * (0-(0)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




         if (tickAnim >= 0 && tickAnim < 2) {
xx = -30.8194 + (((tickAnim - 0) / 2) * (-14.43307-(-30.8194)));
yy = -5.29159 + (((tickAnim - 0) / 2) * (-33.36915-(-5.29159)));
zz = 1.50181 + (((tickAnim - 0) / 2) * (1.18039-(1.50181)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
xx = -14.43307 + (((tickAnim - 2) / 1) * (70.2273-(-14.43307)));
yy = -33.36915 + (((tickAnim - 2) / 1) * (12.42167-(-33.36915)));
zz = 1.18039 + (((tickAnim - 2) / 1) * (10.44045-(1.18039)));
        }
        else if (tickAnim >= 3 && tickAnim < 3) {
xx = 70.2273 + (((tickAnim - 3) / 0) * (38.82911-(70.2273)));
yy = 12.42167 + (((tickAnim - 3) / 0) * (21.83106-(12.42167)));
zz = 10.44045 + (((tickAnim - 3) / 0) * (4.54166-(10.44045)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
xx = 38.82911 + (((tickAnim - 3) / 3) * (-2.03372-(38.82911)));
yy = 21.83106 + (((tickAnim - 3) / 3) * (10.29297-(21.83106)));
zz = 4.54166 + (((tickAnim - 3) / 3) * (10.26371-(4.54166)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
xx = -2.03372 + (((tickAnim - 6) / 2) * (-2.39654-(-2.03372)));
yy = 10.29297 + (((tickAnim - 6) / 2) * (1.24512-(10.29297)));
zz = 10.26371 + (((tickAnim - 6) / 2) * (-15.98576-(10.26371)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
xx = -2.39654 + (((tickAnim - 8) / 3) * (7.05441-(-2.39654)));
yy = 1.24512 + (((tickAnim - 8) / 3) * (-1.66009-(1.24512)));
zz = -15.98576 + (((tickAnim - 8) / 3) * (-8.2135-(-15.98576)));
        }
        else if (tickAnim >= 11 && tickAnim < 15) {
xx = 7.05441 + (((tickAnim - 11) / 4) * (-30.8194-(7.05441)));
yy = -1.66009 + (((tickAnim - 11) / 4) * (-5.29159-(-1.66009)));
zz = -8.2135 + (((tickAnim - 11) / 4) * (1.50181-(-8.2135)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


         if (tickAnim >= 0 && tickAnim < 2) {
xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
yy = 0 + (((tickAnim - 2) / 1) * (0-(0)));
zz = 0 + (((tickAnim - 2) / 1) * (-0.175-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
zz = -0.175 + (((tickAnim - 3) / 5) * (0-(-0.175)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
zz = 0 + (((tickAnim - 8) / 1) * (-0.175-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 11) {
xx = 0 + (((tickAnim - 9) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 9) / 2) * (0-(0)));
zz = -0.175 + (((tickAnim - 9) / 2) * (-0.5-(-0.175)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
yy = 0 + (((tickAnim - 11) / 2) * (0.425-(0)));
zz = -0.5 + (((tickAnim - 11) / 2) * (-0.425-(-0.5)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
yy = 0.425 + (((tickAnim - 13) / 2) * (0-(0.425)));
zz = -0.425 + (((tickAnim - 13) / 2) * (0-(-0.425)));
        }
        else {
xx = 0;
yy = 0;
zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);
    }

    public void animWalk(EntityLivingBase entitylivingrootIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraGerobatrachus entity = (EntityPrehistoricFloraGerobatrachus) entitylivingrootIn;
        int animCycle = 40;
        if (entity.animSpeedAdder() <= 0) {
            partialTickTime = 0; //If it's static don't increment partial ticks either
        }
        double tickAnim = (entity.ticksExistedAnimated + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExistedAnimated + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-5), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-0.15);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.1);


        this.setRotateAngle(body2, body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1), body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+90))*10), body2.rotateAngleZ + (float) Math.toRadians(0));
        this.body2.rotationPointX = this.body2.rotationPointX + (float)(0);
        this.body2.rotationPointY = this.body2.rotationPointY - (float)(0);
        this.body2.rotationPointZ = this.body2.rotationPointZ + (float)(-0.2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-50))*1), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+150))*-5), tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-100))*1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+100))*-5), tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-150))*1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-5), tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(tailend, tailend.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-200))*1), tailend.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), tailend.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 8.46823 + (((tickAnim - 0) / 20) * (-10.33752-(8.46823)));
            yy = 46.02174 + (((tickAnim - 0) / 20) * (-32.27196-(46.02174)));
            zz = 10.63953 + (((tickAnim - 0) / 20) * (-17.33077-(10.63953)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -10.33752 + (((tickAnim - 20) / 5) * (-9.36794-(-10.33752)));
            yy = -32.27196 + (((tickAnim - 20) / 5) * (15.638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150-(-32.27196)));
            zz = -17.33077 + (((tickAnim - 20) / 5) * (-21.67053-(-17.33077)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -9.36794 + (((tickAnim - 25) / 10) * (-8.27644-(-9.36794)));
            yy = 15.638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150 + (((tickAnim - 25) / 10) * (44.282-(15.638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-80))*150)));
            zz = -21.67053 + (((tickAnim - 25) / 10) * (-14.2987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*150-(-21.67053)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -8.27644 + (((tickAnim - 35) / 5) * (8.46823-(-8.27644)));
            yy = 44.282 + (((tickAnim - 35) / 5) * (46.02174-(44.282)));
            zz = -14.2987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*150 + (((tickAnim - 35) / 5) * (10.63953-(-14.2987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*150)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(xx), leftLeg.rotateAngleY + (float) Math.toRadians(yy), leftLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -18.41803 + (((tickAnim - 0) / 10) * (-9.24333-(-18.41803)));
            yy = 4.71747 + (((tickAnim - 0) / 10) * (30.83482-(4.71747)));
            zz = -1.6659 + (((tickAnim - 0) / 10) * (-4.52435-(-1.6659)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -9.24333 + (((tickAnim - 10) / 10) * (5.77425-(-9.24333)));
            yy = 30.83482 + (((tickAnim - 10) / 10) * (16.04542-(30.83482)));
            zz = -4.52435 + (((tickAnim - 10) / 10) * (8.21833-(-4.52435)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 5.77425 + (((tickAnim - 20) / 5) * (1.36543-(5.77425)));
            yy = 16.04542 + (((tickAnim - 20) / 5) * (228.0919+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520-(16.04542)));
            zz = 8.21833 + (((tickAnim - 20) / 5) * (9.75979-(8.21833)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 1.36543 + (((tickAnim - 25) / 5) * (6.54492-(1.36543)));
            yy = 228.0919+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520 + (((tickAnim - 25) / 5) * (-30.49931-(228.0919+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520)));
            zz = 9.75979 + (((tickAnim - 25) / 5) * (2.87404-(9.75979)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 6.54492 + (((tickAnim - 30) / 10) * (-18.41803-(6.54492)));
            yy = -30.49931 + (((tickAnim - 30) / 10) * (4.71747-(-30.49931)));
            zz = 2.87404 + (((tickAnim - 30) / 10) * (-1.6659-(2.87404)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.275 + (((tickAnim - 10) / 10) * (0-(-0.275)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -0.35 + (((tickAnim - 25) / 5) * (0.125-(-0.35)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0.075-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = 0.125 + (((tickAnim - 30) / 5) * (0.06-(0.125)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0.075 + (((tickAnim - 35) / 5) * (0-(0.075)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0.06 + (((tickAnim - 35) / 5) * (0-(0.06)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 13.1745 + (((tickAnim - 0) / 10) * (3.55206-(13.1745)));
            yy = 44.84653 + (((tickAnim - 0) / 10) * (145.1951+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520-(44.84653)));
            zz = 12.03828 + (((tickAnim - 0) / 10) * (14.80346-(12.03828)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 3.55206 + (((tickAnim - 10) / 15) * (39.10438-(3.55206)));
            yy = 145.1951+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520 + (((tickAnim - 10) / 15) * (-26.17143-(145.1951+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*-520)));
            zz = 14.80346 + (((tickAnim - 10) / 15) * (-35.47097-(14.80346)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 39.10438 + (((tickAnim - 25) / 10) * (8.7698-(39.10438)));
            yy = -26.17143 + (((tickAnim - 25) / 10) * (70.06937-(-26.17143)));
            zz = -35.47097 + (((tickAnim - 25) / 10) * (3.55478-(-35.47097)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 8.7698 + (((tickAnim - 35) / 5) * (13.1745-(8.7698)));
            yy = 70.06937 + (((tickAnim - 35) / 5) * (44.84653-(70.06937)));
            zz = 3.55478 + (((tickAnim - 35) / 5) * (12.03828-(3.55478)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(xx), leftLeg3.rotateAngleY + (float) Math.toRadians(yy), leftLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.355-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 10) / 25) * (0-(0)));
            yy = 0.355 + (((tickAnim - 10) / 25) * (0.375-(0.355)));
            zz = 0 + (((tickAnim - 10) / 25) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0.375 + (((tickAnim - 35) / 5) * (0-(0.375)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg3.rotationPointX = this.leftLeg3.rotationPointX + (float)(xx);
        this.leftLeg3.rotationPointY = this.leftLeg3.rotationPointY - (float)(yy);
        this.leftLeg3.rotationPointZ = this.leftLeg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -10.33752 + (((tickAnim - 0) / 5) * (-15.00804-(-10.33752)));
            yy = 32.27196 + (((tickAnim - 0) / 5) * (-54.2029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150-(32.27196)));
            zz = 17.33077 + (((tickAnim - 0) / 5) * (14.81567-(17.33077)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = -15.00804 + (((tickAnim - 5) / 10) * (-8.27644-(-15.00804)));
            yy = -54.2029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150 + (((tickAnim - 5) / 10) * (-44.282-(-54.2029+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*-150)));
            zz = 14.81567 + (((tickAnim - 5) / 10) * (-61.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-250-(14.81567)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -8.27644 + (((tickAnim - 15) / 5) * (8.46823-(-8.27644)));
            yy = -44.282 + (((tickAnim - 15) / 5) * (-46.02174-(-44.282)));
            zz = -61.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-250 + (((tickAnim - 15) / 5) * (-10.63953-(-61.1013+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20-30))*-250)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 8.46823 + (((tickAnim - 20) / 20) * (-10.33752-(8.46823)));
            yy = -46.02174 + (((tickAnim - 20) / 20) * (32.27196-(-46.02174)));
            zz = -10.63953 + (((tickAnim - 20) / 20) * (17.33077-(-10.63953)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(xx), rightLeg.rotateAngleY + (float) Math.toRadians(yy), rightLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 5.77425 + (((tickAnim - 0) / 5) * (-32.2596+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*100-(5.77425)));
            yy = -16.04542 + (((tickAnim - 0) / 5) * (-278.5669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40+30))*400-(-16.04542)));
            zz = -8.21833 + (((tickAnim - 0) / 5) * (-9.75979-(-8.21833)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = -32.2596+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*100 + (((tickAnim - 5) / 15) * (-16.94258-(-32.2596+Math.sin((Math.PI/180)*(((double)tickAnim/20)*10+20))*100)));
            yy = -278.5669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40+30))*400 + (((tickAnim - 5) / 15) * (-17.60112-(-278.5669+Math.sin((Math.PI/180)*(((double)tickAnim/20)*40+30))*400)));
            zz = -9.75979 + (((tickAnim - 5) / 15) * (-4.76369-(-9.75979)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -16.94258 + (((tickAnim - 20) / 20) * (5.77425-(-16.94258)));
            yy = -17.60112 + (((tickAnim - 20) / 20) * (-16.04542-(-17.60112)));
            zz = -4.76369 + (((tickAnim - 20) / 20) * (-8.21833-(-4.76369)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.35-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 4) * (0-(0)));
            zz = -0.35 + (((tickAnim - 5) / 4) * (0.15-(-0.35)));
        }
        else if (tickAnim >= 9 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 9) / 5) * (0-(0)));
            zz = 0.15 + (((tickAnim - 9) / 5) * (0.2-(0.15)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0.2 + (((tickAnim - 14) / 6) * (-0.15-(0.2)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = -0.15 + (((tickAnim - 20) / 20) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.56824 + (((tickAnim - 0) / 5) * (21.58513-(11.56824)));
            yy = 13.60841 + (((tickAnim - 0) / 5) * (7.83451-(13.60841)));
            zz = 6.99288 + (((tickAnim - 0) / 5) * (14.66169-(6.99288)));
        }
        else if (tickAnim >= 5 && tickAnim < 15) {
            xx = 21.58513 + (((tickAnim - 5) / 10) * (15.39917-(21.58513)));
            yy = 7.83451 + (((tickAnim - 5) / 10) * (-67.03346-(7.83451)));
            zz = 14.66169 + (((tickAnim - 5) / 10) * (-16.91939-(14.66169)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 15.39917 + (((tickAnim - 15) / 6) * (18.63214-(15.39917)));
            yy = -67.03346 + (((tickAnim - 15) / 6) * (-55.08281-(-67.03346)));
            zz = -16.91939 + (((tickAnim - 15) / 6) * (-10.40955-(-16.91939)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 18.63214 + (((tickAnim - 21) / 9) * (12.28424-(18.63214)));
            yy = -55.08281 + (((tickAnim - 21) / 9) * (-304.4215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*500-(-55.08281)));
            zz = -10.40955 + (((tickAnim - 21) / 9) * (7.58752-(-10.40955)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 12.28424 + (((tickAnim - 30) / 10) * (11.56824-(12.28424)));
            yy = -304.4215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*500 + (((tickAnim - 30) / 10) * (13.60841-(-304.4215+Math.sin((Math.PI/180)*(((double)tickAnim/20)*20))*500)));
            zz = 7.58752 + (((tickAnim - 30) / 10) * (6.99288-(7.58752)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(xx), rightLeg3.rotateAngleY + (float) Math.toRadians(yy), rightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 15) * (0.375-(0.5)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 15) / 6) * (0-(0)));
            yy = 0.375 + (((tickAnim - 15) / 6) * (0-(0.375)));
            zz = 0 + (((tickAnim - 15) / 6) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0.5-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg3.rotationPointX = this.rightLeg3.rotationPointX + (float)(xx);
        this.rightLeg3.rotationPointY = this.rightLeg3.rotationPointY - (float)(yy);
        this.rightLeg3.rotationPointZ = this.rightLeg3.rotationPointZ + (float)(zz);



        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-80))*-1), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+40))*5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(0), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -74.5 + (((tickAnim - 0) / 20) * (44.75-(-74.5)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (55.16872-(0)));
            yy = 44.75 + (((tickAnim - 20) / 5) * (45.91847-(44.75)));
            zz = 0 + (((tickAnim - 20) / 5) * (43.0804-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 55.16872 + (((tickAnim - 25) / 5) * (33.50217-(55.16872)));
            yy = 45.91847 + (((tickAnim - 25) / 5) * (-18.85724-(45.91847)));
            zz = 43.0804 + (((tickAnim - 25) / 5) * (27.18984-(43.0804)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 33.50217 + (((tickAnim - 30) / 5) * (-3.49014-(33.50217)));
            yy = -18.85724 + (((tickAnim - 30) / 5) * (-63.185-(-18.85724)));
            zz = 27.18984 + (((tickAnim - 30) / 5) * (13.06158-(27.18984)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -3.49014 + (((tickAnim - 35) / 5) * (0-(-3.49014)));
            yy = -63.185 + (((tickAnim - 35) / 5) * (-74.5-(-63.185)));
            zz = 13.06158 + (((tickAnim - 35) / 5) * (0-(13.06158)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm, rightArm.rotateAngleX + (float) Math.toRadians(xx), rightArm.rotateAngleY + (float) Math.toRadians(yy), rightArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0.475 + (((tickAnim - 0) / 20) * (-0.6-(0.475)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -0.6 + (((tickAnim - 20) / 5) * (-0.6-(-0.6)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -0.6 + (((tickAnim - 25) / 15) * (0.475-(-0.6)));
            yy = 0 + (((tickAnim - 25) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm.rotationPointX = this.rightArm.rotationPointX + (float)(xx);
        this.rightArm.rotationPointY = this.rightArm.rotationPointY - (float)(yy);
        this.rightArm.rotationPointZ = this.rightArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 19.06215 + (((tickAnim - 0) / 10) * (7.01248-(19.06215)));
            yy = 50.95122 + (((tickAnim - 0) / 10) * (37.19378-(50.95122)));
            zz = 2.35713 + (((tickAnim - 0) / 10) * (-2.50817-(2.35713)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 7.01248 + (((tickAnim - 10) / 10) * (10.50294-(7.01248)));
            yy = 37.19378 + (((tickAnim - 10) / 10) * (47.8921-(37.19378)));
            zz = -2.50817 + (((tickAnim - 10) / 10) * (-11.83914-(-2.50817)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 10.50294 + (((tickAnim - 20) / 5) * (39.74497-(10.50294)));
            yy = 47.8921 + (((tickAnim - 20) / 5) * (48.30298-(47.8921)));
            zz = -11.83914 + (((tickAnim - 20) / 5) * (34.37695-(-11.83914)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 39.74497 + (((tickAnim - 25) / 5) * (-1.14931-(39.74497)));
            yy = 48.30298 + (((tickAnim - 25) / 5) * (49.18573-(48.30298)));
            zz = 34.37695 + (((tickAnim - 25) / 5) * (23.70368-(34.37695)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = -1.14931 + (((tickAnim - 30) / 5) * (-1.96534-(-1.14931)));
            yy = 49.18573 + (((tickAnim - 30) / 5) * (51.55387-(49.18573)));
            zz = 23.70368 + (((tickAnim - 30) / 5) * (-4.84536-(23.70368)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -1.96534 + (((tickAnim - 35) / 5) * (19.06215-(-1.96534)));
            yy = 51.55387 + (((tickAnim - 35) / 5) * (50.95122-(51.55387)));
            zz = -4.84536 + (((tickAnim - 35) / 5) * (2.35713-(-4.84536)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -2.39654 + (((tickAnim - 0) / 20) * (-14.3194-(-2.39654)));
            yy = -1.24512 + (((tickAnim - 0) / 20) * (5.29159-(-1.24512)));
            zz = 15.98576 + (((tickAnim - 0) / 20) * (-1.50181-(15.98576)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14.3194 + (((tickAnim - 20) / 5) * (-14.43307-(-14.3194)));
            yy = 5.29159 + (((tickAnim - 20) / 5) * (33.36915-(5.29159)));
            zz = -1.50181 + (((tickAnim - 20) / 5) * (-1.18039-(-1.50181)));
        }
        else if (tickAnim >= 25 && tickAnim < 28) {
            xx = -14.43307 + (((tickAnim - 25) / 3) * (70.2273-(-14.43307)));
            yy = 33.36915 + (((tickAnim - 25) / 3) * (12.42167-(33.36915)));
            zz = -1.18039 + (((tickAnim - 25) / 3) * (10.44045-(-1.18039)));
        }
        else if (tickAnim >= 28 && tickAnim < 30) {
            xx = 70.2273 + (((tickAnim - 28) / 2) * (38.82911-(70.2273)));
            yy = 12.42167 + (((tickAnim - 28) / 2) * (21.83106-(12.42167)));
            zz = 10.44045 + (((tickAnim - 28) / 2) * (4.54166-(10.44045)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 38.82911 + (((tickAnim - 30) / 5) * (-2.03372-(38.82911)));
            yy = 21.83106 + (((tickAnim - 30) / 5) * (10.29297-(21.83106)));
            zz = 4.54166 + (((tickAnim - 30) / 5) * (10.26371-(4.54166)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -2.03372 + (((tickAnim - 35) / 5) * (-2.39654-(-2.03372)));
            yy = 10.29297 + (((tickAnim - 35) / 5) * (-1.24512-(10.29297)));
            zz = 10.26371 + (((tickAnim - 35) / 5) * (15.98576-(10.26371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm3, rightArm3.rotateAngleX + (float) Math.toRadians(xx), rightArm3.rotateAngleY + (float) Math.toRadians(yy), rightArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = -0.175 + (((tickAnim - 5) / 5) * (-0.3-(-0.175)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = -0.3 + (((tickAnim - 10) / 5) * (-0.15-(-0.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            zz = -0.15 + (((tickAnim - 15) / 5) * (0-(-0.15)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = -0.175 + (((tickAnim - 30) / 10) * (0-(-0.175)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm3.rotationPointX = this.rightArm3.rotationPointX + (float)(xx);
        this.rightArm3.rotationPointY = this.rightArm3.rotationPointY - (float)(yy);
        this.rightArm3.rotationPointZ = this.rightArm3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (55.16872-(0)));
            yy = -44.75 + (((tickAnim - 0) / 5) * (-45.91847-(-44.75)));
            zz = 0 + (((tickAnim - 0) / 5) * (-43.0804-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 55.16872 + (((tickAnim - 5) / 5) * (33.50217-(55.16872)));
            yy = -45.91847 + (((tickAnim - 5) / 5) * (18.85724-(-45.91847)));
            zz = -43.0804 + (((tickAnim - 5) / 5) * (-27.18984-(-43.0804)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 33.50217 + (((tickAnim - 10) / 5) * (-3.49014-(33.50217)));
            yy = 18.85724 + (((tickAnim - 10) / 5) * (63.185-(18.85724)));
            zz = -27.18984 + (((tickAnim - 10) / 5) * (-13.06158-(-27.18984)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -3.49014 + (((tickAnim - 15) / 5) * (0-(-3.49014)));
            yy = 63.185 + (((tickAnim - 15) / 5) * (74.5-(63.185)));
            zz = -13.06158 + (((tickAnim - 15) / 5) * (0-(-13.06158)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 74.5 + (((tickAnim - 20) / 20) * (-44.75-(74.5)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm, leftArm.rotateAngleX + (float) Math.toRadians(xx), leftArm.rotateAngleY + (float) Math.toRadians(yy), leftArm.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0.6 + (((tickAnim - 0) / 5) * (0.6-(0.6)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0.6 + (((tickAnim - 5) / 15) * (-0.475-(0.6)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -0.475 + (((tickAnim - 20) / 20) * (0.6-(-0.475)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm.rotationPointX = this.leftArm.rotationPointX + (float)(xx);
        this.leftArm.rotationPointY = this.leftArm.rotationPointY - (float)(yy);
        this.leftArm.rotationPointZ = this.leftArm.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 10.50294 + (((tickAnim - 0) / 5) * (39.74497-(10.50294)));
            yy = -47.8921 + (((tickAnim - 0) / 5) * (-48.30298-(-47.8921)));
            zz = 11.83914 + (((tickAnim - 0) / 5) * (-34.37695-(11.83914)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 39.74497 + (((tickAnim - 5) / 5) * (-1.14931-(39.74497)));
            yy = -48.30298 + (((tickAnim - 5) / 5) * (-49.18573-(-48.30298)));
            zz = -34.37695 + (((tickAnim - 5) / 5) * (-23.70368-(-34.37695)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -1.14931 + (((tickAnim - 10) / 5) * (-1.96534-(-1.14931)));
            yy = -49.18573 + (((tickAnim - 10) / 5) * (-51.55387-(-49.18573)));
            zz = -23.70368 + (((tickAnim - 10) / 5) * (4.84536-(-23.70368)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -1.96534 + (((tickAnim - 15) / 5) * (19.06215-(-1.96534)));
            yy = -51.55387 + (((tickAnim - 15) / 5) * (-50.95122-(-51.55387)));
            zz = 4.84536 + (((tickAnim - 15) / 5) * (-2.35713-(4.84536)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 19.06215 + (((tickAnim - 20) / 10) * (7.01248-(19.06215)));
            yy = -50.95122 + (((tickAnim - 20) / 10) * (-37.19378-(-50.95122)));
            zz = -2.35713 + (((tickAnim - 20) / 10) * (2.50817-(-2.35713)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 7.01248 + (((tickAnim - 30) / 10) * (10.50294-(7.01248)));
            yy = -37.19378 + (((tickAnim - 30) / 10) * (-47.8921-(-37.19378)));
            zz = 2.50817 + (((tickAnim - 30) / 10) * (11.83914-(2.50817)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = -14.3194 + (((tickAnim - 0) / 5) * (-14.43307-(-14.3194)));
            yy = -5.29159 + (((tickAnim - 0) / 5) * (-33.36915-(-5.29159)));
            zz = 1.50181 + (((tickAnim - 0) / 5) * (1.18039-(1.50181)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -14.43307 + (((tickAnim - 5) / 3) * (70.2273-(-14.43307)));
            yy = -33.36915 + (((tickAnim - 5) / 3) * (12.42167-(-33.36915)));
            zz = 1.18039 + (((tickAnim - 5) / 3) * (10.44045-(1.18039)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 70.2273 + (((tickAnim - 8) / 2) * (38.82911-(70.2273)));
            yy = 12.42167 + (((tickAnim - 8) / 2) * (21.83106-(12.42167)));
            zz = 10.44045 + (((tickAnim - 8) / 2) * (4.54166-(10.44045)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 38.82911 + (((tickAnim - 10) / 5) * (-2.03372-(38.82911)));
            yy = 21.83106 + (((tickAnim - 10) / 5) * (10.29297-(21.83106)));
            zz = 4.54166 + (((tickAnim - 10) / 5) * (10.26371-(4.54166)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -2.03372 + (((tickAnim - 15) / 5) * (-2.39654-(-2.03372)));
            yy = 10.29297 + (((tickAnim - 15) / 5) * (1.24512-(10.29297)));
            zz = 10.26371 + (((tickAnim - 15) / 5) * (-15.98576-(10.26371)));
        }
        else if (tickAnim >= 20 && tickAnim < 40) {
            xx = -2.39654 + (((tickAnim - 20) / 20) * (-14.3194-(-2.39654)));
            yy = 1.24512 + (((tickAnim - 20) / 20) * (-5.29159-(1.24512)));
            zz = -15.98576 + (((tickAnim - 20) / 20) * (1.50181-(-15.98576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm3, leftArm3.rotateAngleX + (float) Math.toRadians(xx), leftArm3.rotateAngleY + (float) Math.toRadians(yy), leftArm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = -0.175 + (((tickAnim - 10) / 10) * (0-(-0.175)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.175-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = -0.175 + (((tickAnim - 25) / 5) * (-0.3-(-0.175)));
        }
        else if (tickAnim >= 30 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 5) * (0-(0)));
            zz = -0.3 + (((tickAnim - 30) / 5) * (-0.15-(-0.3)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = -0.15 + (((tickAnim - 35) / 5) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm3.rotationPointX = this.leftArm3.rotationPointX + (float)(xx);
        this.leftArm3.rotationPointY = this.leftArm3.rotationPointY - (float)(yy);
        this.leftArm3.rotationPointZ = this.leftArm3.rotationPointZ + (float)(zz);

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraGerobatrachus Gerobatrachus = (EntityPrehistoricFloraGerobatrachus) e;

        this.faceTarget(f3, f4, 7, head);

//        float speed = 0.3F;
//        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3};
//        AdvancedModelRenderer[] Torso = {this.body, this.chest};
//
//        AdvancedModelRenderer[] LeftArm = {this.upperarmleft, this.upperarmleft2};
//        AdvancedModelRenderer[] RightArm = {this.upperarmright, this.upperarmright2};
//
//        AdvancedModelRenderer[] LeftLeg = {this.upperlegleft, this.lowerlegleft};
//        AdvancedModelRenderer[] RightLeg = {this.upperlegright, this.lowerlegright};
//
//        if (!Gerobatrachus.isReallyInWater()) {
//            //Land animation:
//            this.chainWave(Tail, speed * 0.5F, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed * 0.5F, 0.12F, -3, f2, 0.8F);
//
//            //System.err.println("Blinking: " + Gerobatrachus.getBlinking());
//
//
//            this.jaw.rotateAngleX = -0.2F;
//            this.walk(this.jaw, speed * 0.2F, 0.1F,false, 0F,0.5F, f2, 0.6F);
//
//            if (f3 == 0.0F || !Gerobatrachus.getIsMoving()) { //Not moving
//                return;
//            }
//
//            this.flap(upperlegleft, speed, 0.45F, false, -3, -0.35F, f2, 0.5F);
//            this.swing(upperlegleft, speed, -0.5F, true, -1, 1F, f2, 0.5F);
//            this.walk(lowerlegleft, speed, -0.6F, true, -3, 0.0F, f2, 0.8F);
//            this.flap(lowerlegleft, speed, -0.5F, true, 0, 0.25F, f2, 0.8F);
//            this.flap(footleft, speed, 0.2F, false, 3, -0.1F, f2, 0.3F);
//            this.walk(footleft, speed, 0.2F, false, 3, 0.4F, f2, 0.5F);
//            this.swing(footleft, speed, 0.2F, false, 3, 0F, f2, 0.5F);
//
//            this.flap(upperlegright, speed, -0.45F, false, 0, 0.35F, f2, 0.5F);
//            this.swing(upperlegright, speed, 0.5F, true, 2, -1F, f2, 0.5F);
//            this.walk(lowerlegright, speed, -0.6F, true, 0, 0.0F, f2, 0.8F);
//            this.flap(lowerlegright, speed, 0.5F, true, 3, -0.25F, f2, 0.8F);
//            this.flap(footright, speed, -0.2F, false, 6, 0.1F, f2, 0.3F);
//            this.walk(footright, speed, 0.2F, false, 6, 0.4F, f2, 0.5F);
//            this.swing(footright, speed, -0.2F, false, 6, 0F, f2, 0.5F);
//
//            this.flap(upperarmleft, speed, 0.45F, false, 0, -0.18F, f2, 0.5F);
//            this.swing(upperarmleft, speed, -0.75F, true, 2, 0.5F, f2, 0.5F);
//            this.walk(upperarmleft2, speed, -0.5F, true, 0, 0.0F, f2, 0.8F);
//            this.flap(lowerarmleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.3F);
//            this.walk(lowerarmleft, speed, 0.2F, false, -1.5F, 0.4F, f2, 0.5F);
//            this.swing(lowerarmleft, speed, 0.2F, false, -1.5F, 0F, f2, 0.5F);
//
//            this.flap(upperarmright, speed, -0.45F, false, -3, 0.18F, f2, 0.5F);
//            this.swing(upperarmright, speed, 0.75F, true, -1, -0.5F, f2, 0.5F);
//            this.walk(upperarmright2, speed, -0.5F, true, -3, 0.0F, f2, 0.8F);
//            this.flap(lowerarmright, speed, -0.2F, false, 1.5F, -0.4F, f2, 0.3F);
//            this.walk(lowerarmright, speed, 0.2F, false, 1.5F, 0.4F, f2, 0.5F);
//            this.swing(lowerarmright, speed, -0.2F, false, 1.5F, 0F, f2, 0.5F);
//
//        }
//        else {
//            //Swimming animation:
//            speed = speed * 1.2F;
//
//            this.setRotateAngle(cube_r1, 0.0F, -0.1745F, 0.0F);
//            this.setRotateAngle(cube_r10, 0.0F, -0.0436F, 0.0F);
//            this.setRotateAngle(cube_r11, 0.0F, -0.3927F, 0.0F);
//            this.setRotateAngle(cube_r12, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
//            this.setRotateAngle(cube_r14, 0.0F, 0.0436F, 0.0F);
//            this.setRotateAngle(cube_r15, 0.0F, -0.3927F, 0.0F);
//            this.setRotateAngle(cube_r16, 0.0F, -0.0436F, 0.0F);
//            this.setRotateAngle(cube_r2, 0.0F, 0.1745F, 0.0F);
//            this.setRotateAngle(cube_r3, 0.0F, -0.0611F, 0.0F);
//            this.setRotateAngle(cube_r4, 0.0F, 0.0611F, 0.0F);
//            this.setRotateAngle(cube_r5, -0.0218F, 0.0F, 0.0F);
//            this.setRotateAngle(cube_r6, 0.0F, 0.0436F, 0.0F);
//            this.setRotateAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
//            this.setRotateAngle(cube_r8, 0.1309F, 0.1309F, -0.1745F);
//            this.setRotateAngle(cube_r9, 0.1309F, -0.1309F, 0.1745F);
//            this.setRotateAngle(footleft, 0.547F, -0.5194F, -0.1099F);
//            this.setRotateAngle(footright, 0.547F, 0.5194F, 0.1099F);
//            this.setRotateAngle(head, 0.1309F, 0.0F, 0.0F);
//            this.setRotateAngle(jaw, -0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(lowerarmleft, 0.0F, 0.7854F, -0.7418F);
//            this.setRotateAngle(lowerarmright, 0.0F, -0.7854F, 0.7418F);
//            this.setRotateAngle(lowerlegleft, -0.0436F, -0.829F, 0.1745F);
//            this.setRotateAngle(lowerlegright, -0.0436F, 0.829F, -0.1745F);
//            this.setRotateAngle(tail1, -0.1309F, 0.0F, 0.0F);
//            this.setRotateAngle(tail2, 0.0873F, 0.0F, 0.0F);
//            this.setRotateAngle(tail3, 0.0436F, 0.0F, 0.0F);
//            this.setRotateAngle(upperarmleft, 0.0F, -0.7854F, 0.1745F);
//            this.setRotateAngle(upperarmleft2, 0.8259F, -0.0473F, -0.0022F);
//            this.setRotateAngle(upperarmright, 0.0F, 0.7854F, -0.1745F);
//            this.setRotateAngle(upperarmright2, 0.8259F, 0.0473F, 0.0022F);
//            this.setRotateAngle(upperlegleft, -0.1525F, -0.698F, 0.4521F);
//            this.setRotateAngle(upperlegright, -0.1525F, 0.698F, -0.4521F);
//
//            this.chainSwing(Torso, speed, 0.07F, -3, f2, 1);
//            if (f3 == 0.0F) {
//                return;
//            }
//
//
//            this.chainSwingExtended(LeftArm, speed, -0.2F,0F,3.0F, f2, 0.7F);
//            this.chainSwingExtended(RightArm, speed, 0.2F,0F,0, f2, 0.7F);
//
//            this.chainSwingExtended(LeftLeg, speed, 0.2F,0F,3.0F, f2, 0.7F);
//            this.chainSwingExtended(RightLeg, speed , -0.2F,0F,0, f2, 0.7F);
//
//            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed * 1.2F, 0.3F, -3, f2, 0.8F);
//            this.chainSwing(Torso, speed, 0.1F, -3, f2, 1);
//
//            this.chainWave(Tail, speed, 0.05F, -3, f2, 1);
//            this.chainSwing(Tail, speed, 0.35F, -3, f2, 1F);
//
//
//        }
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraGerobatrachus e = (EntityPrehistoricFloraGerobatrachus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        //animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(2);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(10);
        //animator.move(this.neck, 0,0,-1F);
        animator.rotate(this.head, (float) Math.toRadians(-35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(10);
        animator.resetKeyframe(10);
    }
}
