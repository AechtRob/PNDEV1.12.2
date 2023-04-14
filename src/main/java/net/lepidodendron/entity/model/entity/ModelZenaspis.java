package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelZenaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer eyes_r1;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer headleft;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer headright;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer finLeft;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer finRight;
    private final AdvancedModelRenderer cube_r21;
    public ModelZenaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 17, 0, -2.0F, -1.05F, -9.0F, 4, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 40, 32, -1.0F, -1.05F, -11.8F, 2, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.0F, -4.1F, -3.35F, 2, 2, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5672F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -1.0F, -6.7F, -8.75F, 2, 1, 1, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 41, -1.5F, -6.7F, -7.75F, 3, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3403F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 33, -1.0F, -4.8F, -4.25F, 2, 2, 2, 0.0F, false));

        this.eyes_r1 = new AdvancedModelRenderer(this);
        this.eyes_r1.setRotationPoint(0.5F, 0.0F, 1.4F);
        this.head.addChild(eyes_r1);
        this.setRotateAngle(eyes_r1, 0.1222F, 0.0F, 0.0F);
        this.eyes_r1.cubeList.add(new ModelBox(eyes_r1, 40, 12, -2.0F, -3.8956F, -9.2396F, 3, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1222F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 17, 15, -2.0F, -3.7F, -9.15F, 4, 2, 6, 0.0F, false));

        this.headleft = new AdvancedModelRenderer(this);
        this.headleft.setRotationPoint(0.2F, -0.25F, -0.65F);
        this.head.addChild(headleft);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.2618F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 42, -0.7695F, -0.49F, 5.2874F, 2, 0, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.2F, 0.35F, -0.35F);
        this.headleft.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.6109F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 35, 5.45F, -1.76F, -6.5F, 1, 1, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.3F, 0.35F, -11.35F);
        this.headleft.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.9948F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 6, -2.0037F, -1.26F, 0.3551F, 2, 1, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.4974F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 8, -4.0146F, -1.25F, 0.0393F, 4, 1, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0524F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 41, 2.255F, -0.48F, 6.4728F, 1, 0, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(3.9F, 0.35F, -9.0F);
        this.headleft.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.288F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 40, 37, -2.9034F, -1.26F, 4.8921F, 4, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.2F, 0.35F, 0.65F);
        this.headleft.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 26, -0.6F, -3.05F, -7.5F, 3, 1, 4, -0.002F, false));

        this.headright = new AdvancedModelRenderer(this);
        this.headright.setRotationPoint(-0.2F, -0.25F, -0.65F);
        this.head.addChild(headright);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.2618F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 42, -1.2305F, -0.49F, 5.2874F, 2, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.2F, 0.35F, -0.35F);
        this.headright.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.6109F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 27, 35, -6.45F, -1.76F, -6.5F, 1, 1, 3, 0.0F, true));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.3F, 0.35F, -11.35F);
        this.headright.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.9948F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 40, 6, 0.0037F, -1.26F, 0.3551F, 2, 1, 4, 0.0F, true));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.4974F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 8, 0.0146F, -1.25F, 0.0393F, 4, 1, 5, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0524F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 11, 41, -3.255F, -0.48F, 6.4728F, 1, 0, 3, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-3.9F, 0.35F, -9.0F);
        this.headright.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, -0.288F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 40, 37, -1.0966F, -1.26F, 4.8921F, 4, 1, 1, 0.0F, true));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.2F, 0.35F, 0.65F);
        this.headright.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0F, 0.0F, -0.5672F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 35, 26, -2.4F, -3.05F, -7.5F, 3, 1, 4, -0.002F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -3.3F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.99F, -1.0F, -0.7F, 4, 2, 8, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 15, 24, -0.49F, -1.95F, 0.28F, 1, 1, 7, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 11, -1.49F, -1.75F, -0.69F, 3, 1, 8, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1F, 6.8F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 33, -1.5F, -1.0F, 0.0F, 3, 2, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 8, 21, -0.51F, -1.75F, -0.02F, 1, 1, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 21, 0.0F, -5.6F, 0.55F, 0, 4, 7, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 33, 19, -0.99F, -1.5F, -0.01F, 2, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 17, 35, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 32, 35, -0.49F, -1.25F, -0.01F, 1, 1, 5, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.body3.addChild(tailfin);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.0F, -15.0F);
        this.tailfin.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 25, 26, -0.5F, 3.5F, 14.0F, 1, 1, 7, 0.0F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 32, 8, 0.0F, 4.5F, 14.0F, 0, 2, 7, 0.0F, false));

        this.finLeft = new AdvancedModelRenderer(this);
        this.finLeft.setRotationPoint(3.2F, -0.2F, -2.6F);
        this.head.addChild(finLeft);
        this.setRotateAngle(finLeft, -0.0873F, 0.1745F, 0.0F);
        this.finLeft.cubeList.add(new ModelBox(finLeft, 0, 11, -0.05F, 0.0F, -2.3F, 1, 0, 1, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.0F, 0.5F, -1.0F);
        this.finLeft.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.1309F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 32, 0, -2.8F, -0.5F, -0.3F, 3, 0, 5, 0.0F, false));

        this.finRight = new AdvancedModelRenderer(this);
        this.finRight.setRotationPoint(-3.2F, -0.2F, -2.6F);
        this.head.addChild(finRight);
        this.setRotateAngle(finRight, -0.0873F, -0.1745F, 0.0F);
        this.finRight.cubeList.add(new ModelBox(finRight, 0, 11, -0.95F, 0.0F, -2.3F, 1, 0, 1, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.0F, 0.5F, -1.0F);
        this.finRight.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.1309F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 32, 0, -0.2F, -0.5F, -0.3F, 3, 0, 5, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.render(0.01F);
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
        //this.head.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body2, this.body3, this.tailfin};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.flap(finLeft, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(finLeft, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(finRight, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(finRight, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                //this.head.offsetY = 1.0F;
                this.bob(head, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
