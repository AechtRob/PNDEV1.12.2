package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraCryptoclidus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelCryptoclidus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer snout2;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer forehead;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer forehead2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer jaw2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw3;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer armRight;
    private final AdvancedModelRenderer armRight2;
    private final AdvancedModelRenderer armRight3;
    private final AdvancedModelRenderer armLeft;
    private final AdvancedModelRenderer armLeft2;
    private final AdvancedModelRenderer armLeft3;
    private final AdvancedModelRenderer rightLeg;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightLeg3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer leftLeg;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftLeg3;

    private ModelAnimator animator;

    public ModelCryptoclidus() {
        this.textureWidth = 100;
        this.textureHeight = 100;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 10.9957F, 9.077F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.4035F, 4.5952F, 2.475F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 44, 37, -7.5F, -5.0F, -4.5F, 15, 9, 9, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 2.5038F, -0.2075F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -10.0F, -3.25F, -14.225F, 20, 11, 15, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.875F, -14.275F);
        this.body.addChild(chest);
        this.chest.cubeList.add(new ModelBox(chest, 0, 27, -8.5414F, -0.4134F, -7.025F, 17, 9, 9, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.0415F, 2.5866F, -7.025F);
        this.chest.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 0, 46, -5.5F, -2.0F, -6.0F, 11, 6, 7, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -0.25F, -5.0F);
        this.neck.addChild(neck2);
        this.neck2.cubeList.add(new ModelBox(neck2, 0, 60, -3.0F, -1.5F, -7.0F, 6, 5, 7, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.25F, -6.0F);
        this.neck2.addChild(neck3);
        this.neck3.cubeList.add(new ModelBox(neck3, 56, 0, -2.5F, -1.0F, -10.0F, 5, 4, 10, 0.01F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.25F, -10.0F);
        this.neck3.addChild(neck4);
        this.neck4.cubeList.add(new ModelBox(neck4, 52, 61, -2.0F, -1.0F, -8.0F, 4, 3, 9, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -8.0F);
        this.neck4.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 71, 15, -2.0F, -1.5F, -2.0F, 4, 2, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -0.8427F, -2.8375F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3484F, -0.0162F, 0.0002F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.45F, -0.35F, -0.75F, 1, 1, 1, 0.02F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, -0.8427F, -2.8375F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3484F, 0.0162F, -0.0002F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.55F, -0.35F, -0.75F, 1, 1, 1, 0.02F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.5F, -1.95F);
        this.head.addChild(snout);
        this.setRotateAngle(snout, 0.0436F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 30, 46, -1.5F, -1.0F, -2.0F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(1.5F, 0.0F, -1.0F);
        this.snout.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 8, 0, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.5F, 0.0F, -1.0F);
        this.snout.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.8727F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 8, 0, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.snout2 = new AdvancedModelRenderer(this);
        this.snout2.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.snout.addChild(snout2);
        this.setRotateAngle(snout2, -0.0873F, 0.0F, 0.0F);
        this.snout2.cubeList.add(new ModelBox(snout2, 62, 77, -1.0F, -1.975F, -3.075F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -1.0F, -1.0F);
        this.snout2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 5, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.0F, -1.0F, -1.0F);
        this.snout2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 5, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.forehead = new AdvancedModelRenderer(this);
        this.forehead.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.snout2.addChild(forehead);
        this.setRotateAngle(forehead, 0.3578F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.forehead.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.1091F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 77, -1.0F, -0.175F, -0.825F, 2, 1, 3, -0.001F, false));

        this.forehead2 = new AdvancedModelRenderer(this);
        this.forehead2.setRotationPoint(0.0F, -0.025F, 1.8F);
        this.forehead.addChild(forehead2);
        this.setRotateAngle(forehead2, -0.1876F, 0.0F, 0.0F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.forehead2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 19, 82, -1.5F, -0.925F, 0.25F, 3, 1, 2, -0.001F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 54, 56, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 0.0F, -2.0F);
        this.jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3927F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 73, 32, -1.0F, -1.575F, -0.8F, 3, 2, 2, -0.02F, false));

        this.jaw2 = new AdvancedModelRenderer(this);
        this.jaw2.setRotationPoint(0.0F, 0.0F, -2.95F);
        this.jaw.addChild(jaw2);
        this.setRotateAngle(jaw2, 0.0436F, 0.0F, 0.0F);
        this.jaw2.cubeList.add(new ModelBox(jaw2, 71, 80, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 2, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.jaw2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 2, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.jaw3 = new AdvancedModelRenderer(this);
        this.jaw3.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.jaw2.addChild(jaw3);
        this.setRotateAngle(jaw3, -0.0873F, 0.0F, 0.0F);
        this.jaw3.cubeList.add(new ModelBox(jaw3, 21, 77, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(1.1036F, -1.0036F, -2.0F);
        this.jaw3.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.2793F, -0.7854F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 3, -0.0757F, -0.0707F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(1.0F, -1.0F, 0.0F);
        this.jaw3.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.1745F, -0.7854F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 8, 4, 0.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.1036F, -1.0036F, -2.0F);
        this.jaw3.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.2793F, 0.7854F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 3, -0.9243F, -0.0707F, -1.0F, 1, 0, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-1.0F, -1.0F, 0.0F);
        this.jaw3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, -0.1745F, 0.7854F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 8, 4, -1.0F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.armRight = new AdvancedModelRenderer(this);
        this.armRight.setRotationPoint(-8.0414F, 4.5672F, -2.645F);
        this.chest.addChild(armRight);
        this.setRotateAngle(armRight, -0.1624F, -0.0552F, 0.0F);
        this.armRight.cubeList.add(new ModelBox(armRight, 45, 74, -4.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, false));

        this.armRight2 = new AdvancedModelRenderer(this);
        this.armRight2.setRotationPoint(-4.0F, 0.0F, -0.4F);
        this.armRight.addChild(armRight2);
        this.setRotateAngle(armRight2, 0.0F, 0.1309F, 0.0F);
        this.armRight2.cubeList.add(new ModelBox(armRight2, 44, 27, -7.7489F, 0.0F, -0.7734F, 8, 2, 6, 0.0F, false));

        this.armRight3 = new AdvancedModelRenderer(this);
        this.armRight3.setRotationPoint(-7.2489F, 0.5F, 0.4266F);
        this.armRight2.addChild(armRight3);
        this.setRotateAngle(armRight3, 0.0F, 0.1309F, 0.0F);
        this.armRight3.cubeList.add(new ModelBox(armRight3, 22, 70, -8.0F, 0.0F, -0.6F, 8, 1, 5, 0.0F, false));

        this.armLeft = new AdvancedModelRenderer(this);
        this.armLeft.setRotationPoint(7.9585F, 4.5672F, -2.645F);
        this.chest.addChild(armLeft);
        this.setRotateAngle(armLeft, -0.1624F, 0.0552F, 0.0F);
        this.armLeft.cubeList.add(new ModelBox(armLeft, 45, 74, 0.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, true));

        this.armLeft2 = new AdvancedModelRenderer(this);
        this.armLeft2.setRotationPoint(4.0F, 0.0F, -0.4F);
        this.armLeft.addChild(armLeft2);
        this.setRotateAngle(armLeft2, 0.0F, -0.1309F, 0.0F);
        this.armLeft2.cubeList.add(new ModelBox(armLeft2, 44, 27, -0.2511F, 0.0F, -0.7734F, 8, 2, 6, 0.0F, true));

        this.armLeft3 = new AdvancedModelRenderer(this);
        this.armLeft3.setRotationPoint(7.2489F, 0.5F, 0.4266F);
        this.armLeft2.addChild(armLeft3);
        this.setRotateAngle(armLeft3, 0.0F, -0.1309F, 0.0F);
        this.armLeft3.cubeList.add(new ModelBox(armLeft3, 22, 70, 0.0F, 0.0F, -0.6F, 8, 1, 5, 0.0F, true));

        this.rightLeg = new AdvancedModelRenderer(this);
        this.rightLeg.setRotationPoint(-7.9035F, 5.5045F, 1.0475F);
        this.hips.addChild(rightLeg);
        this.setRotateAngle(rightLeg, -0.1622F, 0.2892F, -0.0141F);
        this.rightLeg.cubeList.add(new ModelBox(rightLeg, 45, 74, -3.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, false));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(-3.0F, 0.0F, -0.4F);
        this.rightLeg.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.0F, 0.1309F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 70, 56, -6.7489F, 0.0F, -0.7734F, 7, 2, 5, 0.0F, false));

        this.rightLeg3 = new AdvancedModelRenderer(this);
        this.rightLeg3.setRotationPoint(-6.2489F, 0.5F, 0.4266F);
        this.rightLeg2.addChild(rightLeg3);
        this.setRotateAngle(rightLeg3, 0.0F, 0.1309F, 0.0F);
        this.rightLeg3.cubeList.add(new ModelBox(rightLeg3, 70, 64, -7.0F, 0.0F, -0.6F, 7, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.4035F, 1.3989F, 6.9174F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, -0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 30, 56, -4.0F, -0.7009F, -0.6496F, 8, 6, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.2991F, 5.3504F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.0873F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 67, 21, -3.0F, -1.5F, 0.0F, 6, 4, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 6.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.0873F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 73, -2.0F, -1.5F, -1.0F, 4, 3, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.0873F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 72, 70, -1.0F, -1.5748F, 0.0289F, 2, 2, 7, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -5.5748F, 0.0289F, 0, 4, 7, 0.0F, false));

        this.leftLeg = new AdvancedModelRenderer(this);
        this.leftLeg.setRotationPoint(7.0965F, 5.5045F, 1.0475F);
        this.hips.addChild(leftLeg);
        this.setRotateAngle(leftLeg, -0.1692F, -0.2892F, 0.0577F);
        this.leftLeg.cubeList.add(new ModelBox(leftLeg, 45, 74, -1.0F, -0.5F, -1.0F, 4, 3, 4, 0.0F, true));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(3.0F, 0.0F, -0.4F);
        this.leftLeg.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.0F, -0.1309F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 70, 56, -0.2511F, 0.0F, -0.7734F, 7, 2, 5, 0.0F, true));

        this.leftLeg3 = new AdvancedModelRenderer(this);
        this.leftLeg3.setRotationPoint(6.2489F, 0.5F, 0.4266F);
        this.leftLeg2.addChild(leftLeg3);
        this.setRotateAngle(leftLeg3, 0.0F, -0.1309F, 0.0F);
        this.leftLeg3.cubeList.add(new ModelBox(leftLeg3, 70, 64, 0.0F, 0.0F, -0.6F, 7, 1, 4, 0.0F, true));
        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = -0.6F;
        this.hips.offsetX = 0.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(205);
        this.hips.rotateAngleX = (float)Math.toRadians(18);
        this.hips.rotateAngleZ = (float)Math.toRadians(-8);
        this.hips.scaleChildren = true;
        float scaler = 0.5F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.hips.offsetY = -0.35F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticSuspended(float f) {
        this.hips.offsetY = -0.08F;
        this.hips.render(0.01F);
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
        EntityPrehistoricFloraCryptoclidus ee = (EntityPrehistoricFloraCryptoclidus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            animBeached(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        }
        else {

            if (ee.getIsFast()) { //Running
                animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);


        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraCryptoclidus entity = (EntityPrehistoricFloraCryptoclidus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2 + (((tickAnim - 5) / 8) * (-0.75-(0.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-2)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.75 + (((tickAnim - 13) / 4) * (0-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 1.25 + (((tickAnim - 5) / 8) * (-0.75-(1.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.75 + (((tickAnim - 13) / 4) * (-1.25-(-0.75)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 17) / 3) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 5) / 8) * (1.5-(2.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 1.5 + (((tickAnim - 13) / 4) * (1.75-(1.5)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 17) / 3) * (0-(1.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 2.5 + (((tickAnim - 5) / 8) * (-0.25-(2.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -0.25 + (((tickAnim - 13) / 4) * (1.75-(-0.25)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 1.75 + (((tickAnim - 17) / 3) * (0-(1.75)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = -7.5 + (((tickAnim - 5) / 8) * (-1.25-(-7.5)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 13) / 7) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 12.25 + (((tickAnim - 5) / 8) * (0-(12.25)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 13) / 4) * (8-(0)));
            yy = 0 + (((tickAnim - 13) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 4) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 8 + (((tickAnim - 17) / 3) * (0-(8)));
            yy = 0 + (((tickAnim - 17) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));
        
        
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCryptoclidus entity = (EntityPrehistoricFloraCryptoclidus) entitylivingbaseIn;
        int animCycle = 75;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-30))*-5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-70))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-420))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*2.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-4.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-220))*-20), armRight.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-25), armRight.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+30))*15));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-280))*-10), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*-10), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-120))*-20));
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-10), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-5), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*30));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-220))*-20), armLeft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*25), armLeft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+30))*-15));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-280))*-10), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-400))*10), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-120))*20));
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-10), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*5), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-50))*-30));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-100))*-4), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-150))*-5.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-200))*-6), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-250))*-6.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-20), leftLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*20), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*-25));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-20), leftLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*15), leftLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*-10));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-550))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-80))*-30));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-350))*-20), rightLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-20), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*25));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-20), rightLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-450))*-15), rightLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96+10))*10));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-300))*-10), rightLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-550))*-10), rightLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*96-80))*30));
        
        
    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCryptoclidus entity = (EntityPrehistoricFloraCryptoclidus) entitylivingbaseIn;
        int animCycle = 43;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-30))*-5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-70))*-2));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-70))*1.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-420))*5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-270))*2.5), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*1.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*1.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-4.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armRight.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-25), armRight.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+30))*15));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-280))*-20), armRight2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*-10), armRight2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-120))*-20));
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-10), armRight3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-5), armRight3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*20));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-20), armLeft.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*25), armLeft.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+30))*-15));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-280))*-20), armLeft2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-400))*10), armLeft2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-120))*20));
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-10), armLeft3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*5), armLeft3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-50))*-20));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-20), rightLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-25), rightLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*25));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-20), rightLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*-20), rightLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*10));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-10), rightLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-550))*-10), rightLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-90))*30));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-150))*-5.5), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-200))*-6), tail3.rotateAngleY + (float) Math.toRadians(0), tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-250))*-6.5), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-350))*-20), leftLeg.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*25), leftLeg.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*-25));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-20), leftLeg2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-450))*20), leftLeg2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166+10))*-10));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-300))*-10), leftLeg3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-550))*10), leftLeg3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*166-90))*-30));
       
        
    }
    public void animBeached(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraCryptoclidus entity = (EntityPrehistoricFloraCryptoclidus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(-9), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(-3.425);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(8.25), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0));
        this.body.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.015),(float)1,(float)1);
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(15.75), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0));
        this.chest.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.015),(float)1,(float)1);
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(-3.74712), neck.rotateAngleY + (float) Math.toRadians(-0.14712), neck.rotateAngleZ + (float) Math.toRadians(-2.24519));
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-8.57794), neck2.rotateAngleY + (float) Math.toRadians(5.71298), neck2.rotateAngleZ + (float) Math.toRadians(-5.88382));
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(2.41599), neck3.rotateAngleY + (float) Math.toRadians(7.6526), neck3.rotateAngleZ + (float) Math.toRadians(-4.42368));
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-7.80757), neck4.rotateAngleY + (float) Math.toRadians(11.42662), neck4.rotateAngleZ + (float) Math.toRadians(-2.80499));
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(-4+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*-1.5), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+50))*3), jaw.rotateAngleY + (float) Math.toRadians(0), jaw.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(armRight, armRight.rotateAngleX + (float) Math.toRadians(11.56767), armRight.rotateAngleY + (float) Math.toRadians(-22.76931), armRight.rotateAngleZ + (float) Math.toRadians(-26.78811));
        this.setRotateAngle(armRight2, armRight2.rotateAngleX + (float) Math.toRadians(0), armRight2.rotateAngleY + (float) Math.toRadians(0), armRight2.rotateAngleZ + (float) Math.toRadians(24.5));
        this.setRotateAngle(armRight3, armRight3.rotateAngleX + (float) Math.toRadians(0), armRight3.rotateAngleY + (float) Math.toRadians(0), armRight3.rotateAngleZ + (float) Math.toRadians(3.75));
        this.setRotateAngle(armLeft, armLeft.rotateAngleX + (float) Math.toRadians(0), armLeft.rotateAngleY + (float) Math.toRadians(0), armLeft.rotateAngleZ + (float) Math.toRadians(18));
        this.setRotateAngle(armLeft2, armLeft2.rotateAngleX + (float) Math.toRadians(0), armLeft2.rotateAngleY + (float) Math.toRadians(0), armLeft2.rotateAngleZ + (float) Math.toRadians(-7.75));
        this.setRotateAngle(armLeft3, armLeft3.rotateAngleX + (float) Math.toRadians(0), armLeft3.rotateAngleY + (float) Math.toRadians(0), armLeft3.rotateAngleZ + (float) Math.toRadians(-5.5));
        this.setRotateAngle(rightLeg, rightLeg.rotateAngleX + (float) Math.toRadians(2.6527), rightLeg.rotateAngleY + (float) Math.toRadians(-9.94278), rightLeg.rotateAngleZ + (float) Math.toRadians(-14.79031));
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(0), rightLeg2.rotateAngleY + (float) Math.toRadians(0), rightLeg2.rotateAngleZ + (float) Math.toRadians(3.25));
        this.setRotateAngle(rightLeg3, rightLeg3.rotateAngleX + (float) Math.toRadians(9.5), rightLeg3.rotateAngleY + (float) Math.toRadians(0), rightLeg3.rotateAngleZ + (float) Math.toRadians(13.75));
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(-6), tail.rotateAngleY + (float) Math.toRadians(0), tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(12.25), tail2.rotateAngleY + (float) Math.toRadians(0), tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(14.41673), tail3.rotateAngleY + (float) Math.toRadians(-2.01919), tail3.rotateAngleZ + (float) Math.toRadians(0.40747));
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(6.25), tail4.rotateAngleY + (float) Math.toRadians(0), tail4.rotateAngleZ + (float) Math.toRadians(27.75));
        this.setRotateAngle(leftLeg, leftLeg.rotateAngleX + (float) Math.toRadians(0.02258), leftLeg.rotateAngleY + (float) Math.toRadians(1.64617), leftLeg.rotateAngleZ + (float) Math.toRadians(15.74549));
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(0), leftLeg2.rotateAngleY + (float) Math.toRadians(0), leftLeg2.rotateAngleZ + (float) Math.toRadians(-11));
        this.setRotateAngle(leftLeg3, leftLeg3.rotateAngleX + (float) Math.toRadians(0), leftLeg3.rotateAngleY + (float) Math.toRadians(0), leftLeg3.rotateAngleZ + (float) Math.toRadians(-11.5));
        
    }


    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        this.faceTarget(f3, f4, 5, neck);
        this.faceTarget(f3, f4, 5, neck2);
        this.faceTarget(f3, f4, 5, neck3);
        this.faceTarget(f3, f4, 5, head);

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        EntityPrehistoricFloraCryptoclidus ee = (EntityPrehistoricFloraCryptoclidus) e;
        ee.tailBuffer.applyChainSwingBuffer(fishTail);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
    }
}

