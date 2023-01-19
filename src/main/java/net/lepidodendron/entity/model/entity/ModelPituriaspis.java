package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPituriaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer spike;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer spike2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;

    public ModelPituriaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(3.5F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 13, 13, -6.0F, -2.0F, -4.0F, 5, 2, 3, 0.001F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -4.5F, -2.0F, -5.0F, 2, 2, 1, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 8, -4.0F, -1.5F, -12.0F, 1, 1, 7, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -6.0F, -3.0F, -1.0F, 5, 3, 5, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 20, 0, -5.5F, -3.0F, 4.0F, 4, 3, 3, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 26, 9, -4.0F, -3.1943F, 0.6537F, 1, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-3.5F, -3.1943F, 0.6537F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2051F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 2, -0.5F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.5F, -2.75F, 6.75F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0829F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 25, -0.5F, -0.625F, -2.1F, 1, 1, 4, -0.01F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-3.5F, -3.0F, -1.0F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 8, -2.0F, 0.25F, -3.45F, 4, 1, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.5F, -1.0F, -4.5F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.6458F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 0, -2.3F, -1.0F, 0.05F, 3, 2, 1, -0.001F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-5.5F, -1.0F, -4.5F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.6458F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 15, 0, -0.7F, -1.0F, 0.05F, 3, 2, 1, -0.01F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-6.0327F, -0.075F, 0.1734F);
        this.main.addChild(frontrightfin);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0327F, 0.075F, -1.1734F);
        this.frontrightfin.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.829F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 6, -3.725F, -0.075F, -1.1F, 5, 0, 3, 0.0F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(-0.9673F, -0.075F, 0.1734F);
        this.main.addChild(frontleftfin);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.0327F, 0.075F, -1.1734F);
        this.frontleftfin.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.829F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 6, -1.275F, -0.075F, -1.1F, 5, 0, 3, 0.0F, true));

        this.spike = new AdvancedModelRenderer(this);
        this.spike.setRotationPoint(-5.9F, -1.0F, -4.0F);
        this.main.addChild(spike);
        this.setRotateAngle(spike, -0.0861F, -0.0144F, -0.1652F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.7767F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 29, -3.9998F, -0.5F, -0.0484F, 4, 1, 1, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.8998F, -0.5F, 0.9516F, 1, 1, 1, 0.0F, false));

        this.spike2 = new AdvancedModelRenderer(this);
        this.spike2.setRotationPoint(-1.1F, -1.0F, -4.0F);
        this.main.addChild(spike2);
        this.setRotateAngle(spike2, -0.0861F, 0.0144F, 0.1652F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.spike2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.7767F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 29, -0.0002F, -0.5F, -0.0484F, 4, 1, 1, 0.0F, true));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.8998F, -0.5F, 0.9516F, 1, 1, 1, 0.0F, true));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-3.5F, -1.7343F, 6.7443F);
        this.main.addChild(body);
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 10, 18, -1.5F, -1.0657F, -0.2443F, 3, 2, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.6093F, -0.2443F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0218F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 20, -1.5F, -1.0F, 0.0F, 3, 1, 4, -0.01F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.4346F, 3.4993F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 0, 16, -1.5F, -1.5003F, 0.0064F, 3, 2, 4, -0.001F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.1747F, -5.9936F);
        this.body2.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0218F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 24, -1.0F, -1.0F, 6.0F, 2, 1, 4, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -0.1383F, 3.946F);
        this.body2.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 0, 22, -1.0F, -1.362F, 0.0354F, 2, 2, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 1.0514F, 0.0217F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1178F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 25, 14, -0.5F, -0.9563F, 0.0104F, 1, 1, 4, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.562F, 4.0354F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 25, -0.5F, -1.75F, 0.0F, 1, 3, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
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
        this.main.offsetY = 0;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.tail, this.tail2};

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
            this.flap(frontleftfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontleftfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(frontrightfin, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(frontrightfin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 0;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
