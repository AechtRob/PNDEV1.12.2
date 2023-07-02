package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGabreyaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer gabreyaspis;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
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

    public ModelGabreyaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.gabreyaspis = new AdvancedModelRenderer(this);
        this.gabreyaspis.setRotationPoint(0.0F, 23.25F, -3.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.75F, 3.0F);
        this.gabreyaspis.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 8, -3.0F, -1.0F, 0.0F, 6, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 22, -0.5F, -1.75F, 2.98F, 1, 1, 2, -0.01F, false));
        this.body.cubeList.add(new ModelBox(body, 22, 22, -0.5F, -1.75F, 1.0F, 1, 1, 2, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.5F, 4.75F);
        this.body.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 26, 8, -2.0F, -0.49F, 0.0F, 4, 2, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 36, 37, -0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.125F, 2.75F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 29, -1.5F, -0.625F, 0.0F, 3, 2, 3, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 12, 24, -0.5F, -0.875F, 0.0F, 1, 1, 3, -0.01F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.375F, 2.75F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 38, -1.0F, -0.99F, 0.0F, 2, 2, 2, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 18, 0.0F, -2.75F, 0.0F, 0, 4, 6, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, -0.6646F, 2.8041F);
        this.gabreyaspis.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 15, -0.5F, -2.0854F, 0.1959F, 1, 2, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -0.5F, 0.1746F, 0.1959F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -5.5F, -1.5854F, -4.8041F, 11, 3, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 15, 2.5F, -0.3354F, -6.8041F, 2, 1, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 8, -4.5F, -0.3354F, -6.8041F, 2, 1, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 22, 23, -5.5F, -0.3354F, -5.8041F, 1, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 22, 4.5F, -0.3354F, -5.8041F, 1, 1, 6, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 36, 32, 5.5F, -0.3354F, -4.8041F, 1, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 26, 36, -6.5F, -0.3354F, -4.8041F, 1, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 8, 1.75F, -0.8354F, -7.5541F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -2.75F, -0.8354F, -7.5541F, 1, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.7092F, 0.1646F, -7.8022F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, -1.2654F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 28, -0.0321F, -0.5F, -3.9041F, 2, 1, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(3.7092F, 0.1646F, -7.8022F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 1.2654F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 18, -1.9679F, -0.5F, -3.9041F, 2, 1, 4, 0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.5F, 0.1646F, -4.8041F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.7418F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 20, 30, 0.0F, -0.5F, -4.0F, 2, 1, 4, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.5F, 0.1646F, -4.8041F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.7418F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 31, -2.0F, -0.5F, -4.0F, 2, 1, 4, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-4.5F, 0.1646F, -0.8041F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 23, -1.5F, -0.5F, -1.25F, 2, 1, 4, 0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(4.5F, 0.1646F, -0.8041F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.6981F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 33, -0.5F, -0.5F, -1.25F, 2, 1, 4, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-1.9617F, 0.1646F, 0.8132F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.3491F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 27, 2, -3.0F, -0.5F, -1.0F, 5, 1, 2, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.9617F, 0.1646F, 0.8132F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.3491F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 32, 5, -2.0F, -0.5F, -1.0F, 5, 1, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-4.0F, -1.8354F, 0.1959F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.5236F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 19, 0.0F, 2.0F, -2.0F, 4, 1, 2, -0.02F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 35, 0.0F, 0.25F, -2.0F, 4, 2, 2, -0.02F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(4.0F, -1.8354F, 0.1959F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.5236F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 28, -4.0F, 2.0F, -2.0F, 4, 1, 2, -0.02F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 15, -4.0F, 0.25F, -2.0F, 4, 2, 2, -0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.1459F, -7.6097F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3054F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 20, -1.5F, 0.1805F, -1.061F, 3, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.5854F, -4.8041F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1309F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 23, -2.0F, 0.25F, -2.9F, 4, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 0, -3.5F, 0.25F, -1.9F, 7, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 12, 17, -4.5F, 0.15F, -0.9F, 9, 2, 1, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.0999F, -5.77F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 8, -2.5F, -0.9777F, -2.0213F, 5, 1, 1, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 26, 13, -3.5F, -0.9777F, -1.0213F, 7, 1, 1, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 1.4146F, -4.8041F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 12, 20, -4.5F, -1.1F, -1.0F, 9, 1, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.3354F, 0.1959F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 35, -0.5F, 0.25F, -4.0F, 1, 1, 4, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.gabreyaspis.render(f5 * 0.285F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.gabreyaspis.rotateAngleY = (float) Math.toRadians(90);
        this.gabreyaspis.offsetX = -0.04F;
        this.gabreyaspis.offsetY = 0F;
        this.gabreyaspis.offsetZ = 0.04F;
        this.gabreyaspis.render(0.01F);
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
        this.gabreyaspis.offsetY = 0.95F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4};

        float speed = 0.422F;
        float taildegree = 0.325F;

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
            speed = 0.125F;
            taildegree = 0.125F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            if (f3 != 0) {
                this.swing(gabreyaspis, speed, 0.12F, true, 0, 0, f2, 1);
            }

            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.gabreyaspis.offsetY = 0.95F;
                this.bob(gabreyaspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
