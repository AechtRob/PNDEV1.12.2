package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCooyoo extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headslopeback;
    private final AdvancedModelRenderer headslopefront;
    private final AdvancedModelRenderer lowerjawback;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftlowerjawslope;
    private final AdvancedModelRenderer leftlowermiddletooth;
    private final AdvancedModelRenderer rightlowerjawslope;
    private final AdvancedModelRenderer rightlowermiddletooth;
    private final AdvancedModelRenderer lowerfrontteeth;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer leftupperteeth;
    private final AdvancedModelRenderer rightupperteeth2;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer rightupperteeth;
    private final AdvancedModelRenderer leftupperteeth2;
    private final AdvancedModelRenderer upperfrontteeth;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer frontdorsalmuscle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailmiddlebase;
    private final AdvancedModelRenderer tailmiddleend;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer tailenddorsalslope;
    private final AdvancedModelRenderer tailendventralslope;
    private final AdvancedModelRenderer tailmidenddorsalslope;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer tailmidendventralslope;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer tailmidbaseslope;
    private final AdvancedModelRenderer tailbaseslope;
    private final AdvancedModelRenderer rightpelvicfin;
    private final AdvancedModelRenderer leftpelvicfin;

    private ModelAnimator animator;

    public ModelCooyoo() {
        this.textureWidth = 80;
        this.textureHeight = 80;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.5F, 0.0F);


        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(0.0F, -5.0F, -1.0F);
        this.root.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 27, 50, -2.5F, -2.5F, -6.5F, 5, 7, 7, 0.0F, false));

        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(-0.01F, -0.01F, -6.0F);
        this.bodymiddle.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 49, -2.5F, -2.5F, -7.5F, 5, 7, 8, 0.0F, false));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(2.49F, 3.9F, -6.9F);
        this.bodyfront.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 0.3396F, 0.0F, -0.6262F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 43, 7, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, false));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-2.47F, 3.9F, -6.9F);
        this.bodyfront.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 0.3396F, 0.0F, 0.6262F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 43, 7, 0.0F, 0.0F, -0.5F, 0, 6, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.3F, -6.5F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 19, 26, -3.0F, -1.0F, -4.5F, 6, 5, 5, 0.0F, false));

        this.headslopeback = new AdvancedModelRenderer(this);
        this.headslopeback.setRotationPoint(0.01F, -3.2F, -0.2F);
        this.head.addChild(headslopeback);
        this.setRotateAngle(headslopeback, -0.0213F, 0.0F, 0.0F);
        this.headslopeback.cubeList.add(new ModelBox(headslopeback, 37, 21, -2.0F, 0.0F, -3.5F, 4, 3, 4, 0.0F, false));

        this.headslopefront = new AdvancedModelRenderer(this);
        this.headslopefront.setRotationPoint(-0.02F, 0.0F, -3.5F);
        this.headslopeback.addChild(headslopefront);
        this.setRotateAngle(headslopefront, 0.9765F, 0.0F, 0.0F);
        this.headslopefront.cubeList.add(new ModelBox(headslopefront, 19, 12, -2.0F, 0.0F, -3.0F, 4, 2, 3, 0.0F, false));

        this.lowerjawback = new AdvancedModelRenderer(this);
        this.lowerjawback.setRotationPoint(0.0F, 3.5F, -4.1F);
        this.head.addChild(lowerjawback);
        this.setRotateAngle(lowerjawback, -0.5548F, 0.0F, 0.0F);
        this.lowerjawback.cubeList.add(new ModelBox(lowerjawback, 48, 61, -1.5F, -1.5F, -3.0F, 3, 2, 4, 0.0F, false));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.lowerjawback.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.2122F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 9, 6, -1.0F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.leftlowerjawslope = new AdvancedModelRenderer(this);
        this.leftlowerjawslope.setRotationPoint(0.96F, -0.5F, -1.9F);
        this.lowerjawfront.addChild(leftlowerjawslope);
        this.setRotateAngle(leftlowerjawslope, 0.2335F, 0.2759F, 0.0F);
        this.leftlowerjawslope.cubeList.add(new ModelBox(leftlowerjawslope, 18, 8, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));

        this.leftlowermiddletooth = new AdvancedModelRenderer(this);
        this.leftlowermiddletooth.setRotationPoint(-0.2F, -0.3F, 0.7F);
        this.leftlowerjawslope.addChild(leftlowermiddletooth);
        this.setRotateAngle(leftlowermiddletooth, 0.0F, 0.2122F, -0.4458F);
        this.leftlowermiddletooth.cubeList.add(new ModelBox(leftlowermiddletooth, 3, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, true));

        this.rightlowerjawslope = new AdvancedModelRenderer(this);
        this.rightlowerjawslope.setRotationPoint(-0.94F, -0.5F, -1.9F);
        this.lowerjawfront.addChild(rightlowerjawslope);
        this.setRotateAngle(rightlowerjawslope, 0.2335F, -0.2759F, 0.0F);
        this.rightlowerjawslope.cubeList.add(new ModelBox(rightlowerjawslope, 18, 8, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.rightlowermiddletooth = new AdvancedModelRenderer(this);
        this.rightlowermiddletooth.setRotationPoint(0.2F, -0.3F, 0.7F);
        this.rightlowerjawslope.addChild(rightlowermiddletooth);
        this.setRotateAngle(rightlowermiddletooth, 0.0F, -0.2122F, 0.4458F);
        this.rightlowermiddletooth.cubeList.add(new ModelBox(rightlowermiddletooth, 3, 1, 0.0F, -1.0F, -0.5F, 0, 1, 1, 0.0F, false));

        this.lowerfrontteeth = new AdvancedModelRenderer(this);
        this.lowerfrontteeth.setRotationPoint(0.0F, -0.5F, -1.9F);
        this.lowerjawfront.addChild(lowerfrontteeth);
        this.setRotateAngle(lowerfrontteeth, 0.2122F, 0.0F, 0.0F);
        this.lowerfrontteeth.cubeList.add(new ModelBox(lowerfrontteeth, 3, 0, -1.0F, -1.0F, 0.0F, 2, 1, 0, 0.0F, false));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -1.8F, -4.9F);
        this.head.addChild(eyeportion);
        this.setRotateAngle(eyeportion, 0.6156F, 0.0F, 0.0F);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 16, 0, -2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 0.0F, -1.5F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.1061F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 0, 9, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(0.59F, 0.32F, -1.9F);
        this.snout.addChild(leftcheek);
        this.setRotateAngle(leftcheek, -0.0398F, 0.0861F, -0.224F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 10, 10, 0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, true));

        this.leftupperteeth = new AdvancedModelRenderer(this);
        this.leftupperteeth.setRotationPoint(0.5F, 2.2F, 0.7F);
        this.leftcheek.addChild(leftupperteeth);


        this.rightupperteeth2 = new AdvancedModelRenderer(this);
        this.rightupperteeth2.setRotationPoint(0.625F, 2.2F, 0.7F);
        this.leftcheek.addChild(rightupperteeth2);
        this.setRotateAngle(rightupperteeth2, 0.0F, 0.0F, -0.0044F);
        this.rightupperteeth2.cubeList.add(new ModelBox(rightupperteeth2, 0, 0, 0.0F, -1.0F, -1.0F, 0, 2, 1, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(-0.57F, 0.32F, -1.9F);
        this.snout.addChild(rightcheek);
        this.setRotateAngle(rightcheek, -0.0398F, -0.0861F, 0.224F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 10, 10, -1.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, false));

        this.rightupperteeth = new AdvancedModelRenderer(this);
        this.rightupperteeth.setRotationPoint(-0.5F, 2.2F, 0.7F);
        this.rightcheek.addChild(rightupperteeth);


        this.leftupperteeth2 = new AdvancedModelRenderer(this);
        this.leftupperteeth2.setRotationPoint(-0.625F, 2.2F, 0.7F);
        this.rightcheek.addChild(leftupperteeth2);
        this.setRotateAngle(leftupperteeth2, 0.0F, 0.0F, 0.0044F);
        this.leftupperteeth2.cubeList.add(new ModelBox(leftupperteeth2, 0, 0, 0.0F, -1.0F, -1.0F, 0, 2, 1, 0.0F, false));

        this.upperfrontteeth = new AdvancedModelRenderer(this);
        this.upperfrontteeth.setRotationPoint(0.0F, 0.1F, -1.6F);
        this.snout.addChild(upperfrontteeth);
        this.setRotateAngle(upperfrontteeth, -0.1201F, 0.0F, 0.0F);
        this.upperfrontteeth.cubeList.add(new ModelBox(upperfrontteeth, 0, 7, -0.5F, 0.0F, -1.0F, 1, 0, 1, 0.0F, false));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(1.745F, 1.4F, -1.3F);
        this.eyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, 0.1664F, -0.1269F, 2.8709F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 8, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(-1.725F, 1.4F, -1.3F);
        this.eyeportion.addChild(righteye);
        this.setRotateAngle(righteye, 0.1664F, 0.1269F, -2.8709F);
        this.righteye.cubeList.add(new ModelBox(righteye, 8, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.frontdorsalmuscle = new AdvancedModelRenderer(this);
        this.frontdorsalmuscle.setRotationPoint(0.0F, -2.9F, -7.5F);
        this.bodyfront.addChild(frontdorsalmuscle);
        this.setRotateAngle(frontdorsalmuscle, -0.0424F, 0.0F, 0.0F);
        this.frontdorsalmuscle.cubeList.add(new ModelBox(frontdorsalmuscle, 39, 29, -2.0F, 0.0F, 0.0F, 4, 1, 8, 0.0F, false));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.01F, 0.01F, 0.0F);
        this.bodymiddle.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 0, 35, -2.5F, -2.5F, -0.5F, 5, 7, 6, 0.0F, false));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, -0.1F, 5.1F);
        this.bodyend.addChild(tailbase);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 23, 37, -2.0F, -1.5F, -0.5F, 4, 6, 6, 0.0F, false));

        this.tailmiddlebase = new AdvancedModelRenderer(this);
        this.tailmiddlebase.setRotationPoint(-0.01F, 0.49F, 5.2F);
        this.tailbase.addChild(tailmiddlebase);
        this.tailmiddlebase.cubeList.add(new ModelBox(tailmiddlebase, 0, 23, -2.0F, -2.0F, -0.5F, 4, 6, 5, 0.0F, false));

        this.tailmiddleend = new AdvancedModelRenderer(this);
        this.tailmiddleend.setRotationPoint(0.0F, 1.1F, 4.0F);
        this.tailmiddlebase.addChild(tailmiddleend);
        this.tailmiddleend.cubeList.add(new ModelBox(tailmiddleend, 45, 47, -1.5F, -2.0F, 0.0F, 3, 4, 5, 0.0F, false));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(0.0F, 0.0F, 4.5F);
        this.tailmiddleend.addChild(tailend);
        this.tailend.cubeList.add(new ModelBox(tailend, 13, 72, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.tailend.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 50, 1, 0.0F, -5.8F, -0.5F, 0, 11, 7, 0.0F, false));

        this.tailenddorsalslope = new AdvancedModelRenderer(this);
        this.tailenddorsalslope.setRotationPoint(-0.01F, -2.0F, 0.0F);
        this.tailend.addChild(tailenddorsalslope);
        this.setRotateAngle(tailenddorsalslope, -0.2759F, 0.0F, 0.0F);
        this.tailenddorsalslope.cubeList.add(new ModelBox(tailenddorsalslope, 19, 51, -1.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tailendventralslope = new AdvancedModelRenderer(this);
        this.tailendventralslope.setRotationPoint(0.01F, 2.0F, 0.0F);
        this.tailend.addChild(tailendventralslope);
        this.setRotateAngle(tailendventralslope, 0.2759F, 0.0F, 0.0F);
        this.tailendventralslope.cubeList.add(new ModelBox(tailendventralslope, 0, 72, -1.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F, false));

        this.tailmidenddorsalslope = new AdvancedModelRenderer(this);
        this.tailmidenddorsalslope.setRotationPoint(-0.01F, -2.0F, 0.0F);
        this.tailmiddleend.addChild(tailmidenddorsalslope);
        this.setRotateAngle(tailmidenddorsalslope, -0.1911F, 0.0F, 0.0F);
        this.tailmidenddorsalslope.cubeList.add(new ModelBox(tailmidenddorsalslope, 19, 65, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, -1.0F, 1.0F);
        this.tailmidenddorsalslope.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, -0.0637F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 55, 0, 0.0F, -4.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.tailmidendventralslope = new AdvancedModelRenderer(this);
        this.tailmidendventralslope.setRotationPoint(0.01F, 2.87F, 0.0F);
        this.tailmiddleend.addChild(tailmidendventralslope);
        this.setRotateAngle(tailmidendventralslope, 0.1698F, 0.0F, 0.0F);
        this.tailmidendventralslope.cubeList.add(new ModelBox(tailmidendventralslope, 36, 65, -1.5F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 4.0F, 1.5F);
        this.tailmiddlebase.addChild(analfin);
        this.setRotateAngle(analfin, 0.2335F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 50, 2, 0.0F, 0.0F, 0.0F, 0, 3, 2, 0.0F, false));

        this.tailmidbaseslope = new AdvancedModelRenderer(this);
        this.tailmidbaseslope.setRotationPoint(0.02F, -2.5F, -0.5F);
        this.tailmiddlebase.addChild(tailmidbaseslope);
        this.setRotateAngle(tailmidbaseslope, -0.0848F, 0.0F, 0.0F);
        this.tailmidbaseslope.cubeList.add(new ModelBox(tailmidbaseslope, 0, 65, -2.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

        this.tailbaseslope = new AdvancedModelRenderer(this);
        this.tailbaseslope.setRotationPoint(0.02F, -1.4F, -0.5F);
        this.tailbase.addChild(tailbaseslope);
        this.setRotateAngle(tailbaseslope, -0.0637F, 0.0F, 0.0F);
        this.tailbaseslope.cubeList.add(new ModelBox(tailbaseslope, 44, 39, -2.0F, -1.0F, 0.0F, 4, 1, 6, 0.0F, false));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.2F, 4.5F, 1.8F);
        this.bodyend.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, 0.0637F, 0.1485F, -0.4753F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 62, 3, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.22F, 4.5F, 1.8F);
        this.bodyend.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, 0.0637F, -0.1485F, 0.4753F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 62, 3, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -0.5F;
        this.root.offsetX = 0.0F;
        this.root.rotateAngleY = (float)Math.toRadians(220);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 0.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetX = -0.14F;
        this.root.offsetY = -0.19F;
        this.root.offsetZ = 0.06F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.18F;
        this.root.render(0.01F);
        this.resetToDefaultPose();
    }

    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();

        //this.head.offsetY = 0.8F;

        AdvancedModelRenderer[] fishTail = {this.tailbase, this.tailmiddlebase, this.tailmiddleend, this.tailend, this.tailfin};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(root, speed, 0.2F, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(root, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(rightpectoralfin, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(rightpectoralfin, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(leftpectoralfin, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(leftpectoralfin, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(rightpelvicfin, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(rightpelvicfin, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(leftpelvicfin, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(leftpelvicfin, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);


        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.1F;
            this.bob(root, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.15F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(8);
        animator.rotate(this.lowerjawback, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

