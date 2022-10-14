package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraEglonaspis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelEglonaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r17;

    public ModelEglonaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.225F);
        this.head.cubeList.add(new ModelBox(head, 23, 20, -0.5F, -1.5F, -8.225F, 1, 1, 3, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0436F, -0.1309F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 15, -2.8F, -1.775F, -4.125F, 1, 2, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0436F, 0.1309F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 17, 1.8F, -1.775F, -4.125F, 1, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 24, 26, -0.99F, -2.4F, -6.125F, 2, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -0.225F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.4102F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 4, 0.0F, -2.975F, 0.225F, 0, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.225F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1658F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, -2.925F, -5.5F, 2, 1, 7, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -0.225F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 12, 10, -2.01F, -0.65F, -4.025F, 4, 1, 4, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.15F, -0.5F, -3.725F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0873F, -0.5236F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 6, -0.425F, -1.49F, -1.05F, 3, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-2.15F, -0.5F, -3.725F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, -0.2618F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 16, 15, -0.875F, -1.49F, 1.8F, 3, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 0, -0.875F, -1.51F, 3.3F, 1, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 27, 4, -0.375F, -1.49F, 2.8F, 2, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 10, 0.625F, -1.5F, 3.55F, 1, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.15F, -0.5F, -3.725F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.2618F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 2, -1.625F, -1.5F, 3.55F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 9, -0.125F, -1.51F, 3.3F, 1, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 27, -1.625F, -1.49F, 2.8F, 2, 1, 1, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 24, -2.125F, -1.49F, 1.8F, 3, 1, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(2.15F, -0.5F, -3.725F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0873F, 0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 19, -2.575F, -1.49F, -1.05F, 3, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -0.225F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0873F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 11, 0, -2.0F, -2.525F, -3.25F, 4, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.05F, -0.075F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0087F, -0.5672F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 26, -4.125F, -1.49F, -5.725F, 1, 1, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.05F, -0.075F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0087F, 0.5672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 26, 3.125F, -1.49F, -5.725F, 1, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.0F, -5.225F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.6981F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 17, 23, -1.325F, -1.0F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.0F, -5.225F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.6981F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 24, 10, -0.675F, -1.01F, 0.0F, 2, 2, 2, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1047F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 10, 26, -1.01F, -0.625F, -6.2F, 2, 1, 1, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.0F, -0.425F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -2.02F, -0.75F, -0.05F, 4, 2, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 14, -1.52F, -1.25F, -0.06F, 3, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 0, -0.5F, -1.5F, 0.93F, 1, 1, 3, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 3.85F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 22, 15, -1.5F, -0.85F, 0.0F, 3, 2, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 24, 6, -1.02F, -1.125F, -0.01F, 2, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 3, -0.49F, -1.375F, -0.02F, 1, 1, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 1.85F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, -1.02F, -0.95F, 0.05F, 2, 2, 1, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 8, -0.5F, -1.225F, 0.03F, 1, 1, 1, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 0.9F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 9, 21, -0.52F, -0.95F, 0.05F, 1, 2, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.0F, 2.75F);
        this.body4.addChild(tail);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, -0.2F);
        this.tail.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.3054F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 19, -0.02F, -2.175F, 0.125F, 0, 3, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.92F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.render(0.01F);
        GlStateManager.enableCull();
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
        //this.head.offsetY = 0.0F;

        EntityPrehistoricFloraEglonaspis ee = (EntityPrehistoricFloraEglonaspis) e;

        //System.err.println("swimmingTicks = " + ee.swimmingTicks);
        //System.err.println("buriedTicks = " + buriedTicks);

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.head.offsetY = 0.5F;
                this.head.rotateAngleX = -(float) Math.toRadians(70);
                swaymodifier = 0;
            }
            else {
                this.head.offsetY = 0.05F + (0.45F * (float)((double)ee.getBuriedTick()/60D));
                this.head.rotateAngleX = -(float) Math.toRadians(70 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.head.offsetY = 0.05F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4, this.tail};

        float speed = 0.4F;
        float taildegree = 0.3F;

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
            speed = 0.15F * speedmodifier;
            taildegree = 0.12F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(head, speed, 0.3F * swaymodifier, true, 0, 0, f2, 1);
            //this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 0.05F;
                this.bob(head, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
