package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGroenlandaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Groenlandaspis;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body1;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightBackFin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer leftBackFin;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer rightPectoral;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer leftPectoral;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer mouth;
    private final AdvancedModelRenderer cube_r17;

    public ModelGroenlandaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Groenlandaspis = new AdvancedModelRenderer(this);
        this.Groenlandaspis.setRotationPoint(0.0F, 24.0F, -3.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Groenlandaspis.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 0, 25, -3.0F, -6.0F, -5.0F, 6, 5, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 34, 19, -2.5F, -5.0F, -6.5F, 5, 3, 2, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 20, 8, -3.5F, -7.75F, -1.25F, 7, 7, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 35, 39, -1.0F, -8.25F, 0.75F, 2, 2, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -9.25F, 2.5F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 41, -0.5F, -0.25F, -3.25F, 1, 3, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-4.5F, -2.5F, 0.25F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.0873F, -0.6109F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 24, -2.25F, -0.3F, 0.0F, 3, 1, 5, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.5F, -2.5F, 0.25F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0873F, 0.6109F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 34, 24, -0.75F, -0.3F, 0.0F, 3, 1, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-4.5F, -2.75F, -1.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.0873F, -0.8727F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 29, 1, -0.75F, -1.0F, -2.5F, 4, 2, 5, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(4.5F, -2.75F, -1.75F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.8727F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 29, 1, -3.25F, -1.0F, -2.5F, 4, 2, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.3374F, -4.7561F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 42, 8, -2.0F, 0.15F, -1.5F, 4, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -4.5F, -7.25F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.9163F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 42, -2.0F, -0.05F, -1.5F, 4, 2, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -7.0F, -3.0F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4363F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 12, -2.5F, 0.0F, -5.25F, 5, 3, 7, -0.01F, false));

        this.body1 = new AdvancedModelRenderer(this);
        this.body1.setRotationPoint(0.0F, -4.0F, 2.75F);
        this.head.addChild(body1);
        this.body1.cubeList.add(new ModelBox(body1, 0, 0, -3.0F, -3.0F, -1.0F, 6, 6, 6, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1476F, 4.8783F);
        this.body1.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 17, 50, -2.5F, -2.1024F, -0.8783F, 5, 5, 6, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.6024F, 2.6217F);
        this.body2.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.48F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, 0.0F, -1.5F, -2.5F, 0, 3, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.8298F, 5.1448F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 0, 34, -1.5436F, -1.4321F, -1.024F, 3, 3, 5, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.0436F, 1.5679F, 1.226F);
        this.body3.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.6545F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 10, 18, 0.0F, -1.5F, -0.75F, 0, 2, 4, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(-0.0436F, 0.3179F, 3.976F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 22, 22, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 2.75F);
        this.body4.addChild(body5);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -2.3376F, 4.0586F);
        this.body5.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 22, 0.0F, 0.0595F, -5.2573F, 0, 6, 7, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.body5.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.5672F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 27, 37, -0.5F, -0.75F, -1.75F, 1, 1, 5, 0.0F, false));

        this.rightBackFin = new AdvancedModelRenderer(this);
        this.rightBackFin.setRotationPoint(-2.0746F, 1.8976F, 1.3085F);
        this.body2.addChild(rightBackFin);
        this.setRotateAngle(rightBackFin, 0.0F, 0.0F, -0.3491F);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.1754F, 0.0F, -0.9368F);
        this.rightBackFin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.5672F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 34, 8, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, false));

        this.leftBackFin = new AdvancedModelRenderer(this);
        this.leftBackFin.setRotationPoint(2.5746F, 1.8976F, 1.3085F);
        this.body2.addChild(leftBackFin);
        this.setRotateAngle(leftBackFin, 0.0F, 0.0F, 1.0908F);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-0.3227F, 0.0436F, -0.9368F);
        this.leftBackFin.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.5672F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 34, 8, -1.0F, 0.0F, 0.0F, 2, 0, 4, 0.0F, true));

        this.rightPectoral = new AdvancedModelRenderer(this);
        this.rightPectoral.setRotationPoint(-2.4465F, -1.5F, 2.4576F);
        this.head.addChild(rightPectoral);
        this.setRotateAngle(rightPectoral, 0.0934F, -0.1974F, -0.3583F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.0535F, -1.0F, -0.4576F);
        this.rightPectoral.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.1524F, -0.5938F, -0.2062F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 0, -2.1802F, 0.75F, -0.1336F, 4, 0, 6, 0.0F, false));

        this.leftPectoral = new AdvancedModelRenderer(this);
        this.leftPectoral.setRotationPoint(2.4465F, -1.5F, 2.4576F);
        this.head.addChild(leftPectoral);
        this.setRotateAngle(leftPectoral, 0.0846F, 0.2013F, 0.314F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0535F, -1.0F, -0.4576F);
        this.leftPectoral.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1524F, 0.5938F, 0.2062F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 0, -1.8198F, 0.75F, -0.1336F, 4, 0, 6, 0.0F, true));

        this.mouth = new AdvancedModelRenderer(this);
        this.mouth.setRotationPoint(0.0F, -2.5874F, -6.2561F);
        this.head.addChild(mouth);
        this.setRotateAngle(mouth, 0.3491F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.5093F, -0.7517F);
        this.mouth.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 41, -1.5F, -0.5F, -0.5F, 3, 1, 2, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Groenlandaspis.render(f5 * 0.30F);
    }
    public void renderStatic(float f) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        GlStateManager.disableCull();
        this.Groenlandaspis.rotateAngleY = (float) Math.toRadians(90);
        this.Groenlandaspis.render(0.01F);
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
        this.Groenlandaspis.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body1, this.body2, this.body3, this.body4, this.body5};
        AdvancedModelRenderer[] fishfinL = {this.leftPectoral};
        AdvancedModelRenderer[] fishfinR = {this.rightPectoral};

        float speed = 0.3F;
        float taildegree = 0.22F;

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
            taildegree = 0.09F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2.33, f2, 1);
            this.chainSwing(fishfinL, speed, -0.15F, -3, f2, 1);
            this.chainWave(fishfinL, speed, 0.15F, -3, f2, 1);
            this.chainSwing(fishfinR, speed, 0.15F, -3, f2, 1);
            this.chainWave(fishfinR, speed, 0.15F, -3, f2, 1);
            this.swing(Groenlandaspis, speed, 0.22F, true, 0, 0, f2, 1);
            this.walk(mouth, (float) (speed * 0.75), -0.4F, true, 0.20F, 0, f2, 1);
            this.walk(leftBackFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(leftBackFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.walk(rightBackFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(rightBackFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Groenlandaspis.offsetY = 1.0F;
                this.bob(Groenlandaspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
