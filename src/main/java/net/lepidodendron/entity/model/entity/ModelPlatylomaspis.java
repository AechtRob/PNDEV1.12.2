package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatylomaspis;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelPlatylomaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer Platylomaspis;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer MedialOpening_r1;
    private final AdvancedModelRenderer Ventralrim;
    private final AdvancedModelRenderer CheekL;
    private final AdvancedModelRenderer CheekR;
    private final AdvancedModelRenderer Rostrum;
    private final AdvancedModelRenderer BodyStatic;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Tail;

    public ModelPlatylomaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Platylomaspis = new AdvancedModelRenderer(this);
        this.Platylomaspis.setRotationPoint(0.0F, 26.0F, 0.0F);


        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Platylomaspis.addChild(body);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -6.0F, 9.0F);
        this.body.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 20, -4.0F, -1.6F, -15.0F, 8, 2, 8, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 0, 0, -4.5F, -0.3F, -16.0F, 9, 1, 10, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 19, 33, -3.0F, -2.0F, -14.0F, 6, 1, 7, 0.0F, false));

        this.MedialOpening_r1 = new AdvancedModelRenderer(this);
        this.MedialOpening_r1.setRotationPoint(0.0F, 0.0F, -15.0F);
        this.Cephalon.addChild(MedialOpening_r1);
        this.setRotateAngle(MedialOpening_r1, -0.7418F, 0.0F, 0.0F);
        this.MedialOpening_r1.cubeList.add(new ModelBox(MedialOpening_r1, 0, 50, -4.0F, -1.2F, -1.0F, 8, 2, 1, -0.01F, false));

        this.Ventralrim = new AdvancedModelRenderer(this);
        this.Ventralrim.setRotationPoint(0.0F, 6.0F, -9.0F);
        this.Cephalon.addChild(Ventralrim);
        this.Ventralrim.cubeList.add(new ModelBox(Ventralrim, 24, 21, -4.0F, -6.0F, -11.0F, 8, 1, 1, 0.0F, false));
        this.Ventralrim.cubeList.add(new ModelBox(Ventralrim, 38, 33, -5.0F, -6.0F, -10.0F, 10, 1, 2, 0.0F, false));
        this.Ventralrim.cubeList.add(new ModelBox(Ventralrim, 0, 11, -6.0F, -5.9F, -8.0F, 12, 1, 8, 0.0F, false));
        this.Ventralrim.cubeList.add(new ModelBox(Ventralrim, 0, 54, -3.0F, -6.0F, 0.0F, 6, 1, 2, 0.0F, false));

        this.CheekL = new AdvancedModelRenderer(this);
        this.CheekL.setRotationPoint(4.0F, -6.0F, 0.0F);
        this.Ventralrim.addChild(CheekL);
        this.setRotateAngle(CheekL, 0.0F, 0.0F, 0.1309F);
        this.CheekL.cubeList.add(new ModelBox(CheekL, 0, 30, -1.0F, 0.0F, -4.0F, 5, 1, 8, 0.0F, false));
        this.CheekL.cubeList.add(new ModelBox(CheekL, 44, 15, -1.0F, 0.0F, 4.0F, 4, 1, 3, 0.0F, false));

        this.CheekR = new AdvancedModelRenderer(this);
        this.CheekR.setRotationPoint(-3.0F, -6.0F, 0.0F);
        this.Ventralrim.addChild(CheekR);
        this.setRotateAngle(CheekR, 0.0F, 0.0F, -0.1309F);
        this.CheekR.cubeList.add(new ModelBox(CheekR, 28, 0, -5.0F, 0.0F, -4.0F, 5, 1, 8, 0.0F, false));
        this.CheekR.cubeList.add(new ModelBox(CheekR, 44, 21, -4.0F, 0.0F, 4.0F, 4, 1, 3, 0.0F, false));

        this.Rostrum = new AdvancedModelRenderer(this);
        this.Rostrum.setRotationPoint(0.0F, -5.0F, -9.0F);
        this.Ventralrim.addChild(Rostrum);
        this.setRotateAngle(Rostrum, 0.0436F, 0.0F, 0.0F);
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 0, 0, -1.5F, -1.0F, -6.0F, 3, 1, 2, 0.0F, false));
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 30, 10, -1.0F, -1.0F, -16.0F, 2, 1, 10, 0.0F, false));
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 0, 3, -2.0F, -1.0F, -4.0F, 4, 1, 1, 0.0F, false));
        this.Rostrum.cubeList.add(new ModelBox(Rostrum, 44, 25, -3.0F, -1.0F, -3.0F, 6, 1, 1, 0.0F, false));

        this.BodyStatic = new AdvancedModelRenderer(this);
        this.BodyStatic.setRotationPoint(0.0F, 6.0F, -9.0F);
        this.Cephalon.addChild(BodyStatic);
        this.BodyStatic.cubeList.add(new ModelBox(BodyStatic, 25, 23, -3.0F, -8.0F, 2.0F, 6, 3, 7, 0.0F, false));
        this.BodyStatic.cubeList.add(new ModelBox(BodyStatic, 0, 41, 0.0F, -11.0F, 3.0F, 0, 3, 6, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -7.0F, 9.0F);
        this.body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 43, 39, 0.0F, -4.0F, 0.0F, 0, 3, 5, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 39, -2.5F, -1.0F, 0.0F, 5, 3, 5, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 1.0F, 5.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 40, 36, -2.0F, -2.0F, 0.0F, 4, 3, 5, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 12, 42, 0.0F, -5.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 29, 41, -1.0F, -1.0F, 0.0F, 2, 3, 5, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, 0.0F, -4.0F, 0.0F, 0, 3, 5, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 44, 9, -1.0F, -0.5F, 0.0F, 2, 2, 4, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 20, 34, 0.0F, -1.0F, 0.0F, 0, 5, 7, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Platylomaspis.render(f5 * 0.165F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Platylomaspis.rotateAngleY = (float) Math.toRadians(90);
        this.Platylomaspis.offsetX = -0.06F;
        this.Platylomaspis.offsetZ = 0.F;
        this.Platylomaspis.render(0.01F);
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
        this.Platylomaspis.offsetY = 1.25F;

        EntityPrehistoricFloraPlatylomaspis ee = (EntityPrehistoricFloraPlatylomaspis) e;

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.Platylomaspis.offsetY = 1.60F;
                this.Platylomaspis.rotateAngleX = (float) Math.toRadians(90);
                swaymodifier = 0;
            }
            else {
                this.Platylomaspis.offsetY = 1.25F + (0.35F * (float)((double)ee.getBuriedTick()/60D));
                this.Platylomaspis.rotateAngleX = (float) Math.toRadians(90 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.Platylomaspis.offsetY = 1.25F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Tail};

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
            this.chainWave(fishTail, speed, 0.05F, -2.5, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -2.5, f2, 1);
            this.swing(Platylomaspis, speed, 0.3F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.Platylomaspis.offsetY = 1.25F;
                this.bob(Platylomaspis, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -2.5, f2, 1);
            }
        }
    }
}
