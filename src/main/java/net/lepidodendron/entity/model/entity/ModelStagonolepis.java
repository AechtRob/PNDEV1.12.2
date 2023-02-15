package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraStagonolepis;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStagonolepis extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Stagonolepis;
    private final AdvancedModelRendererExtended body3;
    private final AdvancedModelRendererExtended tail;
    private final AdvancedModelRendererExtended tail2;
    private final AdvancedModelRendererExtended tail3;
    private final AdvancedModelRendererExtended tail4;
    private final AdvancedModelRendererExtended leftBackLeg;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended leftBjoint;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended leftBfoot;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended rightBackLeg;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended rightBjoint;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended rightBfoot;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended body2;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended rightFrontLeg;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended RightFjoint;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended RightFFoot;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended leftFrontLeg;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended LeftFjoint;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended LeftFFoot;
    private final AdvancedModelRendererExtended cube_r14;
    private final AdvancedModelRendererExtended neck;
    private final AdvancedModelRendererExtended cube_r15;
    private final AdvancedModelRendererExtended cube_r16;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r17;
    private final AdvancedModelRendererExtended cube_r18;
    private final AdvancedModelRendererExtended cube_r19;
    private final AdvancedModelRendererExtended cube_r20;
    private final AdvancedModelRendererExtended jaw;
    private final AdvancedModelRendererExtended cube_r21;

    private ModelAnimator animator;

    public ModelStagonolepis() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Stagonolepis = new AdvancedModelRendererExtended(this);
        this.Stagonolepis.setRotationPoint(-0.5F, 18.675F, 5.0F);


        this.body3 = new AdvancedModelRendererExtended(this);
        this.body3.setRotationPoint(0.0F, -6.9335F, 0.4753F);
        this.Stagonolepis.addChild(body3);
        this.setRotateAngle(body3, -0.1309F, 0.0F, 0.0F);
        this.body3.cubeList.add(new ModelBox(body3, 0, 19, -4.0F, -3.3524F, -0.2172F, 9, 10, 9, 0.0F, false));

        this.tail = new AdvancedModelRendererExtended(this);
        this.tail.setRotationPoint(0.0F, -2.3524F, 8.7828F);
        this.body3.addChild(tail);
        this.setRotateAngle(tail, -0.1329F, 0.0F, -0.023F);
        this.tail.cubeList.add(new ModelBox(tail, 29, 10, -3.0F, -0.6109F, -0.372F, 7, 7, 9, 0.0F, false));

        this.tail2 = new AdvancedModelRendererExtended(this);
        this.tail2.setRotationPoint(0.5F, -0.3609F, 8.628F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, -0.1329F, 0.0F, -0.023F);
        this.tail2.cubeList.add(new ModelBox(tail2, 23, 48, -2.5F, 0.0653F, -0.7457F, 5, 5, 9, 0.0F, false));

        this.tail3 = new AdvancedModelRendererExtended(this);
        this.tail3.setRotationPoint(0.0F, 0.5653F, 7.7543F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.044F, 0.0F, -0.0057F);
        this.tail3.cubeList.add(new ModelBox(tail3, 52, 0, -1.5F, -0.25F, 0.0F, 3, 3, 7, 0.0F, false));

        this.tail4 = new AdvancedModelRendererExtended(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1855F, 0.0F, 0.0631F);
        this.tail4.cubeList.add(new ModelBox(tail4, 48, 37, -1.0F, 0.2391F, -0.2498F, 2, 2, 11, 0.0F, false));

        this.leftBackLeg = new AdvancedModelRendererExtended(this);
        this.leftBackLeg.setRotationPoint(3.75F, 1.3976F, 4.7828F);
        this.body3.addChild(leftBackLeg);
        this.setRotateAngle(leftBackLeg, -0.4363F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -3.5005F, -2.3809F);
        this.leftBackLeg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2921F, 0.0905F, -0.2921F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, -2.7721F, 1.8442F, -2.3523F, 4, 6, 6, 0.0F, false));

        this.leftBjoint = new AdvancedModelRendererExtended(this);
        this.leftBjoint.setRotationPoint(1.3F, 2.4995F, -0.6309F);
        this.leftBackLeg.addChild(leftBjoint);
        this.setRotateAngle(leftBjoint, 0.5236F, 0.0F, 0.0F);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.25F, 3.8786F, 1.1063F);
        this.leftBjoint.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 18, 62, -1.0F, -4.0F, -2.0F, 2, 7, 4, 0.0F, false));

        this.leftBfoot = new AdvancedModelRendererExtended(this);
        this.leftBfoot.setRotationPoint(-0.25F, 6.9697F, 1.8901F);
        this.leftBjoint.addChild(leftBfoot);
        this.setRotateAngle(leftBfoot, -0.2618F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 1.25F, -1.25F);
        this.leftBfoot.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 0, -1.5F, -1.5F, -5.0F, 4, 2, 8, 0.0F, false));

        this.rightBackLeg = new AdvancedModelRendererExtended(this);
        this.rightBackLeg.setRotationPoint(-2.75F, 1.3976F, 4.7828F);
        this.body3.addChild(rightBackLeg);
        this.setRotateAngle(rightBackLeg, -0.4363F, 0.0F, 0.0F);


        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, -3.5005F, -2.3809F);
        this.rightBackLeg.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.2921F, -0.0905F, 0.2921F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 49, -1.2279F, 1.8442F, -2.3523F, 4, 6, 6, 0.0F, true));

        this.rightBjoint = new AdvancedModelRendererExtended(this);
        this.rightBjoint.setRotationPoint(-1.3F, 2.4995F, -0.6309F);
        this.rightBackLeg.addChild(rightBjoint);
        this.setRotateAngle(rightBjoint, 0.5236F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(-0.25F, 3.8786F, 1.1063F);
        this.rightBjoint.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2182F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 62, -1.0F, -4.0F, -2.0F, 2, 7, 4, 0.0F, true));

        this.rightBfoot = new AdvancedModelRendererExtended(this);
        this.rightBfoot.setRotationPoint(0.25F, 6.9697F, 1.8901F);
        this.rightBjoint.addChild(rightBfoot);
        this.setRotateAngle(rightBfoot, -0.2618F, 0.0F, 0.0F);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 1.25F, -1.25F);
        this.rightBfoot.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 0, -2.5F, -1.5F, -5.0F, 4, 2, 8, 0.0F, true));

        this.body2 = new AdvancedModelRendererExtended(this);
        this.body2.setRotationPoint(0.0F, -2.8702F, -0.221F);
        this.body3.addChild(body2);
        this.setRotateAngle(body2, 0.2182F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.5F, 4.8091F, -4.332F);
        this.body2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 29, 31, -4.0F, -5.25F, -2.0F, 8, 10, 7, 0.0F, false));

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.5F, 0.1669F, -6.5496F);
        this.body2.addChild(body);
        this.setRotateAngle(body, -0.0873F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -4.5F, 0.3257F, -9.0076F, 9, 9, 10, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, -0.1743F, -0.5076F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 38, -3.0F, -0.3639F, -8.5F, 6, 1, 10, 0.0F, false));

        this.rightFrontLeg = new AdvancedModelRendererExtended(this);
        this.rightFrontLeg.setRotationPoint(-4.0F, 8.0908F, -8.4517F);
        this.body.addChild(rightFrontLeg);
        this.setRotateAngle(rightFrontLeg, 0.3491F, -0.2618F, 0.3491F);


        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.4059F, -0.7694F, -0.4768F);
        this.rightFrontLeg.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.0553F, -0.0981F, -0.1095F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 30, 62, -1.674F, 0.5969F, -1.3649F, 3, 6, 3, 0.0F, true));

        this.RightFjoint = new AdvancedModelRendererExtended(this);
        this.RightFjoint.setRotationPoint(-0.6518F, 1.5023F, 4.5709F);
        this.rightFrontLeg.addChild(RightFjoint);
        this.setRotateAngle(RightFjoint, -0.3927F, 0.0436F, -0.3491F);


        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -3.0F, 0.25F);
        this.RightFjoint.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.2182F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -0.5F, 3.5F, -1.0F, 2, 5, 3, 0.0F, true));

        this.RightFFoot = new AdvancedModelRendererExtended(this);
        this.RightFFoot.setRotationPoint(1.0F, 4.8042F, -0.7206F);
        this.RightFjoint.addChild(RightFFoot);
        this.setRotateAngle(RightFFoot, 0.4363F, 0.0F, -0.0436F);


        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0658F, -0.2566F);
        this.RightFFoot.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.4363F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 61, -2.5F, -0.2172F, -3.8345F, 4, 2, 5, -0.01F, true));

        this.leftFrontLeg = new AdvancedModelRendererExtended(this);
        this.leftFrontLeg.setRotationPoint(4.0F, 8.0908F, -8.4517F);
        this.body.addChild(leftFrontLeg);
        this.setRotateAngle(leftFrontLeg, 0.3491F, 0.2618F, -0.3491F);


        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(-0.4059F, -0.7694F, -0.4768F);
        this.leftFrontLeg.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.0553F, 0.0981F, 0.1095F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 62, -1.326F, 0.5969F, -1.3649F, 3, 6, 3, 0.0F, false));

        this.LeftFjoint = new AdvancedModelRendererExtended(this);
        this.LeftFjoint.setRotationPoint(0.6518F, 1.5023F, 4.5709F);
        this.leftFrontLeg.addChild(LeftFjoint);
        this.setRotateAngle(LeftFjoint, -0.3927F, -0.0436F, 0.3491F);


        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, -3.0F, 0.25F);
        this.LeftFjoint.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.2182F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.5F, 3.5F, -1.0F, 2, 5, 3, 0.0F, false));

        this.LeftFFoot = new AdvancedModelRendererExtended(this);
        this.LeftFFoot.setRotationPoint(-1.0F, 4.8042F, -0.7206F);
        this.LeftFjoint.addChild(LeftFFoot);
        this.setRotateAngle(LeftFFoot, 0.4363F, 0.0F, 0.0436F);


        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0658F, -0.2566F);
        this.LeftFFoot.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.4363F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 61, -1.5F, -0.2172F, -3.8345F, 4, 2, 5, -0.01F, false));

        this.neck = new AdvancedModelRendererExtended(this);
        this.neck.setRotationPoint(0.0F, 0.3257F, -9.0076F);
        this.body.addChild(neck);
        this.neck.cubeList.add(new ModelBox(neck, 51, 50, -3.5F, 1.0F, -5.0F, 7, 6, 6, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 0, 0, 0.0F, 1.0F, -5.01F, 0, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRendererExtended(this);
        this.cube_r15.setRotationPoint(0.0F, 6.2664F, -0.739F);
        this.neck.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.3491F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 52, 10, -3.0F, -1.5F, -2.0F, 6, 3, 5, -0.01F, false));

        this.cube_r16 = new AdvancedModelRendererExtended(this);
        this.cube_r16.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.neck.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1309F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 52, 26, -2.5F, -0.5F, -6.5F, 5, 1, 6, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, 3.0F, -4.0F);
        this.neck.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 61, 18, -2.5F, -2.0F, -3.25F, 5, 3, 3, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 49, -2.0F, -1.0F, -6.0F, 4, 2, 4, 0.02F, false));
        this.head.cubeList.add(new ModelBox(head, 50, 62, -1.5F, 0.0F, -8.25F, 3, 1, 3, 0.01F, false));

        this.cube_r17 = new AdvancedModelRendererExtended(this);
        this.cube_r17.setRotationPoint(0.0F, 0.7239F, -8.3694F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.9599F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 22, -1.5F, -1.6716F, -0.3464F, 3, 2, 1, 0.0F, false));

        this.cube_r18 = new AdvancedModelRendererExtended(this);
        this.cube_r18.setRotationPoint(0.0F, -1.0749F, -6.2357F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.48F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 19, -1.0F, 0.1868F, -2.0402F, 2, 1, 2, -0.01F, false));

        this.cube_r19 = new AdvancedModelRendererExtended(this);
        this.cube_r19.setRotationPoint(0.0F, -1.0749F, -6.2357F);
        this.head.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.2182F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 42, 50, -1.0F, -0.0632F, -3.0402F, 2, 1, 4, 0.0F, false));

        this.cube_r20 = new AdvancedModelRendererExtended(this);
        this.cube_r20.setRotationPoint(-0.5F, -2.0F, -4.25F);
        this.head.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.2182F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 52, 33, -1.0F, 0.2841F, -2.0F, 3, 1, 3, 0.02F, false));

        this.jaw = new AdvancedModelRendererExtended(this);
        this.jaw.setRotationPoint(-0.5F, 0.9508F, -1.1296F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 44, 0, -1.5F, 0.0492F, -4.8704F, 4, 1, 3, 0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 62, 62, -1.0F, 0.0492F, -7.1204F, 3, 1, 3, 0.011F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 63, 35, -1.5F, -1.9508F, -1.8704F, 4, 2, 2, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 36, 26, -2.0F, 0.0492F, -2.1204F, 5, 2, 3, 0.011F, false));

        this.cube_r21 = new AdvancedModelRendererExtended(this);
        this.cube_r21.setRotationPoint(0.5F, 1.0862F, -3.5893F);
        this.jaw.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2182F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 42, 62, -1.0F, -0.5F, -2.0F, 2, 1, 4, 0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Stagonolepis.render(f5 * 0.727f);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.disableCull();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.neck.offsetY = -0.04F;
        this.jaw.rotateAngleX = (float) Math.toRadians(32.5);
        this.head.rotateAngleX = (float) Math.toRadians(-12.5);
        this.neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        //this.Desmatosuchus.offsetY = 0.40F;
        //float ZOffsetter = 0.60F;

        EntityPrehistoricFloraStagonolepis entityStagonolepis = (EntityPrehistoricFloraStagonolepis) e;
        float masterSpeed = entityStagonolepis.getTravelSpeed();

        if (entityStagonolepis.isDrinking()) {
            this.faceTarget(f3, f4, 1, Stagonolepis);
        }

        //System.err.println("PFDrink " + entityDesmatosuchus.getPFDrinking());

        //float masterSpeed = 0;

        this.faceTarget(f3, f4, 4, neck);
        this.faceTarget(f3, f4, 4, head);

        AdvancedModelRendererExtended[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        entityStagonolepis.tailBuffer.applyChainSwingBuffer(Tail);

        if (entityStagonolepis.getAnimation() == entityStagonolepis.LAY_ANIMATION) {
            this.Stagonolepis.offsetY = 0.40F;
            //this.Desmatosuchus.offsetZ = ZOffsetter;
            this.swing(neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);

            return;
         }

        if (f3 == 0.0F || !entityStagonolepis.getIsMoving()) { //Not moving
            this.Stagonolepis.offsetY = 0.40F;
            //this.Desmatosuchus.offsetZ = ZOffsetter;
            this.swing(neck, 0.06F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            this.walk(neck, 0.06F * 2F, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            this.chainFlap(Tail, (0.06F*0.9F), 0.10F, 0.10F, f2, 1F);
            this.chainSwing(Tail, (0.06F*0.9F) * 2F, 0.05F, 0.06F, f2, 1F);
            return;
         }

        this.Stagonolepis.offsetY = 0.44F;
        float speed = masterSpeed / 2.225F;
        if (entityStagonolepis.getIsFast()) {
            speed = speed * 2;
        }

        this.leftFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 1, f2, 1.5F);;
        this.rightFrontLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.8), false, 4, f2, 1.5F);;
        this.leftBackLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 4, f2, 1.5F);;
        this.rightBackLeg.offsetY = this.moveBoxExtended(speed, (float) Math.toRadians(1.0), false, 1, f2, 1.5F);;

        this.flap(leftFrontLeg, speed, -0.2F, true, 4, 0.15F, f2, 1F);
        this.flap(rightFrontLeg, speed, 0.2F, true, 7, -0.15F, f2, 1F);
        this.flap(leftBackLeg, speed, 0.1F, false, 7, -0.05F, f2, 1F);
        this.flap(rightBackLeg, speed, -0.1F, false, 4, 0.05F, f2, 1F);

        this.walk(leftFrontLeg, speed, 0.20F, true, 5, 0.30F, f2, 1F);
        this.walk(rightFrontLeg, speed, 0.20F, true, 8, 0.30F, f2, 1F);
        this.walk(leftBackLeg, speed, 0.30F, true, 8, 0F, f2, 1F);
        this.walk(rightBackLeg, speed, 0.30F, true, 5, 0F, f2, 1F);

        this.walk(LeftFjoint, speed, 0.25F, true, 6, 0F, f2, 1F);
        this.walk(RightFFoot, speed, 0.25F, true, 9, 0F, f2, 1F);
        this.walk(leftBjoint, speed, 0.20F, true, 9, 0F, f2, 1F);
        this.walk(rightBjoint, speed, 0.20F, true, 6, 0F, f2, 1F);

        this.flap(LeftFjoint, speed, 0.10F, true, 0, 0.05F, f2, 1F);
        this.flap(RightFFoot, speed, -0.10F, true, 3, -0.05F, f2, 1F);
        this.flap(leftBjoint, speed, -0.10F, false, 3, -0.05F, f2, 1F);
        this.flap(rightBjoint, speed, 0.10F, false, 0, 0.05F, f2, 1F);

        this.walk(LeftFFoot, speed, 0.30F, true, 2, -0.10F, f2, 1F);
        this.walk(RightFFoot, speed, 0.30F, true, 5, -0.10F, f2, 1F);
        this.walk(leftBfoot, speed, 0.25F, true, 5, -0.08F, f2, 1F);
        this.walk(rightBfoot, speed, 0.25F, true, 2, -0.08F, f2, 1F);

        this.bobExtended(Stagonolepis, speed * 2F, 0.2F, false, 2.5F,  f2, 1F);

        this.flap(body3, speed, 0.12F, false, 5.0F,0.06F, f2, 1.0F);
        this.flap(body2, speed, -0.12F, false, 5.0F,-0.06F, f2, 1.0F);
        this.flap(body, speed, -0.08F, false, 5.0F,-0.04F, f2, 1.0F);

        this.walk(body, speed * 2, 0.05F, false, 2.5F,-0.01F, f2, 0.8F);

        this.swing(neck, speed, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
        this.walk(neck, speed * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
        this.chainFlap(Tail, (speed*0.6F), 0.20F, 0.2F, f2, 1F);
        this.chainSwing(Tail, (speed*0.6F) * 2F, 0.10F, 0.12F, f2, 1F);

        this.Stagonolepis.offsetZ = this.moveBoxExtended(speed * 2, (float) Math.toRadians(2.2), false, 1.5F, f2, 1);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraStagonolepis e = (EntityPrehistoricFloraStagonolepis) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION); //20 ticks
        animator.startKeyframe(5);
        animator.rotate(this.body2, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(15.0), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(-12.2), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(-12.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.rotate(this.body2, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(1);
        animator.resetKeyframe(9);

        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
        animator.startKeyframe(4);
        animator.rotate(this.neck, (float) Math.toRadians(45), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(3);
        animator.resetKeyframe(3);

        animator.setAnimation(e.DRINK_ANIMATION); //66 ticks
        animator.startKeyframe(10);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        //frame 2:
        animator.startKeyframe(5);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 3:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 4:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 5:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 6:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 7:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        //animator.rotate(this.jaw, (float) Math.toRadians(-15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 8:
        animator.startKeyframe(2);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.rotate(this.neck, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        //frame 9:
        animator.startKeyframe(5);
        animator.move(this.body3, 0, 0.1F, 0);
        animator.rotate(this.body3, (float) Math.toRadians(17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.rightBackLeg, (float) Math.toRadians(-17.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.body2, (float) Math.toRadians(-2.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.leftFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(-30));
        animator.rotate(this.rightFrontLeg, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(30));
        animator.rotate(this.LeftFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFjoint, (float) Math.toRadians(0), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.rotate(this.LeftFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(55));
        animator.rotate(this.RightFFoot, (float) Math.toRadians(-20), (float) Math.toRadians(0), (float) Math.toRadians(-55));
        animator.move(this.leftFrontLeg, 0, -0.2F, 0);
        animator.move(this.rightFrontLeg, 0, -0.2F, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        //end:
        animator.resetKeyframe(10);

        animator.setAnimation(e.ROAR_ANIMATION);
        animator.startKeyframe(3);
        animator.rotate(this.neck, (float) Math.toRadians(-10), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.head, (float) Math.toRadians(-5), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(20), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(2);
        animator.resetKeyframe(10);

        animator.setAnimation(e.LAY_ANIMATION); //50 ticks

    }
}
